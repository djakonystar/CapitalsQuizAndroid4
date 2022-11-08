package uz.texnopos.capitalsquizapp.data

object Constants {
    const val PREFS_NAME = "CapitalsSettings"

    fun provideQuestions(): List<Question> {
        val questions = mutableListOf<Question>()

        questions.add(
            Question(
                id = 0,
                question = "Uzbekistan",
                answers = listOf("Tashkent", "Moscow", "London", "Paris"),
                correctAnswerId = 0
            )
        )

        questions.add(
            Question(
                id = 1,
                question = "Karakalpakstan",
                answers = listOf("Tashkent", "Moscow", "Nukus", "Paris"),
                correctAnswerId = 2
            )
        )

        questions.add(
            Question(
                id = 2,
                question = "Uzbekistan",
                answers = listOf("Tashkent", "Moscow", "London", "Paris"),
                correctAnswerId = 0
            )
        )

        questions.add(
            Question(
                id = 0,
                question = "Uzbekistan",
                answers = listOf("Tashkent", "Moscow", "London", "Paris"),
                correctAnswerId = 0
            )
        )

        questions.add(
            Question(
                id = 0,
                question = "Uzbekistan",
                answers = listOf("Tashkent", "Moscow", "London", "Paris"),
                correctAnswerId = 0
            )
        )

        questions.add(
            Question(
                id = 0,
                question = "Uzbekistan",
                answers = listOf("Tashkent", "Moscow", "London", "Paris"),
                correctAnswerId = 0
            )
        )

        questions.add(
            Question(
                id = 0,
                question = "Uzbekistan",
                answers = listOf("Tashkent", "Moscow", "London", "Paris"),
                correctAnswerId = 0
            )
        )

        questions.add(
            Question(
                id = 0,
                question = "Uzbekistan",
                answers = listOf("Tashkent", "Moscow", "London", "Paris"),
                correctAnswerId = 0
            )
        )

        questions.add(
            Question(
                id = 0,
                question = "Uzbekistan",
                answers = listOf("Tashkent", "Moscow", "London", "Paris"),
                correctAnswerId = 0
            )
        )

        questions.add(
            Question(
                id = 0,
                question = "Russia",
                answers = listOf("Tashkent", "Moscow", "London", "Paris"),
                correctAnswerId = 1
            )
        )

        return questions
    }
}
