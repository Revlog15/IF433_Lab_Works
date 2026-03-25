package oop_126621_RevandAnrianPutra.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.SafeZone -> println("Kamu berada di zona aman. Tidak ada ancaman.")
        is BattleState.MonsterEncounter -> println("BAHAYA! Monster muncul: ${event.monsterName}. Bersiaplah bertarung!")
        is BattleState.LootDropped -> println("Item ditemukan: ${event.item.name} | Damage: ${event.item.damage} | Rarity: ${event.item.rarity}")
        is BattleState.GameOver -> println("GAME OVER! Alasan: ${event.reason}")
    }
}