package com.company;

import com.company.entity.Employees;
import com.company.service.inter.EmployeesServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HrmDbAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmDbAppApplication.class, args);
	}
	@Autowired
	@Qualifier("employeeService")

	private EmployeesServiceInter userService;

	@Bean
	public CommandLineRunner run() {
		CommandLineRunner clr = new CommandLineRunner(){

			@Override
			public void run(String... args) throws Exception {

				List<Employees> users = userService.getAll();
				for(int i=0;i<users.size();i++){
					Employees u = users.get(i);
					System.out.println(u);
				}

//				for(int i=0;i<10;i++){
//					userService.getAll();
//					Employees u = userService.getById(i);
//					System.out.println(u);
//					if(u!=null){
//						u.setFirstname("Pala");
//					}
//				}
//
//				userService.getById(6);//
			}
		};

		return clr;
	}
}
