package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketTowerAllDataRsp;
import emu.grasscutter.server.packet.send.PacketAntiAddictNotify;

import static emu.grasscutter.config.Configuration.GAME_INFO;

@Opcodes(PacketOpcodes.TowerAllDataReq)
public class HandlerTowerAllDataReq extends PacketHandler {
    
    private boolean dialogSent = false;

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        // Check if dialog has not been sent yet
        if (!dialogSent) {
            // Send the dialog to client
            session.send(new PacketAntiAddictNotify(1, GAME_INFO.joinOptions.dialogMessage));
            dialogSent = true;
        }

        // Send other packets as needed
        session.send(
                new PacketTowerAllDataRsp(
                        session.getServer().getTowerSystem(), session.getPlayer().getTowerManager()));
    }
}
