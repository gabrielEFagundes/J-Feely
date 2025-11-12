package com.feelytics;

import com.feelytics.data.collection.APICaller;

public class Main {
    public static void main(String[] args) {

        APICaller caller = new APICaller();

        caller.getApiData("Something");

    }
}