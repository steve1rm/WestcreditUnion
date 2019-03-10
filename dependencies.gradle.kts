ext {
    /** Android */
    androidBuildToolsVersion = "28.0.3"
    androidMinSdkVersion = 15
    androidTargetSdkVersion = 27
    androidCompileSdkVersion = 28
    versionCode = 1
    versionName = "1.0"
    kotlinVersion = '1.2.51'
    gradleVersion = '3.2.0'

    /*** Libraries */
    supportLibraryVersion = '28.0.1'
    rxJavaVersion = '2.0.2'
    javaxAnnotationVersion = '1.0'
    javaxInjectVersion = '1'
    parcelerVersion = '1.1.9'
    parcelerApiVersion = '1.1.9'
    kotlinReflectVersion = '2.1.0'
    androidAnnotationVersion = '21.0.3'
    daggerVersion = '2.16'
    rxKotlinVersion = '2.2.0'
    okhttpVersion = '3.13.1'
    retrofitVersion = '2.5.0'
    gsonVersion = '2.8.5'
    loggingInterceptorVersion = '3.4.1'
    okhttpVersion = '3.9.0'
    jaxbVersion = '1.0.0'

    /** Testing */
    jUnitVersion = '4.12'
    assertJVersion = '3.11.1'
    mockitoKotlinVersion = '1.6.0'
    robolectricVersion = '3.4.2'
    mockitoVersion = '1.9.5'

    dataDependencies = [
        rxKotlin:        "io.reactivex.rxjava2:rxkotlin:$rxJavaVersion",
    kotlin:          "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion",
    javaxAnnotation: "javax.annotation:jsr250-api:$javaxAnnotationVersion",
    javaxInject:     "javax.inject:javax.inject:$javaxInjectVersion",
    retrofit:        "com.squareup.retrofit2:retrofit:$retrofitVersion",
    okhttp:          "com.squareup.okhttp3:okhttp:$okhttpVersion",
    gson:            "com.google.code.gson:gson:$gsonVersion",
    ]

    dataTestDependencies = [
        junit:         "junit:junit:$jUnitVersion",
    kotlinJUnit:   "junit:junit:$jUnitVersion",
    assertJ:       "org.assertj:assertj-core:$assertJVersion",
    mockitoKotlin: "com.nhaarman:mockito-kotlin:$mockitoKotlinVersion",
    robolectric:   "org.robolectric:robolectric:$robolectricVersion"
    ]
}