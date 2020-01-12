package com.hollingsworth.craftedmagic.spell.effect;

import com.hollingsworth.craftedmagic.spell.enhancement.EnhancementType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.ArrayList;

public class EffectDamage extends EffectType {

    public EffectDamage(String tag) {super(tag, "Damage");
    }

    @Override
    public void onResolve(RayTraceResult rayTraceResult, World world, LivingEntity shooter, ArrayList<EnhancementType> enhancements) {

    }

    @Override
    public int getManaCost() {
        return 0;
    }

    @Override
    public String getTag() {
        return null;
    }
}
