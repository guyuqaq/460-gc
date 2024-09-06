package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp;

public class PacketGachaWishRsp extends BasePacket {

    public PacketGachaWishRsp(
            int gachaSortId ,int gachaType, int scheduleId, int wishItemId, int tenCostItemId) {
        super(PacketOpcodes.GachaWishRsp);

        GachaWishRsp proto =
                GachaWishRsp.newBuilder()
                        .setGachaSortId(gachaSortId)
                        .setGachaType(gachaType)
                        .setGachaScheduleId(scheduleId)
                        .setWishItemId(wishItemId)
                        .setTenCostItemId(tenCostItemId)
                        .build();

        this.setData(proto);
    }
}
