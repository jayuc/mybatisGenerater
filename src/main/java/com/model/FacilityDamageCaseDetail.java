package com.model;

public class FacilityDamageCaseDetail {
    private String caseId;

    private String facilityName;

    private String facilityType;

    private String facilityFunction;

    private String maintainReason;

    private String specification;

    private String material;

    private String paint;

    private Long quantity;

    private String unit;

    private Long price;

    private Long total;

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId == null ? null : caseId.trim();
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName == null ? null : facilityName.trim();
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType == null ? null : facilityType.trim();
    }

    public String getFacilityFunction() {
        return facilityFunction;
    }

    public void setFacilityFunction(String facilityFunction) {
        this.facilityFunction = facilityFunction == null ? null : facilityFunction.trim();
    }

    public String getMaintainReason() {
        return maintainReason;
    }

    public void setMaintainReason(String maintainReason) {
        this.maintainReason = maintainReason == null ? null : maintainReason.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint == null ? null : paint.trim();
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}