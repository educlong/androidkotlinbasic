plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
    id("kotlin-android")
    id("com.google.gms.google-services")
    id("kotlin-kapt")
}

group = "elong"
version = "1.0-SNAPSHOT"

dependencies {
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("com.google.code.ksoap2-android:ksoap2-android:3.6.4")
    implementation("com.google.code.gson:gson:2.8.6")
    implementation("com.google.android.gms:play-services-maps:17.0.0")
//    implementation("com.google.android.gms:play-services-location:18.0.0")
    implementation(platform("com.google.firebase:firebase-bom:26.7.0"))
    implementation("com.google.firebase:firebase-analytics-ktx")
    implementation("com.google.firebase:firebase-messaging:21.0.1")
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "elong.androidApp"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    /*đưa thư viện databinding vào để thực hiện binding trong android*/
    /*  trong build gradle của android
    dataBinding {
        enabled=true
    }
    * */
    /*trong build gradle của kotlin*/
    buildFeatures {
        dataBinding = true
    }
}