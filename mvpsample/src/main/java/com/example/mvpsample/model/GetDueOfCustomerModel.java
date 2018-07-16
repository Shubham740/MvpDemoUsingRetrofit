package com.example.mvpsample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Shubham on 8/12/17.
 */

public class GetDueOfCustomerModel {
    @SerializedName("due")
    @Expose
    private Integer due;

    public Integer getDue() {
        return due;
    }

    public void setDue(Integer due) {
        this.due = due;
    }

}
