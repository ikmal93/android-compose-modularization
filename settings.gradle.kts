pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "android-compose-modularization"

include(":app")

include(":core:analytics")
include(":core:data")
include(":core:database")
include(":core:domain")
include(":core:network")
include(":core:notifications")

include(":feature:home")
include(":feature:login")
include(":feature:onboarding")
include(":feature:register")
