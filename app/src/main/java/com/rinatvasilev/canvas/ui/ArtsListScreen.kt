package com.rinatvasilev.canvas.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rinatvasilev.canvas.Art
import com.rinatvasilev.canvas.Arts
import com.rinatvasilev.canvas.ID
import com.rinatvasilev.canvas.ui.theme.CanvasTheme
import com.rinatvasilev.canvas.ui.views.Avocado
import com.rinatvasilev.canvas.ui.views.Banana

@Composable
fun ArtsList(onItemClicked: (String) -> Unit) {
    CanvasTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = stringResource(id = com.rinatvasilev.canvas.R.string.canvasArts))
                    },
                    actions = {
                        IconButton(onClick = { /* todo link to github */ }) {
                            Icon(
                                painter = painterResource(id = com.rinatvasilev.canvas.R.drawable.ic_github),
                                contentDescription = null
                            )
                        }
                    }
                )
            }) {
            Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                LazyColumn {
                    items(Arts.getData()) { it ->
                        ListItem(item = it, onItemClicked = { artName ->
                            onItemClicked(artName)
                        })
                        Divider(
                            modifier = Modifier.padding(horizontal = 16.dp),
                            color = Color(0x805F5F5F),
                            thickness = 1.dp
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ListItem(item: Art, onItemClicked: (String) -> Unit) {
    val name = Arts.getNameById(item.id)

    Row(
        modifier = Modifier
            .padding(all = 16.dp)
            .clip(RoundedCornerShape(16.dp))
            .clickable {
                onItemClicked(item.id.name)
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        //todo разобраться, почему такое толстое-жирное (на сплеше не жирное. из-за скейла?)
        // нет, сделать не точные размеры, а высчитывать проценты у вьюх
        // то есть, не Stroke(width = 15f), а вместо 15 - высчитать

        Box(modifier = Modifier.size(200.dp)) {
            when (item.id) {
                ID.AVOCADO -> Avocado()
                ID.BANANA -> Banana()
            }
        }

        Spacer(modifier = Modifier.width(16.dp))

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = name.title, fontSize = 30.sp)
            Text(text = name.subtitle, fontSize = 16.sp)
        }
    }
}
