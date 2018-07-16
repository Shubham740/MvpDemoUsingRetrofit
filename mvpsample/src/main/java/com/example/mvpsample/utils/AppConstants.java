package com.example.mvpsample.utils;

/**
 * Created by Shubham on 5/12/17.
 * this class contains all the App Constants including url,and other constants.
 */

public interface AppConstants {
    String BASE_URL_DUPONT = "http://192.168.14.32:83/api/";
    String PLACE_ORDER_HIT_URL = "PlaceAnOrder/GetFilterData?userCode=CMH-0075";
    String PLACE_ORDER_LOAD_DISTRIBUTION_SECTION = "PlaceAnOrder/LoadDistributorSection?userCode=CMH-0075";
    int REQ_PLACE_ORDER = 1;
    int REQ_PLACE_LOAD_DISTRIBUTION = 2;
    int REQ_PLACE_GET_INDENT_DETAILS = 3;
    int REQ_PLACE_GET_DUE_OF_CUSTOMER = 4;
    String CONTENT_TYPE_JSON = "application/json";
    int NETWORK_TIMEOUT = 60;
    String PLACE_GET_INDENT_ORDER_DETAILS_URL = "PlaceAnOrder/GetIndentPlaceOrderDetails?userCode=CMH-0075";
    String GET_DUE_OF_CUSTOMER_URL = "PlaceAnOrder/GetDueOfCustomer?userCode=CMH-0075";
    int SEARCH_WIDTH = 500;
}
