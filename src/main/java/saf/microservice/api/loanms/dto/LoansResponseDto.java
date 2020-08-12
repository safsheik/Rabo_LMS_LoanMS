package saf.microservice.api.loanms.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class LoansResponseDto {
	private List<LoanResponseModel> loans;

}
