package top.jayu.oa.entity;

import java.util.Date;

public class OaBill {
    private Integer id;

    private String code;

    private Byte type;

    private String currentStep;

    private Byte stopFlag;

    private Integer employId;

    private Integer nextEmployId;

    private Integer nextOrgId;

    private Integer orgId;

    private Byte orgOaType;

    private Date startTime;

    private Date endTime;

    private Byte workAge;

    private Short days;

    private Short peopleNumber;

    private String content;

    private String address;

    private Byte travelTool;

    private Integer amount;

    private String fileUrl1;

    private String fileUrl2;

    private String fileUrl3;

    private String extendContent;

    private Date createTime;

    private Date updateTime;

    private String mark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(String currentStep) {
        this.currentStep = currentStep == null ? null : currentStep.trim();
    }

    public Byte getStopFlag() {
        return stopFlag;
    }

    public void setStopFlag(Byte stopFlag) {
        this.stopFlag = stopFlag;
    }

    public Integer getEmployId() {
        return employId;
    }

    public void setEmployId(Integer employId) {
        this.employId = employId;
    }

    public Integer getNextEmployId() {
        return nextEmployId;
    }

    public void setNextEmployId(Integer nextEmployId) {
        this.nextEmployId = nextEmployId;
    }

    public Integer getNextOrgId() {
        return nextOrgId;
    }

    public void setNextOrgId(Integer nextOrgId) {
        this.nextOrgId = nextOrgId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Byte getOrgOaType() {
        return orgOaType;
    }

    public void setOrgOaType(Byte orgOaType) {
        this.orgOaType = orgOaType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Byte getWorkAge() {
        return workAge;
    }

    public void setWorkAge(Byte workAge) {
        this.workAge = workAge;
    }

    public Short getDays() {
        return days;
    }

    public void setDays(Short days) {
        this.days = days;
    }

    public Short getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Short peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Byte getTravelTool() {
        return travelTool;
    }

    public void setTravelTool(Byte travelTool) {
        this.travelTool = travelTool;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getFileUrl1() {
        return fileUrl1;
    }

    public void setFileUrl1(String fileUrl1) {
        this.fileUrl1 = fileUrl1 == null ? null : fileUrl1.trim();
    }

    public String getFileUrl2() {
        return fileUrl2;
    }

    public void setFileUrl2(String fileUrl2) {
        this.fileUrl2 = fileUrl2 == null ? null : fileUrl2.trim();
    }

    public String getFileUrl3() {
        return fileUrl3;
    }

    public void setFileUrl3(String fileUrl3) {
        this.fileUrl3 = fileUrl3 == null ? null : fileUrl3.trim();
    }

    public String getExtendContent() {
        return extendContent;
    }

    public void setExtendContent(String extendContent) {
        this.extendContent = extendContent == null ? null : extendContent.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
}