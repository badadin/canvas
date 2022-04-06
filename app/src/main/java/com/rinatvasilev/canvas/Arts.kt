package com.rinatvasilev.canvas

data class Art(val id: ID)

data class ArtTitle(val title: String, val subtitle: String)

enum class ID {
    AVOCADO, BANANA, ORANGE
}

class Arts {
    companion object {
        fun getData(): List<Art> {
            return arrayListOf(
                Art(id = ID.AVOCADO),
                Art(id = ID.BANANA),
                Art(id = ID.ORANGE)
            )
        }

        fun getNameById(id: ID): ArtTitle {
            return when (id) {
                ID.AVOCADO -> ArtTitle(title = "Avocado", subtitle = "Art 1")
                ID.BANANA -> ArtTitle(title = "Banana", subtitle = "Art 2")
                ID.ORANGE -> ArtTitle(title = "Orange", subtitle = "Art 3")
            }
        }
    }
}
