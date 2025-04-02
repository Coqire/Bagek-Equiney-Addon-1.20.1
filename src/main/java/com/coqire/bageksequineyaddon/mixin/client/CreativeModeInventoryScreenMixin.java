package com.coqire.bageksequineyaddon.mixin.client;

import com.coqire.bageksequineyaddon.client.CreativeFilters;
import com.coqire.bageksequineyaddon.item.BageksAddonCreativeModTab;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.world.item.CreativeModeTab;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CreativeModeInventoryScreen.class)
public class CreativeModeInventoryScreenMixin {
    @Shadow
    private static CreativeModeTab selectedTab;

    @Inject(method = "mouseScrolled", at = @At(value = "HEAD"), cancellable = true)
    private void refurbishedFurnitureMouseScrollHead(double pMouseX, double pMouseY, double pDelta, CallbackInfoReturnable<Boolean> cir)
    {
        double mouseX = 0;
        double mouseY = 0;
        double scrollY = 0;
        if(CreativeFilters.get().onMouseScroll(mouseX, mouseY, scrollY))
        {
            cir.setReturnValue(true);
        }
    }

    @Inject(method = "renderLabels", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiGraphics;drawString(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)I"))
    private void furnitureRefurbishedBeforeRenderLabels(GuiGraphics graphics, int mouseX, int mouseY, CallbackInfo ci)
    {
        if(selectedTab == BageksAddonCreativeModTab.MAIN.get())
        {
            int contentStart = 8;
            int contentTop = 4;
            int contentHeight = 12;
            int contentWidth = Minecraft.getInstance().font.width(selectedTab.getDisplayName()) + 4;
            graphics.fill(contentStart, contentTop + 1, contentStart + 1, contentTop + contentHeight - 1, 0x77000000);
            graphics.fill(contentStart + 1, contentTop, contentStart + contentWidth - 1, contentTop + contentHeight, 0x77000000);
            graphics.fill(contentStart + contentWidth - 1, contentTop + 1, contentStart + contentWidth, contentTop + contentHeight - 1, 0x77000000);
        }
    }

    @ModifyArg(method = "renderLabels", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiGraphics;drawString(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)I"), index = 2)
    private int furnitureRefurbishedRenderLabels(int original)
    {
        return selectedTab == BageksAddonCreativeModTab.MAIN.get() ? original + 2 : original;
    }

    @ModifyArg(method = "renderLabels", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiGraphics;drawString(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)I"), index = 5)
    private boolean furnitureRefurbishedRenderLabels(boolean original)
    {
        return selectedTab == BageksAddonCreativeModTab.MAIN.get();
    }
}
