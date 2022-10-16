package com.seamusmullan.carrotgolems.entity;


import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class GolemEntity extends AbstractGolem{


    public static float health = 25; // health of the golem
    public static double range = 0.4D; // Detection radius


    public GolemEntity(EntityType<? extends AbstractGolem> type, Level world) {
        super(type, world);
        this.createAttributes();
    }

    AttributeSupplier.Builder builder = AttributeSupplier.builder();

    // setup function


    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, health)
                .add(Attributes.MOVEMENT_SPEED, 0.3D)
                .add(Attributes.ATTACK_DAMAGE, 2.0D)
                .add(Attributes.FOLLOW_RANGE, range);
    }

//    @Override
//    protected SoundEvent getAmbientSound() {
//        return new SoundEvent(new ResourceLocation(ArrowGolems.MODID, "golem_idle"));
//    }
//
//    @Override
//    protected SoundEvent getHurtSound(DamageSource damageSource) {
//        return new SoundEvent(new ResourceLocation(ArrowGolems.MODID, "golem_hit"));
//    }
//
//    @Override
//    protected SoundEvent getDeathSound() {
//        return new SoundEvent(new ResourceLocation(ArrowGolems.MODID, "golem_death"));
//    }
//

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new SitWhenOrderedToGoal(this));
        this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, Monster.class, true));
        this.goalSelector.addGoal(6, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
        this.targetSelector.addGoal(7, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(8, new OwnerHurtTargetGoal(this));
        this.targetSelector.addGoal(9, (new HurtByTargetGoal(this)).setAlertOthers());
    }

    @Override
    public void tick() {
        super.tick();
    }

}
