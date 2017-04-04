package com.latmod.warp_pads;

import com.feed_the_beast.ftbl.lib.util.LMUtils;
import com.latmod.warp_pads.block.TileWarpPad;
import com.latmod.warp_pads.block.TileWarpPadPart;
import com.latmod.warp_pads.item.WarpPadsItems;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by LatvianModder on 23.01.2017.
 */
public class WarpPadsCommon
{
    public void preInit()
    {
        LMUtils.register(WarpPadsItems.WARP_PAD);
        LMUtils.register(WarpPadsItems.WARP_WHISTLE);

        GameRegistry.registerTileEntity(TileWarpPad.class, "warp_pads.warp_pad");
        GameRegistry.registerTileEntity(TileWarpPadPart.class, "warp_pads.warp_pad_part");
    }
}