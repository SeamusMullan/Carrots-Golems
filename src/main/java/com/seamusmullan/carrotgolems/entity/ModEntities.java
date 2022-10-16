package com.seamusmullan.carrotgolems.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.seamusmullan.carrotgolems.ArrowGolems.MODID;

public class ModEntities {


    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);

    public static final RegistryObject<EntityType<GolemEntity>> GOLEM = ENTITIES.register("golem", () -> EntityType.Builder.of(GolemEntity::new, MobCategory.CREATURE)
            .sized(0.9F, 1.3F)
            .build(new ResourceLocation(MODID, "golem").toString()));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }

    @SubscribeEvent
    public static void entityAttributesInit(EntityAttributeCreationEvent event) {
        event.put(GOLEM.get(), GolemEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void entityRendererInit(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityType.WOLF, GolemEntityRenderer::new);
    }
}
