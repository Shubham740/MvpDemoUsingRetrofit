package com.example.mvpsample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Shubham on 8/12/17.
 */

public class GetIndentPlaceOrderDetail {
    @SerializedName("cropName")
    @Expose
    private List<CropMaster> cropName = null;
    @SerializedName("groupId")
    @Expose
    private List<Brand> groupId = null;
    @SerializedName("packingSize")
    @Expose
    private List<Size> packingSize = null;
    @SerializedName("count")
    @Expose
    private List<Count> count = null;

    public List<CropMaster> getCropName() {
        return cropName;
    }

    public void setCropName(List<CropMaster> cropName) {
        this.cropName = cropName;
    }

    public List<Brand> getGroupId() {
        return groupId;
    }

    public void setGroupId(List<Brand> groupId) {
        this.groupId = groupId;
    }

    public List<Size> getPackingSize() {
        return packingSize;
    }

    public void setPackingSize(List<Size> packingSize) {
        this.packingSize = packingSize;
    }

    public List<Count> getCount() {
        return count;
    }

    public void setCount(List<Count> count) {
        this.count = count;
    }
}
