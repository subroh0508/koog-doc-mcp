plugins {
    kotlin("jvm") version "2.2.0"
}

group = "net.subroh0508"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
