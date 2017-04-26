package com.ecomp.repos;

import org.springframework.data.repository.CrudRepository;

import com.ecomp.model.EcompModel;

/**
 * Created by AmareshKumar on 21/3/17.
 */
public interface EcompRepo extends CrudRepository<EcompModel, Long> {
}
