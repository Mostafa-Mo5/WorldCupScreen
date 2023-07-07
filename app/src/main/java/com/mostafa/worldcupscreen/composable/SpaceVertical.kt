package com.mostafa.worldcupscreen.composable

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SpaceVertical32dp() {
    Spacer(modifier = Modifier.height(32.dp))
}

@Composable
fun SpaceVertical36dp() {
    Spacer(modifier = Modifier.height(36.dp))
}

@Composable
fun SpaceVertical16dp() {
    Spacer(modifier = Modifier.height(16.dp))


}

@Composable
fun Space16dp() {
    Spacer(modifier = Modifier.size(16.dp))
}

@Composable
fun SpaceVertical8dp() {
    Spacer(modifier = Modifier.height(8.dp))
}

@Composable
fun SpaceHorizantal8dp() {
    Spacer(modifier = Modifier.width(8.dp))
}

@Composable
fun SpaceHorizantal16dp() {
    Spacer(modifier = Modifier.width(16.dp))
}

@Composable
fun SpaceHorizantal24dp() {
    Spacer(modifier = Modifier.width(24.dp))
}

@Composable
fun SpaceHorizantal4dp() {
    Spacer(modifier = Modifier.width(4.dp))
}