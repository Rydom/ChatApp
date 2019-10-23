package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAM_96CCw:APA91bFhH75vk3zolzmUkkYIWcVgzRdoQp_M69BI5kMMjqlQ8aCfTzlu8fAHI_buOPsmnqVoV8WrtPVIJTUV4FVj0eUDuStXBQis7jzdG9y74QCexuNR_oHwrp0oQyd_7UD8IHHKjTh6"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
