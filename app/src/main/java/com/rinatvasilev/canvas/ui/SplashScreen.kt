package com.rinatvasilev.canvas.ui

import android.view.animation.DecelerateInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.navigation.NavController
import com.rinatvasilev.canvas.Screens
import com.rinatvasilev.canvas.ui.views.Avocado

@Composable
fun SplashScreen(navController: NavController) {
    val maxValue = 0.4f
    val scaleAndRotate = remember { Animatable(0.01f) }

    LaunchedEffect(key1 = true) {
        scaleAndRotate.animateTo(
            targetValue = maxValue,
            animationSpec = tween(
                durationMillis = 500,
                easing = { DecelerateInterpolator(1f).getInterpolation(it) }
            )
        )

        navController.popBackStack()
        navController.navigate(Screens.ART_LIST.name)
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .scale(scaleAndRotate.value)
                .rotate(calculateDegree(value = scaleAndRotate.value, maxValue = maxValue))
        ) {
            Avocado()
        }
    }
}

private fun calculateDegree(value: Float, maxValue: Float): Float {
    val valuePercent = (value * 100f) / maxValue
    return (360f * valuePercent) / 100f
}
