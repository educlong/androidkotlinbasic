include(":ksoap2-android-assembly-2.6.0-jar-with-dependencies")
include(":ksoap2-android-assembly-3.6.4-jar-with-dependencies")
pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
    }
    
}
rootProject.name = "androidKotlin"


include(":androidApp")
include(":shared")

