package com.cjc.fwl.main.serviceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cjc.fwl.main.model.Disbursement;
import com.cjc.fwl.main.model.Sanction;
import com.cjc.fwl.main.repository.DisbursementRepository;
import com.cjc.fwl.main.repository.SanctionRepository;
import com.cjc.fwl.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	SanctionRepository sr;
	
	@Autowired
	DisbursementRepository dr;

	@Override
	public List<Sanction> getall() {
		List<Sanction> data = (List<Sanction>) sr.findAll();
		return data;
	}

	@Override
	public void saverecord(Sanction s) {
		sr.save(s);
	}

	@Override
	public List<Disbursement> getdis() {
		List<Disbursement> dislist=(List<Disbursement>) dr.findAll();
		return dislist;
	}

	@Override
	public void savedisdata(Disbursement d) {
		dr.save(d);		
	}
}