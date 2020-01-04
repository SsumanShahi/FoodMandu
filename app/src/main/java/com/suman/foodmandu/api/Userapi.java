package com.suman.foodmandu.api;

import com.suman.foodmandu.model.User;
import com.suman.foodmandu.serverresponse.SignupResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Userapi {

    @POST("users/signup")
    Call<SignupResponse> registerUser(@Body User user);
}
