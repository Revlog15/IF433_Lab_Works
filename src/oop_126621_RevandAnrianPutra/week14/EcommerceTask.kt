package oop_126621_RevandAnrianPutra.week14

import java.io.File

data class Order(
    val itemName: String,
    val finalPrice: Double,
    val customerType: String
)

interface OrderRepository {
    fun saveOrder(order: Order)
}

class CsvOrderRepository(
    private val path: String = "orders.csv"
) : OrderRepository {
    override fun saveOrder(order: Order) {
        File(path).printWriter().use { writer ->
            writer.println("${order.itemName},${order.finalPrice},${order.customerType}")
        }
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price
    }
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(
        itemName: String,
        basePrice: Double,
        customerType: String,
        pricingStrategy: PricingStrategy
    ) {
        val finalPrice = pricingStrategy.calculate(basePrice)

        val order = Order(
            itemName = itemName,
            finalPrice = finalPrice,
            customerType = customerType
        )

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(order)
        notifier.sendNotification("Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

fun main() {
    val repository = CsvOrderRepository()
    val notifier = EmailNotifier()

    val processor = SafeOrderProcessor(
        repo = repository,
        notifier = notifier
    )

    processor.processOrder(
        itemName = "Keyboard Mechanical",
        basePrice = 500_000.0,
        customerType = "VIP",
        pricingStrategy = VipPricing()
    )

    processor.processOrder(
        itemName = "Mouse Wireless",
        basePrice = 250_000.0,
        customerType = "REGULAR",
        pricingStrategy = RegularPricing()
    )
}