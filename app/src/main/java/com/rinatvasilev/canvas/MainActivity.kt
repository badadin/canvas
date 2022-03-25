package com.rinatvasilev.canvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.rinatvasilev.canvas.ui.ArtDetails
import com.rinatvasilev.canvas.ui.ArtsList

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
        startDestination = Screens.SPLASH.name
    ) {
        composable(Screens.SPLASH.name) {
            SplashScreen(navController = navController)
        }

        //todo Scaffold с topBar'ом добавить не внутри каждого экрана, а общий, чтобы не мерцало

        composable(Screens.ART_LIST.name) {
            ArtsList(onItemClicked = { artName ->
                navController.navigate("${Screens.ART_DETAILS.name}/$artName")
            })
        }

        composable(
            route = "${Screens.ART_DETAILS.name}/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                }
            )
        ) { entry ->
            val artName = entry.arguments?.getString("name")
            artName?.let {
                val id = try {
                    ID.valueOf(it)
                } catch (ex: Throwable) {
                    ID.AVOCADO
                }

                ArtDetails(artID = id, onBackClickListener = {
                    navController.popBackStack()
                })
            }
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
    ArtsList(onItemClicked = {})
}
