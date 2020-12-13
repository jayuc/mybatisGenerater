package top.jayu.oa.entity;

import java.util.Date;

public class OaBillOpera {
    private Integer id;

    private Integer billId;

    private String step;

    private Integer approveEmployId;

    private Integer approveOrgId;

    private Byte passFlag;

    private String content;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step == null ? null : step.trim();
    }

    public Integer getApproveEmployId() {
        return approveEmployId;
    }

    public void setApproveEmployId(Integer approveEmployId) {
        this.approveEmployId = approveEmployId;
    }

    public Integer getApproveOrgId() {
        return approveOrgId;
    }

    public void setApproveOrgId(Integer approveOrgId) {
        this.approveOrgId = approveOrgId;
    }

    public Byte getPassFlag() {
        return passFlag;
    }

    public void setPassFlag(Byte passFlag) {
        this.passFlag = passFlag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}