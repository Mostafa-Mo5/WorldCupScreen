package com.mostafa.worldcupscreen.composable


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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