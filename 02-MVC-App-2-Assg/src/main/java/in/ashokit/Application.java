package in.ashokit;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entities.Employee;
import in.ashokit.repo.EmpRepo;
import in.ashokit.service.EmpServiceImpl;

@SpringBootApplication
public class Application  {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(Application.class, args);
		EmpServiceImpl serviceImpl = context.getBean(EmpServiceImpl.class);
		serviceImpl.addEmp();

	}

	

}
