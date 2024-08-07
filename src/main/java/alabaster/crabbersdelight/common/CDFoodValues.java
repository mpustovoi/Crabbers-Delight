package alabaster.crabbersdelight.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

import static vectorwing.farmersdelight.common.FoodValues.*;

public class CDFoodValues {
    
    // Helper Value Map
    public static final int BRIEF_DURATION = 600;    // 30 seconds
    public static final int SHORT_DURATION = 1200;    // 1 minute
    public static final int MEDIUM_DURATION = 3600;    // 3 minutes
    public static final int LONG_DURATION = 6000;    // 5 minutes

    //public static final FoodProperties SOGGY_FLESH = (new FoodProperties.Builder())
    //        .nutrition(3).saturationModifier(0.3f)
    //        .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).build();

    //public static final FoodProperties ARID_FLESH = (new FoodProperties.Builder())
    //        .nutrition(3).saturationModifier(0.3f)
    //        .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).build();

    public static final FoodProperties RAW_CRAB = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.3f).build();

    public static final FoodProperties COOKED_CRAB = (new FoodProperties.Builder())
            .nutrition(4).saturationModifier(0.8f).build();

    public static final FoodProperties RAW_CLAWSTER = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.5f).build();

    public static final FoodProperties COOKED_CLAWSTER = (new FoodProperties.Builder())
            .nutrition(7).saturationModifier(0.8f).build();

    public static final FoodProperties RAW_SHRIMP = (new FoodProperties.Builder())
            .nutrition(1).saturationModifier(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).fast().build();

    public static final FoodProperties COOKED_SHRIMP = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.6f).fast().build();

    public static final FoodProperties RAW_CLAM_MEAT = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.3f).fast().build();

    public static final FoodProperties COOKED_CLAM_MEAT = (new FoodProperties.Builder())
            .nutrition(4).saturationModifier(0.8f).fast().build();

    public static final FoodProperties RAW_SQUID_TENTACLES = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.5f).build();

    public static final FoodProperties COOKED_SQUID_TENTACLES = (new FoodProperties.Builder())
            .nutrition(7).saturationModifier(0.8f).build();

    public static final FoodProperties RAW_FROG_LEG = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.3f).build();

    public static final FoodProperties COOKED_FROG_LEG = (new FoodProperties.Builder())
            .nutrition(4).saturationModifier(0.7f).build();

    // Drinks

    public static final FoodProperties KELP_SHAKE = (new FoodProperties.Builder())
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 300, 0), 1.0F).build();

    // Slices

    public static final FoodProperties COOKED_TROPICAL_FISH = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.8f).fast().build();

    public static final FoodProperties COOKED_TROPICAL_FISH_SLICE = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.5f).fast().build();

    public static final FoodProperties TROPICAL_FISH_SLICE = (new FoodProperties.Builder())
            .nutrition(1).saturationModifier(0.1f).fast().build();

    public static final FoodProperties COOKED_PUFFERFISH_SLICE = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.5f).fast().build();

    public static final FoodProperties PUFFERFISH_SLICE = (new FoodProperties.Builder())
            .nutrition(1).saturationModifier(0.1f).effect(() -> new MobEffectInstance(MobEffects.POISON, 300, 0), 0.3F).fast().build();

    // Food

    public static final FoodProperties CRAB_LEGS = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.6f).build();

    public static final FoodProperties SHRIMP_SKEWER = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.8f).build();

    public static final FoodProperties SHRIMP_FRIED_RICE = (new FoodProperties.Builder())
            .nutrition(7).saturationModifier(0.7f)
            .effect(() -> comfort(BRIEF_DURATION), 1.0F).build();

    public static final FoodProperties SURF_AND_TURF = (new FoodProperties.Builder())
            .nutrition(14).saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, LONG_DURATION, 0), 1.0F).build();

    public static final FoodProperties CLAM_BAKE = (new FoodProperties.Builder())
            .nutrition(13).saturationModifier(0.9f)
            .effect(() -> nourishment(LONG_DURATION), 1.0F).build();

    public static final FoodProperties CLAM_CHOWDER = (new FoodProperties.Builder())
            .nutrition(7).saturationModifier(0.6f)
            .effect(() -> comfort(MEDIUM_DURATION), 1.0F).build();

    public static final FoodProperties BISQUE = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.75f)
            .effect(() -> nourishment(MEDIUM_DURATION), 1.0F).build();

    public static final FoodProperties SEAFOOD_GUMBO = (new FoodProperties.Builder())
            .nutrition(12).saturationModifier(0.9f)
            .effect(() -> comfort(LONG_DURATION), 1.0F).build();

    public static final FoodProperties FISH_STICK = (new FoodProperties.Builder())
            .nutrition(5).saturationModifier(0.6f).build();

    public static final FoodProperties CRAB_CAKES = (new FoodProperties.Builder())
            .nutrition(10).saturationModifier(0.6f)
            .effect(() -> nourishment(SHORT_DURATION), 1.0F).build();

    public static final FoodProperties STUFFED_NAUTILUS_SHELL = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.7f)
            .effect(() -> nourishment(MEDIUM_DURATION), 1.0F).build();

    public static final FoodProperties JAR_OF_PICKLES = (new FoodProperties.Builder())
            .nutrition(4).saturationModifier(0.4f).build();

    public static final FoodProperties SEA_PICKLE_JUICE = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, BRIEF_DURATION, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, MEDIUM_DURATION, 0), 1.0F).build();

    public static final FoodProperties SQUID_KEBAB = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.8f).build();

    public static final FoodProperties FROG_LEG_KEBAB = (new FoodProperties.Builder())
            .nutrition(9).saturationModifier(0.8f).build();

    public static final FoodProperties CORAL_CRUNCH = (new FoodProperties.Builder())
            .nutrition(4).saturationModifier(0.2f).fast()
            .effect(() -> comfort(SHORT_DURATION), 1.0F).build();

    public static final FoodProperties CLAWSTER_FEAST = (new FoodProperties.Builder())
            .nutrition(10).saturationModifier(0.9f)
            .effect(() -> nourishment(LONG_DURATION), 1.0F).build();
}
