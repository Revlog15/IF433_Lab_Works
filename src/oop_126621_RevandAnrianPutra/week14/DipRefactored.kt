package oop_126621_RevandAnrianPutra.week14

interface Database {
    fun query(sql: String): List<String>
}

class PostgreDatabase : Database {
    override fun query(sql: String): List<String> {
        return listOf("pg_data1", "pg_data2")
    }
}

class MongoDatabase : Database {
    override fun query(sql: String): List<String> {
        return listOf("mongo_data1", "mongo_data2")
    }
}

class SafeUserService(
    private val db: Database
) {
    fun getUser(id: Int): List<String> {
        return db.query("SELECT * FROM users WHERE id=$id")
    }
}

fun main() {
    val postgreService = SafeUserService(PostgreDatabase())
    val mongoService = SafeUserService(MongoDatabase())

    println(postgreService.getUser(1))
    println(mongoService.getUser(2))
}