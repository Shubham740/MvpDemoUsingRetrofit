package com.example.mvpsample.presenter.architecture;

import com.example.mvpsample.model.FilterData;
import com.example.mvpsample.model.GetDueOfCustomerModel;
import com.example.mvpsample.model.GetIndentPlaceOrderDetail;
import com.example.mvpsample.model.LoadDistributorSectionModel;

import java.util.List;

/**
 * Created by Shubham on 6/12/17.
 * this interface provide the interact between View and Presenter
 */

public interface LoginContract {
    /**
     * it is used to provide the response on the View
     * View Interface extends the BaseView whose generic type is Presenter
     */
    interface View extends BaseView<Presenter> {
        /**
         * @param object  : it contains the response
         * @param status  : it provides the status of the response
         * @param reqType : it provides the reqKey
         */
        void getFilterDataList(List<FilterData> object, boolean status, int reqType);
        void getLoadDistributorSectionList(List<LoadDistributorSectionModel> object, boolean status, int reqType);
        void getGetIndentPlaceOrderDetailList(List<GetIndentPlaceOrderDetail> getIndentPlaceOrderDetailList, boolean status, int reqType);
        void getDueOfCustomerList(List<GetDueOfCustomerModel> getDueOfCustomerModelList, boolean status, int reqType);

    }

    interface Presenter {
        void delegatePlaceOrder();

        void delegateLoadDistributorSection();

        void delegateGetIndentPlaceOrderDetail();

        void delegateGetDueOfCustomerModel();
    }


}
