package com.rinatvasilev.canvas.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.rinatvasilev.canvas.Arts
import com.rinatvasilev.canvas.ID
import com.rinatvasilev.canvas.R
import com.rinatvasilev.canvas.ui.theme.CanvasTheme
import com.rinatvasilev.canvas.ui.views.Avocado
import com.rinatvasilev.canvas.ui.views.Banana

@Composable
fun ArtDetails(artID: ID, onBackClickListener: () -> Unit) {

    CanvasTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = Arts.getNameById(artID).title)
                    },
                    navigationIcon = {
                        IconButton(onClick = { onBackClickListener() }) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_github),
                                contentDescription = null
                            )
                        }
                    }
                )
            }) {
            Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                when (artID) {
                    ID.AVOCADO -> Avocado()
                    ID.BANANA -> Banana()
                }
            }
        }
    }
}
