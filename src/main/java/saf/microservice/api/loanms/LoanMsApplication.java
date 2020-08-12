package saf.microservice.api.loanms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class LoanMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanMsApplication.class, args);
	}
	
//	@Bean
//   public ModelMapper modelMapper() {
//      ModelMapper modelMapper = new ModelMapper();
//      return modelMapper;
//   }

}
