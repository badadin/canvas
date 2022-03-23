package com.rinatvasilev.canvas

data class Tutorial(val id: ID)

data class TutorialTitle(val title: String, val subtitle: String)

enum class ID {
    AVOCADO, BANANA
}

class TutorialList {
    companion object {
        fun getData(): List<Tutorial> {
            return arrayListOf(
                Tutorial(id = ID.AVOCADO),
                Tutorial(id = ID.BANANA)
            )
        }

        fun getNameById(id: ID): TutorialTitle {
            return when (id) {
                ID.AVOCADO -> TutorialTitle(title = "Avocado", subtitle = "Tutorial 1")
                ID.BANANA -> TutorialTitle(title = "Banana", subtitle = "Tutorial 2")
            }
        }
    }
}
