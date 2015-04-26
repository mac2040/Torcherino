package com.sci.torcherino.block;

import com.sci.torcherino.Torcherino;
import com.sci.torcherino.tile.TileCompressedInverseTorcherino;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * @author MrComputerGhost
 */
public class BlockCompressedInverseTorcherino extends BlockInverseTorcherino {

    public BlockCompressedInverseTorcherino() {
        this.setBlockName("compressed_inverse_torcherino");
        this.setBlockTextureName("torcherino:compressed_torcherino" + (Torcherino.animatedTextures ? "_animated" : ""));
    }

    @Override
    public TileEntity createNewTileEntity(final World world, final int i) {
        return new TileCompressedInverseTorcherino();
    }

}