package net.schnegg.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class FreiburgBlock extends Block {

    public FreiburgBlock() {
        super(Block.Properties.create(Material.ICE).lightValue(10).slipperiness(1.2F).hardnessAndResistance(5).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.GLASS));
    }

    @Override
    public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        player.sendMessage(new StringTextComponent("FreiburgBlock on ice"));
        return true;
    }

}
