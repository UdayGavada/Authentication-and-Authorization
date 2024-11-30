package com.rbac.example.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.rbac.example.models.User;

@Service
public class UserService {
	
	private List<User> store=new ArrayList<>();
	

	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Uday Gavada","udaygavada@web.com"));
		store.add(new User(UUID.randomUUID().toString(),"Ganesh Koti","ganeshkoti@web.com"));
		store.add(new User(UUID.randomUUID().toString(),"Manish Patidar","manishpatidar@web.com"));
		store.add(new User(UUID.randomUUID().toString(),"Raj Mane","rajmane@web.com"));
	}
	
	public List<User> getUsers(){
		return this.store;
	}
}
