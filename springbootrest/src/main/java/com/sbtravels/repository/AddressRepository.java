package com.sbtravels.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sbtravels.model.Address;
import com.sbtravels.model.User;

public interface AddressRepository extends JpaRepository<Address, String>{
@Query(value = "SELECT * FROM address WHERE id = ?1", nativeQuery = true)
public List<Address> findAddress(String addId);
@Query(value = "SELECT * FROM address WHERE id in(select ADD_ID from useraddressmap where USER_ID = :id)", nativeQuery = true)
public List<Address> findUserAddress(@Param("id") Long userID);
}
