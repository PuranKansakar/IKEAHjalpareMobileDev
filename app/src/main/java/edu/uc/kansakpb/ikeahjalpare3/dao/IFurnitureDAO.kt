package edu.uc.kansakpb.ikeahjalpare3.dao

import edu.uc.kansakpb.ikeahjalpare3.dto.Furniture
import retrofit2.http.GET

/**
 * Defines methods for a furniture DAO.
 */
interface IFurnitureDAO {

    /**
     * Gets the list of funitures using retrofit2.
     */
    @GET("/dbc64a5b111a92183e33.json")
    fun getAllFurnitures(): retrofit2.Call<ArrayList<Furniture>>

    /**
     * Get the furniture give the name.
     */
    @GET("/dbc64a5b111a92183e33.json")
    fun getFurnitures(furnitureName: String) : retrofit2.Call<ArrayList<Furniture>>
}