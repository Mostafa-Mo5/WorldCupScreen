package com.mostafa.worldcupscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mostafa.worldcupscreen.screens.BookingScreen
import com.mostafa.worldcupscreen.screens.FilmScreen
import com.mostafa.worldcupscreen.screens.HomeScreen
import com.mostafa.worldcupscreen.ui.theme.WorldCupScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorldCupScreenTheme {


                    val navController =  rememberNavController()
                   NavHost(navController = navController, startDestination = "firstScreen" ){
                       composable("firstScreen"){ HomeScreen(navController)}
                       composable("secondScreen"){ FilmScreen(navController) }
                       composable("thirdScreen"){ BookingScreen() }


                    
                }
            }
        }
    }
}
