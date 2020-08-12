package saf.microservice.api.loanms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import saf.microservice.api.loanms.entity.PropertyAddress;

@Data
@NoArgsConstructor
@ToString
public class LoanResponseModel {
	private long loanId;
	private String loanUser;
	private String amount;
	private PropertyResponseDto propertyAddress;

}
