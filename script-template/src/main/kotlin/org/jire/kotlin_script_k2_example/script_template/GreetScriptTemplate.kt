package org.jire.kotlin_script_k2_example.script_template

import kotlin.script.experimental.annotations.KotlinScript
import kotlin.script.experimental.api.ScriptCompilationConfiguration
import kotlin.script.experimental.api.isStandalone

@KotlinScript(fileExtension = "greet.kts", compilationConfiguration = GreetScriptDefinition::class)
abstract class GreetScriptTemplate {
    fun greet(subject: String) {
        println("Hello, $subject!")
    }
}

object GreetScriptDefinition : ScriptCompilationConfiguration({
    isStandalone(false)
})