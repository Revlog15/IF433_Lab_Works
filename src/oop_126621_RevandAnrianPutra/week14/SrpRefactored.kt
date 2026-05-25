package oop_126621_RevandAnrianPutra.week14


data class SafeUser(
    val name: String,
    val email: String,
    val age: Int
)

class UserValidator {
    fun validate(user: SafeUser): Boolean {
        return user.email.contains("@") && user.age >= 18
    }
}

class UserRepository {
    fun save(user: SafeUser) {
        println("Saving user ${user.name} to database")
    }
}

class EmailService {
    fun sendWelcomeEmail(user: SafeUser) {
        println("Welcome email -> ${user.email}")
    }
}

fun main() {
    val user = SafeUser("Alice", "alice@mail.com", 20)

    val validator = UserValidator()
    val repository = UserRepository()
    val emailService = EmailService()

    if (validator.validate(user)) {
        repository.save(user)
        emailService.sendWelcomeEmail(user)
    }
}