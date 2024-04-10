package com.example.demo

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

interface Printer {
    fun print(text: String)
}

class RuPrinter: Printer{
    override fun print(text: String) {
        println("Текст: $text")
    }
}

class EnPrinter: Printer{
    override fun print(text: String) {
        println("Text: $text")
    }
}

interface MegaPrinter{
    fun print(text: String)
}

@Component
@Scope("prototype")
class CustomPrinter: MegaPrinter{
    override fun print(text: String) {
        println(text)
    }
}