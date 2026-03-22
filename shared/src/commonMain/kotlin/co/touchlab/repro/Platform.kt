package co.touchlab.repro

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform