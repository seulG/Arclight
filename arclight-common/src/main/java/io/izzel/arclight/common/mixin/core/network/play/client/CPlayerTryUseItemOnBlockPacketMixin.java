package io.izzel.arclight.common.mixin.core.network.play.client;

import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.CPlayerTryUseItemOnBlockPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CPlayerTryUseItemOnBlockPacket.class)
public class CPlayerTryUseItemOnBlockPacketMixin {

    public long timestamp;

    @Inject(method = "readPacketData", at = @At("HEAD"))
    private void arclight$read(PacketBuffer buf, CallbackInfo ci) {
        this.timestamp = System.currentTimeMillis();
    }
}
