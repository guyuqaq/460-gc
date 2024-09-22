package emu.grasscutter.server.packet.recv;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq;
import emu.grasscutter.server.game.GameSession;
import java.util.Arrays;

@Opcodes(PacketOpcodes.WeaponAwakenReq)
public class HandlerWeaponAwakenReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
         // 打印原始 payload 数据
        Grasscutter.getLogger().info("Received WeaponAwakenReq payload: " + java.util.Arrays.toString(payload));
        WeaponAwakenReq req = WeaponAwakenReq.parseFrom(payload);

        // 打印解析后的内容
        Grasscutter.getLogger().info("Parsed WeaponAwakenReq:");
        Grasscutter.getLogger().info("TargetWeaponGuid: " + req.getTargetWeaponGuid());
        Grasscutter.getLogger().info("ItemGuid: " + req.getItemGuid());
        // Weapon refinement
        session
                .getServer()
                .getInventorySystem()
                .refineWeapon(session.getPlayer(), req.getTargetWeaponGuid(), req.getItemGuid());
    }
}
