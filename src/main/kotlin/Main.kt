import flash.klibapng.APNG
import flash.klibapng.APNGSplitter
import java.nio.file.Files
import java.nio.file.StandardOpenOption
import kotlin.io.path.Path

fun main(args: Array<String>) {
    val file = "${System.getProperty("user.dir")}/firefox.png"
    val output = { i: Int -> "${System.getProperty("user.dir")}/firefox_$i.png"}
    val apng = APNG(file)

    val split = APNGSplitter.splitWithOpsAppliedAndDelaysInMs(apng)
    for (i in split.indices) {
        Files.write(Path(output(i)), split[i].first, StandardOpenOption.CREATE)
        println("$i delay: ${split[i].second}ms")
    }
}