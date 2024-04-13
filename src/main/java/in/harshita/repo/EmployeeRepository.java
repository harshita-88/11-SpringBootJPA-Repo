package in.harshita.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.harshita.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
