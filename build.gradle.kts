plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    namespace = "com.example.smallnumber" // Ensure this matches your package name
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.smallnumber" // Ensure this matches your package name
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding { enable = true } // Enable view binding
        dataBinding { enable = true } // Enable data binding
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    dependencies {
        implementation("androidx.core:core-ktx:1.12.0")
        implementation("androidx.appcompat:appcompat:1.6.1") // Ensure AppCompat is included
        implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
        implementation("androidx.activity:activity-compose:1.7.2") // Use activity-compose for Compose support
        implementation("androidx.compose.ui:ui:1.5.0") // Core Compose UI
        implementation("androidx.compose.material3:material3:1.1.0") // Material3 for Jetpack Compose
        implementation("androidx.compose.foundation:foundation:1.5.0") // Foundation for Compose
        implementation("androidx.compose.ui:ui-tooling-preview:1.5.0") // Preview support
        implementation("androidx.compose.material3:material3-window-size-class:1.1.0") // Optional for handling window sizes
        implementation("androidx.compose.ui:ui-graphics:1.5.0") // Graphics support
        implementation("androidx.compose.ui:ui-test-junit4:1.5.0") // UI testing support

        // Other dependencies...
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    }

}
