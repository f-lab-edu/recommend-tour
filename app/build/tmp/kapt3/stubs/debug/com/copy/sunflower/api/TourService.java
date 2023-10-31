package com.copy.sunflower.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JJ\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\u00062\b\b\u0003\u0010\f\u001a\u00020\nH\'\u00a8\u0006\r"}, d2 = {"Lcom/copy/sunflower/api/TourService;", "", "getData", "Lretrofit2/Call;", "Lcom/recommend_tour/data/ApiResponse;", "mobileOS", "", "mobileApp", "serviceKey", "pageNo", "", "_type", "numOfRows", "app_debug"})
public abstract interface TourService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "areaBasedList1")
    public abstract retrofit2.Call<com.recommend_tour.data.ApiResponse> getData(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "MobileOS")
    java.lang.String mobileOS, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "MobileApp")
    java.lang.String mobileApp, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "serviceKey")
    java.lang.String serviceKey, @retrofit2.http.Query(value = "pageNo")
    int pageNo, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "_type")
    java.lang.String _type, @retrofit2.http.Query(value = "numOfRows")
    int numOfRows);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
}