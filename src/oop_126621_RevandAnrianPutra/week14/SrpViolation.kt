package oop_126621_RevandAnrianPutra.week14

data class User(
    val name: String,
    val email: String,
    val age: Int
)

class UserManager {

    // Business logic
    fun validateUser(user: User): Boolean {
        return user.email.contains("@") && user.age >= 18
    }

    // Database access
    fun saveToDatabase(user: User) {
        println("INSERT INTO users VALUES ('${user.name}', '${user.email}')")
    }

    // Email notification
    fun sendWelcomeEmail(user: User) {
        println("Sending email to ${user.email}")
    }
}

fun main() {
    val user = User("Alice", "alice@mail.com", 20)
    val manager = UserManager()

    if (manager.validateUser(user)) {
        manager.saveToDatabase(user)
        manager.sendWelcomeEmail(user)
    }
}