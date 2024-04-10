package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)


	var context = AnnotationConfigApplicationContext("com.example.demo")

	var customBean = context.getBean(MegaPrinter::class.java)
	var customBean1 = context.getBean(MegaPrinter::class.java)

	var printersBean = context.getBeansOfType(Printer::class.java)

	customBean.print("Ni Hao!")//Component

	//Configuration+Beans
	printersBean["enPrinter"]?.print("Hello!")
	printersBean["ruPrinter"]?.print("Привет!")

	print(customBean==customBean1)//Проверка на non-singleton

	println()
}
