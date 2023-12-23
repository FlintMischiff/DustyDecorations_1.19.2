package flintmischiff.dustydecorations.block.custom;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.BlockPos;

public class SalmonBarrelBlock extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public SalmonBarrelBlock(Properties sound) {
        super(sound);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {

        return switch (state.getValue(FACING)) {
            default -> Shapes.or(box(0, 0, 0, 16, 14, 16), box(14, 14, 0, 16, 16, 16), box(0, 14, 0, 2, 16, 16), box(2, 14, 0, 14, 16, 2),
                    box(2, 14, 14, 14, 16, 16));
            case NORTH -> Shapes.or(box(0, 0, 0, 16, 14, 16), box(0, 14, 0, 2, 16, 16), box(14, 14, 0, 16, 16, 16), box(2, 14, 14, 14, 16, 16),
                    box(2, 14, 0, 14, 16, 2));
            case EAST -> Shapes.or(box(0, 0, 0, 16, 14, 16), box(0, 14, 0, 16, 16, 2), box(0, 14, 14, 16, 16, 16), box(0, 14, 2, 2, 16, 14),
                    box(14, 14, 2, 16, 16, 14));
            case WEST -> Shapes.or(box(0, 0, 0, 16, 14, 16), box(0, 14, 14, 16, 16, 16), box(0, 14, 0, 16, 16, 2), box(14, 14, 2, 16, 16, 14),
                    box(0, 14, 2, 2, 16, 14));
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