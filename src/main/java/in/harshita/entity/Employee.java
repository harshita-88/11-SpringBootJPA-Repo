package in.harshita.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "emp_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@jakarta.persistence.Id
	private Integer empId;
	private String empName;
	private Double salary;
	private String empGender;
	private String dept;

}
