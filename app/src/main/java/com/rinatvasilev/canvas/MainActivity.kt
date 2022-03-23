package com.rinatvasilev.canvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rinatvasilev.canvas.ui.theme.CanvasTheme
import com.rinatvasilev.canvas.ui.views.Avocado
import com.rinatvasilev.canvas.ui.views.Banana

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TutorialsList()
        }
    }
}

@Composable
fun TutorialsList() {
    CanvasTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
            LazyColumn {
                items(TutorialList.getData()) {
                    ListItem(item = it)
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
fun ListItem(item: Tutorial) {
    val name = TutorialList.getNameById(item.id)

    Row(
        modifier = Modifier
            .padding(all = 16.dp)
            .clickable {

            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier.size(128.dp)) {
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

//@Preview(
//    uiMode = Configuration.UI_MODE_NIGHT_NO,
//    showBackground = true,
//    name = "Light Mode"
//)
//@Preview(
//    uiMode = Configuration.UI_MODE_NIGHT_YES,
//    showBackground = true,
//    name = "Dark Mode"
//)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TutorialsList()
}
