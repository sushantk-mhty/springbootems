package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;


	@Override
	public void run(String... args) throws Exception {
		Employee emp1=new Employee();
		emp1.setFirstName("Sruti");
		emp1.setLastName("Das");
		emp1.setEmailId("sruti.das@gmail.com");
		employeeRepository.save(emp1);

		Employee emp2=new Employee();
		emp2.setFirstName("Pritam");
		emp2.setLastName("Khan");
		emp2.setEmailId("pritam.khan@gmail.com");
		employeeRepository.save(emp2);
	}
}
