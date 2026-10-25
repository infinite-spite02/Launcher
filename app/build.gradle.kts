plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.iglass.launcher"
    compileSdk = 35

    defaultConfig {
        minSdk = 29
        targetSdk = 35
    }
}
