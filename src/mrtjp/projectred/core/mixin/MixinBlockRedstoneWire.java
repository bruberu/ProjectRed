package mrtjp.projectred.core.mixin;

import net.minecraft.block.BlockRedstoneWire;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(BlockRedstoneWire.class)
public interface MixinBlockRedstoneWire {
    @Accessor("canProvidePower")
    void setCanProvidePower(boolean value);
}
