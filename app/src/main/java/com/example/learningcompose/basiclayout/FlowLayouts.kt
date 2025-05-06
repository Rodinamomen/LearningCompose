package com.example.learningcompose.basiclayout



import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningcompose.ui.theme.LearningComposeTheme


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowLayout(modifier: Modifier = Modifier) {
    FlowRow(modifier = Modifier.fillMaxSize(), maxItemsInEachRow = 4,
        horizontalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.CenterHorizontally),
        verticalArrangement = Arrangement.spacedBy(20.dp, alignment = Alignment.CenterVertically),

    ) {
        for(i in 0..30){
            AssistChip(onClick = {}, label = {
                Text("Hello $i")
            })
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xfff)
@Composable
private fun FlowLayoutPrev() {
    LearningComposeTheme {
        FlowLayout()
    }
}