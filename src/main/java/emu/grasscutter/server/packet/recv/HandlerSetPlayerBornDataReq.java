package emu.grasscutter.server.packet.recv;

import static emu.grasscutter.config.Configuration.*;

import emu.grasscutter.*;
import emu.grasscutter.data.GameData;
import emu.grasscutter.game.avatar.Avatar;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq;
import emu.grasscutter.server.game.GameSession;
import java.util.Arrays;

@Opcodes(PacketOpcodes.SetPlayerBornDataReq)
public class HandlerSetPlayerBornDataReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        SetPlayerBornDataReq req = SetPlayerBornDataReq.parseFrom(payload);

        // Sanity checks
        int avatarId = req.getAvatarId();
        int headImage;
        int startingSkillDepot;
        if (avatarId == GameConstants.MAIN_CHARACTER_MALE) {
            headImage = 1 ;
            startingSkillDepot = 504;
        } else if (avatarId == GameConstants.MAIN_CHARACTER_FEMALE) {
            headImage = 2 ;
            startingSkillDepot = 704;
        } else {
            return;
        }

        // Make sure resources folder is set
        if (!GameData.getAvatarDataMap().containsKey(avatarId)) {
            Grasscutter.getLogger()
                    .error("No avatar data found! Please check your ExcelBinOutput folder.");
            session.close();
            return;
        }

        // Get player object
        Player player = session.getPlayer();
        player.setNickname(req.getNickName());

        // Create avatar
        if (player.getAvatars().getAvatarCount() == 0) {
            Avatar mainCharacter = new Avatar(avatarId);

            // Check if the default Anemo skill should be given.
            if (!GAME_OPTIONS.questing.enabled) {
                mainCharacter.setSkillDepotData(
                        GameData.getAvatarSkillDepotDataMap().get(startingSkillDepot));
            }

            // Manually handle adding to team
            player.addAvatar(mainCharacter, false);
            player.setMainCharacterId(avatarId);
            player.setHeadImage(headImage);
            player
                    .getTeamManager()
                    .getCurrentSinglePlayerTeamInfo()
                    .getAvatars()
                    .add(mainCharacter.getAvatarId());
            player.save(); // TODO save player team in different object
        } else {
            return;
        }

        // Login done
        session.getPlayer().onLogin();
        session.getPlayer().onPlayerBorn();
        
        // Born resp packet
        session.send(new BasePacket(PacketOpcodes.SetPlayerBornDataRsp));
}
}
