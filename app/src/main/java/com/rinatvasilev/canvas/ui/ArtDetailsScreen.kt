package com.rinatvasilev.canvas.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rinatvasilev.canvas.ID
import com.rinatvasilev.canvas.ui.theme.CanvasTheme
import com.rinatvasilev.canvas.ui.views.Avocado
import com.rinatvasilev.canvas.ui.views.Banana
import com.rinatvasilev.canvas.ui.views.Bananas
import com.rinatvasilev.canvas.ui.views.Orange

@Composable
fun ArtDetails(artID: ID) {
    CanvasTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
            when (artID) {
                ID.AVOCADO -> Avocado()
                ID.BANANA -> {
                    Column {
                        Banana()
                        Bananas()
                    }
                }
                ID.ORANGE -> Orange()
            }
        }
    }
}
