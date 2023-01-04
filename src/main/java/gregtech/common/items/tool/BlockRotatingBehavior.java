package gregtech.common.items.tool;

import gregtech.api.items.toolitem.ToolHelper;
import gregtech.api.items.toolitem.behavior.IToolBehavior;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class BlockRotatingBehavior implements IToolBehavior {

    @Override
    public EnumActionResult onItemUseFirst(@Nonnull EntityPlayer player, @Nonnull World world, @Nonnull BlockPos pos, @Nonnull EnumFacing side, float hitX, float hitY, float hitZ, @Nonnull EnumHand hand) {
        TileEntity te = world.getTileEntity(pos);
        // MTEs have special handling on rotation
        if (te instanceof IGregTechTileEntity) {
            return EnumActionResult.PASS;
        }

        Block b = world.getBlockState(pos).getBlock();
        // leave rail rotation to Crowbar only
        if (b instanceof BlockRailBase) {
            return EnumActionResult.FAIL;
        }

        if (!player.isSneaking() && world.canMineBlockBody(player, pos)) {
            if (b.rotateBlock(world, pos, side)) {
                ToolHelper.onActionDone(player, world, hand);
                return EnumActionResult.SUCCESS;
            }
        }
        return EnumActionResult.PASS;
    }
}