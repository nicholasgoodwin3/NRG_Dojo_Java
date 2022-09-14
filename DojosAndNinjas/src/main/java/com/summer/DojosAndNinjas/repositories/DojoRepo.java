package com.summer.DojosAndNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.summer.DojosAndNinjas.models.Dojo;

public interface DojoRepo extends CrudRepository<Dojo,Long>{
	List<Dojo> findAll();
}
