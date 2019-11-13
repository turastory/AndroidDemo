object Versions {
    const val kotlin = "1.3.50"
    const val studio = "3.6.0-beta03"
}

object Dependencies {
    const val kotlinStdlibJdk = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    object AndroidX {
        const val core = "androidx.core:core-ktx:1.2.0-beta02"
        const val activity = "androidx.activity:activity-ktx:1.1.0-rc02"
        const val fragment = "androidx.fragment:fragment-ktx:1.2.0-rc02"
        const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:2.2.0-rc02"
        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.2.0-rc02"
        const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0-rc02"
        const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0-rc02"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.0-beta3"
        const val coreTesting = "androidx.arch.core:core-testing:2.1.0"
        const val testJUnitExt = "androidx.test.ext:junit:1.1.1"
        const val testEspressoCore = "androidx.test.espresso:espresso-core:3.2.0"
    }

    const val design = "com.google.android.material:material:1.0.0"

    object Rx {
        const val rxJava = "io.reactivex.rxjava2:rxjava:2.2.13"
        const val rxAndroid = "io.reactivex.rxjava2:rxandroid:2.1.1"
        const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:2.4.0"
        const val rxBinding = "com.jakewharton.rxbinding3:rxbinding:3.0.0"
    }

    const val junit = "junit:junit:4.12"
    const val kotlinTest = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    const val kluentAndroid = "org.amshove.kluent:kluent-android:1.56"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0"
    const val mockitoInline = "org.mockito:mockito-inline:3.0.0"
    const val liveDataTesting = "com.jraska.livedata:testing-ktx:1.1.0"
}