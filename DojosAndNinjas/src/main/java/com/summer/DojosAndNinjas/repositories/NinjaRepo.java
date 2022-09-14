package com.summer.DojosAndNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.summer.DojosAndNinjas.models.Dojo;
import com.summer.DojosAndNinjas.models.Ninja;

public interface NinjaRepo extends CrudRepository<Ninja,Long>{
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);
}
