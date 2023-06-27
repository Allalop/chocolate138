plugins {
    id("java")
}

group = "br.com.iterasys"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testImplementation("io.rest-assured:rest-assured:5.3.0")
    testImplementation("org.testng:testng:7.7.1")
    implementation("com.google.code.gson:gson:2.10.1")
    testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")
    testImplementation("org.slf4j:slf4j-api:1.7.33")




}

tasks.test {
    useJUnitPlatform()
}

