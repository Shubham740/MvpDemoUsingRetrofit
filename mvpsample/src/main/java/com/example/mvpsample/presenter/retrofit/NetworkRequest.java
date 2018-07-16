package com.example.mvpsample.presenter.retrofit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;


import com.example.mvpsample.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Shubham Gupta on 6/12/2017 .
 */

public class NetworkRequest<T> implements Callback<T> {
    private static final String TAG = NetworkRequest.class.getSimpleName();

    private int mReqType;
    private Context mContext;
    private onUpdateListener mUpdateListener;

    public NetworkRequest(Context context, Call<T> call, onUpdateListener listener, int reqType) {

        mUpdateListener = listener;
        mReqType = reqType;
        mContext=context;
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (response != null) {
            /*if (AppConst.SESSION_EXPIRE == response.code()) {
                mUpdateListener.onLogout();
            }*/  if (response.body() != null) {
                mUpdateListener.onUpdateView(response.body(), true, mReqType);
            } else {
                onFailure(call);
            }
        } else {
            onFailure(call);
        }
    }

    private void onFailure(Call<T> call) {
        Log.d(TAG, "onResponse onFailure"+call.toString());
        mUpdateListener.onUpdateView(mContext.getString(R.string.NETWORK_ERROR), false, mReqType);
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        t.printStackTrace();
        mUpdateListener.onUpdateView(mContext.getResources().getString(R.string.NETWORK_ERROR), false, mReqType);
    }


    /**
     * Interface which is used to update UI after Network operation finish
     */
    public interface onUpdateListener {
        /**
         * Callback method called after Network Operation finish
         *
         * @param response Network response
         * @param success  response status type
         * @param reqType  request type
         */
        void onUpdateView(@NonNull Object response, boolean success, int reqType);

        }
}
