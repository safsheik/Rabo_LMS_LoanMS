package saf.microservice.api.loanms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class LoanRequestModel {
	private String loanUser;
	private String amount;
	private PropertyRequestDto propertyAddress;

}
