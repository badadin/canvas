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
            drawSliceType1(width, height)
        }

        rotate(degrees = 32f, pivot = Offset(width.times(0.429f), height.times(0.533f))) {
            drawSliceType1(width, height)
        }

        rotate(degrees = 127f, pivot = Offset(width.times(0.465f), height.times(0.504f))) {
            drawSliceType1(width, height)
        }

        rotate(degrees = -3f, pivot = Offset(width.times(0.455f), height.times(0.500f))) {
            drawSliceType2(width, height)
        }

        rotate(degrees = 163f, pivot = Offset(width.times(0.455f), height.times(0.500f))) {
            drawSliceType1(width, height)
        }

        rotate(degrees = 112f, pivot = Offset(width.times(0.455f), height.times(0.500f))) {
            drawSliceType2(width, height)
        }

        rotate(degrees = 74f, pivot = Offset(width.times(0.456f), height.times(0.507f))) {
            drawSliceType2(width, height)
        }

        rotate(degrees = 38f, pivot = Offset(width.times(0.456f), height.times(0.5207f))) {
            drawSliceType2(width, height)
        }

        drawSliceType3(width, height)
    }
}

private fun DrawScope.drawSliceType1(width: Float, height: Float) {
    val pathSlice = Path().apply {
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

    val pathGlares = Path().apply {
        moveTo(width.times(0.493f), height.times(0.275f))

        cubicTo(
            x1 = width.times(0.486f),
            y1 = height.times(0.279f),
            x2 = width.times(0.471f),
            y2 = height.times(0.318f),
            x3 = width.times(0.479f),
            y3 = height.times(0.340f)
        )

        cubicTo(
            x1 = width.times(0.485f),
            y1 = height.times(0.323f),
            x2 = width.times(0.494f),
            y2 = height.times(0.299f),
            x3 = width.times(0.493f),
            y3 = height.times(0.275f)
        )

        moveTo(width.times(0.534f), height.times(0.327f))

        cubicTo(
            x1 = width.times(0.534f),
            y1 = height.times(0.308f),
            x2 = width.times(0.542f),
            y2 = height.times(0.286f),
            x3 = width.times(0.557f),
            y3 = height.times(0.264f)
        )

        cubicTo(
            x1 = width.times(0.553f),
            y1 = height.times(0.307f),
            x2 = width.times(0.556f),
            y2 = height.times(0.292f),
            x3 = width.times(0.534f),
            y3 = height.times(0.327f)
        )

        moveTo(width.times(0.506f), height.times(0.349f))

        cubicTo(
            x1 = width.times(0.502f),
            y1 = height.times(0.381f),
            x2 = width.times(0.495f),
            y2 = height.times(0.400f),
            x3 = width.times(0.479f),
            y3 = height.times(0.427f)
        )

        cubicTo(
            x1 = width.times(0.481f),
            y1 = height.times(0.395f),
            x2 = width.times(0.488f),
            y2 = height.times(0.373f),
            x3 = width.times(0.506f),
            y3 = height.times(0.349f)
        )
    }

    drawPath(
        path = pathSlice,
        color = Color(0xFFFF9000),
        style = Fill
    )

    drawPath(
        path = pathGlares,
        color = Color(0xFFFDF376),
        style = Fill
    )
}

private fun DrawScope.drawSliceType2(width: Float, height: Float) {
    val pathSlice = Path().apply {
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

    val pathGlares = Path().apply {
        moveTo(width.times(0.293f), height.times(0.670f))

        cubicTo(
            x1 = width.times(0.303f),
            y1 = height.times(0.643f),
            x2 = width.times(0.323f),
            y2 = height.times(0.627f),
            x3 = width.times(0.342f),
            y3 = height.times(0.610f)
        )

        cubicTo(
            x1 = width.times(0.329f),
            y1 = height.times(0.635f),
            x2 = width.times(0.310f),
            y2 = height.times(0.652f),
            x3 = width.times(0.293f),
            y3 = height.times(0.670f)
        )

        moveTo(width.times(0.388f), height.times(0.575f))

        cubicTo(
            x1 = width.times(0.385f),
            y1 = height.times(0.598f),
            x2 = width.times(0.380f),
            y2 = height.times(0.611f),
            x3 = width.times(0.366f),
            y3 = height.times(0.626f)
        )

        cubicTo(
            x1 = width.times(0.374f),
            y1 = height.times(0.596f),
            x2 = width.times(0.370f),
            y2 = height.times(0.605f),
            x3 = width.times(0.388f),
            y3 = height.times(0.575f)
        )
    }

    drawPath(
        path = pathSlice,
        color = Color(0xFFFF9000),
        style = Fill //Stroke(width = 10f, cap = StrokeCap.Round)
    )

    drawPath(
        path = pathGlares,
        color = Color(0xFFFDF376),
        style = Fill
    )
}

private fun DrawScope.drawSliceType3(width: Float, height: Float) {
    val pathSlice = Path().apply {
        moveTo(width.times(0.673f), height.times(0.621f))

        cubicTo(
            x1 = width.times(0.474f),
            y1 = height.times(0.478f),
            x2 = width.times(0.485f),
            y2 = height.times(0.522f),
            x3 = width.times(0.693f),
            y3 = height.times(0.465f)
        )

        cubicTo(
            x1 = width.times(0.749f),
            y1 = height.times(0.486f),
            x2 = width.times(0.756f),
            y2 = height.times(0.591f),
            x3 = width.times(0.673f),
            y3 = height.times(0.621f)
        )
    }

    val pathGlares = Path().apply {
        moveTo(width.times(0.564f), height.times(0.514f))

        cubicTo(
            x1 = width.times(0.583f),
            y1 = height.times(0.520f),
            x2 = width.times(0.607f),
            y2 = height.times(0.507f),
            x3 = width.times(0.628f),
            y3 = height.times(0.525f)
        )

        cubicTo(
            x1 = width.times(0.600f),
            y1 = height.times(0.530f),
            x2 = width.times(0.584f),
            y2 = height.times(0.527f),
            x3 = width.times(0.564f),
            y3 = height.times(0.514f)
        )

        moveTo(width.times(0.693f), height.times(0.512f))

        cubicTo(
            x1 = width.times(0.670f),
            y1 = height.times(0.518f),
            x2 = width.times(0.646f),
            y2 = height.times(0.518f),
            x3 = width.times(0.623f),
            y3 = height.times(0.506f)
        )

        cubicTo(
            x1 = width.times(0.647f),
            y1 = height.times(0.503f),
            x2 = width.times(0.668f),
            y2 = height.times(0.504f),
            x3 = width.times(0.693f),
            y3 = height.times(0.512f)
        )

        moveTo(width.times(0.620f), height.times(0.557f))

        cubicTo(
            x1 = width.times(0.645f),
            y1 = height.times(0.551f),
            x2 = width.times(0.663f),
            y2 = height.times(0.552f),
            x3 = width.times(0.683f),
            y3 = height.times(0.566f)
        )

        cubicTo(
            x1 = width.times(0.661f),
            y1 = height.times(0.566f),
            x2 = width.times(0.642f),
            y2 = height.times(0.564f),
            x3 = width.times(0.620f),
            y3 = height.times(0.557f)
        )
    }

    drawPath(
        path = pathSlice,
        color = Color(0xFFFF9000),
        style = Fill
    )

    drawPath(
        path = pathGlares,
        color = Color(0xFFFDF376),
        style = Fill
    )
}

@Preview(showBackground = true)
@Composable
fun OrangePreview() {
    CanvasTheme {
        Orange()
    }
}
