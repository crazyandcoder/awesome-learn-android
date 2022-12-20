package com.zy.plugin;

import com.zy.utils.Logger;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * @description:
 * @author: ajx
 * @date: 2022/12/20-11:44
 */
class MyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        Logger.info("apply my plugin")

        project.tasks.create("mytask", MyTask.class)

    }
}
