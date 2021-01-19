package com.xevilspawnx.crucialgadgets.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class GraveStone extends Block {

    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    private static final VoxelShape SHAPE_N = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(4, 2, 14, 12, 13, 16), Block.makeCuboidShape(3, 0, 0, 13, 2, 16), IBooleanFunction.OR);
    private static final VoxelShape SHAPE_E = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(0, 2, 4, 2, 13, 12), Block.makeCuboidShape(0, 0, 3, 16, 2, 13), IBooleanFunction.OR);
    private static final VoxelShape SHAPE_S = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(4, 2, 0, 12, 13, 2), Block.makeCuboidShape(3, 0, 0, 13, 2, 16), IBooleanFunction.OR);
    private static final VoxelShape SHAPE_W = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(14, 2, 4, 16, 13, 12), Block.makeCuboidShape(0, 0, 3, 16, 2, 13), IBooleanFunction.OR);

    public GraveStone() {
        super(AbstractBlock.Properties.create(Material.IRON)
                .hardnessAndResistance(4.5f, 4.5f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(0)
                .setRequiresTool()
        );
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return  SHAPE_N;
            case SOUTH:
                return  SHAPE_S;
            case EAST:
                return  SHAPE_E;
            case WEST:
                return  SHAPE_W;
            default:
                return SHAPE_N;
        }
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
