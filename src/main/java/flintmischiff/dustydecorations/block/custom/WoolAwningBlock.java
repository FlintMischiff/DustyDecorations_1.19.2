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

public class WoolAwningBlock extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public WoolAwningBlock(Properties sound) {
        super(sound);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {

        return switch (state.getValue(FACING)) {
            default -> Shapes.or(box(0, 14, 0, 16, 16, 4), box(0, 12, 4, 16, 14, 8),
                    box(0, 8, 12, 16, 10, 15), box(0, 10, 8, 16, 12, 12));
            case NORTH -> Shapes.or(box(0, 14, 12, 16, 16, 16), box(0, 12, 8, 16, 14, 12),
                    box(0, 8, 1, 16, 10, 4), box(0, 10, 4, 16, 12, 8));
            case EAST -> Shapes.or(box(0, 14, 0, 4, 16, 16), box(4, 12, 0, 8, 14, 16),
                    box(12, 8, 0, 15, 10, 16), box(8, 10, 0, 12, 12, 16));
            case WEST -> Shapes.or(box(12, 14, 0, 16, 16, 16), box(8, 12, 0, 12, 14, 16),
                    box(1, 8, 0, 4, 10, 16), box(4, 10, 0, 8, 12, 16));
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