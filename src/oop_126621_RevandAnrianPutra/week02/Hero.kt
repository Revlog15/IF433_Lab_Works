package oop_126621_RevandAnrianPutra.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {

    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {

    println("--- MINI RPG BATTLE ---")

    print("Nama Hero: ")
    val heroName = readLine()!!

    print("Base Damage: ")
    val damage = readLine()!!.toInt()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")
        val action = readLine()!!.toInt()

        if (action == 1) {

            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh menyerang balik!")
                hero.takeDamage(enemyDamage)
                println("HP Hero: ${hero.hp}")
            }

        } else {
            println("Kamu kabur!")
            break
        }
    }

    if (hero.hp > 0 && enemyHp == 0) {
        println("Hero menang!")
    } else if (hero.hp == 0) {
        println("Hero kalah!")
    }
}
