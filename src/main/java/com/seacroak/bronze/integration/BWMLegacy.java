package com.seacroak.bronze.integration;

import ckathode.weaponmod.entity.projectile.ICustomProjectileMaterials;
import ckathode.weaponmod.entity.projectile.MaterialRegistry;
import ckathode.weaponmod.item.IItemWeapon;
import ckathode.weaponmod.item.ItemMelee;
import ckathode.weaponmod.item.MeleeCompBoomerang;
import com.seacroak.bronze.material.BronzeToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static com.seacroak.bronze.util.GenericUtils.ID;

public class BWMLegacy {

    public static final int BRONZE_ID = 6;

    public static final ItemMelee BRONZE_BOOMERANG = Registry.register(Registries.ITEM, ID("bronze_boomerang"),
            new ItemMelee(new MeleeCompBoomerang(BronzeToolMaterial.INSTANCE)));

    public static void init() {
        MaterialRegistry.registerCustomProjectileMaterial(new ICustomProjectileMaterials() {
            @Override
            public int[] getAllMaterialIDs() {
                return new int[]{BRONZE_ID};
            }

            @Override
            public int getMaterialID(ItemStack itemStack) {
                if (itemStack != null && itemStack.getItem() instanceof IItemWeapon weapon && weapon.getMeleeComponent() != null) {
                    if (weapon.getMeleeComponent().weaponMaterial == BronzeToolMaterial.INSTANCE) return BRONZE_ID;
                }
                return -1;
            }

            @Override
            public float[] getColorFromMaterialID(int i) {
                if (i == BRONZE_ID)
                    return new float[]{0.86f, 0.65f, 0.25f};
                return null;
            }
        });
    }

}
