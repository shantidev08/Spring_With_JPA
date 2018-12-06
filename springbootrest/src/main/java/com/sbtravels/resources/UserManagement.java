package com.sbtravels.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sbtravels.model.Address;
import com.sbtravels.model.User;
import com.sbtravels.repository.AddressRepository;
import com.sbtravels.repository.UserRepository;

@RestController
@RequestMapping("sbtravels")
public class UserManagement {
	@Autowired
	UserRepository repo;
	@Autowired
	AddressRepository add_repo;
	@GetMapping("users")
	public List<User> getUsers(){
		List<User> userList = (List<User>) repo.findAll();
		for(User user : userList) {
			List<Address> addressList = (List<Address>) add_repo.findUserAddress(user.getUSER_ID());
			user.setAddressList(addressList);
		}
		return userList;
	}
	/*@GetMapping("users")
	public List<User> getUsers( @RequestParam("govId") String govId){
		List<User> userList = (List<User>) repo.findG(govId);
		for(User user : userList) {
			List<Address> addressList = (List<Address>) add_repo.findAddress(user.getUSER_ID());
		}
		return userList;
	}*/
	
	/*@GetMapping("address")
	public List<Address> getAddress( @RequestParam("id") String addId){
		List<Address> addressList = (List<Address>) add_repo.findAddress(addId);
		return addressList;
	}*/
	
	@GetMapping("address")
	public List<Address> getAddress( @RequestParam("id") Long addId){
		List<Address> addressList = (List<Address>) add_repo.findUserAddress(addId);
		return addressList;
	}
}
