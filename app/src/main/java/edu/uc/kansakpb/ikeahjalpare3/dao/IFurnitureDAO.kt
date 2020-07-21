package edu.uc.kansakpb.ikeahjalpare3.dao

import android.telecom.Call
import edu.uc.kansakpb.ikeahjalpare3.dto.Furniture
import retrofit2.http.GET

interface IFurnitureDAO {
    //Created DAO class for
    @GET("/ikeafurniture.json")
    fun getAllFurnitures(): retrofit2.Call<ArrayList<Furniture>>

    @GET("/ikeafurniture.json")
    fun getFurnitures(furnitureName: String) : retrofit2.Call <ArrayList<Furniture>>
}