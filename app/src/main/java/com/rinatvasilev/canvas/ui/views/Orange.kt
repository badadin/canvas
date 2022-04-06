package com.rinatvasilev.canvas.ui.views

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.tooling.preview.Preview
import com.rinatvasilev.canvas.ui.theme.CanvasTheme

@Composable
fun Orange() {

    Canvas(modifier = Modifier.aspectRatio(1f)) {

        val width = size.width
        val height = size.height

        val pathBg1 = Path().apply {
            moveTo(width.times(0.152f), height.times(0.470f))

            cubicTo(
                x1 = width.times(0.139f),
                y1 = height.times(1.013f),
                x2 = width.times(0.855f),
                y2 = height.times(0.884f),
                x3 = width.times(0.846f),
                y3 = height.times(0.504f)
            )

            cubicTo(
                x1 = width.times(0.803f),
                y1 = height.times(0.061f),
                x2 = width.times(0.200f),
                y2 = height.times(0.052f),
                x3 = width.times(0.152f),
                y3 = height.times(0.470f)
            )
        }

        val pathBg2 = Path().apply {
            moveTo(width.times(0.763f), height.times(0.538f))

            cubicTo(
                x1 = width.times(0.780f),
                y1 = height.times(0.108f),
                x2 = width.times(0.212f),
                y2 = height.times(0.061f),
                x3 = width.times(0.176f),
                y3 = height.times(0.470f)
            )

            cubicTo(
                x1 = width.times(0.128f),
                y1 = height.times(0.876f),
                x2 = width.times(0.710f),
                y2 = height.times(0.941f),
                x3 = width.times(0.763f),
                y3 = height.times(0.538f)
            )

        }

        drawPath(
            path = pathBg1,
            color = Color(0xFFFF9000),
            style = Fill
        )

        drawPath(
            path = pathBg2,
            color = Color(0xFFFEDF85),
            style = Fill //Stroke(width = 10f, cap = StrokeCap.Round)
        )

        rotate(degrees = -2f, pivot = Offset(width.times(0.429f), height.times(0.533f))) {
            drawDolkaType1(width, height)
        }

        rotate(degrees = 32f, pivot = Offset(width.times(0.429f), height.times(0.533f))) {
            drawDolkaType1(width, height)
        }

        rotate(degrees = 127f, pivot = Offset(width.times(0.465f), height.times(0.504f))) {
            drawDolkaType1(width, height)
        }

        rotate(degrees = -3f, pivot = Offset(width.times(0.455f), height.times(0.500f))) {
            drawDolkaType2(width, height)
        }

        rotate(degrees = 163f, pivot = Offset(width.times(0.455f), height.times(0.500f))) {
            drawDolkaType1(width, height)
        }

        rotate(degrees = 112f, pivot = Offset(width.times(0.455f), height.times(0.500f))) {
            drawDolkaType2(width, height)
        }

        rotate(degrees = 74f, pivot = Offset(width.times(0.456f), height.times(0.507f))) {
            drawDolkaType2(width, height)
        }

        rotate(degrees = 38f, pivot = Offset(width.times(0.456f), height.times(0.5207f))) {
            drawDolkaType2(width, height)
        }

        rotate(degrees = -124f, pivot = Offset(width.times(0.460f), height.times(0.50f))) {
            drawDolkaType3(width, height)
        }
        //0xFFFFFDE4
    }
}

private fun DrawScope.drawDolkaType1(width: Float, height: Float) {
    val pathDolka = Path().apply {
        moveTo(width.times(0.465f), height.times(0.236f))

        cubicTo(
            x1 = width.times(0.429f),
            y1 = height.times(0.533f),
            x2 = width.times(0.444f),
            y2 = height.times(0.544f),
            x3 = width.times(0.613f),
            y3 = height.times(0.293f)
        )

        cubicTo(
            x1 = width.times(0.622f),
            y1 = height.times(0.255f),
            x2 = width.times(0.513f),
            y2 = height.times(0.201f),
            x3 = width.times(0.465f),
            y3 = height.times(0.236f)
        )
    }

    drawPath(
        path = pathDolka,
        color = Color(0xFFFF9000),
        style = Fill //Stroke(width = 10f, cap = StrokeCap.Round)
    )
}

private fun DrawScope.drawDolkaType2(width: Float, height: Float) {
    val pathDolka = Path().apply {
        moveTo(width.times(0.239f), height.times(0.628f))

        cubicTo(
            x1 = width.times(0.490f),
            y1 = height.times(0.468f),
            x2 = width.times(0.457f),
            y2 = height.times(0.512f),
            x3 = width.times(0.330f),
            y3 = height.times(0.723f)
        )

        cubicTo(
            x1 = width.times(0.301f),
            y1 = height.times(0.741f),
            x2 = width.times(0.208f),
            y2 = height.times(0.676f),
            x3 = width.times(0.239f),
            y3 = height.times(0.628f)
        )
    }

    drawPath(
        path = pathDolka,
        color = Color(0xFFFF9000),
        style = Fill //Stroke(width = 10f, cap = StrokeCap.Round)
    )
}

private fun DrawScope.drawDolkaType3(width: Float, height: Float) {
    val pathDolka = Path().apply {
        moveTo(width.times(0.355f), height.times(0.725f))

        cubicTo(
            x1 = width.times(0.432f),
            y1 = height.times(0.520f),
            x2 = width.times(0.449f),
            y2 = height.times(0.521f),
            x3 = width.times(0.236f),
            y3 = height.times(0.611f)
        )

        cubicTo(
            x1 = width.times(0.200f),
            y1 = height.times(0.692f),
            x2 = width.times(0.285f),
            y2 = height.times(0.736f),
            x3 = width.times(0.355f),
            y3 = height.times(0.725f)
        )

    }

    drawPath(
        path = pathDolka,
        color = Color(0xFFFF9000),
        style = Fill //Stroke(width = 10f, cap = StrokeCap.Round)
    )
}

@Preview(showBackground = true)
@Composable
fun OrangePreview() {
    CanvasTheme {
        Orange()
    }
}
