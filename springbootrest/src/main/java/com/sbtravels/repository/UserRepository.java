package com.sbtravels.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sbtravels.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
@Query(value = "SELECT * FROM user WHERE GOV_ID = ?1", nativeQuery = true)
public List<User> findG(String govID);
}
