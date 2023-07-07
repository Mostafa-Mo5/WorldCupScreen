package com.mostafa.worldcupscreen.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mostafa.worldcupscreen.R
import com.mostafa.worldcupscreen.composable.Chip
import com.mostafa.worldcupscreen.composable.HorizontalPagerWithCircularImages
import com.mostafa.worldcupscreen.composable.SpaceHorizantal24dp
import com.mostafa.worldcupscreen.composable.SpaceHorizantal4dp
import com.mostafa.worldcupscreen.composable.SpaceVertical32dp
import com.mostafa.worldcupscreen.composable.SpaceVertical36dp
import com.mostafa.worldcupscreen.composable.SpaceVertical8dp
import com.mostafa.worldcupscreen.ui.theme.Gray100
import com.mostafa.worldcupscreen.ui.theme.Orange


@Composable
fun FilmScreen() {
    Column(Modifier.fillMaxSize()) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_background),
                contentDescription = "Image",
                modifier = Modifier.fillMaxSize()
            )


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .wrapContentSize(Alignment.TopEnd),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.End
            ) {
                SpaceVertical32dp()
                Row(
                    verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                        .background(
                            color = Gray100, shape = RoundedCornerShape(16.dp)
                        )
                        .padding(8.dp)
                ) {

                    Icon(
                        painter = painterResource(R.drawable.ic_timer_24),
                        contentDescription = "Vector",
                        modifier = Modifier.padding(end = 2.dp)
                    )
                    Text(text = "2h 23m", color = Color.White)

                }
            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center)
            ) {
                Image(
                    painter = painterResource(R.drawable.not_started_24),
                    contentDescription = "Vector",
                    modifier = Modifier.size(36.dp)
                )

            }
        }

        Column(
            modifier = Modifier
                .offset(y = (-24).dp)
                .fillMaxSize()
                .background(Color.White, shape = RoundedCornerShape(36.dp))
        ) {

            SpaceVertical36dp()
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(CenterHorizontally),
                Arrangement.Center,


                ) {
                val annotatedString = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Black)) {
                        append("6.8")
                    }
                    withStyle(style = SpanStyle(color = Color.Gray)) {
                        append("/10")
                    }
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = annotatedString, fontSize = 24.sp
                    )
                    Text(
                        text = "IMDb", fontSize = 16.sp, color = Color.Gray
                    )
                }

                SpaceHorizantal24dp()

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "63%", fontSize = 24.sp, color = Color.Black
                    )
                    Text(
                        text = "Rotten Tomatoes", fontSize = 16.sp, color = Color.Gray
                    )
                }

                SpaceHorizantal24dp()

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = annotatedString, fontSize = 24.sp
                    )
                    Text(
                        text = "IGN", fontSize = 16.sp, color = Color.Gray
                    )
                }

            }

            Text(
                text = "Fantatic Bantastic: The Doctor Want you ",
                fontSize = 32.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp)
            )
            SpaceVertical8dp()

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Chip(text = "Action")
                SpaceHorizantal4dp()
                Chip(text = "Comedy")

            }

            val imageIds = listOf(
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
            )

            MaterialTheme {
                HorizontalPagerWithCircularImages(imageResourceIds = imageIds)
            }

            LazyColumn(modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp)) {
                item {
                    Text(
                        text = "Inception\" is a mind-bending science fiction film directed by " +
                                "Christopher Nolan. The story revolves around Dom Cobb, a skilled" +
                                " thief who possesses the rare ability to enter people's dreams and" +
                                " steal valuable information from their subconscious",
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                    )
                }
            }

            Button(
                onClick = { },
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 15.dp,
                    disabledElevation = 0.dp,
                ),
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .align(CenterHorizontally)
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Orange),
                shape = RoundedCornerShape(16.dp),
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_save_24),
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.padding(start = 8.dp, end = 16.dp)
                    )
                    Text(text = "Booking", color = Color.White)
                }
            }


        }


    }


}


@Preview(showBackground = true)
@Composable
private fun Preview2() {
    FilmScreen()
}

