package com.github.rshalika.test1.services

import com.intellij.openapi.project.Project
import com.github.rshalika.test1.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
