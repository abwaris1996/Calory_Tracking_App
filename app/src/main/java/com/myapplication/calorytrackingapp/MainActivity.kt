package com.myapplication.calorytrackingapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.compiler.plugins.kotlin.EmptyFunctionMetrics.composable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.myapplication.calorytrackingapp.util.navigate
import com.myapplication.core.util.naviagation.Route
import com.myapplication.onboarding_presentation.Gender.GenderScreen
import com.myapplication.onboarding_presentation.activity.ActivityScreen
import com.myapplication.onboarding_presentation.age.AgeScreen
import com.myapplication.onboarding_presentation.goal.GoalScreen
import com.myapplication.onboarding_presentation.height.HeightScreen
import com.myapplication.onboarding_presentation.nutriant_goal.NutrientGoalScreen
import com.myapplication.onboarding_presentation.weight.WeightScreen
import com.myapplication.onboarding_presentation.welcome.WelcomeScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaloryTrackerTheme {
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    scaffoldState = scaffoldState
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = Route.WELCOME
                    ) {
                        composable(Route.WELCOME) {
                            WelcomeScreen(onNavigate = navController::navigate)
                        }
                        composable(Route.AGE) {
                            AgeScreen(
                                scaffoldState = scaffoldState,
                                onNavigate = navController::navigate
                            )
                        }
                        composable(Route.GENDER) {
                            GenderScreen(onNavigate = navController::navigate)
                        }
                        composable(Route.HEIGHT) {
                        HeightScreen(scaffoldState = scaffoldState, onNavigate =navController::navigate )
                        }
                        composable(Route.WEIGHT) {
                        WeightScreen(scaffoldState = scaffoldState, onNavigate =navController::navigate )
                        }
                        composable(Route.NUTRIENT_GOAL) {
                            NutrientGoalScreen(
                                scaffoldState = scaffoldState,
                                onNavigate = navController::navigate
                            )
                        }
                        composable(Route.ACTIVITY) {
                            ActivityScreen( onNavigate =navController::navigate )
                        }
                        composable(Route.GOAL) {
                            GoalScreen(onNavigate =navController::navigate )
                        }

                        composable(Route.TRACKER_OVERVIEW) {

                        }
                        composable(Route.SEARCH) {

                        }
                    }
                }

            }
        }
    }
}
