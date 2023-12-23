package flintmischiff.dustydecorations.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class EmptyBarrelBlock extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public EmptyBarrelBlock(Properties sound) {
        super(sound);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {

        return switch (state.getValue(FACING)) {
            default -> Shapes.or(box(0, 0, 0, 2, 16, 16), box(2, 0, 2, 14, 2, 14), box(2, 0, 0, 14, 16, 2), box(14, 0, 0, 16, 16, 16),
                    box(2, 0, 14, 14, 16, 16));
            case NORTH -> Shapes.or(box(0, 0, 0, 2, 16, 16), box(2, 0, 2, 14, 2, 14), box(2, 0, 0, 14, 16, 2), box(14, 0, 0, 16, 16, 16),
                    box(2, 0, 14, 14, 16, 16));
            case EAST -> Shapes.or(box(0, 0, 0, 2, 16, 16), box(2, 0, 2, 14, 2, 14), box(2, 0, 0, 14, 16, 2), box(14, 0, 0, 16, 16, 16),
                    box(2, 0, 14, 14, 16, 16));
            case WEST -> Shapes.or(box(0, 0, 0, 2, 16, 16), box(2, 0, 2, 14, 2, 14), box(2, 0, 0, 14, 16, 2), box(14, 0, 0, 16, 16, 16),
                    box(2, 0, 14, 14, 16, 16));
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }
}