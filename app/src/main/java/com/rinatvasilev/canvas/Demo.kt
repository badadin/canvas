package com.rinatvasilev.canvas.ui.views

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
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

}

@Preview(showBackground = true)
@Composable
fun DemoPreview() {
    CanvasTheme {
        Demo()
    }
}
