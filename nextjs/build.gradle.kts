import com.github.gradle.node.yarn.task.YarnTask

plugins {
    id("com.github.node-gradle.node")
}

group = rootProject.group
version = rootProject.version
description = "Reactjs UI"

node {
    download = true
    version = "20.11.1"
    npmVersion = "10.4.0"
    yarnVersion = "1.22.21"
}

val yarn = tasks.named<YarnTask>("yarn")
