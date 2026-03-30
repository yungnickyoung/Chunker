package com.hivemc.chunker.conversion.intermediate.column.blockentity;

import java.util.Objects;

/**
 * Represents a Jigsaw Block Entity.
 */
public class JigsawBlockEntity extends BlockEntity {
    private String name;
    private String target;
    private String pool;
    private String finalState;
    private Joint joint;
    private int placementPriority;
    private int selectionPriority;

    /**
     * Get the name of this Jigsaw block.
     *
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of this Jigsaw block.
     *
     * @param name the name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the target of this Jigsaw block.
     *
     * @return the target.
     */
    public String getTarget() {
        return target;
    }

    /**
     * Set the target of this Jigsaw block.
     *
     * @param target the target.
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * Get the target pool of this Jigsaw block.
     *
     * @return the target pool.
     */
    public String getPool() {
        return pool;
    }

    /**
     * Set the target pool of this Jigsaw block.
     *
     * @param pool the target pool.
     */
    public void setPool(String pool) {
        this.pool = pool;
    }

    /**
     * Get the final state for this Jigsaw block.
     *
     * @return the final state.
     */
    public String getFinalState() {
        return finalState;
    }

    /**
     * Set the final state for this Jigsaw block.
     *
     * @param finalState the final state.
     */
    public void setFinalState(String finalState) {
        this.finalState = finalState;
    }

    /**
     * Get the joint type for this Jigsaw block.
     *
     * @return the joint.
     */
    public Joint getJoint() {
        return joint;
    }

    /**
     * Set the joint type for this Jigsaw block.
     *
     * @param joint the joint.
     */
    public void setJoint(Joint joint) {
        this.joint = joint;
    }

    /**
     * Get the placement priority for this Jigsaw block.
     *
     * @return the placement priority.
     */
    public int getPlacementPriority() {
        return placementPriority;
    }

    /**
     * Set the placement priority for this Jigsaw block.
     *
     * @param placementPriority the placement priority.
     */
    public void setPlacementPriority(int placementPriority) {
        this.placementPriority = placementPriority;
    }

    /**
     * Get the selection priority for this Jigsaw block.
     *
     * @return the selection priority.
     */
    public int getSelectionPriority() {
        return selectionPriority;
    }

    /**
     * Set the selection priority for this Jigsaw block.
     *
     * @param selectionPriority the selection priority.
     */
    public void setSelectionPriority(int selectionPriority) {
        this.selectionPriority = selectionPriority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JigsawBlockEntity that)) return false;
        if (!super.equals(o)) return false;
        return getPlacementPriority() == that.getPlacementPriority() &&
                getSelectionPriority() == that.getSelectionPriority() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getTarget(), that.getTarget()) &&
                Objects.equals(getPool(), that.getPool()) &&
                Objects.equals(getFinalState(), that.getFinalState()) &&
                getJoint() == that.getJoint();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), getTarget(), getPool(), getFinalState(), getJoint(), getPlacementPriority(), getSelectionPriority());
    }

    /**
     * The joint type used by a Jigsaw block.
     */
    public enum Joint {
        /**
         * Align all axis except the connected one.
         */
        ALIGNED,
        /**
         * Allow rotation in any direction.
         */
        ROLLABLE
    }
}
