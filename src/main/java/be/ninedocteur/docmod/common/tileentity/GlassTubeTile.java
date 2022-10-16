package be.ninedocteur.docmod.common.tileentity;

import be.ninedocteur.docmod.common.init.DMTileEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class GlassTubeTile extends BlockEntity {

    public GlassTubeTile(BlockPos pos, BlockState state) {
        super(DMTileEntity.GlassTile.get(), pos, state);
    }
}
