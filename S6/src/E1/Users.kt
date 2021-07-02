package E1

class User(var name: String, val lastName: String, var age: Int, private var status: String, var isMale: Boolean) {

    fun setStatus(status: String) {
        this.status = status
    }
}