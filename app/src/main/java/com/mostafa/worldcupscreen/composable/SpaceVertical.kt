package com.mostafa.worldcupscreen.composable

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SpaceVertical48dp(){
    Spacer(modifier = Modifier.height(32.dp))
}

@Composable
fun SpaceHorizantal8dp(){
    Spacer(modifier = Modifier.width(8.dp))
}

@Composable
fun SpaceHorizantal48dp(){
    Spacer(modifier = Modifier.width(24.dp))
}