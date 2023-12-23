package flintmischiff.dustydecorations.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TreasureMapBlock extends FaceAttachedHorizontalDirectionalBlock {
    protected static final VoxelShape CEILING_AABB_X = Block.box(3, 15, 0, 13, 16, 16);
    protected static final VoxelShape CEILING_AABB_Z = Block.box(0, 15, 3, 16, 16, 13);
    protected static final VoxelShape FLOOR_AABB_X = Block.box(3, 0, 0, 13, 1, 16);
    protected static final VoxelShape FLOOR_AABB_Z = Block.box(0, 0, 3, 16, 1, 13);
    protected static final VoxelShape NORTH_AABB = Block.box(0, 3, 15, 16, 13, 16);
    protected static final VoxelShape SOUTH_AABB = Block.box(0, 3, 0, 16, 13, 1);
    protected static final VoxelShape WEST_AABB = Block.box(15, 3, 0, 16, 13, 16);
    protected static final VoxelShape EAST_AABB = Block.box(0, 3, 0, 1, 13, 16);


    public TreasureMapBlock(Properties p_249680_) {
        super(p_249680_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL));
    }

    public VoxelShape getShape(BlockState p_51104_, BlockGetter p_51105_, BlockPos p_51106_, CollisionContext p_51107_) {
        Direction direction = p_51104_.getValue(FACING);
        switch ((AttachFace)p_51104_.getValue(FACE)) {
            case FLOOR:
                if (direction.getAxis() == Direction.Axis.X) {
                    return FLOOR_AABB_X;
                }

                return FLOOR_AABB_Z;
            case WALL:
                VoxelShape voxelshape;
                switch (direction) {
                    case EAST:
                        voxelshape = EAST_AABB;
                        break;
                    case WEST:
                        voxelshape = WEST_AABB;
                        break;
                    case SOUTH:
                        voxelshape = SOUTH_AABB;
                        break;
                    case NORTH:
                    case UP:
                    case DOWN:
                        voxelshape = NORTH_AABB;
                        break;
                    default:
                        throw new IncompatibleClassChangeError();
                }

                return voxelshape;
            case CEILING:
            default:
                if (direction.getAxis() == Direction.Axis.X) {
                    return CEILING_AABB_X;
                } else {
                    return CEILING_AABB_Z;
                }
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_51101_) {
        p_51101_.add(FACING, FACE);
    }
}