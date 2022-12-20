package com.zy.plugin

import com.zy.utils.Logger;

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * @description:
 * @author: ajx
 * @date: 2022/12/20-11:51
 */
class MyTask extends DefaultTask {


    @TaskAction
    void action() {
        Logger.info("my task run")
    }

}
