fun includeProject(name: String, projectPath: String? = null) {
    include(name)
    projectPath?.run { project(name).projectDir = File(this) }
}

rootProject.name = "UIChallanges"

includeProject(":app")
