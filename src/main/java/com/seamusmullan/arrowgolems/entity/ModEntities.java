package com.seamusmullan.arrowgolems.entity;

import com.seamusmullan.arrowgolems.ArrowGolems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.seamusmullan.arrowgolems.ArrowGolems.MODID;

public class ModEntities {


    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);

    public static final RegistryObject<EntityType<GolemEntity>> ARROW_GOLEM = ENTITIES.register("arrow_golem",
            () -> EntityType.Builder.<GolemEntity>of(GolemEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f)
                    .clientTrackingRange(8).updateInterval(10)
                    .build(new ResourceLocation(ArrowGolems.MODID, "arrow_golem").toString()));


    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
