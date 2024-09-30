package com.example.task20part2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.task20part2.model.Profile
import com.example.task20part2.ui.layout.ProfileScreen
import com.example.task20part2.ui.theme.Task20Part2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val profile1 =
            Profile(
                "Ahmed",
                10,
                listOf(R.drawable.imag1, R.drawable.imag2, R.drawable.imag4),
                100,
                200,
                R.drawable.image,
                " I like traveling \n Learning Android \n Sleeping"
            )
        setContent {
            Task20Part2Theme {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) { ProfileScreen(profile1) }
            }
        }
    }
}
