package info.loenwind.enderioaddons.drain;

import com.enderio.core.common.util.BlockCoord;

import net.minecraft.world.World;

public interface IWaterSensitive {

  public boolean preventInfiniteWaterForming(World world, BlockCoord bc);
  
}