package com.suman.foodmandu.api;

import com.suman.foodmandu.model.User;
import com.suman.foodmandu.serverresponse.ImageResponse;
import com.suman.foodmandu.serverresponse.SignupResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface Userapi {

    @POST("users/signup")
    Call<SignupResponse> registerUser(@Body User user);

    @Multipart
    @POST("upload")
    Call<ImageResponse> uploadImage(@Part MultipartBody.Part img);


}
