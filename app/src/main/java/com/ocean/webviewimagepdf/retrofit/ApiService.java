package com.ocean.webviewimagepdf.retrofit;

import com.ocean.webviewimagepdf.Constant;
import com.ocean.webviewimagepdf.model.ViewJournalExpenseModel;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {

    @Multipart
    @POST(Constant.VIEW_JOURNAL_EXPENSES)
    Call<ViewJournalExpenseModel> viewJournalExpenses(@Part("auth_key") RequestBody auth_key, @Part("id") RequestBody id);

}
