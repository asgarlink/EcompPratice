package com.ecomp.service;

import com.ecomp.model.EcompModel;

/**
 * Created by AmareshKumar on 21/3/17.
 */
public interface EcompService {

	public void createEcomp(EcompModel ecomp);
	
	public EcompModel getEcomp(Long ecompId);
}
