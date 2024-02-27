rootProject.name = "reactjs"

include(
    "nextjs"
)

pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }

    plugins {
        id("org.springframework.boot")    version "3.2.3"
        id("com.github.node-gradle.node") version "7.0.2" apply false
    }
}
