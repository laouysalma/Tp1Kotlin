fun main() {
    // Task 1: operations on numbers
    println(157 + 482 * 963)
    println(5 + 7 * 3 + 6 * 4 + 8 * 2 + 9 * 1)
    println((4 + 6) * 5 + 3 * 9 + 2 * (7 + 1) * 4)
    println(9876.0 / 3.4)

    // Task 2: operations on variables
    val scoreLevel1 = 65
    val scoreLevel2 = 89
    val scoreLevel3 = 72

    val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3

    // Simple (Int) average
    val averageScoreInt = totalScore / 3

    // Pro (Double) average
    val averageScoreDouble = totalScore / 3.0

    println("Total score = $totalScore")
    println("Average (Int) = $averageScoreInt")
    println("Average (Double) = %.2f".format(averageScoreDouble))

    // Task 3: bonus
    val boostMultiplier = 5
    val scoreBoost = totalScore * boostMultiplier
    val finalBoostedScore = totalScore + scoreBoost

    println("Score boost = $scoreBoost")
    println("Final boosted score = $finalBoostedScore")
}
