enum class SuitCard(val priority: Int, color: String) {
    SPADE(priority = 0, color = "black"),
    CLUB(priority = 1, color = "black"),
    DIAMOND(priority = 2, color = "red"),
    HEART(priority = 3, color = "red"),
}

sealed class Card(val priority: Int, val suitCard: SuitCard) {
    class Three(suitCard: SuitCard) : Card(0, suitCard)
    class Four(suitCard: SuitCard) : Card(1, suitCard)
    class Five(suitCard: SuitCard) : Card(2, suitCard)
    class Six(suitCard: SuitCard) : Card(3, suitCard)
    class Seven(suitCard: SuitCard) : Card(4, suitCard)
    class Eight(suitCard: SuitCard) : Card(5, suitCard)
    class Nine(suitCard: SuitCard) : Card(6, suitCard)
    class Ten(suitCard: SuitCard) : Card(7, suitCard)
    class Jack(suitCard: SuitCard) : Card(8, suitCard)
    class Queen(suitCard: SuitCard) : Card(9, suitCard)
    class King(suitCard: SuitCard) : Card(10, suitCard)
    class Ace(suitCard: SuitCard) : Card(11, suitCard)
    class Two(suitCard: SuitCard) : Card(12, suitCard)
    class Joker(suitCard: SuitCard) : Card(13, suitCard)
}

fun main() {
    val nineHeart = Card.Nine(suitCard = SuitCard.HEART)
    val nineDiamond = Card.Nine(suitCard = SuitCard.DIAMOND)

    val result = "nineHeart ${compareCard(nineHeart, nineDiamond)} nineDiamond"
    println(result)

}

fun compareCard(firstCard: Card, secondCard: Card): String {
    val priorityOfFirstCard = firstCard.priority + firstCard.suitCard.priority;
    val priorityOfSecondCard = secondCard.priority + secondCard.suitCard.priority;
    return if (priorityOfFirstCard > priorityOfSecondCard) ">" else "<"
}