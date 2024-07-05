package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entities.Employee;
import in.ashokit.repo.EmpRepo;


@Service
public class EmpServiceImpl implements EmpService {

	
	@Autowired
	private EmpRepo empRepo;

	public EmpServiceImpl(EmpRepo empRepo) {
		super();
		this.empRepo = empRepo;
	}
	

	
	public List<Employee> getEmployeeDetails() {
		return empRepo.findAll();
		
	}
	
	public void addEmp() {
		Employee e=new Employee();
		e.setName("Kaifi");
		e.setEmail("kaifi@gmail.com");
		e.setMob("9006847338");
		Employee save = empRepo.save(e);
		
	}
	

}
