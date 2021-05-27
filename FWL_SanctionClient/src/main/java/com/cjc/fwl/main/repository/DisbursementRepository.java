package com.cjc.fwl.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cjc.fwl.main.model.Disbursement;

@Repository
public interface DisbursementRepository extends CrudRepository<Disbursement, Integer> {

}
