package com.example.learningcompose.basiclayout

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningcompose.ui.theme.LearningComposeTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyLayout(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan)
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
        ,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        stickyHeader {
            Text(
                "Header",
                modifier = Modifier
                    .background(Color.Blue)
                    .fillParentMaxWidth(),
                textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
            )
        }
        items(100) { i ->
            Text("Item $i")
        }
        item {
            Box(
                modifier = Modifier
                    .fillParentMaxWidth()
                    .background(Color.Red)
            ) {
                Text("Rodinaaaaa")
            }
        }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xfff
)
@Composable
private fun LazyLayoutPrev() {
    LearningComposeTheme {
        LazyLayout()
    }
}