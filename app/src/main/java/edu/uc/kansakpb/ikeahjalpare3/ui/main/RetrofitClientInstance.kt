package edu.uc.kansakpb.ikeahjalpare3.ui.main

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientInstance {
    private var retrofit: Retrofit? = null;
    private val BASE_URL = "https://mailuc-my.sharepoint.com" // GETS YOU To OneDrive at UC

    val retrofitInstance : Retrofit?
        get() {
            // has this object been created
            if (retrofit == null) {
                //create it
                retrofit = retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
}