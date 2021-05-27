package com.cjc.fwl.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cjc.fwl.main.model.Sanction;

@Repository
public interface SanctionRepository extends CrudRepository<Sanction, Integer> {

}
