package cy.its.dispath.domain.model.rescue;

import java.util.Date;

public class DispatchRescueResource {
    private String resourceId;

    private String resourceType;

    private String resourceOrgName;

    private String alarmTel;

    private String name;

    private String post;

    private String personTel;

    private String lonLat;

    private String address;

    private String ambulanceInfo;

    private Short smallCraneNum;

    private Short mediumCraneNum;

    private Short largeCraneNum;

    private String materialReserves;

    private String fireTruckInfo;

    private String rescueHelicopter;

    private String remark;

    private String district;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public String getResourceOrgName() {
        return resourceOrgName;
    }

    public void setResourceOrgName(String resourceOrgName) {
        this.resourceOrgName = resourceOrgName == null ? null : resourceOrgName.trim();
    }

    public String getAlarmTel() {
        return alarmTel;
    }

    public void setAlarmTel(String alarmTel) {
        this.alarmTel = alarmTel == null ? null : alarmTel.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getPersonTel() {
        return personTel;
    }

    public void setPersonTel(String personTel) {
        this.personTel = personTel == null ? null : personTel.trim();
    }

    public String getLonLat() {
        return lonLat;
    }

    public void setLonLat(String lonLat) {
        this.lonLat = lonLat == null ? null : lonLat.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAmbulanceInfo() {
        return ambulanceInfo;
    }

    public void setAmbulanceInfo(String ambulanceInfo) {
        this.ambulanceInfo = ambulanceInfo == null ? null : ambulanceInfo.trim();
    }

    public Short getSmallCraneNum() {
        return smallCraneNum;
    }

    public void setSmallCraneNum(Short smallCraneNum) {
        this.smallCraneNum = smallCraneNum;
    }

    public Short getMediumCraneNum() {
        return mediumCraneNum;
    }

    public void setMediumCraneNum(Short mediumCraneNum) {
        this.mediumCraneNum = mediumCraneNum;
    }

    public Short getLargeCraneNum() {
        return largeCraneNum;
    }

    public void setLargeCraneNum(Short largeCraneNum) {
        this.largeCraneNum = largeCraneNum;
    }

    public String getMaterialReserves() {
        return materialReserves;
    }

    public void setMaterialReserves(String materialReserves) {
        this.materialReserves = materialReserves == null ? null : materialReserves.trim();
    }

    public String getFireTruckInfo() {
        return fireTruckInfo;
    }

    public void setFireTruckInfo(String fireTruckInfo) {
        this.fireTruckInfo = fireTruckInfo == null ? null : fireTruckInfo.trim();
    }

    public String getRescueHelicopter() {
        return rescueHelicopter;
    }

    public void setRescueHelicopter(String rescueHelicopter) {
        this.rescueHelicopter = rescueHelicopter == null ? null : rescueHelicopter.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}