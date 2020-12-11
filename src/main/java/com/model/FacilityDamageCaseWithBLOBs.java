package com.model;

public class FacilityDamageCaseWithBLOBs extends FacilityDamageCase {
    private byte[] imageBeforeHandle;

    private byte[] imageAfterHandle;

    private byte[] imageBeforeRepair;

    private byte[] imageAfterRepair;

    public byte[] getImageBeforeHandle() {
        return imageBeforeHandle;
    }

    public void setImageBeforeHandle(byte[] imageBeforeHandle) {
        this.imageBeforeHandle = imageBeforeHandle;
    }

    public byte[] getImageAfterHandle() {
        return imageAfterHandle;
    }

    public void setImageAfterHandle(byte[] imageAfterHandle) {
        this.imageAfterHandle = imageAfterHandle;
    }

    public byte[] getImageBeforeRepair() {
        return imageBeforeRepair;
    }

    public void setImageBeforeRepair(byte[] imageBeforeRepair) {
        this.imageBeforeRepair = imageBeforeRepair;
    }

    public byte[] getImageAfterRepair() {
        return imageAfterRepair;
    }

    public void setImageAfterRepair(byte[] imageAfterRepair) {
        this.imageAfterRepair = imageAfterRepair;
    }
}