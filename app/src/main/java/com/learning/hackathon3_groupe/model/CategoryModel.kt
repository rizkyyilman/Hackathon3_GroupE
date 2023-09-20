package com.learning.hackathon3_groupe.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.UUID
@Parcelize
data class CategoryModel(
    val position : Int,
    val name : String,
    val imgUrl : String,
    val desc : String
) : Parcelable
