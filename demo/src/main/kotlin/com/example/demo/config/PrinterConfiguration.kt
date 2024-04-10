package com.example.demo.config

import com.example.demo.RuPrinter
import com.example.demo.EnPrinter
import com.example.demo.Printer
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PrinterConfiguration{

    @Bean
    @ConditionalOnProperty(name=["printer.language"], havingValue="russian")
    fun ruPrinter(): Printer {
        return RuPrinter()
    }

    @Bean
    @ConditionalOnProperty(name=["printer.language"], havingValue="english")
    fun enPrinter(): Printer {
        return EnPrinter()
    }
}