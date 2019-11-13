repositories {
    google()
    jcenter()
    maven(url = "https://plugins.gradle.org/m2/")
}

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

object Version {
    const val studio = "3.6.0-beta03"
    const val kotlin = "1.3.50"
}

dependencies {
    implementation(gradleKotlinDsl())
    implementation(kotlin("gradle-plugin", Version.kotlin))
    implementation("org.jetbrains.kotlin:kotlin-test-junit:${Version.kotlin}")
    implementation("com.android.tools.build:gradle:${Version.studio}")
    testImplementation("junit:junit:4.12")
    testImplementation("org.amshove.kluent:kluent:1.54")
}
