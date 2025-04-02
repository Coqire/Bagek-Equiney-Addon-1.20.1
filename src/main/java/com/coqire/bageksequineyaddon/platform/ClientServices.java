package com.coqire.bageksequineyaddon.platform;

import com.coqire.bageksequineyaddon.platform.services.IClientHelper;
import mezz.jei.common.platform.Services;

/**
     * Author: MrCrayfish
     */
    public class ClientServices
    {
        public static final IClientHelper PLATFORM = Services.load(IClientHelper.class);
}
