import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.20"
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
    }

    group = "org.jire"
    version = "1.0-SNAPSHOT"

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            useK2 = true // change to false, and you'll see the classes generate fine
        }
    }
}