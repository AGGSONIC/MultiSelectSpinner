plugins {
    alias(libs.plugins.androidLibrary) apply false
}

dependencies {
    (files(libs.plugins.androidLibrary))
}