package ru.itsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.itsjava.service.MyService;
import ru.itsjava.service.UserService;

//@EnableAutoConfiguration
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(Application.class, args);

//		System.out.println("context.getBean(MyService.class) = " + context.getBean(MyService.class));

		System.out.println(context.getBean(UserService.class).sayHey("Vitalik"));
	}

}