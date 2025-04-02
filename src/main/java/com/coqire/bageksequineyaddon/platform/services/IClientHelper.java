package com.coqire.bageksequineyaddon.platform.services;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipPositioner;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Author: MrCrayfish
 */
public class IClientHelper
{
    public int getGuiLeft(AbstractContainerScreen<?> screen) {
        return 0;
    }

    public int getGuiTop(AbstractContainerScreen<?> screen) {
        return 0;
    }

    public CreativeModeTab getSelectedCreativeModeTab() {
        return null;
    }

    public void setTooltipCache(Tooltip tooltip, List<FormattedCharSequence> lines) {

    }

    TextureAtlasSprite[] getFluidSprites(Fluid fluid, @Nullable BlockAndTintGetter getter, @Nullable BlockPos pos, FluidState state) {
        return null;
    }

    void drawBakedModel(BakedModel model, PoseStack poseStack, VertexConsumer consumer, int light, int overlay) {

    }

    BakedModel getBakedModel(ResourceLocation location) {
        return null;
    }

    RenderType getTelevisionScreenRenderType(ResourceLocation id) {
        return null;
    }

    void renderTooltip(GuiGraphics graphics, Font font, List<ClientTooltipComponent> components, int mouseX, int mouseY, ClientTooltipPositioner position) {

    }

    @SuppressWarnings("rawtypes")
    AbstractContainerScreen createFreezerScreen(AbstractContainerMenu menu, Inventory playerInventory, Component title) {
        return null;
    }

    @SuppressWarnings("rawtypes")
    AbstractContainerScreen createMicrowaveScreen(AbstractContainerMenu menu, Inventory playerInventory, Component title) {
        return null;
    }

    @SuppressWarnings("rawtypes")
    AbstractContainerScreen createStoveScreen(AbstractContainerMenu menu, Inventory playerInventory, Component title) {
        return null;
    }
}
