import org.gradle.api.tasks.wrapper.Wrapper

plugins {
    id("java-library")
    id("application")
    id("idea")
    id("org.springframework.boot")
}

group = "au.com.rainmore"
version = "1.0.0"
description = "Reactjs TODO"

tasks.named<Wrapper>("wrapper").configure {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = project.properties["gradle.version"] as String
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
        vendor = JvmVendorSpec.ADOPTIUM
    }
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
