plugins {
    alias(libs.plugins.kotlin.jvm)
}

group = "net.subroh0508.mcp"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(libs.mcp.sdk)
    implementation(libs.ktor.client.cio)
    implementation(libs.ktor.server.netty)
    testImplementation(libs.kotlin.test)
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
