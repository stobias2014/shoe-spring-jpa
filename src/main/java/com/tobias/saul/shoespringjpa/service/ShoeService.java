package com.tobias.saul.shoespringjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobias.saul.shoespringjpa.model.Shoe;
import com.tobias.saul.shoespringjpa.repository.ShoeRepository;

@Service
public class ShoeService {
	
	@Autowired
	private final ShoeRepository shoeRepository;
	
	public ShoeService(ShoeRepository shoeRepository) {
		this.shoeRepository = shoeRepository;
	}
	
	public Shoe addShoe(Shoe shoe) {
		return shoeRepository.save(shoe);
	}

}
