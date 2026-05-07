package io.github.jumperonjava.imaginebook.mixin;

import io.github.jumperonjava.imaginebook.Imaginebook;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayerEntity.class)
public class ClientPlayerEntityMixin {
    @Inject(method = "useBook", at = @At("HEAD"))
    void useBook(ItemStack stack, Hand hand, CallbackInfo ci) {
        Imaginebook.captureBookImagesTag(stack);
    }
}
