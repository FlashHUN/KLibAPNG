import flash.klibapng.APNG
import flash.klibapng.APNGSplitter
import java.nio.file.Files
import java.nio.file.StandardOpenOption
import kotlin.io.path.Path

fun main(args: Array<String>) {
    read("firefox")
}

private fun read(filename: String) {
    val file = "${System.getProperty("user.dir")}/${filename}.png"
    val output = { i: Int -> "${System.getProperty("user.dir")}/${filename}_$i.png"}
    val apng = APNG(file)

    val split = APNGSplitter.splitWithOpsAppliedAndDelaysInMs(apng)
    for (i in split.indices) {
        Files.write(Path(output(i)), split[i].first, StandardOpenOption.CREATE)
        println("$i delay: ${split[i].second}ms")
    }
}