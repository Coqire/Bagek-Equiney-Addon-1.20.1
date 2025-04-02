package com.coqire.bageksequineyaddon.event;

import com.coqire.bageksequineyaddon.api.event.IFrameworkEvent;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.Connection;

import javax.annotation.Nullable;

public interface IClientConnectionEvent extends IFrameworkEvent
{
    @FunctionalInterface
    interface LoggingIn extends IClientConnectionEvent
    {
        void handle(LocalPlayer player, MultiPlayerGameMode gameMode, Connection connection);
    }

    @FunctionalInterface
    interface LoggingOut extends IClientConnectionEvent
    {
        void handle(@Nullable Connection connection);
    }
}
