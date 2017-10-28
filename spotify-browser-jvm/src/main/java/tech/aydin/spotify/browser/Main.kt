package tech.aydin.spotify.browser

import tech.aydin.spotify.browser.model.Track

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val track1 = Track("Kumru", "Fazil Say", 342)

        println(track1)
    }
}