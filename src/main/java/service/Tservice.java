package com.Task.Task1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Task.Task1.dto.Tdto;
import com.Task.Task1.repository.Trepository;

@Component
public class Tservice {
	

	    @Autowired
	    private Trepository repo;
	    
	    public List<Tdto> getAllTdto() {
	        return repo.findAll();
	    }
	    
       public Tdto getItemById(int no) {
	        return repo.findById(no).orElse(null);
	    }
	    
	    public void saveItem(Tdto dto) {
	       repo.save(dto);
	    }
	    
	    public void deleteItem(int no) {
	        repo.deleteById(no);
	    }
	}

