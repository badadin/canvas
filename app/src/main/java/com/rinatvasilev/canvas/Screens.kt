package com.rinatvasilev.canvas

enum class Screens {
    SPLASH, ART_LIST, ART_DETAILS;

    companion object {
        fun fromRoute(route: String?): Screens =
            when (route?.substringBefore("/")) {
                SPLASH.name -> SPLASH
                ART_LIST.name -> ART_LIST
                ART_DETAILS.name -> ART_DETAILS
                else -> ART_LIST
            }
    }
}
