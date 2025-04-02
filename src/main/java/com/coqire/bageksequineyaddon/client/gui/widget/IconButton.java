package com.coqire.bageksequineyaddon.client.gui.widget;

import com.coqire.bageksequineyaddon.Constants;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipPositioner;
import net.minecraft.client.gui.screens.inventory.tooltip.DefaultTooltipPositioner;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import java.awt.*;

public class IconButton extends Button {
    public static final ResourceLocation ICON_TEXTURES = new ResourceLocation(Constants.MOD_ID, "textures/gui/icons.png");

    private final Component label;
    private final int u, v;

    public IconButton(int x, int y, int u, int v, OnPress onPress)
    {
        this(x, y, u, v, 20, CommonComponents.EMPTY, onPress);
    }

    public IconButton(int x, int y, int u, int v, int width, Component label, OnPress onPress)
    {
        this(x, y, u, v, width, 20, label, onPress);
    }

    public IconButton(int x, int y, int u, int v, int width, int height, Component label, OnPress onPress)
    {
        super(x, y, width, height, CommonComponents.EMPTY, onPress, Button.DEFAULT_NARRATION);
        this.label = label;
        this.u = u;
        this.v = v;
    }

    @Override
    public void renderWidget(GuiGraphics graphics, int mouseX, int mouseY, float partialTicks)
    {
        super.renderWidget(graphics, mouseX, mouseY, partialTicks);

        Minecraft mc = Minecraft.getInstance();
        int contentWidth = 10 + mc.font.width(this.label) + (!this.label.getString().isEmpty() ? 4 : 0);
        int contentLeft = (this.width - contentWidth) / 2;
        int iconX = this.getX() + contentLeft;
        int iconY = this.getY() + 5;
        float brightness = this.active ? 1.0F : 0.5F;
        RenderSystem.enableBlend();
        graphics.setColor(brightness, brightness, brightness, this.alpha);
        graphics.blit(ICON_TEXTURES, iconX, iconY, this.u, this.v, 10, 10, 64, 64);
        graphics.setColor(1.0F, 1.0F, 1.0F, 1.0F);

        int start = iconX + 14;
        int end = iconX + contentWidth;
        int labelColour = 0xFFFFFF | Mth.ceil(this.alpha * 255) << 24;
        renderScrollingString(graphics, mc.font, this.label, start, this.getY(), end, this.getY() + this.getHeight(), labelColour);
    }

    @Override
    protected ClientTooltipPositioner createTooltipPositioner()
    {
        return DefaultTooltipPositioner.INSTANCE;
    }
}
