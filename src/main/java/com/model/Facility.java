package com.model;

import java.math.BigDecimal;
import java.util.Date;

public class Facility {
    private String facilityId;

    private String facilityNo;

    private String facilityName;

    private String facilityType;

    private String facilityFunction;

    private String roadId;

    private String districtCode;

    private String lonlat;

    private String address;

    private String orgId;

    private String projectId;

    private Date installBeginTime;

    private Date installEndTime;

    private String signalInstallMode;

    private String signalBrand;

    private Short designLife;

    private String specification;

    private String material;

    private String contractorId;

    private String barrierSurface;

    private String signContent;

    private String signLayout;

    private String signSupport;

    private Short signLimitSpeed;

    private String signBridge;

    private BigDecimal markLength;

    private BigDecimal markWidth;

    private Short markAreaRatio;

    private BigDecimal markArea;

    private BigDecimal markPrice;

    private String markPaint;

    private String ploIsCharge;

    private Short ploMotorBerth;

    private Short ploChargeMotorBerth;

    private Short ploFreeMotorBerth;

    private Short ploNonMotorBerth;

    private Short ploChargeNonMotorBerth;

    private Short ploFreeNonMotorBerth;

    private String unit;

    private Short quantity;

    private BigDecimal total;

    private String facilityStatus;

    private String remark;

    private byte[] facilityImage;

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId == null ? null : facilityId.trim();
    }

    public String getFacilityNo() {
        return facilityNo;
    }

    public void setFacilityNo(String facilityNo) {
        this.facilityNo = facilityNo == null ? null : facilityNo.trim();
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

    public String getRoadId() {
        return roadId;
    }

    public void setRoadId(String roadId) {
        this.roadId = roadId == null ? null : roadId.trim();
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    public String getLonlat() {
        return lonlat;
    }

    public void setLonlat(String lonlat) {
        this.lonlat = lonlat == null ? null : lonlat.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public Date getInstallBeginTime() {
        return installBeginTime;
    }

    public void setInstallBeginTime(Date installBeginTime) {
        this.installBeginTime = installBeginTime;
    }

    public Date getInstallEndTime() {
        return installEndTime;
    }

    public void setInstallEndTime(Date installEndTime) {
        this.installEndTime = installEndTime;
    }

    public String getSignalInstallMode() {
        return signalInstallMode;
    }

    public void setSignalInstallMode(String signalInstallMode) {
        this.signalInstallMode = signalInstallMode == null ? null : signalInstallMode.trim();
    }

    public String getSignalBrand() {
        return signalBrand;
    }

    public void setSignalBrand(String signalBrand) {
        this.signalBrand = signalBrand == null ? null : signalBrand.trim();
    }

    public Short getDesignLife() {
        return designLife;
    }

    public void setDesignLife(Short designLife) {
        this.designLife = designLife;
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

    public String getContractorId() {
        return contractorId;
    }

    public void setContractorId(String contractorId) {
        this.contractorId = contractorId == null ? null : contractorId.trim();
    }

    public String getBarrierSurface() {
        return barrierSurface;
    }

    public void setBarrierSurface(String barrierSurface) {
        this.barrierSurface = barrierSurface == null ? null : barrierSurface.trim();
    }

    public String getSignContent() {
        return signContent;
    }

    public void setSignContent(String signContent) {
        this.signContent = signContent == null ? null : signContent.trim();
    }

    public String getSignLayout() {
        return signLayout;
    }

    public void setSignLayout(String signLayout) {
        this.signLayout = signLayout == null ? null : signLayout.trim();
    }

    public String getSignSupport() {
        return signSupport;
    }

    public void setSignSupport(String signSupport) {
        this.signSupport = signSupport == null ? null : signSupport.trim();
    }

    public Short getSignLimitSpeed() {
        return signLimitSpeed;
    }

    public void setSignLimitSpeed(Short signLimitSpeed) {
        this.signLimitSpeed = signLimitSpeed;
    }

    public String getSignBridge() {
        return signBridge;
    }

    public void setSignBridge(String signBridge) {
        this.signBridge = signBridge == null ? null : signBridge.trim();
    }

    public BigDecimal getMarkLength() {
        return markLength;
    }

    public void setMarkLength(BigDecimal markLength) {
        this.markLength = markLength;
    }

    public BigDecimal getMarkWidth() {
        return markWidth;
    }

    public void setMarkWidth(BigDecimal markWidth) {
        this.markWidth = markWidth;
    }

    public Short getMarkAreaRatio() {
        return markAreaRatio;
    }

    public void setMarkAreaRatio(Short markAreaRatio) {
        this.markAreaRatio = markAreaRatio;
    }

    public BigDecimal getMarkArea() {
        return markArea;
    }

    public void setMarkArea(BigDecimal markArea) {
        this.markArea = markArea;
    }

    public BigDecimal getMarkPrice() {
        return markPrice;
    }

    public void setMarkPrice(BigDecimal markPrice) {
        this.markPrice = markPrice;
    }

    public String getMarkPaint() {
        return markPaint;
    }

    public void setMarkPaint(String markPaint) {
        this.markPaint = markPaint == null ? null : markPaint.trim();
    }

    public String getPloIsCharge() {
        return ploIsCharge;
    }

    public void setPloIsCharge(String ploIsCharge) {
        this.ploIsCharge = ploIsCharge == null ? null : ploIsCharge.trim();
    }

    public Short getPloMotorBerth() {
        return ploMotorBerth;
    }

    public void setPloMotorBerth(Short ploMotorBerth) {
        this.ploMotorBerth = ploMotorBerth;
    }

    public Short getPloChargeMotorBerth() {
        return ploChargeMotorBerth;
    }

    public void setPloChargeMotorBerth(Short ploChargeMotorBerth) {
        this.ploChargeMotorBerth = ploChargeMotorBerth;
    }

    public Short getPloFreeMotorBerth() {
        return ploFreeMotorBerth;
    }

    public void setPloFreeMotorBerth(Short ploFreeMotorBerth) {
        this.ploFreeMotorBerth = ploFreeMotorBerth;
    }

    public Short getPloNonMotorBerth() {
        return ploNonMotorBerth;
    }

    public void setPloNonMotorBerth(Short ploNonMotorBerth) {
        this.ploNonMotorBerth = ploNonMotorBerth;
    }

    public Short getPloChargeNonMotorBerth() {
        return ploChargeNonMotorBerth;
    }

    public void setPloChargeNonMotorBerth(Short ploChargeNonMotorBerth) {
        this.ploChargeNonMotorBerth = ploChargeNonMotorBerth;
    }

    public Short getPloFreeNonMotorBerth() {
        return ploFreeNonMotorBerth;
    }

    public void setPloFreeNonMotorBerth(Short ploFreeNonMotorBerth) {
        this.ploFreeNonMotorBerth = ploFreeNonMotorBerth;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getFacilityStatus() {
        return facilityStatus;
    }

    public void setFacilityStatus(String facilityStatus) {
        this.facilityStatus = facilityStatus == null ? null : facilityStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public byte[] getFacilityImage() {
        return facilityImage;
    }

    public void setFacilityImage(byte[] facilityImage) {
        this.facilityImage = facilityImage;
    }
}