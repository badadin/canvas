package com.rinatvasilev.canvas.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.rinatvasilev.canvas.R
import com.rinatvasilev.canvas.ui.theme.CanvasTheme

@Composable
fun ArtDetails(artName: String?, onBackClickListener: () -> Unit) {
    CanvasTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = stringResource(id = R.string.canvasArts))
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
                // todo
            }
        }
    }
}