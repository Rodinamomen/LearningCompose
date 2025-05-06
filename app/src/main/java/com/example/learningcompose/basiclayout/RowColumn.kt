package com.example.learningcompose.basiclayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningcompose.ui.theme.LearningComposeTheme

@Composable
fun RowColumnDemo(modifier: Modifier = Modifier) {
    Row(modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Red)
        )
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Blue))
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Yellow))
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xfff
)
@Composable
private fun RowColumnDemoPreview() {
   LearningComposeTheme {
        RowColumnDemo()
    }
}