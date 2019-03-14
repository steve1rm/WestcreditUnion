import org.gradle.kotlin.dsl.implementation

plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdkVersion(Versions.compileSdkVersion)

    defaultConfig {
        minSdkVersion(Versions.minSdkVersion)
        targetSdkVersion(Versions.targetSdkVersion)
        versionCode = Versions.versionCode
        versionName = Versions.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(Libraries.kotlinStdlib)
    implementation(Libraries.appCompat)
    implementation(Libraries.gson)
    implementation(Libraries.retrofit2)
    implementation(Libraries.adapterRxjava2)
    implementation(Libraries.converterSimpleXml)
    implementation(Libraries.daggerAndroid)

    testImplementation(TestLibraries.junit)
    testImplementation(TestLibraries.assertJ)
    testImplementation(TestLibraries.mockitoKotlin)
}

