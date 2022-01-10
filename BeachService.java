package com.veneet.java101.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.veneet.java101.model.Beach;

import java.util.List;

public interface BeachService {
	
	 Beach save(Beach beach);

	    void delete(Beach beach);

	  //  Beach findOne(String id);

	    Iterable<Beach> findAll();

	    Page<Beach> findByBeachName(String beachName, PageRequest pageRequest);

	    List<Beach> findByBeachName(String beachName);
	    
	    List<Beach> findByIslandName(String islandName);
	
}
