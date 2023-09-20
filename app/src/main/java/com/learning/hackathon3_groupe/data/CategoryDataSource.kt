package com.learning.hackathon3_groupe.data

import com.learning.hackathon3_groupe.model.CategoryModel
import java.util.Locale

interface CategoryDataSource{
    fun getCategory() : List<CategoryModel>


}

class CategoryDataSourceImpl() :CategoryDataSource {
    override fun getCategory(): List<CategoryModel> = listOf(
        CategoryModel(
            position = 1,
            name = "Groceries",
            desc = "Groceries Ada Disini !",
            imgUrl = ""
        ),
        CategoryModel(
            position = 2,
            name = "Fruit",
            desc = "Buah Buah Ada Disini !",
            imgUrl = ""
        ),
        CategoryModel(
            position = 3,
            name = "Spices",
            desc = "Spices Ada Disini !",
            imgUrl = ""
        ),
        CategoryModel(
            position = 4,
            name = "Herbs",
            desc = "Herbs Ada Disini !",
            imgUrl = ""
        ),
        CategoryModel(
            position = 5,
            name = "Seasoning",
            desc = "Bumbu Dapur Ada Disini !",
            imgUrl = ""
        ),
        CategoryModel(
            position = 6,
            name = "Meat",
            desc = "Daging Ada Disini !",
            imgUrl = ""
        ),
    )
}
