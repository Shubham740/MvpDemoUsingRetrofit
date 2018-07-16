package com.example.mvpsample.presenter.architecture;

import android.support.annotation.NonNull;

/**
 * Created by Shubham  on 6/12/17.
 * it is the BaseView for every  View
 */

public interface BaseView<T> {
    /**
     * Attach presenter
     *
     * @param presenter presenter instance
     */
    void setPresenter(@NonNull T presenter);

    void onFailure(Object object);
}
