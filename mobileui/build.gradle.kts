plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdkVersion(Versions.compileSdkVersion)

    defaultConfig {
        applicationId = "nz.org.westforce.mobileui"
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
    implementation(Libraries.appCompat)
    implementation(Libraries.kotlinStdlib)
    implementation(Libraries.daggerAndroid)
    implementation(Libraries.daggerSupport)
    kapt(Libraries.daggerCompiler)
    kapt(Libraries.daggerProcessor)
    implementation(Libraries.retrofit2)
    implementation(Libraries.converterSimpleXml)
    implementation(Libraries.loggingInterceptor)
    implementation(Libraries.okhttp)
    
    testImplementation(TestLibraries.junit)

    androidTestImplementation(TestLibraries.runner)
    androidTestImplementation(TestLibraries.espressoCore)

    implementation(project(":data"))
}

