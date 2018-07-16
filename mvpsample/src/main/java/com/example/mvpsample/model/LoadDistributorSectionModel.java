
package com.example.mvpsample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoadDistributorSectionModel {

    @SerializedName("overdueAmount")
    @Expose
    private Integer overdueAmount;
    @SerializedName("overdue")
    @Expose
    private Integer overdue;
    @SerializedName("signOffDate")
    @Expose
    private String signOffDate;
    @SerializedName("pesticideLicenseValidity")
    @Expose
    private String pesticideLicenseValidity;
    @SerializedName("pesticideLicenseValidityvalue")
    @Expose
    private Integer pesticideLicenseValidityvalue;
    @SerializedName("ctsValue")
    @Expose
    private Integer ctsValue;
    @SerializedName("signOffDateValue")
    @Expose
    private Integer signOffDateValue;
    @SerializedName("aggremenDate")
    @Expose
    private String aggremenDate;
    @SerializedName("aggremenDateValue")
    @Expose
    private Integer aggremenDateValue;

    public Integer getOverdueAmount() {
        return overdueAmount;
    }

    public void setOverdueAmount(Integer overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    public Integer getOverdue() {
        return overdue;
    }

    public void setOverdue(Integer overdue) {
        this.overdue = overdue;
    }

    public String getSignOffDate() {
        return signOffDate;
    }

    public void setSignOffDate(String signOffDate) {
        this.signOffDate = signOffDate;
    }

    public String getPesticideLicenseValidity() {
        return pesticideLicenseValidity;
    }

    public void setPesticideLicenseValidity(String pesticideLicenseValidity) {
        this.pesticideLicenseValidity = pesticideLicenseValidity;
    }

    public Integer getPesticideLicenseValidityvalue() {
        return pesticideLicenseValidityvalue;
    }

    public void setPesticideLicenseValidityvalue(Integer pesticideLicenseValidityvalue) {
        this.pesticideLicenseValidityvalue = pesticideLicenseValidityvalue;
    }

    public Integer getCtsValue() {
        return ctsValue;
    }

    public void setCtsValue(Integer ctsValue) {
        this.ctsValue = ctsValue;
    }

    public Integer getSignOffDateValue() {
        return signOffDateValue;
    }

    public void setSignOffDateValue(Integer signOffDateValue) {
        this.signOffDateValue = signOffDateValue;
    }

    public String getAggremenDate() {
        return aggremenDate;
    }

    public void setAggremenDate(String aggremenDate) {
        this.aggremenDate = aggremenDate;
    }

    public Integer getAggremenDateValue() {
        return aggremenDateValue;
    }

    public void setAggremenDateValue(Integer aggremenDateValue) {
        this.aggremenDateValue = aggremenDateValue;
    }

}
