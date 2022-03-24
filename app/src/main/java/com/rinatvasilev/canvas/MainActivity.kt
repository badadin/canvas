package com.rinatvasilev.canvas

import android.os.Bundle
import android.view.animation.DecelerateInterpolator
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rinatvasilev.canvas.ui.theme.CanvasTheme
import com.rinatvasilev.canvas.ui.views.Avocado
import com.rinatvasilev.canvas.ui.views.Banana

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation()
        }
    }
}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "splash_screen"
    ) {
        composable("splash_screen") {
            SplashScreen(navController = navController)
        }

        composable("main_screen") {
            ArtsList()
        }
    }
}

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
        navController.navigate("main_screen")
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

@Composable
fun ArtsList() {
    CanvasTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = stringResource(id = R.string.canvasArts))
                    },
                    actions = {
                        IconButton(onClick = { /* todo link to github */ }) {
                            Icon(painter = painterResource(id = R.drawable.ic_github), contentDescription = null)
                        }
                    }
                )
            }) {
            Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                LazyColumn {
                    items(ArtList.getData()) {
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
}

@Composable
fun ListItem(item: Art) {
    val name = ArtList.getNameById(item.id)

    Row(
        modifier = Modifier
            .padding(all = 16.dp)
            .clip(RoundedCornerShape(16.dp))
            .clickable {
                //todo
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
    ArtsList()
}
