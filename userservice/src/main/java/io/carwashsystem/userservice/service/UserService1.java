package io.carwashsystem.userservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.google.common.base.Optional;

import io.carwashsystem.userservice.model.Userdetails;

public interface UserService1 {
	public Userdetails addUser(Userdetails user);
	
	public List<Userdetails> getUsers();
	
	
	
	public ResponseEntity<Object> deleteById(int id);

	public ResponseEntity<Object> updateuser(int id, Userdetails user);

	public Optional<Userdetails> getuser(int id);
}
