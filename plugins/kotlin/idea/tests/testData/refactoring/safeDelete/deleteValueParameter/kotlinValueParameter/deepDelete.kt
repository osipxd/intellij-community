fun consumer2(i: Int) {
    targetFunction(i)
    consumer1(i)
}

fun consumer1(i: Int) {
    targetFunction(i)
}

fun targetFunction(<caret>i: Int) {}