package oop_126621_RevandAnrianPutra.week10

data class ApiResponse<T>(val status: String, val data: T)

fun <T> search(items: List<T>, keyword: String, selector: (T) -> String): List<T> {
    return items.filter { selector(it).contains(keyword, ignoreCase = true) }
}