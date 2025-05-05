package spring.boot.desafio.emprestimo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//Solution 3: Disable Spring Boot's DataSource Auto-Configuration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EmprestimoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmprestimoApplication.class, args);
	}

}
