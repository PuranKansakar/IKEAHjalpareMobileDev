package edu.uc.kansakpb.ikeahjalpare3.dto

import com.google.gson.annotations.SerializedName

data class Furniture(
    @SerializedName( "id") var id : Int,
    @SerializedName("furniture_name") var furnitureName: String,
    @SerializedName( "article_number") var articleNumber : String,
    @SerializedName("intructions_manuel")var instructionsManuel: String,
    @SerializedName("video_link")var videoLink: String
    ) {
        override fun toString(): String{
        return "$id $furnitureName $articleNumber $instructionsManuel  $videoLink"
    }
}