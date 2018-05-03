package com.lee.collection.entities;

import java.math.BigDecimal;
import java.util.Date;

public class CasePaid {
    private Integer id;

    private Integer state;

    private String caseId;

    private Date ptpTime;

    private BigDecimal ptpMoney;

    private Date cpTime;

    private BigDecimal cpMoney;

    private Date paidTime;

    private BigDecimal paidNum;

    private String surUser;

    private Date surTime;

    private String surRemark;

    private String delUser;

    private Date delTime;

    private BigDecimal mPaid;

    private BigDecimal cpmPaid;

    private String seNo;

    private BigDecimal cmPaid;

    private BigDecimal backPaid;

    private BigDecimal backPaidRate;

    private BigDecimal pbackPaid;

    private BigDecimal entrustPaid;

    private BigDecimal entrustPaidRate;

    private BigDecimal lastDebtM;

    private BigDecimal leftAmt;

    private String createEmpId;

    private Date createTime;

    private String modifyEmpId;

    private Date modifyTime;

    private Integer version;

    private String isDerate;

    private BigDecimal inDerate;

    private BigDecimal outDerate;

    private String cancelReason;

    private String repayType;

    private String operateEmpId;

    private Date operateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId == null ? null : caseId.trim();
    }

    public Date getPtpTime() {
        return ptpTime;
    }

    public void setPtpTime(Date ptpTime) {
        this.ptpTime = ptpTime;
    }

    public BigDecimal getPtpMoney() {
        return ptpMoney;
    }

    public void setPtpMoney(BigDecimal ptpMoney) {
        this.ptpMoney = ptpMoney;
    }

    public Date getCpTime() {
        return cpTime;
    }

    public void setCpTime(Date cpTime) {
        this.cpTime = cpTime;
    }

    public BigDecimal getCpMoney() {
        return cpMoney;
    }

    public void setCpMoney(BigDecimal cpMoney) {
        this.cpMoney = cpMoney;
    }

    public Date getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    public BigDecimal getPaidNum() {
        return paidNum;
    }

    public void setPaidNum(BigDecimal paidNum) {
        this.paidNum = paidNum;
    }

    public String getSurUser() {
        return surUser;
    }

    public void setSurUser(String surUser) {
        this.surUser = surUser == null ? null : surUser.trim();
    }

    public Date getSurTime() {
        return surTime;
    }

    public void setSurTime(Date surTime) {
        this.surTime = surTime;
    }

    public String getSurRemark() {
        return surRemark;
    }

    public void setSurRemark(String surRemark) {
        this.surRemark = surRemark == null ? null : surRemark.trim();
    }

    public String getDelUser() {
        return delUser;
    }

    public void setDelUser(String delUser) {
        this.delUser = delUser == null ? null : delUser.trim();
    }

    public Date getDelTime() {
        return delTime;
    }

    public void setDelTime(Date delTime) {
        this.delTime = delTime;
    }

    public BigDecimal getmPaid() {
        return mPaid;
    }

    public void setmPaid(BigDecimal mPaid) {
        this.mPaid = mPaid;
    }

    public BigDecimal getCpmPaid() {
        return cpmPaid;
    }

    public void setCpmPaid(BigDecimal cpmPaid) {
        this.cpmPaid = cpmPaid;
    }

    public String getSeNo() {
        return seNo;
    }

    public void setSeNo(String seNo) {
        this.seNo = seNo == null ? null : seNo.trim();
    }

    public BigDecimal getCmPaid() {
        return cmPaid;
    }

    public void setCmPaid(BigDecimal cmPaid) {
        this.cmPaid = cmPaid;
    }

    public BigDecimal getBackPaid() {
        return backPaid;
    }

    public void setBackPaid(BigDecimal backPaid) {
        this.backPaid = backPaid;
    }

    public BigDecimal getBackPaidRate() {
        return backPaidRate;
    }

    public void setBackPaidRate(BigDecimal backPaidRate) {
        this.backPaidRate = backPaidRate;
    }

    public BigDecimal getPbackPaid() {
        return pbackPaid;
    }

    public void setPbackPaid(BigDecimal pbackPaid) {
        this.pbackPaid = pbackPaid;
    }

    public BigDecimal getEntrustPaid() {
        return entrustPaid;
    }

    public void setEntrustPaid(BigDecimal entrustPaid) {
        this.entrustPaid = entrustPaid;
    }

    public BigDecimal getEntrustPaidRate() {
        return entrustPaidRate;
    }

    public void setEntrustPaidRate(BigDecimal entrustPaidRate) {
        this.entrustPaidRate = entrustPaidRate;
    }

    public BigDecimal getLastDebtM() {
        return lastDebtM;
    }

    public void setLastDebtM(BigDecimal lastDebtM) {
        this.lastDebtM = lastDebtM;
    }

    public BigDecimal getLeftAmt() {
        return leftAmt;
    }

    public void setLeftAmt(BigDecimal leftAmt) {
        this.leftAmt = leftAmt;
    }

    public String getCreateEmpId() {
        return createEmpId;
    }

    public void setCreateEmpId(String createEmpId) {
        this.createEmpId = createEmpId == null ? null : createEmpId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyEmpId() {
        return modifyEmpId;
    }

    public void setModifyEmpId(String modifyEmpId) {
        this.modifyEmpId = modifyEmpId == null ? null : modifyEmpId.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getIsDerate() {
        return isDerate;
    }

    public void setIsDerate(String isDerate) {
        this.isDerate = isDerate == null ? null : isDerate.trim();
    }

    public BigDecimal getInDerate() {
        return inDerate;
    }

    public void setInDerate(BigDecimal inDerate) {
        this.inDerate = inDerate;
    }

    public BigDecimal getOutDerate() {
        return outDerate;
    }

    public void setOutDerate(BigDecimal outDerate) {
        this.outDerate = outDerate;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType == null ? null : repayType.trim();
    }

    public String getOperateEmpId() {
        return operateEmpId;
    }

    public void setOperateEmpId(String operateEmpId) {
        this.operateEmpId = operateEmpId == null ? null : operateEmpId.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }
}