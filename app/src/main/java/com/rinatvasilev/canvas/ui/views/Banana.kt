package com.rinatvasilev.canvas.ui.views

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import com.rinatvasilev.canvas.ui.theme.CanvasTheme

@Composable
fun Banana() {

    Canvas(modifier = Modifier.aspectRatio(1f)) {

        val width = size.width
        val height = size.height

        val pathContour = Path().apply {
            moveTo(width.times(.05f), height.times(.5f))

            cubicTo(
                x1 = width.times(.10f),
                y1 = height.times(.9f),
                x2 = width.times(1.15f),
                y2 = height.times(.9f),
                x3 = width.times(.9f),
                y3 = height.times(.5f)
            )

            quadraticBezierTo(
                x1 = width.times(.88f),
                y1 = height.times(.47f),
                x2 = width.times(.83f),
                y2 = height.times(.52f)
            )

            cubicTo(
                x1 = width.times(.8f),
                y1 = height.times(.7f),
                x2 = width.times(.3f),
                y2 = height.times(.65f),
                x3 = width.times(.1f),
                y3 = height.times(.47f)
            )

            cubicTo(
                x1 = width.times(.7f),
                y1 = height.times(.7f),
                x2 = width.times(.8f),
                y2 = height.times(.5f),
                x3 = width.times(.83f),
                y3 = height.times(.52f)
            )
        }

        drawPath(
            path = pathContour,
            color = Color(0xFF442B1A),
            style = Stroke(width = 5f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BananaPreview() {
    CanvasTheme {
        Banana()
    }
}
