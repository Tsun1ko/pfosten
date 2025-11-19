package net.tsuniko.pfosten.mixin;

import net.minecraft.item.AxeItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(AxeItem.class)
public class StrippablesMixin {
    @Inject()
}
