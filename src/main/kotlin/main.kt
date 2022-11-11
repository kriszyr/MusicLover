fun main() {

    val album = true
    val previousOrders = 12_000
    val discount1 = 100
    val discount2 = 0.05
    val regularDiscount = 0.01
    val totalPrice = 10_000

    val finalPrice = if (album) {
        if (previousOrders in 101..10_000) {
            (totalPrice - discount1) * (1 - regularDiscount)
        } else if(previousOrders > 10_000) {
            totalPrice * (1 - discount2) * (1 - regularDiscount)
        } else {
            totalPrice
        }
    } else {
        if (previousOrders in 101..10_000) {
            totalPrice - discount1
        } else if (previousOrders > 10_000) {
            totalPrice * (1 - discount2)
        } else {
            totalPrice
        }
    }

    println("The price: $totalPrice, with discount: $finalPrice")
}