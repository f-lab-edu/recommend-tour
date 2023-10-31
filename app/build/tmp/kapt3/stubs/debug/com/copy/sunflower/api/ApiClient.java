package com.copy.sunflower.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \r*\u0004\u0018\u00010\u00140\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/copy/sunflower/api/ApiClient;", "", "()V", "BASE_URL", "", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "clientBuilder", "Lokhttp3/OkHttpClient$Builder;", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "logger", "Lokhttp3/logging/HttpLoggingInterceptor;", "getLogger", "()Lokhttp3/logging/HttpLoggingInterceptor;", "mobileApp", "retrofit", "Lretrofit2/Retrofit;", "serviceKey", "tourService", "Lcom/copy/sunflower/api/TourService;", "getTourService", "()Lcom/copy/sunflower/api/TourService;", "app_debug"})
public final class ApiClient {
    @org.jetbrains.annotations.NotNull
    public static final com.copy.sunflower.api.ApiClient INSTANCE = null;
    private static final java.lang.String BASE_URL = "http://apis.data.go.kr/B551011/KorService1/";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String mobileApp = "recommend_tour";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String serviceKey = "Lv3KHPJYHUvfCs0PRMXwrxDSUYHp3ePlZLPSbQ3JeGgai6UhMyWmBGFw79liTjnNd3pJaqRdcesC+1XWjnnTuA==";
    private static final com.google.gson.Gson gson = null;
    @org.jetbrains.annotations.NotNull
    private static final okhttp3.logging.HttpLoggingInterceptor logger = null;
    private static final okhttp3.OkHttpClient.Builder clientBuilder = null;
    @org.jetbrains.annotations.NotNull
    private static final okhttp3.OkHttpClient client = null;
    private static final retrofit2.Retrofit retrofit = null;
    @org.jetbrains.annotations.NotNull
    private static final com.copy.sunflower.api.TourService tourService = null;
    
    private ApiClient() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final okhttp3.logging.HttpLoggingInterceptor getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.copy.sunflower.api.TourService getTourService() {
        return null;
    }
}