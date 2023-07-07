package com.mostafa.worldcupscreen.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mostafa.worldcupscreen.FilmData
import com.mostafa.worldcupscreen.R
import com.mostafa.worldcupscreen.composable.Chip
import com.mostafa.worldcupscreen.composable.ImageItem
import com.mostafa.worldcupscreen.composable.SpaceHorizantal24dp
import com.mostafa.worldcupscreen.composable.SpaceHorizantal4dp
import com.mostafa.worldcupscreen.composable.SpaceVertical16dp
import com.mostafa.worldcupscreen.ui.theme.Orange


@Composable
fun HomeScreen() {

    val filmList = listOf(
        FilmData(
            R.drawable.cover,
            "Fate/Strange Fake: Whispers of Dawn ",
            "Action",
            "Comedy"
        ),
        FilmData(
            R.drawable.cover2,
            "The Out-Laws ",
            "Drama",
            "Thriller"
        ),
        FilmData(
            R.drawable.cover3,
            "Guardians of the Galaxy Vol. 3 ",
            "Romance",
            "Fantasy"
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 16.dp)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .align(CenterHorizontally)
                .padding(horizontal = 24.dp, vertical = 32.dp)
        ) {
            Button(
                onClick = { /* Handle button 1 click */ },
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 15.dp,
                    disabledElevation = 0.dp,
                ),
                modifier = Modifier.padding(8.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Orange),
                shape = RoundedCornerShape(16.dp),
            ) {
                Text(text = "Now Showing", color = Color.White)
            }

            Spacer(modifier = Modifier.width(4.dp))

            Button(
                onClick = { /* Handle button 2 click */ },
                modifier = Modifier.padding(8.dp),
                border = BorderStroke(1.dp, Color.White),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red),
                shape = RoundedCornerShape(16.dp),
            ) {
                Text(text = "Coming Soon")
            }
        }

        Box(modifier = Modifier.fillMaxWidth()) {
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {
                items(filmList) { dataFilm ->
                    ImageItem(dataFilm = dataFilm)
                    Spacer(modifier = Modifier.width(24.dp))

                }

            }

        }

    }


}


@Preview(showBackground = true)
@Composable
fun Preview() {
    HomeScreen()
}