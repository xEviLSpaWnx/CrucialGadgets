package com.xevilspawnx.crucialgadgets.items;

import com.xevilspawnx.crucialgadgets.CrucialGadgets;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class Wings extends Item {

    private boolean isActive = false;

    public Wings() {
        super(new Properties().group(CrucialGadgets.TAB)
                .maxStackSize(1)
                .defaultMaxDamage(500)
        );
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
            if (!player.isCreative() && !player.isSpectator() && !world.isRemote) {
                if (player.getHeldItemMainhand().getItem() == this.getItem()) {
                    if (isActive == false) {
                        CrucialGadgets.LOGGER.info("startFlying");
                        isActive = true;
                        startFlying(player);
                    }
                    else {
                        CrucialGadgets.LOGGER.info("stopFlying");
                        isActive = false;
                        stopFlying(player);
                    }
                }
            }
        return super.onItemRightClick(world, player, hand);
    }

    private void startFlying(PlayerEntity player) {

        player.abilities.allowFlying = true;
        player.sendPlayerAbilities();
    }

    private void stopFlying(PlayerEntity player) {

        player.abilities.isFlying = false;
        player.abilities.allowFlying = false;
        player.sendPlayerAbilities();
    }
}