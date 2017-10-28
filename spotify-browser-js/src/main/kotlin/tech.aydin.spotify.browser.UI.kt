import tech.aydin.spotify.browser.model.Track
import kotlin.browser.document

fun main(args: Array<String>) {
    val track2 = Track("Black Earth", "Fazil Say", 640)

    document.getElementById("placeholder")?.textContent = track2.toString()
}