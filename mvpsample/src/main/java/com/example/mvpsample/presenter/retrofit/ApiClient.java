package com.example.mvpsample.presenter.retrofit;


import com.example.mvpsample.model.FilterData;
import com.example.mvpsample.model.GetDueOfCustomerModel;
import com.example.mvpsample.model.GetIndentPlaceOrderDetail;
import com.example.mvpsample.model.LoadDistributorSectionModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

import static com.example.mvpsample.utils.AppConstants.GET_DUE_OF_CUSTOMER_URL;
import static com.example.mvpsample.utils.AppConstants.PLACE_GET_INDENT_ORDER_DETAILS_URL;
import static com.example.mvpsample.utils.AppConstants.PLACE_ORDER_HIT_URL;
import static com.example.mvpsample.utils.AppConstants.PLACE_ORDER_LOAD_DISTRIBUTION_SECTION;

/**
 * Created by Shubham on 1/12/17.
 * This class gives the Object of Retrofit
 */

public interface ApiClient {
    /**
     * This  function provides us the list of FilterData Model
     *
     * @param authToken   : to provide the token
     * @param contentType : it is used to define which type of content-type we are using
     * @return
     */
    @GET(PLACE_ORDER_HIT_URL)
    Call<List<FilterData>> getFilterDataModel(@Header("AuthToken") String authToken, @Header("Content-Type") String contentType);

    @GET(PLACE_ORDER_LOAD_DISTRIBUTION_SECTION)
    Call<List<LoadDistributorSectionModel>> getLoadDistributorSectionModelList(@Header("AuthToken") String authToken, @Header("Content-Type") String contentType);

    @GET(PLACE_GET_INDENT_ORDER_DETAILS_URL)
    Call<List<GetIndentPlaceOrderDetail>> getIndentPlaceOrderDetailList(@Header("AuthToken") String authToken, @Header("Content-Type") String contentType);

    @GET(GET_DUE_OF_CUSTOMER_URL)
    Call<List<GetDueOfCustomerModel>> getDueOfCustomerModelList(@Header("AuthToken") String authToken, @Header("Content-Type") String contentType);

}
