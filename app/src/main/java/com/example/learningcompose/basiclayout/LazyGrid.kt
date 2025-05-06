package com.example.learningcompose.basiclayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningcompose.ui.theme.LearningComposeTheme
import kotlin.random.Random
import kotlin.random.nextInt

@Composable

fun LazyGrid(modifier: Modifier = Modifier) {
    LazyVerticalStaggeredGrid(columns = StaggeredGridCells.Fixed(5),  horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
        items(2) {
            Box(modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(color = Color(Random.nextInt()))
                .height(Random.nextInt(2..200).dp))

        }

    }

        LazyVerticalGrid(
            // If you assigned bigger value to the fixed number the width of the item will be overwritten, so you can assign height so the width will be auto configured
            // columns = GridCells.Fixed(5),
            //columns = GridCells.FixedSize(100.dp)
            columns = GridCells.Adaptive(50.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(300) {
                Box(modifier = Modifier
                    .background(color = Color(Random.nextInt()))
                    .height(100.dp))
            }


    }

}

@Preview(showBackground = true, backgroundColor = 0xfff)
@Composable
private fun LazyGridPrev() {
    LearningComposeTheme {
        LazyGrid()
    }
}