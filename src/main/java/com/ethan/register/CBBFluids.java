    package com.ethan.register;

    import com.ethan.CreateBrokenBad;
    import net.minecraft.core.registries.Registries;
    import net.minecraft.resources.ResourceLocation;
    import net.minecraft.world.item.BucketItem;
    import net.minecraft.world.item.Item;
    import net.minecraft.world.level.material.Fluid;
    import net.neoforged.neoforge.fluids.BaseFlowingFluid;
    import net.neoforged.neoforge.fluids.FluidType;
    import net.neoforged.neoforge.registries.DeferredRegister;
    import net.neoforged.neoforge.registries.DeferredHolder;
    import net.neoforged.neoforge.registries.NeoForgeRegistries;

    public class CBBFluids {
        public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, CreateBrokenBad.MOD_ID);
        public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(Registries.FLUID, CreateBrokenBad.MOD_ID);
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, CreateBrokenBad.MOD_ID);

        private static final ResourceLocation STILL = ResourceLocation.withDefaultNamespace("block/water_still");
        private static final ResourceLocation FLOW = ResourceLocation.withDefaultNamespace("block/water_flow");

        public static final DeferredHolder<FluidType, FluidType> LIQUID_BLUE_METHAMPHETAMINE_TYPE = FLUID_TYPES.register("liquid_blue_methamphetamine", () -> new FluidType(FluidType.Properties.create().viscosity(500).density(500).supportsBoating(true)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> LIQUID_BLUE_METHAMPHETAMINE = FLUIDS.register("liquid_blue_methamphetamine", () -> new BaseFlowingFluid.Source(makeProperties(LIQUID_BLUE_METHAMPHETAMINE_TYPE, 0xff42ddf5)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> LIQUID_BLUE_METHAMPHETAMINE_FLOWING = FLUIDS.register("liquid_blue_methamphetamine_flowing", () -> new BaseFlowingFluid.Flowing(makeProperties(LIQUID_BLUE_METHAMPHETAMINE_TYPE, 0xff42ddf5)));
        public static final DeferredHolder<Item, BucketItem> LIQUID_BLUE_METHAMPHETAMINE_BUCKET = ITEMS.register("liquid_blue_methamphetamine_bucket", () -> new BucketItem(LIQUID_BLUE_METHAMPHETAMINE.get(), new Item.Properties().stacksTo(1)));

        public static final DeferredHolder<FluidType, FluidType> LIQUID_METHAMPHETAMINE_TYPE = FLUID_TYPES.register("liquid_methamphetamine", () -> new FluidType(FluidType.Properties.create().viscosity(500).density(500).supportsBoating(true)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> LIQUID_METHAMPHETAMINE = FLUIDS.register("liquid_methamphetamine", () -> new BaseFlowingFluid.Source(makeProperties(LIQUID_METHAMPHETAMINE_TYPE, 0xffffffff)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> LIQUID_METHAMPHETAMINE_FLOWING = FLUIDS.register("liquid_methamphetamine_flowing", () -> new BaseFlowingFluid.Flowing(makeProperties(LIQUID_METHAMPHETAMINE_TYPE, 0xffffffff)));
        public static final DeferredHolder<Item, BucketItem> LIQUID_METHAMPHETAMINE_BUCKET = ITEMS.register("liquid_methamphetamine_bucket", () -> new BucketItem(LIQUID_METHAMPHETAMINE.get(), new Item.Properties().stacksTo(1)));

        public static final DeferredHolder<FluidType, FluidType> METHYLAMINE_TYPE = FLUID_TYPES.register("methylamine", () -> new FluidType(FluidType.Properties.create().viscosity(500).density(500).supportsBoating(true)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> METHYLAMINE = FLUIDS.register("methylamine", () -> new BaseFlowingFluid.Source(makeProperties(METHYLAMINE_TYPE, 0xffffffff)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> METHYLAMINE_FLOWING = FLUIDS.register("methylamine_flowing", () -> new BaseFlowingFluid.Flowing(makeProperties(METHYLAMINE_TYPE, 0xffffffff)));
        public static final DeferredHolder<Item, BucketItem> METHYLAMINE_BUCKET = ITEMS.register("methylamine_bucket", () -> new BucketItem(METHYLAMINE.get(), new Item.Properties().stacksTo(1)));

        public static final DeferredHolder<FluidType, FluidType> METHANOL_TYPE = FLUID_TYPES.register("methanol", () -> new FluidType(FluidType.Properties.create().viscosity(500).density(500).supportsBoating(true)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> METHANOL = FLUIDS.register("methanol", () -> new BaseFlowingFluid.Source(makeProperties(METHANOL_TYPE, 0xffffffff)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> METHANOL_FLOWING = FLUIDS.register("methanol_flowing", () -> new BaseFlowingFluid.Flowing(makeProperties(METHANOL_TYPE, 0xffffffff)));
        public static final DeferredHolder<Item, BucketItem> METHANOL_BUCKET = ITEMS.register("methanol_bucket", () -> new BucketItem(METHANOL.get(), new Item.Properties().stacksTo(1)));

        public static final DeferredHolder<FluidType, FluidType> HYDROGEN_TYPE = FLUID_TYPES.register("hydrogen", () -> new FluidType(FluidType.Properties.create().viscosity(500).density(500).supportsBoating(true)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> HYDROGEN = FLUIDS.register("hydrogen", () -> new BaseFlowingFluid.Source(makeProperties(HYDROGEN_TYPE, 0xffffffff)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> HYDROGEN_FLOWING = FLUIDS.register("hydrogen_flowing", () -> new BaseFlowingFluid.Flowing(makeProperties(HYDROGEN_TYPE, 0xffffffff)));
        public static final DeferredHolder<Item, BucketItem> HYDROGEN_BUCKET = ITEMS.register("hydrogen_bucket", () -> new BucketItem(HYDROGEN.get(), new Item.Properties().stacksTo(1)));

        public static final DeferredHolder<FluidType, FluidType> OXYGEN_TYPE = FLUID_TYPES.register("oxygen", () -> new FluidType(FluidType.Properties.create().viscosity(500).density(500).supportsBoating(true)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> OXYGEN = FLUIDS.register("oxygen", () -> new BaseFlowingFluid.Source(makeProperties(OXYGEN_TYPE, 0xffffffff)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> OXYGEN_FLOWING = FLUIDS.register("oxygen_flowing", () -> new BaseFlowingFluid.Flowing(makeProperties(OXYGEN_TYPE, 0xffffffff)));
        public static final DeferredHolder<Item, BucketItem> OXYGEN_BUCKET = ITEMS.register("oxygen_bucket", () -> new BucketItem(OXYGEN.get(), new Item.Properties().stacksTo(1)));

        public static final DeferredHolder<FluidType, FluidType> AMMONIA_TYPE = FLUID_TYPES.register("ammonia", () -> new FluidType(FluidType.Properties.create().viscosity(500).density(500).supportsBoating(true)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> AMMONIA = FLUIDS.register("ammonia", () -> new BaseFlowingFluid.Source(makeProperties(AMMONIA_TYPE, 0xffffffff)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> AMMONIA_FLOWING = FLUIDS.register("ammonia_flowing", () -> new BaseFlowingFluid.Flowing(makeProperties(AMMONIA_TYPE, 0xffffffff)));
        public static final DeferredHolder<Item, BucketItem> AMMONIA_BUCKET = ITEMS.register("ammonia_bucket", () -> new BucketItem(AMMONIA.get(), new Item.Properties().stacksTo(1)));

        public static final DeferredHolder<FluidType, FluidType> PHENYLACETIC_ACID_TYPE = FLUID_TYPES.register("phenylacetic_acid", () -> new FluidType(FluidType.Properties.create().viscosity(500).density(500).supportsBoating(true)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> PHENYLACETIC_ACID = FLUIDS.register("phenylacetic_acid", () -> new BaseFlowingFluid.Source(makeProperties(PHENYLACETIC_ACID_TYPE, 0xffffffff)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> PHENYLACETIC_ACID_FLOWING = FLUIDS.register("phenylacetic_acid_flowing", () -> new BaseFlowingFluid.Flowing(makeProperties(PHENYLACETIC_ACID_TYPE, 0xffffffff)));
        public static final DeferredHolder<Item, BucketItem> PHENYLACETIC_ACID_BUCKET = ITEMS.register("phenylacetic_acid_bucket", () -> new BucketItem(PHENYLACETIC_ACID.get(), new Item.Properties().stacksTo(1)));

        public static final DeferredHolder<FluidType, FluidType> ACETIC_ANHYDRIDE_TYPE = FLUID_TYPES.register("acetic_anhydride", () -> new FluidType(FluidType.Properties.create().viscosity(500).density(500).supportsBoating(true)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> ACETIC_ANHYDRIDE = FLUIDS.register("acetic_anhydride", () -> new BaseFlowingFluid.Source(makeProperties(ACETIC_ANHYDRIDE_TYPE, 0xffffffff)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> ACETIC_ANHYDRIDE_FLOWING = FLUIDS.register("acetic_anhydride_flowing", () -> new BaseFlowingFluid.Flowing(makeProperties(ACETIC_ANHYDRIDE_TYPE, 0xffffffff)));
        public static final DeferredHolder<Item, BucketItem> ACETIC_ANHYDRIDE_BUCKET = ITEMS.register("acetic_anhydride_bucket", () -> new BucketItem(ACETIC_ANHYDRIDE.get(), new Item.Properties().stacksTo(1)));

        public static final DeferredHolder<FluidType, FluidType> PHENYLACETONE_TYPE = FLUID_TYPES.register("phenylacetone", () -> new FluidType(FluidType.Properties.create().viscosity(500).density(500).supportsBoating(true)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> PHENYLACETONE = FLUIDS.register("phenylacetone", () -> new BaseFlowingFluid.Source(makeProperties(PHENYLACETONE_TYPE, 0xffffffff)));
        public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> PHENYLACETONE_FLOWING = FLUIDS.register("phenylacetone_flowing", () -> new BaseFlowingFluid.Flowing(makeProperties(PHENYLACETONE_TYPE, 0xffffffff)));
        public static final DeferredHolder<Item, BucketItem> PHENYLACETONE_BUCKET = ITEMS.register("phenylacetone_bucket", () -> new BucketItem(PHENYLACETONE.get(), new Item.Properties().stacksTo(1)));

        private static BaseFlowingFluid.Properties makeProperties(DeferredHolder<FluidType, FluidType> type, int color) {
            return new BaseFlowingFluid.Properties(
                    type,
                    () -> CBBFluids.FLUIDS.getEntries().stream()
                            .filter(e -> e.getId().getPath().equals(type.getId().getPath()))
                            .findFirst().orElseThrow().get(),
                    () -> CBBFluids.FLUIDS.getEntries().stream()
                            .filter(e -> e.getId().getPath().equals(type.getId().getPath() + "_flowing"))
                            .findFirst().orElseThrow().get()
            ).bucket(() -> CBBFluids.ITEMS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals(type.getId().getPath() + "_bucket"))
                    .findFirst().orElseThrow().get());
        }
    }