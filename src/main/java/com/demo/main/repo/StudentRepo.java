package com.demo.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.main.model.Students;

@Repository
public interface StudentRepo extends JpaRepository<Students,Integer>{

}
