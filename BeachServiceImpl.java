package com.veneet.java101.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.veneet.java101.model.Beach;
import com.veneet.java101.repository.BeachRepository;




@Service
public class BeachServiceImpl implements BeachService {

	private BeachRepository beachRepository;
	
	
	@Autowired
	public void setBeachRepository(BeachRepository beachRepository) {
        this.beachRepository = beachRepository;
    }
	
	
	
	
	
	
	
	@Override
	public Beach save(Beach beach) {
		return beachRepository.save(beach);
	}

	@Override
	public void delete(Beach beach) {
		beachRepository.delete(beach);

	}

	
//	public Beach findOne(String id) {
	//	Optional<Beach> beach = beachRepository.findById(id);
	//	return (beach);
//	}

	@Override
	public Iterable<Beach> findAll() {
		return beachRepository.findAll();
	}

	@Override
	public Page<Beach> findByBeachName(String beachName, PageRequest pageRequest) {
		return beachRepository.findByBeachName(beachName, pageRequest);
	}

	@Override
	public List<Beach> findByBeachName(String beachName) {
		return beachRepository.findByBeachName(beachName);
	}
	
	@Override
	public List<Beach> findByIslandName(String islandName) {
		return beachRepository.findByIslandName(islandName);
	}

}
