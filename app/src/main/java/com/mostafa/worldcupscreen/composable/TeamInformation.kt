package com.mostafa.worldcupscreen.composable


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.mutableStateOf
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun RowScope.TeamPlayingNow(team1: Int, team2: Int, result: String) {

    SpaceHorizantal8dp()
    Box(
        modifier = Modifier
            .weight(1f)
            .align(Alignment.CenterVertically)
    ) {
        Image(
            painter = painterResource(team1),
            contentDescription = "team1",
            modifier = Modifier
                .size(55.dp)
                .align(Alignment.Center)
        )
    }
    Box(
        modifier = Modifier
            .weight(1f)
            .align(Alignment.CenterVertically)
            .fillMaxWidth()
    ) {

        Text(
            text = result, modifier = Modifier
                .align(Alignment.Center),
            color = Color(0xFFFFFFFF),
            fontSize = 20.sp
        )

    }
    Box(
        modifier = Modifier
            .weight(1f)
            .align(Alignment.CenterVertically)
    ) {
        Image(
            painter = painterResource(team2),
            contentDescription = "team2",
            modifier = Modifier
                .size(55.dp)
                .align(Alignment.Center)
        )
    }
    SpaceHorizantal8dp()

}

@Composable
fun BoxScope.LeftTeamInformation(name: String, image: Int) {
    Text(
        text = name, modifier = Modifier
            .align(Alignment.CenterStart)
            .padding(8.dp),
        color = Color(0xFFFFFFFF),
        fontSize = 14.sp
    )
    Image(
        painter = painterResource(id = image),
        contentDescription = "team1",
        modifier = Modifier
            .size(42.dp)
            .align(Alignment.CenterEnd)
    )
}

@Composable
fun BoxScope.RightTeamInformation(name: String, image: Int) {
    Image(
        painter = painterResource(id = image),
        contentDescription = "team1",
        modifier = Modifier
            .size(42.dp)
            .align(Alignment.CenterStart)
    )
    Text(
        text = name, modifier = Modifier
            .align(Alignment.CenterEnd)
            .padding(8.dp),
        color = Color(0xFFFFFFFF),
        fontSize = 14.sp
    )

}

@Composable
fun BoxScope.TimeInfo(date: String, time: String) {
    Column(modifier = Modifier.align(Alignment.Center)) {
        Text(
            text = date, modifier = Modifier
                .align(Alignment.CenterHorizontally),
            color = Color(0xFFFFFFFF),
            fontSize = 14.sp
        )
        Text(
            text = time, modifier = Modifier
                .align(Alignment.CenterHorizontally),
            color = Color(0xFFFFFFFF),
            fontSize = 10.sp
        )
    }
}

@Composable
fun Chip(text: String) {
    Surface(
        color = Color.White,
        contentColor = Color.White,
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .padding(4.dp)
            .border(0.5.dp, Color.Gray, RoundedCornerShape(16.dp))
    ) {
        Text(
            text = text,
            color = Color.Black,
            style = MaterialTheme.typography.body2,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
        )
    }
}

@Composable
fun ImageItem(image: Int) {
    val painter: Painter = painterResource(id = image)

    Box(
        modifier = Modifier
            .padding(4.dp)
            .size(width = 240.dp, height = 320.dp)
            .clip(RoundedCornerShape(16.dp))
    ) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
    }
}

@Composable
fun HorizontalPagerWithCircularImages(imageResourceIds: List<Int>) {
    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        for (imageResourceId in imageResourceIds) {
            Image(
                painter = painterResource(id = imageResourceId),
                contentDescription = null,
                modifier = Modifier
                    .padding(4.dp)
                    .size(60.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }
    }
}


@Composable
fun combineImagesHorizontally(
    image1ResId: Int,
    image2ResId: Int,
    spacing: Dp,
    rotationDegree: Float
) {
    Row(Modifier.size(80.dp, 60.dp)) {
        Image(
            painter = painterResource(image1ResId),
            contentDescription = null,
            modifier = Modifier
                .weight(1f)
                .rotate(rotationDegree),
            contentScale = ContentScale.Fit
        )
        Space16dp()

        Image(
            painter = painterResource(image2ResId),
            contentDescription = null,
            modifier = Modifier
                .weight(1f)
                .rotate(rotationDegree),
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
fun textWithVectorIcon(text: String, iconResId: Int, imageColor: Color = Color.Unspecified) {
    Row(
        modifier = Modifier.padding(24.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val painter = painterResource(iconResId)
        val colorFilter = imageColor.let { color ->
            if (color != Color.Unspecified) {
                ColorFilter.tint(color)
            } else {
                null
            }
        }

        Image(
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.padding(end = 4.dp),
            colorFilter = colorFilter
        )
        Text(
            text = text,
            color = Color.White
        )
    }
}
@Composable
fun TwoVerticalTextsWithBorder(
    texts: List<Pair<String, String>>,
    borderRadius: Dp = 32.dp,
    borderStrokeWidth: Dp = 1.dp,
    borderColor: Color = Color.Gray,
    onClick: (String) -> Unit
) {
    val roundedCornerShape: Shape = RoundedCornerShape(borderRadius)
    val borderStroke = BorderStroke(borderStrokeWidth, borderColor)

    Row(Modifier.padding(vertical = 8.dp).horizontalScroll(rememberScrollState()),verticalAlignment = Alignment.CenterVertically) {

        texts.forEach { (text1, text2) ->
            SpaceHorizantal8dp()
            Surface(
                modifier = Modifier
                    .border(borderStroke, roundedCornerShape)
                    .clickable { onClick(text1) },
                color = Color.White
            ) {
                Column(modifier = Modifier.padding(8.dp)) {
                    Text(
                        text = text1, color = Color.Black,
                        modifier = Modifier
                            .padding(bottom = 4.dp)
                            .background(Color.White)
                            .clickable { onClick(text1) }
                    )
                    Text(
                        text = text2,color = Color.Black,
                        modifier = Modifier
                            .background(Color.White)
                            .clickable { onClick(text1) }
                    )
                }
            }
        }
    }
}




@Composable
fun OneVerticalTextsWithBorder(
    text1: String,
    onClick: () -> Unit
) {
    val backgroundColor = remember { mutableStateOf(Color.White) }

    Box(
        modifier = Modifier
            .border(1.dp, Color.Gray, shape = CircleShape)
            .background(backgroundColor.value)
            .padding(8.dp)
            .clickable {
                backgroundColor.value = Color.Gray
                onClick()
            }
    ) {
        Text(
            text = text1,
            color = Color.Black,
            modifier = Modifier.padding(8.dp)
        )
    }
}


