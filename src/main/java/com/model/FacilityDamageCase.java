package com.model;

import java.util.Date;

public class FacilityDamageCase {
    private String caseId;

    private Date acceptTime;

    private String caseRoadSeg;

    private String caseSrc;

    private String districtCode;

    private String caseNature;

    private String caseDesc;

    private Long amount;

    private String casePos;

    private String orgId;

    private String repairType;

    private Date jeeveBeginTime;

    private Date jeeveOverTime;

    private String handleStatus;

    private String compensateStatus;

    private Long compensatedAmount;

    private Long notCompensatedAmount;

    private String approvalRecord;

    private String approvalPoliceMan;

    private String approvalLeader;

    private String isCount;

    private String remark;

    private Date createTime;

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId == null ? null : caseId.trim();
    }

    public Date getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    public String getCaseRoadSeg() {
        return caseRoadSeg;
    }

    public void setCaseRoadSeg(String caseRoadSeg) {
        this.caseRoadSeg = caseRoadSeg == null ? null : caseRoadSeg.trim();
    }

    public String getCaseSrc() {
        return caseSrc;
    }

    public void setCaseSrc(String caseSrc) {
        this.caseSrc = caseSrc == null ? null : caseSrc.trim();
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    public String getCaseNature() {
        return caseNature;
    }

    public void setCaseNature(String caseNature) {
        this.caseNature = caseNature == null ? null : caseNature.trim();
    }

    public String getCaseDesc() {
        return caseDesc;
    }

    public void setCaseDesc(String caseDesc) {
        this.caseDesc = caseDesc == null ? null : caseDesc.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getCasePos() {
        return casePos;
    }

    public void setCasePos(String casePos) {
        this.casePos = casePos == null ? null : casePos.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType == null ? null : repairType.trim();
    }

    public Date getJeeveBeginTime() {
        return jeeveBeginTime;
    }

    public void setJeeveBeginTime(Date jeeveBeginTime) {
        this.jeeveBeginTime = jeeveBeginTime;
    }

    public Date getJeeveOverTime() {
        return jeeveOverTime;
    }

    public void setJeeveOverTime(Date jeeveOverTime) {
        this.jeeveOverTime = jeeveOverTime;
    }

    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus == null ? null : handleStatus.trim();
    }

    public String getCompensateStatus() {
        return compensateStatus;
    }

    public void setCompensateStatus(String compensateStatus) {
        this.compensateStatus = compensateStatus == null ? null : compensateStatus.trim();
    }

    public Long getCompensatedAmount() {
        return compensatedAmount;
    }

    public void setCompensatedAmount(Long compensatedAmount) {
        this.compensatedAmount = compensatedAmount;
    }

    public Long getNotCompensatedAmount() {
        return notCompensatedAmount;
    }

    public void setNotCompensatedAmount(Long notCompensatedAmount) {
        this.notCompensatedAmount = notCompensatedAmount;
    }

    public String getApprovalRecord() {
        return approvalRecord;
    }

    public void setApprovalRecord(String approvalRecord) {
        this.approvalRecord = approvalRecord == null ? null : approvalRecord.trim();
    }

    public String getApprovalPoliceMan() {
        return approvalPoliceMan;
    }

    public void setApprovalPoliceMan(String approvalPoliceMan) {
        this.approvalPoliceMan = approvalPoliceMan == null ? null : approvalPoliceMan.trim();
    }

    public String getApprovalLeader() {
        return approvalLeader;
    }

    public void setApprovalLeader(String approvalLeader) {
        this.approvalLeader = approvalLeader == null ? null : approvalLeader.trim();
    }

    public String getIsCount() {
        return isCount;
    }

    public void setIsCount(String isCount) {
        this.isCount = isCount == null ? null : isCount.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}