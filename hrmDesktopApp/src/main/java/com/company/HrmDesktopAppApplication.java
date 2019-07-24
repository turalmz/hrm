package com.company;


import com.company.entity.Countries;
import com.company.panel.EmployeesForm;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.company.service.inter.DepartmentServiceInter;
import com.company.service.inter.JobServiceInter;
import com.company.service.inter.EmployeesServiceInter;
import com.company.service.inter.CountryServiceInter;
import com.company.service.inter.EmployeeMonthHoursServiceInter;
import com.company.service.inter.EmployeeMonthServiceInter;
import com.company.service.inter.MonthServiceInter;

//@SpringBootApplication
//public class HrmDesktopAppApplication {
//
//        @Autowired
//        public static EmployeesServiceInter userService;
//        
////	public static void main(String[] args) {
////		SpringApplication.run(HrmDesktopAppApplication.class, args);
////	}
////	@Bean
////	public CommandLineRunner run1() {
////		CommandLineRunner clr = new CommandLineRunner(){
////
////			@Override
////			public void run(String... args) throws Exception {
////
//////			Users us = new Users();
//////                        us.setVisible(true);
////                        alma.run();
////
////			}
////		};
////
////		return clr;
////	}
//}


//@Configuration
//@ComponentScan
//@EnableAutoConfiguration


@SpringBootApplication
public class HrmDesktopAppApplication {  
    
    @Autowired
    public static EmployeesServiceInter employeeService;
    
    @Autowired
    public static DepartmentServiceInter departmentService;
    
    @Autowired
    public static JobServiceInter jobService;    
    
    @Autowired
    public static CountryServiceInter countryService;
    
    @Autowired
    public static MonthServiceInter monthService;

    @Autowired
    public static EmployeeMonthServiceInter employeeMonthService;    

    @Autowired
    public static EmployeeMonthHoursServiceInter employeeMonthHoursService;    
    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(HrmDesktopAppApplication.class).headless(false).run(args);
        //Users appFrame = context.getBean(Users.class);
        MenuForm appFrame = context.getBean(MenuForm.class);

        //EmployeesForm appFrame = context.getBean(EmployeesForm.class);
        employeeService = context.getBean(EmployeesServiceInter.class);
        jobService = context.getBean(JobServiceInter.class);
        departmentService = context.getBean(DepartmentServiceInter.class);
        countryService = context.getBean(CountryServiceInter.class);
        monthService = context.getBean(MonthServiceInter.class);
        employeeMonthService = context.getBean(EmployeeMonthServiceInter.class);
        employeeMonthHoursService = context.getBean(EmployeeMonthHoursServiceInter.class);

        //Countries c = context.getBean(Countries.class);

        appFrame.alma();
        appFrame.setVisible(true);
    }
}
