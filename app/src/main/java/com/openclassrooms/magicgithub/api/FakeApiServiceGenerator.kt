package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User
import java.util.*

object FakeApiServiceGenerator {

    @JvmField
    var FAKE_USERS = mutableListOf(
        User("001", "Jake", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("002", "Paul", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("003", "Phil", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("004", "Guillaume", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("005", "Francis", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("006", "George", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("007", "Louis", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("008", "Mateo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("009", "April", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("010", "Louise", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("011", "Elodie", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("012", "Helene", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("013", "Fanny", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("014", "Laura", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("015", "Gertrude", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("016", "Chloé", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("017", "April", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("018", "Marie", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("019", "Henri", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("020", "Rémi", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s")
    )

    @JvmField
    var FAKE_USERS_RANDOM = Arrays.asList(
        User("021", "Lea", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("022", "Geoffrey", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("023", "Simon", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("024", "André", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s"),
        User("025", "Leopold", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQfStqeQXZg5snrAEY-OTfOSHt9AmDIzBxug&s")
    )
}