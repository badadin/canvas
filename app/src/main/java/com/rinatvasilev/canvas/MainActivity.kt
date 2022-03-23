package com.rinatvasilev.canvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rinatvasilev.canvas.ui.theme.CanvasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CanvasTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.aspectRatio(1f), color = MaterialTheme.colors.background) {
                    //Greeting("Android")
                    Demo()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
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
    CanvasTheme {
        Demo()
        //Greeting("Android")
    }
}
