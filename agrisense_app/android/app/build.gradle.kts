plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.agrisense_app_new"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        // TODO: Specify your own unique Application ID (https://developer.android.com/studio/build/application-id.html).
        applicationId = "com.example.agrisense_app_new"
        // You can update the following values to match your application needs.
        // For more information, see: https://flutter.dev/to/review-gradle-config.
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        buildTypes {
            buildTypes {
                release {
                    // TODO: Add your own signing config for the release build.
                    minifyEnabled true
        RULE: kotlin:S7204
        ISSUE: Make sure that obfuscation is enabled in the release build configuration.
        - Fix the security vulnerability described in the issue
        - Preserve existing functionality
        - Follow language best practices
        - Add security comment if needed
        None available
        - Return ONLY the fixed code to replace the VULNERABLE CODE.
        - NO explanations, NO comments, NO markdown fences.
        - Preserve exact functionality of the surrounding context.
        - Fix ONLY the security issue.
        - Maintain the same variable names and logic flow where possible.
                    minifyEnabled true
                }
            }
        }
        buildTypes {
            buildTypes {
                release {
                    // TODO: Add your own signing config for the release build.
                    minifyEnabled false
        RULE: kotlin:S7204
        ISSUE: Make sure that obfuscation is enabled in the release build configuration.
            release {
                // TODO: Add your own signing config for the release build.
                // Signing with the debug keys for now, so `flutter run --release` works.
                isDebuggable = false
                // ADD THIS LINE TO ENABLE OBFUSCATION FOR RELEASE BUILD CONFIGURATION:
                minifyEnabled true
                proguardFiles getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            }
        }
        By adding this line of code, you ensure that any potential vulnerabilities related to debug symbols or unencrypted data in the release version of your application are mitigated. This helps protect against reverse engineering attempts by attackers who may be trying to exploit known weaknesses in your app's security posture.
            // TODO: Add your own signing config for the release build.
            // Signing with the debug keys for now, so `flutter run --release` works.
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}