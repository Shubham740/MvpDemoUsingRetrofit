package com.example.mvpsample.presenter.architecture;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;


import com.example.mvpsample.application.LakshyaApplication;
import com.example.mvpsample.model.FilterData;
import com.example.mvpsample.model.GetDueOfCustomerModel;
import com.example.mvpsample.model.GetIndentPlaceOrderDetail;
import com.example.mvpsample.model.LoadDistributorSectionModel;
import com.example.mvpsample.presenter.architecture.LoginContract;
import com.example.mvpsample.presenter.retrofit.ApiClient;
import com.example.mvpsample.presenter.retrofit.NetworkRequest;
import com.example.mvpsample.utils.AppConstants;
import com.example.mvpsample.utils.Utils;

import java.util.List;

import retrofit2.Call;

import static com.example.mvpsample.utils.AppConstants.REQ_PLACE_GET_DUE_OF_CUSTOMER;
import static com.example.mvpsample.utils.AppConstants.REQ_PLACE_GET_INDENT_DETAILS;
import static com.example.mvpsample.utils.AppConstants.REQ_PLACE_LOAD_DISTRIBUTION;
import static com.example.mvpsample.utils.AppConstants.REQ_PLACE_ORDER;

/**
 * Created by Shubham on 6/12/2017
 * this class calls the request of all the API
 */

public class LoginPresenter implements LoginContract.Presenter, NetworkRequest.onUpdateListener {
    private ApiClient networkApi;
    private LoginContract.View mView;
    private Context mContext;
    private String TAG = LoginPresenter.class.getSimpleName();

    /**
     * @param view: it contains the view
     */
    public LoginPresenter(Context context, LoginContract.View view) {
        mView = view;
        mContext = (Context) view;
        mView.setPresenter(this);
    }

    /**
     * this method request the placeOrder Data
     * abstract function of Presenter Interface .
     */
    @Override
    public void delegatePlaceOrder() {
        networkApi = LakshyaApplication.getClient();
        Call<List<FilterData>> responseCall = networkApi.getFilterDataModel(Utils.authTokenPlaceOrder, "application/json");
        new NetworkRequest<>(mContext, responseCall, this, REQ_PLACE_ORDER);
    }

    /**
     * this method requests the LoadDistributor data
     * abstract function of Presenter interface
     */
    @Override
    public void delegateLoadDistributorSection() {
        networkApi = LakshyaApplication.getClient();
        Call<List<LoadDistributorSectionModel>> responseCall = networkApi.getLoadDistributorSectionModelList(Utils.authTokenPlaceOrder, AppConstants.CONTENT_TYPE_JSON);
        new NetworkRequest<>(mContext, responseCall, this, REQ_PLACE_LOAD_DISTRIBUTION);

    }

    /**
     * this method requests the GetIndent Place Order Details.
     * abstract function of Presenter Interface
     */
    @Override
    public void delegateGetIndentPlaceOrderDetail() {
        networkApi = LakshyaApplication.getClient();
        Call<List<GetIndentPlaceOrderDetail>> responseCall = networkApi.getIndentPlaceOrderDetailList(Utils.authTokenPlaceOrder, AppConstants.CONTENT_TYPE_JSON);
        new NetworkRequest<>(mContext, responseCall, this, REQ_PLACE_GET_INDENT_DETAILS);


    }

    /**
     * this method request the Get Due  details of the customer
     * abstract function of Presenter interface .
     */
    @Override
    public void delegateGetDueOfCustomerModel() {
        networkApi = LakshyaApplication.getClient();
        Call<List<GetDueOfCustomerModel>> responseCall = networkApi.getDueOfCustomerModelList(Utils.authTokenPlaceOrder, AppConstants.CONTENT_TYPE_JSON);
        new NetworkRequest<>(mContext, responseCall, this, REQ_PLACE_GET_DUE_OF_CUSTOMER);


    }

    /**
     * it is the method of onUpdateListener Interface
     *
     * @param response Network response : it gives all the response from the server
     * @param success  response status type : it shows the status of API
     * @param reqType  request type : it gives which api is called
     */
    @Override
    public void onUpdateView(@NonNull Object response, boolean success, int reqType) {
        if (success) {
            switch (reqType) {
                case REQ_PLACE_ORDER: {
                    List<FilterData> filterData = (List<FilterData>) response;
                    mView.getFilterDataList(filterData, success, reqType);
                    break;
                }
                case REQ_PLACE_LOAD_DISTRIBUTION: {
                    List<LoadDistributorSectionModel> loadDistributorSectionModelList = (List<LoadDistributorSectionModel>) response;
                    mView.getLoadDistributorSectionList(loadDistributorSectionModelList, success, reqType);
                    break;
                }
                case REQ_PLACE_GET_INDENT_DETAILS: {
                    List<GetIndentPlaceOrderDetail> getIndentPlaceOrderDetailList = (List<GetIndentPlaceOrderDetail>) response;
                    mView.getGetIndentPlaceOrderDetailList(getIndentPlaceOrderDetailList, success, reqType);
                    break;
                }

                case REQ_PLACE_GET_DUE_OF_CUSTOMER: {
                    List<GetDueOfCustomerModel> getDueOfCustomerModelList = (List<GetDueOfCustomerModel>) response;
                    mView.getDueOfCustomerList(getDueOfCustomerModelList, success, reqType);
                    break;
                }
            }
        } else {
            Log.e(TAG, response.toString());
            mView.onFailure(response);
        }
    }

}
