package task3

interface Character {
    val name : String
    var action : Action
    var location: Location

    fun doAction(actionName: String) {
        action = Action(actionName)
    }

    fun stopDoingAction() {
        action.zachillsia()
    }

    fun whatAreYouDoing() : String {
        return action.actionName
    }

    fun whatIsYourName() : String {
        return name
    }

    fun whereAreYou() : String {
        return "I'm in ${location.name}"
    }

    fun relocate(newLocation: String) {
        location = Location(newLocation)
    }

    fun areYouInTheSamePlace(character: Character) : Boolean {
        return location.name == character.location.name
    }

    fun whatIsYourSpecies() : String
}

//class Character(private var name : String, private var species : String = "Person") {
//    private var action: Action = Action()
//    private
//
//    fun doAction(actionName: String) {
//        action = Action(actionName)
//    }
//
//    fun whatAreYouDoing() : String {
//        return action.actionName
//    }
//
//    fun changeSpecies(newSpecies: String) {
//        species = newSpecies
//    }
//
//    fun whatIsYourName() : String {
//        return name
//    }
//
//}