package com.example.mvpsample.view.activity;

import android.app.SearchManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.SearchView;

import com.example.mvpsample.R;
import com.example.mvpsample.adapter.ViewPagerAdapterForPlaceOrder;
import com.example.mvpsample.model.FilterData;
import com.example.mvpsample.model.GetDueOfCustomerModel;
import com.example.mvpsample.model.GetIndentPlaceOrderDetail;
import com.example.mvpsample.model.LoadDistributorSectionModel;
import com.example.mvpsample.presenter.architecture.LoginContract;
import com.example.mvpsample.presenter.architecture.LoginPresenter;

import java.util.List;



/**
 * Created by Shubham Gupta
 * This class is used  for Place the order
 * This class implements the onUpdateListener through which we can get the Response according to our
 * Requriements .
 */
public class PlaceOrderActivity extends BaseActivity implements LoginContract.View, SearchView.OnQueryTextListener {

    private Toolbar mToolbar;
    private ViewPagerAdapterForPlaceOrder mViewPagerAdapter;

    private TabLayout mTabLayout;
    private LoginContract.Presenter mPresenter;
    private String TAG = PlaceOrderActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order);
        new LoginPresenter(this, this);

    }

    /**
     * This method is used to initialize the Tab layout
     */
    private void initLayout() {

    }



    /**
     * @param presenter presenter instance: provide the refernce of Presenter Interface .
     *                  we can call all the function of presenter interface here .
     */
    @Override
    public void setPresenter(@NonNull LoginContract.Presenter presenter) {
        mPresenter = presenter;
        mPresenter.delegatePlaceOrder();
        mPresenter.delegateLoadDistributorSection();
        mPresenter.delegateGetIndentPlaceOrderDetail();
        mPresenter.delegateGetDueOfCustomerModel();
    }

    @Override
    public void onFailure(Object object) {
        Log.e(TAG, object.toString());
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                break;
            }

        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * this method needs to create the SearchView
     *
     * @param
     * @return
     */
    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        //TODO: need TO implement the FIlter Here
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        //ToDO: need to implement the filter
        return false;
    }

    @Override
    public void getFilterDataList(List<FilterData> object, boolean status, int reqType) {
        // Get call back
    }

    @Override
    public void getLoadDistributorSectionList(List<LoadDistributorSectionModel> object, boolean status, int reqType) {
        // Get callback

    }

    @Override
    public void getGetIndentPlaceOrderDetailList(List<GetIndentPlaceOrderDetail> getIndentPlaceOrderDetailList, boolean status, int reqType) {
 // Get callback

    }

    @Override
    public void getDueOfCustomerList(List<GetDueOfCustomerModel> getDueOfCustomerModelList, boolean status, int reqType) {
            // Get Callback

    }
}

