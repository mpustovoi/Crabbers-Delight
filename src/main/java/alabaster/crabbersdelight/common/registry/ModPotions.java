package alabaster.crabbersdelight.common.registry;

import alabaster.crabbersdelight.CrabbersDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(Registries.POTION, CrabbersDelight.MODID);

    // Inky Potion
    public static final Supplier<Potion> INKY_POTION = POTIONS.register("inky_potion", () -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 300, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
