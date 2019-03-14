object Plugins {
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    const val androidGralePlugin = "com.android.tools.build:gradle:${Versions.gradleVersion}"
}

object Libraries {
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.androidXVersion}"
    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"
    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val converterSimpleXml = "com.squareup.retrofit2:converter-simplexml:${Versions.retrofitVersion}"
    const val adapterRxjava2 = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofitVersion}"
}

object TestLibraries {
    const val junit = "junit:junit:${Versions.jUnitVersion}"
    const val assertJ = "org.assertj:assertj-core:${Versions.assertJVersion}"
    const val mockitoKotlin = "com.nhaarman:mockito-kotlin:${Versions.mockitoKotlinVersion}"
}
