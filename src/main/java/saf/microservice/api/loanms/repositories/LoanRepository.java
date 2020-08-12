package saf.microservice.api.loanms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import saf.microservice.api.loanms.entity.LoanEntity;

@Repository
public interface LoanRepository extends JpaRepository<LoanEntity, Long>{

}
