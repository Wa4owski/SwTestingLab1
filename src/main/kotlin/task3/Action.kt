package task3

class Action(_actionName: String = "chilling", private var doAction: Boolean = false) {
    var actionName : String = ""
        set(value) {
            field = value
            doAction = true
        }
        get() {
            return if (doAction) {
                "Doing $field"
            } else {
                "Do nothing"
            }
        }

    init {
        if (_actionName != "chilling")
            doAction = true
        actionName = _actionName
    }

    fun zachillsia() {
        doAction = false
    }
}