package edu.uc.kansakpb.ikeahjalpare3.dao

import android.telecom.Call
import edu.uc.kansakpb.ikeahjalpare3.dto.Furniture
import retrofit2.http.GET

interface IFurnitureDAO {
    //Created DAO class for
    @GET("PLACE REMAINING LINK HERE")
    fun getAllFurnitures(): retrofit2.Call<ArrayList<Furniture>>

    @GET("PLACE REMAINING LINK HERE")
    fun getFurnitures(furnitureName: String) : retrofit2.Call <ArrayList<Furniture>>
}