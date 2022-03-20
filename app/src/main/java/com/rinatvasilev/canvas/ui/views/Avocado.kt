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
fun Avocado() {

    Canvas(modifier = Modifier.size(250.dp)) {

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

            quadraticBezierTo(
                x1 = width.times(.71f),
                y1 = height.times(.45f),
                x2 = width.times(.65f),
                y2 = height.times(.2f)
            )

            cubicTo(
                x1 = width.times(.6f),
                y1 = height.times(.0f),
                x2 = width.times(.4f),
                y2 = height.times(.0f),
                x3 = width.times(.35f),
                y3 = height.times(.2f)
            )

            quadraticBezierTo(
                x1 = width.times(.29f),
                y1 = height.times(.45f),
                x2 = width.times(.245f),
                y2 = height.times(.51f)
            )
        }

        val pathCore = Path().apply {
            moveTo(width.times(.35f), height.times(.65f))

            cubicTo(
                x1 = width.times(.3f),
                y1 = height.times(.85f),
                x2 = width.times(.7f),
                y2 = height.times(.85f),
                x3 = width.times(.65f),
                y3 = height.times(.65f)
            )

            cubicTo(
                x1 = width.times(.6f),
                y1 = height.times(.4f),
                x2 = width.times(.4f),
                y2 = height.times(.4f),
                x3 = width.times(.35f),
                y3 = height.times(.65f)
            )
        }

        val pathCorePart = Path().apply {

            moveTo(width.times(.5f), height.times(.5f))

            quadraticBezierTo(
                x1 = width.times(.43f),
                y1 = height.times(.5f),
                x2 = width.times(.4f),
                y2 = height.times(.6f)
            )
        }

        drawPath(
            path = pathContour,
            color = Color(0xFFC3D943),
            style = Fill
        )

        scale(scale = 0.96f) {
            drawPath(
                path = pathContour,
                color = Color(0xFF0B9444),
                style = Stroke(width = 20f)
            )
        }

        drawPath(
            path = pathContour,
            color = Color(0xFF442B1A),
            style = Stroke(width = 15f)
        )

        drawPath(
            path = pathCore,
            color = Color(0xFFD37D3D),
            style = Fill
        )

        drawPath(
            path = pathCore,
            color = Color(0xFF442B1A),
            style = Stroke(width = 10f)
        )

        drawPath(
            path = pathCorePart,
            color = Color(0xFF442B1A),
            style = Stroke(width = 10f, cap = StrokeCap.Round)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AvocadoPreview() {
    CanvasTheme {
        Avocado()
    }
}
