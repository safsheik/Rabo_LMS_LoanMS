package saf.microservice.api.loanms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import saf.microservice.api.loanms.entity.LoanEntity;
import saf.microservice.api.loanms.service.LoanService;

@RestController
@Slf4j
@RequestMapping ("/loans")
public class LoanController {
	@Autowired
	LoanService loanService;
	
//	@GetMapping() 
//	public ResponseEntity<LoansResponseDto> getAllLoans() {
////		Logger.debug("Insdie LoanController - getAllLoans()");
//		return ResponseEntity.status(HttpStatus.OK).body(loanService.findAll());
//	}
	
//	@PostMapping()
//	public ResponseEntity<LoanResponseModel> addLoan(@RequestBody @NotNull LoanRequestModel req) {
//		System.out.println("Request is: "+req.toString());
//		return ResponseEntity.status(HttpStatus.CREATED).body(loanService.addLoan(req));
//	}
	
	@GetMapping("/status")
	public String greetings() {
		return "SyedAli Fathima, Assalamualaikum....";
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping() 
	public List<LoanEntity> getAllLoans() {
		return loanService.findAllLoanEnity();
	}
	
	@PostMapping()
	public LoanEntity addLoan(@RequestBody LoanEntity loanEntity) {
		System.out.println("Request is: "+loanEntity.getLoanUser());
		
		return loanService.addLoanEntity(loanEntity);
	}

}
