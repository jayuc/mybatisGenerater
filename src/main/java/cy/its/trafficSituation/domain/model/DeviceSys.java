package cy.its.trafficSituation.domain.model;

import java.math.BigDecimal;
import java.util.Date;

public class DeviceSys {
    private String deviceId;

    private String deviceSysModelId;

    private String contractId;

    private String deviceSysNbr;

    private String deviceName;

    private String orgId;

    private String deviceType;

    private String deviceBrand;

    private String manufactureSn;

    private String softwareVersion;

    private String networkType;

    private String safeConnectMeans;

    private String deviceIp;

    private Long devicePort;

    private String userName;

    private String password;

    private String simNbr;

    private Date installDate;

    private String installBy;

    private String mountingFacilityType;

    private Date enableUpdateDate;

    private String useStatusFlag;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String statusType;

    private Date statusUpdateTime;

    private String syncStatus;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String remark;

    private String powerType;

    private String transmissionMode;

    private String bandwidth;

    private String ownership;

    private String siteId;

    private String sectionIdList;

    private String collectionType;

    private String orgPrivilegeCode;

    private String contractorId;

    private String architecture;

    private String serverPlatId;

    private String verificationMark;

    private String lineStatisticsMark;

    private String deviceKey;

    private Date deviceStopEndTime;

    private String syncMarkup;

    private String infoCheck;

    private String infoCheckDesc;

    private String netContractor;

    private String itms2CameraId;

    private String itms2DeviceId;

    private String powerOffNetwork;

    private String itms2CameraSn;

    private String toTable;

    private String itms2Isgun;

    private String position;

    private String yushiSn;

    private Date sStatusTime;

    private String sFaultDetails;

    private String sComponentStatusResults;

    private Date sDeviceCurTime;

    private Short sTimeDiff;

    private Date sLastUploadTime;

    private Date sLatestDataTime;

    private String sMapFaultCode;

    private String sMapDataRecvTime;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getDeviceSysModelId() {
        return deviceSysModelId;
    }

    public void setDeviceSysModelId(String deviceSysModelId) {
        this.deviceSysModelId = deviceSysModelId == null ? null : deviceSysModelId.trim();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getDeviceSysNbr() {
        return deviceSysNbr;
    }

    public void setDeviceSysNbr(String deviceSysNbr) {
        this.deviceSysNbr = deviceSysNbr == null ? null : deviceSysNbr.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand == null ? null : deviceBrand.trim();
    }

    public String getManufactureSn() {
        return manufactureSn;
    }

    public void setManufactureSn(String manufactureSn) {
        this.manufactureSn = manufactureSn == null ? null : manufactureSn.trim();
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion == null ? null : softwareVersion.trim();
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType == null ? null : networkType.trim();
    }

    public String getSafeConnectMeans() {
        return safeConnectMeans;
    }

    public void setSafeConnectMeans(String safeConnectMeans) {
        this.safeConnectMeans = safeConnectMeans == null ? null : safeConnectMeans.trim();
    }

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp == null ? null : deviceIp.trim();
    }

    public Long getDevicePort() {
        return devicePort;
    }

    public void setDevicePort(Long devicePort) {
        this.devicePort = devicePort;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSimNbr() {
        return simNbr;
    }

    public void setSimNbr(String simNbr) {
        this.simNbr = simNbr == null ? null : simNbr.trim();
    }

    public Date getInstallDate() {
        return installDate;
    }

    public void setInstallDate(Date installDate) {
        this.installDate = installDate;
    }

    public String getInstallBy() {
        return installBy;
    }

    public void setInstallBy(String installBy) {
        this.installBy = installBy == null ? null : installBy.trim();
    }

    public String getMountingFacilityType() {
        return mountingFacilityType;
    }

    public void setMountingFacilityType(String mountingFacilityType) {
        this.mountingFacilityType = mountingFacilityType == null ? null : mountingFacilityType.trim();
    }

    public Date getEnableUpdateDate() {
        return enableUpdateDate;
    }

    public void setEnableUpdateDate(Date enableUpdateDate) {
        this.enableUpdateDate = enableUpdateDate;
    }

    public String getUseStatusFlag() {
        return useStatusFlag;
    }

    public void setUseStatusFlag(String useStatusFlag) {
        this.useStatusFlag = useStatusFlag == null ? null : useStatusFlag.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType == null ? null : statusType.trim();
    }

    public Date getStatusUpdateTime() {
        return statusUpdateTime;
    }

    public void setStatusUpdateTime(Date statusUpdateTime) {
        this.statusUpdateTime = statusUpdateTime;
    }

    public String getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus == null ? null : syncStatus.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType == null ? null : powerType.trim();
    }

    public String getTransmissionMode() {
        return transmissionMode;
    }

