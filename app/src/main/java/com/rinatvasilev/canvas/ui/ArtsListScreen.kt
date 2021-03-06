package com.rinatvasilev.canvas.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rinatvasilev.canvas.Art
import com.rinatvasilev.canvas.Arts
import com.rinatvasilev.canvas.ID
import com.rinatvasilev.canvas.ui.theme.CanvasTheme
import com.rinatvasilev.canvas.ui.views.Avocado
import com.rinatvasilev.canvas.ui.views.Banana
import com.rinatvasilev.canvas.ui.views.Orange
import com.rinatvasilev.canvas.ui.views.Pear

@Composable
fun ArtsList(onItemClicked: (String) -> Unit) {
    CanvasTheme {
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
        //todo ??????????????????????, ???????????? ?????????? ??????????????-???????????? (???? ???????????? ???? ????????????. ????-???? ?????????????)
        // ??????, ?????????????? ???? ???????????? ??????????????, ?? ?????????????????????? ???????????????? ?? ????????
        // ???? ????????, ???? Stroke(width = 15f), ?? ???????????? 15 - ??????????????????

        Box(modifier = Modifier.size(200.dp)) {
            when (item.id) {
                ID.AVOCADO -> Avocado()
                ID.BANANA -> Banana()
                ID.ORANGE -> Orange()
                ID.PEAR -> Pear()
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
