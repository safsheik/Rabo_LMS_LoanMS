package saf.microservice.api.loanms.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name = "loans")
@Data
@NoArgsConstructor
public class LoanEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loan_id")
	private long loanId;
	
	@Column(name = "loan_user_email")
	private String loanUser;
	
	@Column(name = "loan_amount")
	private String amount;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyAddress propertyAddress;

}
