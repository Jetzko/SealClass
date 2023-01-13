sealed class User (open val ID : String, open val additionalEmail: String, open val userPassword : String){
    data class Email(
       override val ID: String, override val additionalEmail: String, override val userPassword: String)
        : User(ID, additionalEmail, userPassword)

    data class Facebook(override val ID: String, override val additionalEmail: String, override val userPassword: String)
        : User(ID, additionalEmail, userPassword)

    data class Google(override val ID: String, override val additionalEmail: String, override val userPassword: String)
        : User(ID, additionalEmail, userPassword)
}


fun userDetails(user: User) {
    when (user) {
        is User.Email -> println("Email user is : ${user.ID}  ${user.additionalEmail}  ${user.userPassword}")
        is User.Facebook -> println("Facebook user is : ${user.ID}  ${user.additionalEmail}  ${user.userPassword}")
        is User.Google -> println("Google user is : ${user.ID}  ${user.additionalEmail}  ${user.userPassword}")
    }
}

    fun main() {
        userDetails(User.Email("A39", "andreadefilippi@live.it", "1234"))
        userDetails(User.Facebook("B29", "andreadefilippi@hotmail.it", "1248"))
        userDetails(User.Google("R22", "andreadefilippi@gmail.com", "3548"))
    }