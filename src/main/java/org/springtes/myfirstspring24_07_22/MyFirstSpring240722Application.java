package org.springtes.myfirstspring24_07_22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication//основная аннотация спринга содержит функционал
//конфигурирования,автокофигурирования, поиск бинов и конфигураций
//@Configuration
//@EnableAutoConfiguration  анотация для включения автоконфигураций
//3@ эквивалентны первой аннотации и делают однто и тоже
//@ComponentScan
public class MyFirstSpring240722Application {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpring240722Application.class, args);
	}
//@Conditional() это механизм, который используется для включения в контекст
// приложения те или иные бины в зависимости от выполнения заданных условий,
// заданных в классе, реализующем интерфейс Condition.
	/*Виды:
	@ConditionalOnBean
	@ConditionalOnClass
	@ConditionalOnMissingBean
	@ConditionalOnMissingClass
	@ConditionalOnProperty и другое*/
}
