package com.example.learningcompose.basiclayout

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningcompose.R
import com.example.learningcompose.ui.theme.LearningComposeTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldLayout(modifier: Modifier = Modifier) {
    Scaffold(modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text("Home")
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Default.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar {

                NavigationBarItem(icon = {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = null,
                        tint = Color.Red
                    )
                }, selected = false, onClick = {}, label = {
                    Text("Favourite")
                })

                NavigationBarItem(icon = {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = null,
                        tint = Color.Red
                    )

                },
                    selected = true,
                    onClick = {}, label = {
                        Text("Home")
                    })
                NavigationBarItem(icon = {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = null,
                        tint = Color.Red
                    )
                }, selected = false, onClick = {}, label = {
                    Text("Account")
                })
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}, shape = CircleShape, containerColor = Color.White) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null, tint = Color.Red)
            }
        }
    ) { padding ->
        LazyColumn(modifier = modifier.fillMaxSize().padding(padding), verticalArrangement = Arrangement.spacedBy(30.dp)) {
            items(100){
                Row(modifier = modifier.fillParentMaxWidth()) {
                    Image(painter = painterResource(R.drawable.itachi), contentDescription = null,Modifier.size(100.dp))
                    Column(modifier = modifier.fillMaxHeight()) {
                        Text("Anime Character", fontWeight = FontWeight.SemiBold , fontSize = 20.sp, modifier = Modifier)
                        Text("Itatchi",fontWeight = FontWeight.Medium , fontSize = 16.sp)
                        Text("Anime Name",fontWeight = FontWeight.SemiBold , fontSize = 20.sp)
                        Text("Naruoto",fontWeight = FontWeight.Medium , fontSize = 16.sp)
                    }

                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xfff
)
@Composable
private fun ScaffoldPrev() {
    LearningComposeTheme {
        ScaffoldLayout()
    }
}