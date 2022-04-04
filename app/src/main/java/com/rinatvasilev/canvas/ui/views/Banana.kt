package com.rinatvasilev.canvas.ui.views

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.*
import androidx.compose.ui.tooling.preview.Preview
import com.rinatvasilev.canvas.ui.theme.CanvasTheme

@Composable
fun Banana() {

    val ko4erizhkaColors = listOf(Color(0xFFAFC419), Color(0xFFD4CF0B))

    Canvas(modifier = Modifier.aspectRatio(1f)) {

        val width = size.width
        val height = size.height

        rotate(degrees = 10f, pivot = Offset(x = width.times(0.835f), y = height.times(0.412f))) {
            drawBanana(width, height, ko4erizhkaColors)
        }

        rotate(degrees = -5f, pivot = Offset(x = width.times(0.835f), y = height.times(0.412f))) {
            drawBanana(width, height, ko4erizhkaColors)
        }

        rotate(degrees = -20f, pivot = Offset(x = width.times(0.835f), y = height.times(0.412f))) {
            drawBanana(width, height, ko4erizhkaColors)
        }
    }
}

private fun DrawScope.drawBanana(width: Float, height: Float, ko4erizhkaColors: List<Color>) {

    val pathContour1 = Path().apply {
        moveTo(width.times(0.049f), height.times(0.476f))

        cubicTo(
            x1 = width.times(0.143f),
            y1 = height.times(0.927f),
            x2 = width.times(1.010f),
            y2 = height.times(0.871f),
            x3 = width.times(0.917f),
            y3 = height.times(0.410f)
        )

        cubicTo(
            x1 = width.times(0.908f),
            y1 = height.times(0.368f),
            x2 = width.times(0.855f),
            y2 = height.times(0.382f),
            x3 = width.times(0.835f),
            y3 = height.times(0.412f)
        )

        cubicTo(
            x1 = width.times(0.717f),
            y1 = height.times(0.712f),
            x2 = width.times(0.259f),
            y2 = height.times(0.667f),
            x3 = width.times(0.094f),
            y3 = height.times(0.431f)
        )

        cubicTo(
            x1 = width.times(0.074f),
            y1 = height.times(0.416f),
            x2 = width.times(0.041f),
            y2 = height.times(0.442f),
            x3 = width.times(0.049f),
            y3 = height.times(0.476f)
        )
    }

    val pathContour2 = Path().apply {
        moveTo(width.times(0.835f), height.times(0.412f))

        cubicTo(
            x1 = width.times(0.717f),
            y1 = height.times(0.712f),
            x2 = width.times(0.259f),
            y2 = height.times(0.667f),
            x3 = width.times(0.094f),
            y3 = height.times(0.431f)
        )

        cubicTo(
            x1 = width.times(0.374f),
            y1 = height.times(0.580f),
            x2 = width.times(0.551f),
            y2 = height.times(0.684f),
            x3 = width.times(0.835f),
            y3 = height.times(0.412f)
        )
    }

    val pathContour3 = Path().apply {
        moveTo(width.times(0.835f), height.times(0.412f))

        cubicTo(
            x1 = width.times(0.857f),
            y1 = height.times(0.376f),
            x2 = width.times(0.863f),
            y2 = height.times(0.337f),
            x3 = width.times(0.848f),
            y3 = height.times(0.303f)
        )

        cubicTo(
            x1 = width.times(0.881f),
            y1 = height.times(0.277f),
            x2 = width.times(0.897f),
            y2 = height.times(0.318f),
            x3 = width.times(0.934f),
            y3 = height.times(0.310f)
        )

        cubicTo(
            x1 = width.times(0.896f),
            y1 = height.times(0.340f),
            x2 = width.times(0.912f),
            y2 = height.times(0.366f),
            x3 = width.times(0.917f),
            y3 = height.times(0.410f)
        )

        cubicTo(
            x1 = width.times(0.908f),
            y1 = height.times(0.368f),
            x2 = width.times(0.855f),
            y2 = height.times(0.382f),
            x3 = width.times(0.835f),
            y3 = height.times(0.412f)
        )
    }

    val pathPipka = Path().apply {
        moveTo(width.times(0.094f), height.times(0.431f))

        cubicTo(
            x1 = width.times(0.074f),
            y1 = height.times(0.416f),
            x2 = width.times(0.041f),
            y2 = height.times(0.442f),
            x3 = width.times(0.049f),
            y3 = height.times(0.476f)
        )
    }

    val pathBg1 = Path().apply {
        moveTo(width.times(-0.012f), height.times(0.401f))

        cubicTo(
            x1 = width.times(0.171f),
            y1 = height.times(0.888f),
            x2 = width.times(0.889f),
            y2 = height.times(0.890f),
            x3 = width.times(0.942f),
            y3 = height.times(0.402f)
        )
    }

    val pathBg2 = Path().apply {
        moveTo(width.times(0.043f), height.times(0.424f))

        cubicTo(
            x1 = width.times(0.180f),
            y1 = height.times(0.788f),
            x2 = width.times(0.868f),
            y2 = height.times(0.786f),
            x3 = width.times(0.897f),
            y3 = height.times(0.366f)
        )
    }

    clipPath(pathContour1) {
        drawRect(color = Color(0xFFF9DF2F))

        drawPath(
            path = pathBg1,
            color = Color(0xFFF6C10F),
            style = Stroke(width = 100f)
        )

        drawPath(
            path = pathBg2,
            color = Color(0xFFF9CE18),
            style = Stroke(width = 100f)
        )
    }

    clipPath(pathContour2) {
        drawRect(color = Color(0xFFFAE659))
    }

    clipPath(pathContour3) {
        drawRect(
            brush = Brush.linearGradient(
                colors = ko4erizhkaColors,
                start = Offset(width.times(0.9f), height.times(0.3f)),
                end = Offset(width.times(0.9f), height.times(0.4f))
            )
        )
    }

    drawPath(
        path = pathContour1,
        color = Color(0xFF442B1A),
        style = Stroke(width = 5f)
    )

    drawPath(
        path = pathContour2,
        color = Color(0xFF442B1A),
        style = Stroke(width = 5f)
    )

    drawPath(
        path = pathContour3,
        color = Color(0xFF442B1A),
        style = Stroke(width = 5f)
    )

    drawPath(
        path = pathPipka,
        color = Color(0xFF442B1A),
        style = Fill
    )
}

@Preview(showBackground = true)
@Composable
fun BananaPreview() {
    CanvasTheme {
        Banana()
    }
}
