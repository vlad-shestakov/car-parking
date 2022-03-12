package com.shestakov.carparking;

import com.shestakov.carparking.entity.ClientEntity;
import com.shestakov.carparking.mapper.BookingtimeRepository;
import com.shestakov.carparking.mapper.ClientRepository;
import com.shestakov.carparking.mapper.ParkspaceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class CarParkingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarParkingApplication.class, args);
    }

    @Bean
    public CommandLineRunner mappingDemo(
            ClientRepository clientRepository,
            ParkspaceRepository parkspaceRepository,
            BookingtimeRepository bookingtimeRepository

//                  AccountRepository accountRepository,
//                  EmployeeRepository employeeRepository
    ) {
        return args -> {

            // ======= `@IdClass` Annotation =======

            // create new accounts
//            clientRepository.save(new ClientEntity("123"));
//            accountRepository.save(new Account("458666", "Checking", 4588));
//            accountRepository.save(new Account("458689", "Checking", 2500));
//            accountRepository.save(new Account("424265", "Saving", 100000));

            // fetch accounts by a given type
//            List<Account> accounts = accountRepository.findByAccountType("Checking");
//            accounts.forEach(System.out::println);

            // fetch account by composite key
//            Optional<Account> account = accountRepository.findById(new AccountId("424265", "Saving"));
//            account.ifPresent(System.out::println);

            // ======= `@EmbeddedId` Annotation =======

            // create new employees
//            employeeRepository.save(new Employee(new EmployeeId(100L, 10L),
//                    "John Doe", "john@example.com", "123456"));
//            employeeRepository.save(new Employee(new EmployeeId(101L, 20L),
//                    "Emma Ali", "emma@example.com", "654321"));

            // fetch employees by a given department id
//            List<Employee> employees = employeeRepository.findByEmployeeIdDepartmentId(20L);
//            employees.forEach(System.out::println);

            // fetch employee by composite key
//            Optional<Employee> employee = employeeRepository.findById(new EmployeeId(100L, 10L));
//            employee.ifPresent(System.out::println);
        };
    }
}