    public void setTransmissionMode(String transmissionMode) {
        this.transmissionMode = transmissionMode == null ? null : transmissionMode.trim();
    }

    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth == null ? null : bandwidth.trim();
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership == null ? null : ownership.trim();
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId == null ? null : siteId.trim();
    }

    public String getSectionIdList() {
        return sectionIdList;
    }

    public void setSectionIdList(String sectionIdList) {
        this.sectionIdList = sectionIdList == null ? null : sectionIdList.trim();
    }

    public String getCollectionType() {
        return collectionType;
    }

    public void setCollectionType(String collectionType) {
        this.collectionType = collectionType == null ? null : collectionType.trim();
    }

    public String getOrgPrivilegeCode() {
        return orgPrivilegeCode;
    }

    public void setOrgPrivilegeCode(String orgPrivilegeCode) {
        this.orgPrivilegeCode = orgPrivilegeCode == null ? null : orgPrivilegeCode.trim();
    }

    public String getContractorId() {
        return contractorId;
    }

    public void setContractorId(String contractorId) {
        this.contractorId = contractorId == null ? null : contractorId.trim();
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture == null ? null : architecture.trim();
    }

    public String getServerPlatId() {
        return serverPlatId;
    }

    public void setServerPlatId(String serverPlatId) {
        this.serverPlatId = serverPlatId == null ? null : serverPlatId.trim();
    }

    public String getVerificationMark() {
        return verificationMark;
    }

    public void setVerificationMark(String verificationMark) {
        this.verificationMark = verificationMark == null ? null : verificationMark.trim();
    }

    public String getLineStatisticsMark() {
        return lineStatisticsMark;
    }

    public void setLineStatisticsMark(String lineStatisticsMark) {
        this.lineStatisticsMark = lineStatisticsMark == null ? null : lineStatisticsMark.trim();
    }

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey == null ? null : deviceKey.trim();
    }

    public Date getDeviceStopEndTime() {
        return deviceStopEndTime;
    }

    public void setDeviceStopEndTime(Date deviceStopEndTime) {
        this.deviceStopEndTime = deviceStopEndTime;
    }

    public String getSyncMarkup() {
        return syncMarkup;
    }

    public void setSyncMarkup(String syncMarkup) {
        this.syncMarkup = syncMarkup == null ? null : syncMarkup.trim();
    }

    public String getInfoCheck() {
        return infoCheck;
    }

    public void setInfoCheck(String infoCheck) {
        this.infoCheck = infoCheck == null ? null : infoCheck.trim();
    }

    public String getInfoCheckDesc() {
        return infoCheckDesc;
    }

    public void setInfoCheckDesc(String infoCheckDesc) {
        this.infoCheckDesc = infoCheckDesc == null ? null : infoCheckDesc.trim();
    }

    public String getNetContractor() {
        return netContractor;
    }

    public void setNetContractor(String netContractor) {
        this.netContractor = netContractor == null ? null : netContractor.trim();
    }

    public String getItms2CameraId() {
        return itms2CameraId;
    }

    public void setItms2CameraId(String itms2CameraId) {
        this.itms2CameraId = itms2CameraId == null ? null : itms2CameraId.trim();
    }

    public String getItms2DeviceId() {
        return itms2DeviceId;
    }

    public void setItms2DeviceId(String itms2DeviceId) {
        this.itms2DeviceId = itms2DeviceId == null ? null : itms2DeviceId.trim();
    }

    public String getPowerOffNetwork() {
        return powerOffNetwork;
    }

    public void setPowerOffNetwork(String powerOffNetwork) {
        this.powerOffNetwork = powerOffNetwork == null ? null : powerOffNetwork.trim();
    }

    public String getItms2CameraSn() {
        return itms2CameraSn;
    }

    public void setItms2CameraSn(String itms2CameraSn) {
        this.itms2CameraSn = itms2CameraSn == null ? null : itms2CameraSn.trim();
    }

    public String getToTable() {
        return toTable;
    }

    public void setToTable(String toTable) {
        this.toTable = toTable == null ? null : toTable.trim();
    }

    public String getItms2Isgun() {
        return itms2Isgun;
    }

    public void setItms2Isgun(String itms2Isgun) {
        this.itms2Isgun = itms2Isgun == null ? null : itms2Isgun.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getYushiSn() {
        return yushiSn;
    }

    public void setYushiSn(String yushiSn) {
        this.yushiSn = yushiSn == null ? null : yushiSn.trim();
    }

    public Date getsStatusTime() {
        return sStatusTime;
    }

    public void setsStatusTime(Date sStatusTime) {
        this.sStatusTime = sStatusTime;
    }

    public String getsFaultDetails() {
        return sFaultDetails;
    }

    public void setsFaultDetails(String sFaultDetails) {
        this.sFaultDetails = sFaultDetails == null ? null : sFaultDetails.trim();
    }

    public String getsComponentStatusResults() {
        return sComponentStatusResults;
    }

    public void setsComponentStatusResults(String sComponentStatusResults) {
        this.sComponentStatusResults = sComponentStatusResults == null ? null : sComponentStatusResults.trim();
    }

    public Date getsDeviceCurTime() {
        return sDeviceCurTime;
    }

    public void setsDeviceCurTime(Date sDeviceCurTime) {
        this.sDeviceCurTime = sDeviceCurTime;
    }

    public Short getsTimeDiff() {
        return sTimeDiff;
    }

    public void setsTimeDiff(Short sTimeDiff) {
        this.sTimeDiff = sTimeDiff;
    }

    public Date getsLastUploadTime() {
        return sLastUploadTime;
    }

    public void setsLastUploadTime(Date sLastUploadTime) {
        this.sLastUploadTime = sLastUploadTime;
    }

    public Date getsLatestDataTime() {
        return sLatestDataTime;
    }

    public void setsLatestDataTime(Date sLatestDataTime) {
        this.sLatestDataTime = sLatestDataTime;
    }

    public String getsMapFaultCode() {
        return sMapFaultCode;
    }

    public void setsMapFaultCode(String sMapFaultCode) {
        this.sMapFaultCode = sMapFaultCode == null ? null : sMapFaultCode.trim();
    }

    public String getsMapDataRecvTime() {
        return sMapDataRecvTime;
    }

    public void setsMapDataRecvTime(String sMapDataRecvTime) {
        this.sMapDataRecvTime = sMapDataRecvTime == null ? null : sMapDataRecvTime.trim();
    }
}