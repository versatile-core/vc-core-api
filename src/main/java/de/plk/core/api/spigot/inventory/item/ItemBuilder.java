package de.plk.core.api.spigot.inventory.item;

import de.plk.core.api.code.NotNull;
import de.plk.core.api.code.Nullable;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

import java.util.Arrays;
import java.util.Map;

/**
 * @author SoftwareBuilds
 * @since 06.08.2023 20:31
 * Copyright © 2023 | SoftwareBuilds | All rights reserved.
 */
public class ItemBuilder {

    /**
     * The item stack.
     */
    @Nullable
    private final ItemStack itemStack;

    /**
     * The item meta.
     */
    @Nullable
    private final ItemMeta itemMeta;

    /**
     * Creates an item builder.
     *
     * @param material The item material.
     * @param amount   The item amount.
     */
    public ItemBuilder(@NotNull Material material, @NotNull int amount, @NotNull short durability) {
        this.itemStack = new ItemStack(material, amount);
        this.itemMeta = itemStack.getItemMeta();

        if (this.itemMeta != null) {
            ((Damageable) this.itemMeta).setDamage(durability);
        }
    }

    /**
     * Creates an item builder.
     *
     * @see #ItemBuilder(Material, int).
     *
     * @param material The item material.
     */
    public ItemBuilder(@NotNull Material material, @NotNull int amount) {
        this(material, amount, (short) 0);
    }

    /**
     * Creates an item builder.
     *
     * @param material The item material.
     */
    public ItemBuilder(@NotNull Material material) {
        this(material, 1, (short) 0);
    }

    /**
     * Set the item name.
     *
     * @param name The item name.
     *
     * @return The item builder.
     */
    @NotNull
    public ItemBuilder setName(@Nullable String name) {
        this.itemMeta.setDisplayName(name);
        return this;
    }

    /**
     * Set the item material.
     *
     * @param material The item material.
     *
     * @return The item builder.
     */
    @NotNull
    public ItemBuilder setMaterial(@NotNull Material material) {
        this.itemStack.setType(material);
        return this;
    }

    /**
     * Set the item amount.
     *
     * @param amount The item amount.
     *
     * @return The item builder.
     */
    @NotNull
    public ItemBuilder setAmount(@NotNull int amount) {
        this.itemStack.setAmount(amount);
        return this;
    }

    /**
     * Set the item lore.
     *
     * @param lore The item lore.
     *
     * @return The item builder.
     */
    @NotNull
    public ItemBuilder setLore(@Nullable String... lore) {
        this.itemMeta.setLore(Arrays.asList(lore));
        return this;
    }

    /**
     * Set the item enchantments.
     *
     * @param enchantments The item enchantments.
     *
     * @return The item builder.
     */
    @NotNull
    public ItemBuilder setEnchantments(@Nullable Map<Enchantment, Integer> enchantments) {
        if (enchantments != null && !enchantments.isEmpty())
            this.itemStack.addEnchantments(enchantments);
        return this;
    }

    /**
     * Set the item enchantment.
     *
     * @param enchantment The item enchantment.
     *
     * @return The item builder.
     */
    @NotNull
    public ItemBuilder setEnchantment(@NotNull Enchantment enchantment, @NotNull int level) {
        this.itemStack.addEnchantment(enchantment, level);
        return this;
    }

    /**
     * Set the item flags.
     *
     * @param itemFlags The item flags.
     *
     * @return The item builder.
     */
    public ItemBuilder setItemFlags(@Nullable ItemFlag... itemFlags) {
        if (itemFlags != null && itemFlags.length > 0)
            this.itemMeta.addItemFlags(itemFlags);
        return this;
    }

    /**
     * Set the item flag.
     *
     * @param itemFlag The item flag.
     *
     * @return The item builder.
     */
    @NotNull
    public ItemBuilder setItemFlag(@NotNull ItemFlag itemFlag) {
        this.itemMeta.addItemFlags(itemFlag);
        return this;
    }

    /**
     * Set the clickable item name.
     *
     * @see #build().
     *
     * @param clickEvent The click event.
     *
     * @return The clickable item.
     */
    @NotNull
    public IClickableItem build(@NotNull IClickEvent clickEvent) {
        return new IClickableItem() {

            /**
             * {@inheritDoc}
             */
            @Override
            public IClickEvent getClickEvent() {
                return clickEvent;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public ItemStack getItemStack() {
                return build().getItemStack();
            }
        };
    }

    /**
     * Build the item.
     *
     * @return The item.
     */
    @NotNull
    public IItem build() {
        itemStack.setItemMeta(itemMeta);
        return () -> itemStack;
    }

}
