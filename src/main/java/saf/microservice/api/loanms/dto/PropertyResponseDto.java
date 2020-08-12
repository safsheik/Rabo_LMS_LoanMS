package saf.microservice.api.loanms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class PropertyResponseDto {
	private long propertyId;
	private String city;
	private String address;

}
