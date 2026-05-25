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

fun main() {
    val user = SafeUser("Alice", "alice@mail.com", 20)

    val validator = UserValidator()
    val repository = UserRepository()

    if (validator.validate(user)) {
        repository.save(user)
    }
}