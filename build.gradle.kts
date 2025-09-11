plugins {
    alias(libs.plugins.kotlin.jvm)
}

group = "net.subroh0508"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(libs.kotlin.test)
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
