package com.example.quizz2

import androidx.annotation.StringRes

data class  Question(@StringRes val textResId: Int, val answer: Boolean)