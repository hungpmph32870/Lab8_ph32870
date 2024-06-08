package com.example.lab8_ph32870

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.kot104.ui.screen.ScreenNavigation
import com.example.lab8_ph32870.ui.theme.Lab8_ph32870Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab8_ph32870Theme {
                ScreenNavigation()
                // A surface container using the 'background' color from the theme
//                Scaffold(modifier = Modifier
//                    .fillMaxSize()
//                    .safeDrawingPadding()) {
//                    ScreenNavigation()
//                }
            }
        }
    }
}
