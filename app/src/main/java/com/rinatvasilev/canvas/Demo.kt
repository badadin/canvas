package com.rinatvasilev.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rinatvasilev.canvas.ui.theme.CanvasTheme

@Composable
fun Demo() {
    Canvas(modifier = Modifier.aspectRatio(1f)) {
        val width = size.width
        val height = size.height


    }
}

@Preview(showBackground = true)
@Composable
fun DemoPreview() {
    CanvasTheme {
        Demo()
    }
}
