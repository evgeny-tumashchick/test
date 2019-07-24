import org.gradle.plugins.ide.idea.model.IdeaLanguageLevel
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.3.41"
  java
  idea
}

idea {
  project {
    jdkName = "1.8"
    languageLevel = IdeaLanguageLevel("1.8")
  }
}

allprojects {
  group = "test"
  version = "1.0-SNAPSHOT"

  val compileKotlin: KotlinCompile by tasks
  compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
  }
  val compileTestKotlin: KotlinCompile by tasks
  compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
  }
}

repositories {
  mavenLocal()
  mavenCentral()
}

dependencies {
  compile(kotlin("stdlib-jdk8", "1.3.41"))
  testCompile("org.junit.jupiter:junit-jupiter-engine:5.5.0-M1")
  testCompile("org.junit.jupiter:junit-jupiter-api:5.5.0-M1")
  testCompile("org.junit.jupiter:junit-jupiter-params:5.5.0-M1")
}

tasks.withType<Test> {
  useJUnitPlatform()
  systemProperties.putAll(project.gradle.startParameter.systemPropertiesArgs)
}