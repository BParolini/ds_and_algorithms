plugins { java }

java { toolchain { languageVersion = JavaLanguageVersion.of(23) } }

repositories { mavenCentral() }

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.12.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.12.1")
}

tasks.compileJava { options.isFailOnError = false }
