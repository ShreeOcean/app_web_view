package com.ocean.webviewimagepdf.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ViewJournalExpenseModel {

    @SerializedName("status")
    public String status;

    @SerializedName("journal_data")
    public List<JournalData> journalData = null;

    public ViewJournalExpenseModel(String status, List<JournalData> journalData) {
        this.status = status;
        this.journalData = journalData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<JournalData> getJournalData() {
        return journalData;
    }

    public void setJournalData(List<JournalData> journalData) {
        this.journalData = journalData;
    }
}
