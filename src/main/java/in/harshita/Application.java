package in.harshita;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.harshita.entity.Employee;
import in.harshita.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cctx =
				SpringApplication.run(Application.class, args);
		EmployeeRepository repo = cctx.getBean(EmployeeRepository.class);
		/*Employee e1 = new Employee(2,"A",5000.00,"FEMALE","SALES");
		Employee e2 = new Employee(3,"B",10000.00,"FEMALE","ADMIN");
		Employee e3 = new Employee(4,"C",15000.00,"MALE","HR");
		
		repo.saveAll(Arrays.asList(e1,e2,e3));
		*/
		/*  sorting JPA
		Sort descending = Sort.by("empName").descending();
		List<Employee> emp = repo.findAll(descending);
		emp.forEach(System.out::println);
		*/
		
		/* Pagination JPA
		  Sort descending = Sort.by("empName").descending();
		 
		int pageNo =1;
		PageRequest page = PageRequest.of(pageNo-1,3);
		
		Page<Employee> findAll = repo.findAll(page);
		List<Employee> emps = findAll.getContent();			
		
		
		emps.forEach(System.out::println);
		*/
		
		
	
	}

}
