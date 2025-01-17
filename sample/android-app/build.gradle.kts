plugins {
    id("android-app-convention")
    id("detekt-convention")
}

android {
    buildFeatures.dataBinding = true

    defaultConfig {
        applicationId = "dev.icerock.moko.samples.permissions"

        versionCode = 1
        versionName = "0.1.0"
    }
}

dependencies {
    implementation(libs.appCompat)
    implementation(libs.material)

    implementation(projects.sample.mppLibrary)
}
