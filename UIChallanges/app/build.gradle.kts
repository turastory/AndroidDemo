import com.android.build.gradle.AppExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

configure<AppExtension> {
    compileSdkVersion(29)
    buildToolsVersion("29.0.2")
    defaultConfig {
        applicationId = "co.riiid.vida.uichallanges"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    viewBinding.isEnabled = true
    dataBinding.isEnabled = true

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    tasks.withType<KotlinCompile>().configureEach {
        println("Configuring $name in project ${project.name}...")
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar", "*.aar"))))
    implementation(Dependencies.kotlinStdlibJdk)
    implementation(Dependencies.AndroidX.core)
    implementation(Dependencies.AndroidX.activity)
    implementation(Dependencies.AndroidX.fragment)
    implementation(Dependencies.AndroidX.lifecycleExtensions)
    implementation(Dependencies.AndroidX.lifecycleRuntime)
    implementation(Dependencies.AndroidX.lifecycleLiveData)
    implementation(Dependencies.AndroidX.lifecycleViewModel)
    implementation(Dependencies.AndroidX.constraintLayout)

    implementation(Dependencies.design)

    implementation(Dependencies.Rx.rxJava)
    implementation(Dependencies.Rx.rxAndroid)
    implementation(Dependencies.Rx.rxKotlin)
    implementation(Dependencies.Rx.rxBinding)

    testImplementation(Dependencies.junit)
    testImplementation(Dependencies.kotlinTest)
    testImplementation(Dependencies.kluentAndroid)
    testImplementation(Dependencies.mockitoKotlin)
    testImplementation(Dependencies.mockitoInline)
    testImplementation(Dependencies.liveDataTesting)
    testImplementation(Dependencies.AndroidX.coreTesting)
    androidTestImplementation(Dependencies.AndroidX.testJUnitExt)
    androidTestImplementation(Dependencies.AndroidX.testEspressoCore)
}
