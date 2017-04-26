package com.ecomp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ecomp.model.EcompModel;
import com.ecomp.repos.EcompRepo;

/**
 * Created by AmareshKumar on 21/3/17.
 */
@Component
public class EcompServiceImpl implements EcompService {

	@Autowired
	EcompRepo ecompRepo;
	
	@Override
	public void createEcomp(EcompModel ecompRequest) {
		ecompRepo.save(ecompRequest);
	}

	@Override
	public EcompModel getEcomp(Long ecompId) {
		return ecompRepo.findOne(ecompId);
	}

}
