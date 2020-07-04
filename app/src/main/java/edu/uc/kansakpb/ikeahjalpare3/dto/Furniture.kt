package edu.uc.kansakpb.ikeahjalpare3.dto

import com.google.gson.annotations.SerializedName

/**
 * Represents a furniture.
 */
data class Furniture(
    @SerializedName("furniture_name") var furnitureName: String,
    @SerializedName("intructions_manual") var instructionsManuel: String,
    @SerializedName("video_link") var videoLink: String
) {
    override fun toString(): String {
        return "Furniture(furnitureName='$furnitureName', instructionsManuel='$instructionsManuel', videoLink='$videoLink')"
    }
}