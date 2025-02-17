plugins { java }

java { toolchain { languageVersion = JavaLanguageVersion.of(21) } }

repositories { mavenCentral() }

tasks.compileJava {
    options.isFailOnError = false
}
