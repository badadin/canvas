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
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.tooling.preview.Preview
import com.rinatvasilev.canvas.ui.theme.CanvasTheme

@Composable
fun Pear() {

    Canvas(modifier = Modifier.aspectRatio(1f)) {

        val width = size.width
        val height = size.height

        val pathContour = Path().apply {
            moveTo(width.times(0.122f), height.times(0.572f))

            cubicTo(
                x1 = width.times(0.037f),
                y1 = height.times(0.957f),
                x2 = width.times(0.628f),
                y2 = height.times(1.053f),
                x3 = width.times(0.645f),
                y3 = height.times(0.665f)
            )

            cubicTo(
                x1 = width.times(0.648f),
                y1 = height.times(0.590f),
                x2 = width.times(0.558f),
                y2 = height.times(0.552f),
                x3 = width.times(0.591f),
                y3 = height.times(0.443f)
            )

            cubicTo(
                x1 = width.times(0.620f),
                y1 = height.times(0.162f),
                x2 = width.times(0.306f),
                y2 = height.times(0.143f),
                x3 = width.times(0.263f),
                y3 = height.times(0.403f)
            )

            cubicTo(
                x1 = width.times(0.189f),
                y1 = height.times(0.502f),
                x2 = width.times(0.171f),
                y2 = height.times(0.426f),
                x3 = width.times(0.122f),
                y3 = height.times(0.572f)
            )
        }

        val pathStalkFoundation = Path().apply {
            moveTo(width.times(0.481f), height.times(0.325f))

            cubicTo(
                x1 = width.times(0.489f),
                y1 = height.times(0.296f),
                x2 = width.times(0.426f),
                y2 = height.times(0.264f),
                x3 = width.times(0.390f),
                y3 = height.times(0.299f)
            )

            moveTo(width.times(0.517f), height.times(0.300f))

            cubicTo(
                x1 = width.times(0.493f),
                y1 = height.times(0.269f),
                x2 = width.times(0.464f),
                y2 = height.times(0.283f),
                x3 = width.times(0.442f),
                y3 = height.times(0.309f)
            )

            moveTo(width.times(0.442f), height.times(0.313f))

            cubicTo(
                x1 = width.times(0.467f),
                y1 = height.times(0.276f),
                x2 = width.times(0.431f),
                y2 = height.times(0.276f),
                x3 = width.times(0.411f),
                y3 = height.times(0.257f)
            )
        }

        val pathStalkTop = Path().apply {
            moveTo(width.times(0.554f), height.times(0.161f))

            cubicTo(
                x1 = width.times(0.572f),
                y1 = height.times(0.143f),
                x2 = width.times(0.564f),
                y2 = height.times(0.113f),
                x3 = width.times(0.540f),
                y3 = height.times(0.110f)
            )

            cubicTo(
                x1 = width.times(0.528f),
                y1 = height.times(0.127f),
                x2 = width.times(0.535f),
                y2 = height.times(0.144f),
                x3 = width.times(0.554f),
                y3 = height.times(0.161f)
            )
        }

        val pathStalk = Path().apply {
            moveTo(width.times(0.554f), height.times(0.161f))

            cubicTo(
                x1 = width.times(0.521f),
                y1 = height.times(0.162f),
                x2 = width.times(0.468f),
                y2 = height.times(0.247f),
                x3 = width.times(0.478f),
                y3 = height.times(0.282f)
            )

            cubicTo(
                x1 = width.times(0.459f),
                y1 = height.times(0.307f),
                x2 = width.times(0.436f),
                y2 = height.times(0.282f),
                x3 = width.times(0.434f),
                y3 = height.times(0.276f)
            )

            cubicTo(
                x1 = width.times(0.446f),
                y1 = height.times(0.224f),
                x2 = width.times(0.455f),
                y2 = height.times(0.155f),
                x3 = width.times(0.543f),
                y3 = height.times(0.108f)
            )

            cubicTo(
                x1 = width.times(0.569f),
                y1 = height.times(0.098f),
                x2 = width.times(0.575f),
                y2 = height.times(0.143f),
                x3 = width.times(0.554f),
                y3 = height.times(0.161f)
            )
        }

        val pathLeaf = Path().apply {
            moveTo(width.times(0.575f), height.times(0.193f))

            cubicTo(
                x1 = width.times(0.660f),
                y1 = height.times(0.161f),
                x2 = width.times(0.819f),
                y2 = height.times(0.161f),
                x3 = width.times(0.940f),
                y3 = height.times(0.444f)
            )

            cubicTo(
                x1 = width.times(0.884f),
                y1 = height.times(0.394f),
                x2 = width.times(0.784f),
                y2 = height.times(0.420f),
                x3 = width.times(0.718f),
                y3 = height.times(0.405f)
            )

            cubicTo(
                x1 = width.times(0.669f),
                y1 = height.times(0.393f),
                x2 = width.times(0.588f),
                y2 = height.times(0.347f),
                x3 = width.times(0.554f),
                y3 = height.times(0.241f)
            )

            cubicTo(
                x1 = width.times(0.537f),
                y1 = height.times(0.220f),
                x2 = width.times(0.509f),
                y2 = height.times(0.215f),
                x3 = width.times(0.482f),
                y3 = height.times(0.214f)
            )

            cubicTo(
                x1 = width.times(0.473f),
                y1 = height.times(0.169f),
                x2 = width.times(0.515f),
                y2 = height.times(0.218f),
                x3 = width.times(0.575f),
                y3 = height.times(0.193f)
            )
        }

        val pathLeafVeins = Path().apply {
            moveTo(width.times(0.549f), height.times(0.216f))

            cubicTo(
                x1 = width.times(0.667f),
                y1 = height.times(0.216f),
                x2 = width.times(0.768f),
                y2 = height.times(0.295f),
                x3 = width.times(0.893f),
                y3 = height.times(0.394f)
            )

            moveTo(width.times(0.582f), height.times(0.217f))

            cubicTo(
                x1 = width.times(0.576f),
                y1 = height.times(0.208f),
                x2 = width.times(0.615f),
                y2 = height.times(0.200f),
                x3 = width.times(0.621f),
                y3 = height.times(0.205f)
            )

            moveTo(width.times(0.582f), height.times(0.217f))

            cubicTo(
                x1 = width.times(0.626f),
                y1 = height.times(0.236f),
                x2 = width.times(0.663f),
                y2 = height.times(0.246f),
                x3 = width.times(0.694f),
                y3 = height.times(0.322f)
            )

            moveTo(width.times(0.686f), height.times(0.249f))

            cubicTo(
                x1 = width.times(0.725f),
                y1 = height.times(0.238f),
                x2 = width.times(0.759f),
                y2 = height.times(0.241f),
                x3 = width.times(0.788f),
                y3 = height.times(0.266f)
            )

            moveTo(width.times(0.686f), height.times(0.249f))

            cubicTo(
                x1 = width.times(0.718f),
                y1 = height.times(0.262f),
                x2 = width.times(0.748f),
                y2 = height.times(0.295f),
                x3 = width.times(0.769f),
                y3 = height.times(0.365f)
            )

            moveTo(width.times(0.801f), height.times(0.323f))

            cubicTo(
                x1 = width.times(0.822f),
                y1 = height.times(0.310f),
                x2 = width.times(0.845f),
                y2 = height.times(0.318f),
                x3 = width.times(0.861f),
                y3 = height.times(0.333f)
            )

            moveTo(width.times(0.801f), height.times(0.323f))

            cubicTo(
                x1 = width.times(0.823f),
                y1 = height.times(0.343f),
                x2 = width.times(0.835f),
                y2 = height.times(0.362f),
                x3 = width.times(0.846f),
                y3 = height.times(0.382f)
            )


        }

        clipPath(pathContour) {
            drawPath(
                path = pathContour,
                color = Color(0xFFCACC3A),
                style = Fill
            )
        }

        drawPath(
            path = pathContour,
            color = Color(0xFF442B1A),
            style = Stroke(width = 15f, cap = StrokeCap.Round)
        )

        drawPath(
            path = pathStalkFoundation,
            color = Color(0xFF442B1A),
            style = Stroke(width = 7f, cap = StrokeCap.Round)
        )

        clipPath(pathStalk) {
            drawPath(
                path = pathStalk,
                color = Color(0xFF846222),
                style = Fill
            )
        }

        drawPath(
            path = pathStalk,
            color = Color(0xFF442B1A),
            style = Stroke(width = 15f, cap = StrokeCap.Round)
        )

        drawPath(
            path = pathStalkTop,
            color = Color(0xFF442B1A),
            style = Stroke(width = 7f, cap = StrokeCap.Round)
        )

        clipPath(pathLeaf) {
            drawPath(
                path = pathLeaf,
                color = Color(0xFF1A6626),
                style = Fill
            )
        }

        drawPath(
            path = pathLeaf,
            color = Color(0xFF442B1A),
            style = Stroke(width = 15f, cap = StrokeCap.Round)
        )

        drawPath(
            path = pathLeafVeins,
            color = Color(0xFF442B1A),
            style = Stroke(width = 7f, cap = StrokeCap.Round)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PearPreview() {
    CanvasTheme {
        Pear()
    }
}
