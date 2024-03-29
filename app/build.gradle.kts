plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
}
android {
    namespace = "com.unsa.healthcare"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.unsa.healthcare"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}
dependencies {
    // Core Dependencies
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    // Lottie Dependency
    implementation("com.airbnb.android:lottie-compose:6.2.0")
    // Coil Dependency
    implementation("io.coil-kt:coil:2.5.0")
    // Fragment Dependency
    implementation("androidx.fragment:fragment-ktx:1.6.2")
    // Navigation Dependencies
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.6")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.6")
    // View Model Dependency
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    // Data Store Dependency
    implementation("androidx.datastore:datastore-preferences:1.0.0")
    // Retrofit Dependency
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    // Room Dependencies
    implementation("androidx.room:room-ktx:2.5.0")
    kapt("androidx.room:room-compiler:2.5.0")
    // Work Manager Dependency
    implementation("androidx.work:work-runtime-ktx:2.9.0")
    // Dagger Hilt Dependencies
    implementation("com.google.dagger:hilt-android:2.48")
    implementation("androidx.hilt:hilt-work:1.1.0")
    kapt("com.google.dagger:hilt-android-compiler:2.48")
    // Testing Dependencies
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}