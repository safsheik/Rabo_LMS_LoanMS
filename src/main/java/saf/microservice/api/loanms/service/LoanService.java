package saf.microservice.api.loanms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import saf.microservice.api.loanms.entity.LoanEntity;
import saf.microservice.api.loanms.repositories.LoanRepository;

@Service
public class LoanService {
	
	@Autowired
	private LoanRepository loanRepository;
	
//	@Autowired
//	private ModelMapper modelMapper;
	
//	public LoansResponseDto findAll() {
//		List<LoanEntity> loanEntities = loanRepository.findAll();
////		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//		
//		return modelMapper.map(loanEntities, LoansResponseDto.class);
//	}
//	
//	public LoanResponseModel addLoan(LoanRequestModel reqModel) {
////		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//		
//		LoanEntity loanEntity = modelMapper.map(reqModel, LoanEntity.class);
//		loanEntity = loanRepository.save(loanEntity);
//		return modelMapper.map(loanEntity, LoanResponseModel.class);
//		
//	}
	
	public LoanEntity addLoanEntity(LoanEntity reqModel) {
//		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		return loanRepository.save(reqModel);
		
	}

}
