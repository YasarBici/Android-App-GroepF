package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                id = 1,
                question = "Which video game does this character belong to?",
                image = R.drawable.metal_gear,
                optionOne = "Super Mario Kart",
                optionTwo = "Sonic the Hedgehog",
                optionThree = "Super Smash Bros",
                optionFour = "Metal Gear",
                correctAnswer = 4
        )
        questionsList.add(que1)


        val que2 = Question(
                id = 2,
                question = "Which video game does this character belong to?",
                image = R.drawable.plants_vs_zombies,
                optionOne = "Tomb Raider",
                optionTwo = "LittleBigPlanet",
                optionThree = "Plants vs. Zombies",
                optionFour = "Kingdom Hearts",
                correctAnswer = 3
        )
        questionsList.add(que2)

        val que3 = Question(
                id = 3,
                question = "Which video game does this character belong to?",
                image = R.drawable.ice_knack,
                optionOne = "Pokemon",
                optionTwo = "Knack",
                optionThree = "WarCraft",
                optionFour = "Super Smash Bros",
                correctAnswer = 2
        )
        questionsList.add(que3)

        val que4 = Question(
                id = 4,
                question = "Which video game does this character belong to?",
                image = R.drawable.link,
                optionOne = "Wii Sports",
                optionTwo = "Soul Calibur",
                optionThree = "The Legend of Zelda",
                optionFour = "Silent Hill",
                correctAnswer = 3
        )
        questionsList.add(que4)

        val que5 = Question(
                id = 5,
                question = "Which video game does this character belong to?",
                image = R.drawable.god_of_war,
                optionOne = "God of War",
                optionTwo = "Witcher",
                optionThree = "Grand Theft Auto",
                optionFour = "Skyrim",
                correctAnswer = 1
        )
        questionsList.add(que5)

        val que6 = Question(
                id = 6,
                question = "Which video game does this character belong to?",
                image = R.drawable.animal_crossing,
                optionOne = "Harvest Moon",
                optionTwo = "Wii Sports",
                optionThree = "Wii Sports Resort",
                optionFour = "Animal Crossing",
                correctAnswer = 4
        )
        questionsList.add(que6)

        val que7 = Question(
                id = 7,
                question = "Which video game does this character belong to?",
                image = R.drawable.final_fantasy,
                optionOne = "Final Fantasy VII",
                optionTwo = "Dragon Quest",
                optionThree = "Call of Duty",
                optionFour = "Doom",
                correctAnswer = 1
        )
        questionsList.add(que7)

        val que8 = Question(
                id = 8,
                question = "Which video game does this character belong to?",
                image = R.drawable.sonic_flossing,
                optionOne = "Fortnite",
                optionTwo = "Pokemon",
                optionThree = "Sonic",
                optionFour = "Digimon",
                correctAnswer = 3
        )
        questionsList.add(que8)

        val que9 = Question(
                id = 9,
                question = "Which video game does this character belong to?",
                image = R.drawable.little_big_planet,
                optionOne = "Tearaway",
                optionTwo = "Little Big Planet",
                optionThree = "Dreams",
                optionFour = "Woolie's Adventure",
                correctAnswer = 2
        )
        questionsList.add(que9)

        val que10 = Question(
                id = 10,
                question = "Which video game does this character belong to?",
                image = R.drawable.minecraft,
                optionOne = "Half-Life 2",
                optionTwo = "Minecraft",
                optionThree = "Terraria",
                optionFour = "Roblox",
                correctAnswer = 2
        )
        questionsList.add(que10)

        val que11 = Question(
                id = 11,
                question = "Which video game does this character belong to?",
                image = R.drawable.batman_arkham_asylum,
                optionOne = "Batman: Arkham Asylum",
                optionTwo = "Gears of Fenix",
                optionThree = "The Walking Dead",
                optionFour = "Call of Duty",
                correctAnswer = 1
        )
        questionsList.add(que11)

        val que12 = Question(
                id = 12,
                question = "Which video game does this character belong to?",
                image = R.drawable.pacman,
                optionOne = "Master Hand",
                optionTwo = "Ghost Busters",
                optionThree = "Tetris",
                optionFour = "Pacman",
                correctAnswer = 4
        )
        questionsList.add(que12)

        val que13 = Question(
                id = 13,
                question = "Which video game does this character belong to?",
                image = R.drawable.super_mario_bros,
                optionOne = "Guitar Hero",
                optionTwo = "Super Mario Bros.",
                optionThree = "LittleBigPlanet",
                optionFour = "Super Mario Kart",
                correctAnswer = 2
        )
        questionsList.add(que13)

        val que14 = Question(
                id = 14,
                question = "Which video game does this character belong to?",
                image = R.drawable.warcraft_3,
                optionOne = "Bayonetta",
                optionTwo = "Hades",
                optionThree = "Devil May Cry 5",
                optionFour = "WarCraft III: Reign of Chaos",
                correctAnswer = 4
        )
        questionsList.add(que14)

        val que15 = Question(
                id = 15,
                question = "Which video game does this character belong to?",
                image = R.drawable.metroid,
                optionOne = "Half-Life 2",
                optionTwo = "Uncharted",
                optionThree = "Bioshock",
                optionFour = "Metroid",
                correctAnswer = 4
        )
        questionsList.add(que15)

        val que16 = Question(
                id = 16,
                question = "Which video game does this character belong to?",
                image = R.drawable.detective_pikachu,
                optionOne = "L.A. Noire",
                optionTwo = "Digimon",
                optionThree = "Detective Pikachu",
                optionFour = "None of the above",
                correctAnswer = 3
        )
        questionsList.add(que16)

        val que17 = Question(
                id = 17,
                question = "Which video game does this character belong to?",
                image = R.drawable.among_us,
                optionOne = "Town of Salem",
                optionTwo = "Among us",
                optionThree = "Roblox",
                optionFour = "Slenderman",
                correctAnswer = 2
        )
        questionsList.add(que17)

        val que18 = Question(
                id = 18,
                question = "Which video game does this character belong to?",
                image = R.drawable.terraria,
                optionOne = "Terraria",
                optionTwo = "Minecraft",
                optionThree = "Starbound",
                optionFour = "Planet Centauri",
                correctAnswer = 1
        )
        questionsList.add(que18)

        val que19 = Question(
                id = 19,
                question = "Which video game does this character belong to?",
                image = R.drawable.fortnite,
                optionOne = "Marvels Avengers",
                optionTwo = "Creativerse",
                optionThree = "Overwatch",
                optionFour = "Fortnite",
                correctAnswer = 4
        )
        questionsList.add(que19)

        val que20 = Question(
                id = 20,
                question = "Which video game does this character belong to?",
                image = R.drawable.big_yoshi,
                optionOne = "Mario World 3D",
                optionTwo = "Yoshi's Crappy World",
                optionThree = "Mario Tennis",
                optionFour = "Super Smash Bros",
                correctAnswer = 2
        )
        questionsList.add(que20)

        return questionsList
    }

}