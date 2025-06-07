package com.project.AlphaDec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.AlphaDec.model.Experience;

@Repository
public interface ExpRepo extends JpaRepository<Experience, Integer> 
{

}
