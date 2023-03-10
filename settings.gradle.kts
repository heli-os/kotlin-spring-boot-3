pluginManagement {
    plugins {
        val springBootVersion:String by settings
        val springDependencyManagementVersion:String by settings
        val kotlinVersion:String by settings
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version springDependencyManagementVersion
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion
        kotlin("plugin.jpa")  version kotlinVersion
    }

}

rootProject.name = "springboot"
