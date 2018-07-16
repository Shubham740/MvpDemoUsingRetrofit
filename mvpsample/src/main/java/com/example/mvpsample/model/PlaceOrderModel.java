package com.example.mvpsample.model;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by Shubham on 7/12/17.
 */

public class PlaceOrderModel {
    @Expose
    private List<FilterData> filterData;

    public List<FilterData> getFilterData() {
        return filterData;
    }

    public void setFilterData(List<FilterData> filterData) {

        this.filterData = filterData;
    }
}
