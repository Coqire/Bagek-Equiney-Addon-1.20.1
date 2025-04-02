package com.coqire.bageksequineyaddon.platform;

import com.coqire.bageksequineyaddon.platform.services.IClientHelper;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.world.item.CreativeModeTab;

public class ForgeClientHelper extends IClientHelper {

    @Override
    public int getGuiLeft(AbstractContainerScreen<?> screen)
    {
        return screen.getGuiLeft();
    }

    @Override
    public int getGuiTop(AbstractContainerScreen<?> screen)
    {
        return screen.getGuiTop();
    }

    @Override
    public CreativeModeTab getSelectedCreativeModeTab()
    {
        return CreativeModeInventoryScreen.selectedTab;
    }
}
