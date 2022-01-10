package com.veneet.java101.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.veneet.java101.model.Beach;

public interface BeachRepository extends ElasticsearchRepository<Beach, String> {

	Page<Beach> findByBeachName(String beachName, Pageable pageable);

    List<Beach> findByBeachName(String beachName);
    
    List<Beach> findByIslandName(String islandName);
	
}
