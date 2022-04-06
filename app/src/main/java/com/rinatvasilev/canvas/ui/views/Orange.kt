package com.rinatvasilev.canvas.ui.views

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
import com.rinatvasilev.canvas.ui.theme.CanvasTheme

@Composable
fun Orange() {

    Canvas(modifier = Modifier.aspectRatio(1f)) {

        val width = size.width
        val height = size.height

        val pathContour = Path().apply {
            moveTo(width.times(.25f), height.times(.5f))

            cubicTo(
                x1 = width.times(.0f),
                y1 = height.times(1.1f),
                x2 = width.times(1.0f),
                y2 = height.times(1.1f),
                x3 = width.times(.75f),
                y3 = height.times(.5f)
            )


        }

        drawPath(
            path = pathContour,
            color = Color(0xFF442B1A),
            style = Stroke(width = 10f, cap = StrokeCap.Round)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OrangePreview() {
    CanvasTheme {
        Orange()
    }
}
