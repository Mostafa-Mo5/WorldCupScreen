package com.mostafa.worldcupscreen.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mostafa.worldcupscreen.composable.*

@Composable
fun WorldCupScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 16.dp)
    ) {
            Text(text = "LiveMatch", modifier = Modifier.padding(bottom = 16.dp), fontSize = 24.sp)
        Card(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = Color(0xFF222232),
            shape = RoundedCornerShape(16.dp)
        ) {
            

            Column {
                SpaceVertical48dp()
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(horizontal = 16.dp, vertical = 42.dp)

                ) {
                    TeamPlayingNow(
                        team1 = com.mostafa.worldcupscreen.R.drawable.ic_launcher_background,
                        team2 = com.mostafa.worldcupscreen.R.drawable.ic_launcher_background,
                        result = "2 - 2"
                    )
                }

                SpaceVertical48dp()
            }

        }
        SpaceVertical48dp()

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        ) {
            Box(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Match Schedule", modifier = Modifier
                        .align(Alignment.CenterStart),
                    fontSize = 20.sp
                )
                Text(
                    text = "See All", modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .clickable { },
                    color = Color(0xFF8069C5),
                    fontSize = 20.sp
                )
            }


        }

        Card(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = Color(0xFF222232),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally)
            ) {

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                ) {

                    LeftTeamInformation(
                        name = "Chalsea",
                        image = com.mostafa.worldcupscreen.R.drawable.ic_launcher_background
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                        .fillMaxWidth()
                ) {
                    TimeInfo(date = "19/1/2023", time = "19.30")

                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                ) {
                    RightTeamInformation(
                        name = "USA",
                        image = com.mostafa.worldcupscreen.R.drawable.ic_launcher_background
                    )
                }

            }


        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            backgroundColor = Color(0xFF222232),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally)
            ) {

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                ) {

                    LeftTeamInformation(
                        name = "mexico",
                        image = com.mostafa.worldcupscreen.R.drawable.ic_launcher_background
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                        .fillMaxWidth()
                ) {

                    TimeInfo(date = "29/1/2023", time = "19.30")

                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                ) {
                    RightTeamInformation(
                        name = "Qater",
                        image = com.mostafa.worldcupscreen.R.drawable.ic_launcher_background
                    )
                }

            }

        }

        Card(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = Color(0xFF222232),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally)
            ) {

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                ) {

                    LeftTeamInformation(
                        name = "Iraq",
                        image = com.mostafa.worldcupscreen.R.drawable.ic_launcher_background
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                        .fillMaxWidth()
                ) {
                    TimeInfo(date = "11/2/2023", time = "19.30")
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                ) {
                    RightTeamInformation(
                        name = "Egypt",
                        image = com.mostafa.worldcupscreen.R.drawable.ic_launcher_background
                    )
                }

            }

        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            backgroundColor = Color(0xFF222232),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally)
            ) {

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                ) {

                    LeftTeamInformation(
                        name = "Iraq",
                        image = com.mostafa.worldcupscreen.R.drawable.ic_launcher_background
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                        .fillMaxWidth()
                ) {
                    TimeInfo(date = "11/2/2023", time = "19.30")
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                ) {
                    RightTeamInformation(
                        name = "Egypt",
                        image = com.mostafa.worldcupscreen.R.drawable.ic_launcher_background
                    )
                }


            }


        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            backgroundColor = Color(0xFF222232),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally)
            ) {

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                ) {

                    LeftTeamInformation(
                        name = "Iraq",
                        image = com.mostafa.worldcupscreen.R.drawable.ic_launcher_background
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                        .fillMaxWidth()
                ) {
                    TimeInfo(date = "11/2/2023", time = "19.30")
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                ) {
                    RightTeamInformation(
                        name = "Egypt",
                        image = com.mostafa.worldcupscreen.R.drawable.ic_launcher_background
                    )
                }


            }


        }


    }
}


@Preview(showBackground = true)
@Composable
fun PreviewWorldCupScreen() {
    WorldCupScreen()
}