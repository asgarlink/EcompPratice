package com.ecomp.controller;

import com.ecomp.model.EcompModel;
import com.ecomp.model.EcompRequest;
import com.ecomp.service.EcompService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by AmareshKumar on 21/3/17.
 */
@RestController
@RequestMapping("/ecomp")
public class EcompController {
    private static final Logger ACCOUNT_SERVICE_LOGGER = LoggerFactory.getLogger(EcompController.class);
    @Autowired
    private EcompService ecompService;


    @RequestMapping(value = "/details/{ecompId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public EcompModel getEcompDetails(@PathVariable("ecompId") String ecompId) {
    	return ecompService.getEcomp(Long.valueOf(ecompId));
     
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void createEcompDetails(@RequestBody EcompRequest ecompRequest) {
    	EcompModel ecompModel = new EcompModel(ecompRequest.getName(),ecompRequest.getStatus(),ecompRequest.getAccount_open_Date(),ecompRequest.getAccount_balance());
    	ecompService.createEcomp(ecompModel);
    }
}
