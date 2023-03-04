package task3

class Person(override var name : String) : Character {
    override var action: Action = Action()
    override var location: Location = Location()

    override fun whatIsYourSpecies() : String {
        return "I'm person"
    }
}