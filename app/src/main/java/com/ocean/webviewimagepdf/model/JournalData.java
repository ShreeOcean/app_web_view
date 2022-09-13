package com.ocean.webviewimagepdf.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JournalData {

    @SerializedName("RefNo")
    public String refNo;

    @SerializedName("CreatedDate")
    public String createdDate;

    @SerializedName("EnterBy")
    public String enterBy;

    @SerializedName("EmpCode")
    public String empCode;

    @SerializedName("ExpenseFor")
    public String expenseFor;

    @SerializedName("ExpenseForEmpCode")
    public String expenseForEmpCode;

    @SerializedName("EmpType")
    public String empType;

    @SerializedName("ProjectCoordinator")
    public String projectCoordinator;

    @SerializedName("DeptHead")
    public String deptHead;

    @SerializedName("ProjectID")
    public String projectID;

    @SerializedName("PrjName")
    public String prjName;

    @SerializedName("SubProjectID")
    public String subProjectID;

    @SerializedName("SubProject")
    public String subProject;

    @SerializedName("BMSID")
    public String bmsid;

    @SerializedName("BMS")
    public String bms;

    @SerializedName("Status")
    public String status;

    @SerializedName("OrgID")
    public String orgID;

    @SerializedName("Org")
    public String org;

    @SerializedName("ExpDate")
    public String expDate;

    @SerializedName("ExpSheet")
    public String expSheet;

    @SerializedName("ExpSheetAttachment")
    public String expSheetAttachment;

    @SerializedName("ExpSheetAttachmentPath")
    public String expSheetAttachmentPath;

    @SerializedName("Msg")
    public String msg;

    @SerializedName("ExpInfo")
    public List<ExpInfo> expInfo = null;

    @SerializedName("InitialExpInfo")
    public List<InitialExpInfo> initialExpInfo = null;

    @SerializedName("TotalAmount")
    public String totalAmount;

    @SerializedName("InitialTotalAmount")
    public String initialTotalAmount;

    @SerializedName("ModifyStatus")
    public String modifyStatus;

    @SerializedName("ModifyInfo")
    public String modifyInfo;

    public JournalData(String refNo, String createdDate, String enterBy, String empCode, String expenseFor, String expenseForEmpCode, String empType, String projectCoordinator, String deptHead, String projectID, String prjName, String subProjectID, String subProject, String bmsid, String bms, String status, String orgID, String org, String expDate, String expSheet, String expSheetAttachment, String expSheetAttachmentPath, String msg, List<ExpInfo> expInfo, List<InitialExpInfo> initialExpInfo, String totalAmount, String initialTotalAmount, String modifyStatus, String modifyInfo) {
        this.refNo = refNo;
        this.createdDate = createdDate;
        this.enterBy = enterBy;
        this.empCode = empCode;
        this.expenseFor = expenseFor;
        this.expenseForEmpCode = expenseForEmpCode;
        this.empType = empType;
        this.projectCoordinator = projectCoordinator;
        this.deptHead = deptHead;
        this.projectID = projectID;
        this.prjName = prjName;
        this.subProjectID = subProjectID;
        this.subProject = subProject;
        this.bmsid = bmsid;
        this.bms = bms;
        this.status = status;
        this.orgID = orgID;
        this.org = org;
        this.expDate = expDate;
        this.expSheet = expSheet;
        this.expSheetAttachment = expSheetAttachment;
        this.expSheetAttachmentPath = expSheetAttachmentPath;
        this.msg = msg;
        this.expInfo = expInfo;
        this.initialExpInfo = initialExpInfo;
        this.totalAmount = totalAmount;
        this.initialTotalAmount = initialTotalAmount;
        this.modifyStatus = modifyStatus;
        this.modifyInfo = modifyInfo;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getEnterBy() {
        return enterBy;
    }

    public void setEnterBy(String enterBy) {
        this.enterBy = enterBy;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getExpenseFor() {
        return expenseFor;
    }

    public void setExpenseFor(String expenseFor) {
        this.expenseFor = expenseFor;
    }

    public String getExpenseForEmpCode() {
        return expenseForEmpCode;
    }

    public void setExpenseForEmpCode(String expenseForEmpCode) {
        this.expenseForEmpCode = expenseForEmpCode;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public String getProjectCoordinator() {
        return projectCoordinator;
    }

    public void setProjectCoordinator(String projectCoordinator) {
        this.projectCoordinator = projectCoordinator;
    }

    public String getDeptHead() {
        return deptHead;
    }

    public void setDeptHead(String deptHead) {
        this.deptHead = deptHead;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getPrjName() {
        return prjName;
    }

    public void setPrjName(String prjName) {
        this.prjName = prjName;
    }

    public String getSubProjectID() {
        return subProjectID;
    }

    public void setSubProjectID(String subProjectID) {
        this.subProjectID = subProjectID;
    }

    public String getSubProject() {
        return subProject;
    }

    public void setSubProject(String subProject) {
        this.subProject = subProject;
    }

    public String getBmsid() {
        return bmsid;
    }

    public void setBmsid(String bmsid) {
        this.bmsid = bmsid;
    }

    public String getBms() {
        return bms;
    }

    public void setBms(String bms) {
        this.bms = bms;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrgID() {
        return orgID;
    }

    public void setOrgID(String orgID) {
        this.orgID = orgID;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getExpSheet() {
        return expSheet;
    }

    public void setExpSheet(String expSheet) {
        this.expSheet = expSheet;
    }

    public String getExpSheetAttachment() {
        return expSheetAttachment;
    }

    public void setExpSheetAttachment(String expSheetAttachment) {
        this.expSheetAttachment = expSheetAttachment;
    }

    public String getExpSheetAttachmentPath() {
        return expSheetAttachmentPath;
    }

    public void setExpSheetAttachmentPath(String expSheetAttachmentPath) {
        this.expSheetAttachmentPath = expSheetAttachmentPath;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ExpInfo> getExpInfo() {
        return expInfo;
    }

    public void setExpInfo(List<ExpInfo> expInfo) {
        this.expInfo = expInfo;
    }

    public List<InitialExpInfo> getInitialExpInfo() {
        return initialExpInfo;
    }

    public void setInitialExpInfo(List<InitialExpInfo> initialExpInfo) {
        this.initialExpInfo = initialExpInfo;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getInitialTotalAmount() {
        return initialTotalAmount;
    }

    public void setInitialTotalAmount(String initialTotalAmount) {
        this.initialTotalAmount = initialTotalAmount;
    }

    public String getModifyStatus() {
        return modifyStatus;
    }

    public void setModifyStatus(String modifyStatus) {
        this.modifyStatus = modifyStatus;
    }

    public String getModifyInfo() {
        return modifyInfo;
    }

    public void setModifyInfo(String modifyInfo) {
        this.modifyInfo = modifyInfo;
    }
}
