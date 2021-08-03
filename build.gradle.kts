buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
        classpath("com.android.tools.build:gradle:4.0.2")
// Add this line
        classpath("com.google.gms:google-services:4.3.5")
    }
}

group = "elong"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
    repositories {
        google()
        jcenter()
        maven { url = uri("https://oss.sonatype.org/content/repositories/ksoap2-android-releases/") }
        /*xem link tại: https://medium.com/@arturogdg/using-gradle-script-kotlin-for-android-d6cd58c80d60*/
    }
}