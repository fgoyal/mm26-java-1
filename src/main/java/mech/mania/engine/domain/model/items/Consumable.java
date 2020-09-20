package mech.mania.engine.domain.model.items;

import mech.mania.engine.domain.model.ItemProtos;

public class Consumable extends Item {
    protected final TempStatusModifier effect;
    private final int stacks;


    /**
     * Creates a Consumable based on a Protocol Buffer with a given maximum number of stacks.
     * @param maxStack the maximum of this item that can be kept in one inventory slot
     * @param consumableProto the protocol buffer to be copied
     */
    public Consumable(int maxStack, ItemProtos.Consumable consumableProto) {
        super(maxStack);
        this.effect = new TempStatusModifier(consumableProto.getEffect());
        this.stacks = consumableProto.getStacks();
    }

    /**
     * Getter for the current number of stacks remaining on this item. (the stacks represent a number of the same
     * consumable being stored in a single inventory slot).
     * @return the number of stacks left
     */
    public int getStacks() {
        return stacks;
    }


    /**
     * Getter for the effect this consumable applies on use.
     * @return the effect
     */
    public TempStatusModifier getEffect() {
        return effect;
    }

}
