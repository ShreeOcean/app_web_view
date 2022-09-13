package com.ocean.webviewimagepdf.retrofit;


import com.ocean.webviewimagepdf.Constant;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Network {

    private static Network instance;
    private OkHttpClient.Builder httpClient;
    private ApiService apiServices;

    public static Network getInstance() {
        if (instance == null)
            instance = new Network();
        return instance;
    }

    private Network() {
        httpClient = new OkHttpClient.Builder();
        apiServices = create(Constant.API_URL, ApiService.class);
    }

    public ApiService getApiServices() {
        return apiServices;
    }

    private <T> T create(String baseUrl, Class<T> cls) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();
        T t = retrofit.create(cls);
        return t;
    }
}