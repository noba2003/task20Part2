package com.example.task20part2.ui.layout

import androidx.compose.runtime.Composable
import com.example.task20part2.model.Profile
import com.example.task20part2.ui.components.ProfileCard

@Composable
fun ProfileScreen(profile: Profile) {
    ProfileCard(profile)

}