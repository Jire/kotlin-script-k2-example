plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":script-template"))
    kotlinScriptDef(project(":script-template"))
}