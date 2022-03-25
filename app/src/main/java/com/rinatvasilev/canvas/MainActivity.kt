package com.rinatvasilev.canvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
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
    val currentScreen = Screens.fromRoute(navController.currentBackStackEntryAsState().value?.destination?.route)
    var currentTitle by remember { mutableStateOf("") }

    if (currentScreen == Screens.ART_LIST) {
        currentTitle = stringResource(id = R.string.canvasArts)
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = topBar(navController, currentScreen, currentTitle)
    ) {
        NavHost(navController = navController, startDestination = Screens.SPLASH.name) {

            composable(Screens.SPLASH.name) {
                SplashScreen(navController = navController)
            }

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

                    currentTitle = id.name
                    ArtDetails(artID = id)
                }
            }
        }
    }
}

@Composable
fun topBar(navController: NavHostController, currentScreen: Screens, currentTitle: String): @Composable () -> Unit {
    return if (currentScreen == Screens.SPLASH) {
        {}
    } else {
        {
            // todo вынести в отдельное вью, чтобы не было нагромождения в одном месте
            TopAppBar(
                title = {
                    Text(text = currentTitle)
                },
                actions = if (currentScreen == Screens.ART_LIST) {
                    {
                        IconButton(onClick = { /* todo link to github */ }) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_github),
                                contentDescription = null
                            )
                        }
                    }
                } else {
                    {}
                },
                navigationIcon = if (currentScreen == Screens.ART_DETAILS) {
                    {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Icon(Icons.Filled.ArrowBack, contentDescription = null)
                        }
                    }
                } else {
                    null
                }
            )
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
