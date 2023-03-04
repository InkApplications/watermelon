enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "watermelon"

dependencyResolutionManagement {
    versionCatalogs {
        create("androidLibraries") {
            from(files("gradle/versions/android.toml"))
        }
        create("inkLibraries") {
            from(files("gradle/versions/ink.toml"))
        }
        create("kotlinLibraries") {
            from(files("gradle/versions/kotlin.toml"))
        }
    }
}

include("android")
include("coroutines")
include("standard")
