package com.seamusmullan.carrotgolems.entity;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractGolem extends TamableAnimal implements RangedAttackMob {
    protected AbstractGolem(EntityType<? extends TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
        return null;
    }

    @Override
    public void performRangedAttack(LivingEntity p_33317_, float p_33318_) {

    }
}
