
package com.example.mvpsample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CropMaster {

    @SerializedName("crop")
    @Expose
    private String crop;

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

}
