import java.util.*

/*Class Robot defines the tasks which will be performed by the Robot
* You can customize this class according to your preferences*/
class Robot(val name: String) {

    fun ringAlarm(time: String) = println("Good morning!! Its $name, The time is already $time, please wake up!!!")

    fun makeTea(tea: Tea) = if (tea.hot) {
        println("Your hot tea with ${tea.spoonsOfSugar} spoons of sugar is ready!")
    } else {
        println("Your tea with ${tea.spoonsOfSugar} spoons of sugar is ready!")
    }

    fun heatWater(temperature: Int) = println("Bath water with $temperature is ready, take a bath now!")

    fun packBag(day: Int) {
        val messageTemplate = "Books kept for today are : "
        val subjects =
            arrayOf("Maths", "Physics", "Chemistry", "Electronics", "Computers", "Material Sciences", "Human Values")

        when (day) {
            Calendar.MONDAY -> println("$messageTemplate ${subjects[0]}, ${subjects[1]}, ${subjects[2]}")
            Calendar.TUESDAY -> println("$messageTemplate ${subjects[0]}, ${subjects[1]}, ${subjects[2]}")
            Calendar.WEDNESDAY -> println("$messageTemplate ${subjects[3]}, ${subjects[4]}")
            Calendar.THURSDAY -> println("$messageTemplate ${subjects[3]}, ${subjects[4]}")
            Calendar.FRIDAY -> println("$messageTemplate ${subjects[5]}, ${subjects[6]}")
            else -> println("Invalid day or maybe its holiday today!!")
        }
    }

    /*Here a random choice is made by the robot using the system defined method random()*/
    fun cook() {
        val breakfast = mutableListOf("Idli", "Doosa", "Upma", "Vooda", "Eggs with Bread")
        val lunch =
            mutableListOf("Rice with Potato Curry", "Mutton Curry", "Eggs Curry", "Curd Rice", "Jira Rice", "Go for Dine!")
        println("Today's breakfast is ${breakfast.random()} and lunch is ${lunch.random()}")
    }

    fun ironClothes(shirtColor: String, pantColor: String) {
        val shirtColors = mutableListOf("Red", "Yellow", "Black", "Blue", "Green", "Orange")
        val pantColors = mutableListOf("Blue", "Black", "Gray")

        if (shirtColors.contains(shirtColor)) {
            if (pantColors.contains(pantColor)) {
                println("Your Clothes are ready!!")
            } else {
                println("You do not have pant of this color. May be its time to go for a pant shopping.")
            }
        } else {
            println("You do not have shirt of this color. May be its time to go for a pant shopping.")
        }
    }

}