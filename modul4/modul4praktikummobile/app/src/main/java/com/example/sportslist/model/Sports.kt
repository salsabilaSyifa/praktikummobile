package com.example.sportslist.model

import androidx.annotation.StringRes
import androidx.annotation.DrawableRes

data class Sports (
    @StringRes val nama: Int,
    @DrawableRes val gambar : Int,
)