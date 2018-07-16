
package com.example.mvpsample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Count {

    @SerializedName("countCartItem")
    @Expose
    private Integer countCartItem;

    public Integer getCountCartItem() {
        return countCartItem;
    }

    public void setCountCartItem(Integer countCartItem) {
        this.countCartItem = countCartItem;
    }

}
