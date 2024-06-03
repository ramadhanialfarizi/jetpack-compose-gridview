package com.learning.gridview.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DataModel(
    @StringRes val stringResourceId: Int,
    val scores: Int,
    @DrawableRes val imageResourceId: Int
)
