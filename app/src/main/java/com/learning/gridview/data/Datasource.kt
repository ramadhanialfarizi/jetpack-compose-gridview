package com.learning.gridview.data

import com.learning.gridview.R

class Datasource {
        fun loadData(): List<DataModel> {
        return listOf<DataModel>(
            DataModel(R.string.architecture, 58, R.drawable.architecture),
            DataModel(R.string.crafts, 121, R.drawable.crafts),
            DataModel(R.string.business, 78, R.drawable.business),
            DataModel(R.string.culinary, 118, R.drawable.culinary),
            DataModel(R.string.design, 423, R.drawable.design),
            DataModel(R.string.fashion, 92, R.drawable.fashion),
            DataModel(R.string.film, 165, R.drawable.film),
            DataModel(R.string.gaming, 164, R.drawable.gaming),
            DataModel(R.string.drawing, 326, R.drawable.drawing),
            DataModel(R.string.lifestyle, 305, R.drawable.lifestyle),
            DataModel(R.string.music, 212, R.drawable.music),
            DataModel(R.string.painting, 172, R.drawable.painting),
            DataModel(R.string.photography, 321, R.drawable.photography),
            DataModel(R.string.tech, 118, R.drawable.tech)
        )
    }
//    val topics = listOf(
//        DataModel(R.string.architecture, 58, R.drawable.architecture),
//        DataModel(R.string.crafts, 121, R.drawable.crafts),
//        DataModel(R.string.business, 78, R.drawable.business),
//        DataModel(R.string.culinary, 118, R.drawable.culinary),
//        DataModel(R.string.design, 423, R.drawable.design),
//        DataModel(R.string.fashion, 92, R.drawable.fashion),
//        DataModel(R.string.film, 165, R.drawable.film),
//        DataModel(R.string.gaming, 164, R.drawable.gaming),
//        DataModel(R.string.drawing, 326, R.drawable.drawing),
//        DataModel(R.string.lifestyle, 305, R.drawable.lifestyle),
//        DataModel(R.string.music, 212, R.drawable.music),
//        DataModel(R.string.painting, 172, R.drawable.painting),
//        DataModel(R.string.photography, 321, R.drawable.photography),
//        DataModel(R.string.tech, 118, R.drawable.tech),
//    )
}