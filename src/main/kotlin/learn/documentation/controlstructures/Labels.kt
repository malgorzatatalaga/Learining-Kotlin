package learn.documentation.controlstructures

fun main() {
    breakOuterLoop()

    continueOuterLoop()
}

fun breakOuterLoop() {
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i, j = $j")
            if (j == 3) break@loop
        }
    }
}

fun continueOuterLoop() {
    /*
    With the label, we changed the default behavior of the continue keyword.
    Instead of skipping the execution of the inner loop at the second iteration
    and continuing with the next iteration, we returned to the outer loop and continued its execution.
    Without labels, such a trick wouldn't be possible.
     */
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            for (k in 1..3) {
                if (k == 2) continue@loop
                println("i = $i, j = $j, k = $k")
            }
        }
    }
}