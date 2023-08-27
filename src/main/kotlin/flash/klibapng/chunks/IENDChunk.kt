package flash.klibapng.chunks

import java.io.ByteArrayInputStream

class IENDChunk : Chunk {
    internal constructor() : super()
    internal constructor(bytes: ByteArray) : super(bytes)
    internal constructor(stream: ByteArrayInputStream) : super(stream)
    internal constructor(chunk: Chunk) : super(chunk)
}