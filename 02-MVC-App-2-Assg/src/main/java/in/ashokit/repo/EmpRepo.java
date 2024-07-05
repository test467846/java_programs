package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entities.Employee;


@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
