plugins {
    `java-library`
    id("com.cosminpolifronie.gradle.plantuml") version "1.6.0"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")
    testImplementation("org.junit.platform:junit-platform-testkit:1.5.2")
}

sourceSets {
    main {
        java.srcDir("src/main/java")
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

plantUml {
    render(mapOf(
            "input" to "src/main/diagrams/*",
            "output" to "build/diagrams",
            "format" to "png"))
}
