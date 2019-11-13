package co.riiid.uichallenges

import javax.inject.Inject

class Runner @Inject constructor() {
    fun calc(): Int {
        return (1..100).toList()
            .reduce { acc, num ->
                acc + num
            }
    }
}