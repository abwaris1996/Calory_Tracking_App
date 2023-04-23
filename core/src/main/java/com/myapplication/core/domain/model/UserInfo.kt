package com.myapplication.core.domain.model

import com.myapplication.core.domain.prefrences.ActivityLevel
import com.myapplication.core.domain.prefrences.Gender

data class UserInfo(
    val gender: Gender,
    val age: Int,
    val weight: Float,
    val height: Int,
    val activityLevel: ActivityLevel,
    val goalType: GoalType,
    val carbRatio: Float,
    val proteinRatio: Float,
    val fatRatio: Float
)
