package com.ocean.webviewimagepdf.model;

import com.google.gson.annotations.SerializedName;

public class ExpInfo {

    @SerializedName("ID")
    public String id;

    @SerializedName("ExpDate")
    public String expDate;

    @SerializedName("ExpResn")
    public String expResn;

    @SerializedName("ExpResnID")
    public String expResnID;

    @SerializedName("ResnSubCatID")
    public Object resnSubCatID;

    @SerializedName("ResnSubCat")
    public Object resnSubCat;

    @SerializedName("Amount")
    public String amount;

    @SerializedName("Attachment")
    public String attachment;

    @SerializedName("AttachmentPath")
    public String attachmentPath;

    @SerializedName("Remark")
    public String remark;

    public ExpInfo(String id, String expDate, String expResn, String expResnID, Object resnSubCatID, Object resnSubCat, String amount, String attachment, String attachmentPath, String remark) {
        this.id = id;
        this.expDate = expDate;
        this.expResn = expResn;
        this.expResnID = expResnID;
        this.resnSubCatID = resnSubCatID;
        this.resnSubCat = resnSubCat;
        this.amount = amount;
        this.attachment = attachment;
        this.attachmentPath = attachmentPath;
        this.remark = remark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getExpResn() {
        return expResn;
    }

    public void setExpResn(String expResn) {
        this.expResn = expResn;
    }

    public String getExpResnID() {
        return expResnID;
    }

    public void setExpResnID(String expResnID) {
        this.expResnID = expResnID;
    }

    public Object getResnSubCatID() {
        return resnSubCatID;
    }

    public void setResnSubCatID(Object resnSubCatID) {
        this.resnSubCatID = resnSubCatID;
    }

    public Object getResnSubCat() {
        return resnSubCat;
    }

    public void setResnSubCat(Object resnSubCat) {
        this.resnSubCat = resnSubCat;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getAttachmentPath() {
        return attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
