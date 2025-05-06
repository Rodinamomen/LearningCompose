package com.example.learningcompose.basiclayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.learningcompose.R
import com.example.learningcompose.ui.theme.LearningComposeTheme

@Composable
fun Itatchi(modifier: Modifier = Modifier) {
    Box(modifier = Modifier, contentAlignment = Alignment.Center) {
        Image(painter = painterResource(R.drawable.itachi), contentDescription = null)
        Box(
            modifier
                .matchParentSize()
                .background(Brush.verticalGradient(colors = listOf(Color.Transparent, Color.Black)))
        )
        IconButton(onClick = {}, modifier = Modifier.align(Alignment.BottomStart)) {
            Icon(imageVector = Icons.Default.Star, tint = Color.Red, contentDescription = null)
        }

    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xfff
)
@Composable
private fun ItatchiPrev() {
    LearningComposeTheme {
        Itatchi()
    }
}