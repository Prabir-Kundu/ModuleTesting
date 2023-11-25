plugins {
    id("com.android.library")
    //TODO STEP 01
    id ("maven-publish")
}

group = "com.prabirkundu.toastymessages"
version = "1.0.6"

android {
    namespace = "com.prabirkundu.toastymessages"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")

        //TODO STEP 02
        aarMetadata {
            minCompileSdk = 29
        }
        testFixtures {
            enable = true
        }
        //TODO STEP 03
        publishing {
            singleVariant("release") {
                withSourcesJar()
            }
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["release"])
                groupId = "com.prabirkundu.toastymessages"
                artifactId = "ToastyMassages"
                version = "1.0.6"
            }
        }
        repositories {
            mavenLocal()
        }
    }
}