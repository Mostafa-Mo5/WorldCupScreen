package com.mostafa.worldcupscreen.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mostafa.worldcupscreen.R
import com.mostafa.worldcupscreen.composable.OneVerticalTextsWithBorder
import com.mostafa.worldcupscreen.composable.SpaceHorizantal16dp
import com.mostafa.worldcupscreen.composable.SpaceHorizantal24dp
import com.mostafa.worldcupscreen.composable.SpaceHorizantal4dp
import com.mostafa.worldcupscreen.composable.SpaceVertical16dp
import com.mostafa.worldcupscreen.composable.SpaceVertical8dp
import com.mostafa.worldcupscreen.composable.TwoVerticalTextsWithBorder
import com.mostafa.worldcupscreen.composable.combineImagesHorizontally
import com.mostafa.worldcupscreen.composable.textWithVectorIcon
import com.mostafa.worldcupscreen.ui.theme.Orange


@Composable
fun BookingScreen() {
    Column(Modifier.fillMaxSize()) {

        Column(
            Modifier
                .fillMaxWidth()
                .background(Color.Black)
        ) {

            Image(
                painter = painterResource(R.drawable.cover),
                contentDescription = "Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                Alignment.TopCenter
            )

            SpaceVertical16dp()

            Row(
                Modifier
                    .fillMaxWidth()
                    .height(350.dp)
                    .align(CenterHorizontally), horizontalArrangement = Arrangement.Center
            ) {
                SpaceHorizantal24dp()
                Column(Modifier.fillMaxHeight()) {


                    combineImagesHorizontally(R.drawable.seat, R.drawable.seat, 4.dp, 30f)
                    combineImagesHorizontally(R.drawable.seat, R.drawable.seat, 4.dp, 28f)
                    combineImagesHorizontally(R.drawable.seat, R.drawable.seat, 4.dp, 26f)
                    combineImagesHorizontally(R.drawable.seat, R.drawable.seat, 4.dp, 24f)
                    combineImagesHorizontally(R.drawable.seat, R.drawable.seat, 4.dp, 22f)

                }
                SpaceHorizantal24dp()
                Column(Modifier.fillMaxHeight()) {
                    combineImagesHorizontally(R.drawable.seat, R.drawable.seat, 4.dp, 0f)
                    combineImagesHorizontally(R.drawable.seat, R.drawable.seat, 4.dp, 0f)
                    combineImagesHorizontally(R.drawable.seat, R.drawable.seat, 4.dp, 0f)
                    combineImagesHorizontally(R.drawable.seat, R.drawable.seat, 4.dp, 0f)
                    combineImagesHorizontally(R.drawable.seat, R.drawable.seat, 4.dp, 0f)

                }
                SpaceHorizantal24dp()
                Column(Modifier.fillMaxHeight()) {
                    combineImagesHorizontally(R.drawable.seat, R.drawable.seat, 4.dp, -30f)
                    combineImagesHorizontally(R.drawable.seat, R.drawable.seat, 4.dp, -28f)
                    combineImagesHorizontally(R.drawable.seat, R.drawable.seat, 4.dp, -26f)
                    combineImagesHorizontally(R.drawable.seat, R.drawable.seat, 4.dp, -24f)
                    combineImagesHorizontally(R.drawable.seat, R.drawable.seat, 4.dp, -22f)

                }
            }

            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                textWithVectorIcon("Avilable", R.drawable.circle, Color.White)

                textWithVectorIcon("Taken", R.drawable.circlegray)

                textWithVectorIcon("selected", R.drawable.circle)

            }


        }

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {


            val texts = listOf(
                "14" to "Thu",
                "16" to "Mon",
                "16" to "Mon",
                "14" to "Thu",
                "15" to "Son",
                "16" to "Mon",
                "16" to "Mon",
                "16" to "Mon",
                "16" to "Mon",
            )

            TwoVerticalTextsWithBorder(
                texts = texts,
                onClick = { selectedText ->
                    // Handle click for the selectedText
                }
            )


        }
        SpaceVertical8dp()

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {


            OneVerticalTextsWithBorder(text1 = "12.00") {}

            SpaceHorizantal4dp()

            OneVerticalTextsWithBorder(text1 = "2.00") {}

            SpaceHorizantal4dp()

            OneVerticalTextsWithBorder(text1 = "15.00") {}

            SpaceHorizantal4dp()

            OneVerticalTextsWithBorder(text1 = "3.40") {}


        }
        SpaceVertical8dp()

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(Modifier.padding(start = 16.dp)) {
                Text(text = "100.00$", color = Color.Black, fontSize = 24.sp)
                Text(text = "4 Tickets", color = Color.Gray, fontSize = 8.sp)
            }

            Button(
                onClick = { },
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 15.dp,
                    disabledElevation = 0.dp,
                ),
                modifier = Modifier.padding(end = 16.dp),
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Orange),
                shape = RoundedCornerShape(16.dp),
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_save_24),
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.padding(end = 8.dp),
                    )
                    Text(text = "Booking", color = Color.White)
                }
            }
        }

    }


}


@Preview(showBackground = true)
@Composable
fun Preview3() {
    BookingScreen()
}