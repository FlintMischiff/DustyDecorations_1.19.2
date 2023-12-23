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
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class AnchorBlock extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public AnchorBlock(Properties sound) {
        super(sound);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {

        return switch (state.getValue(FACING)) {
            default -> Shapes.or(box(1, 0, 8, 15, 6, 14),
                    box(1, 8, 0, 15, 14, 6), box(1, 4, 4, 15, 10, 10));
            case NORTH -> Shapes.or(box(1, 0, 2, 15, 6, 8),
                    box(1, 8, 10, 15, 14, 16), box(1, 4, 6, 15, 10, 12));
            case EAST -> Shapes.or(box(8, 0, 1, 14, 6, 15),
                    box(0, 8, 1, 6, 14, 15), box(4, 4, 1, 10, 10, 15));
            case WEST -> Shapes.or(box(2, 0, 1, 8, 6, 15),
                    box(10, 8, 1, 16, 14, 15), box(6, 4, 1, 12, 10, 15));
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