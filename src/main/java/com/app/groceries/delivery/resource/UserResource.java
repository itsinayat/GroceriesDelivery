package com.app.groceries.delivery.resource;

import java.text.ParseException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.app.groceries.delivery.model.UserModel;
import com.app.groceries.delivery.service.UserService;
import com.app.groceries.delivery.serviceImpl.UserServiceImpl;



@Path("/user")
@Produces(MediaType.APPLICATION_JSON)

public class UserResource {
	@POST
	@Path("/signup")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response Signup(UserModel user) {
		System.out.println("Entered in resources|signup.");
		UserService service=new UserServiceImpl();
		user=service.doRegister(user);
		return	Response.status(Status.CREATED).entity(user).build();
		
		
	}

	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response login(UserModel user) {
		System.out.println("Entered in resource|login.");
		UserService service = new UserServiceImpl();
		UserModel result = service.doLogin(user);
		return	Response.status(Status.CREATED).entity(result).build();
	}
	
	
	
	@GET
	@Path("/forgetpassword")
	@Produces(MediaType.TEXT_PLAIN)
	public String forgetPassword(@QueryParam("username")String username, @QueryParam("secretans")String secretans) {
		System.out.println("Entered in resource|forgetPassword.");
		UserService service = new UserServiceImpl();
		String returnedPassword = service.getPassword(username,secretans);
		return returnedPassword;	
	}
	
	
	
	
	
	
	
	
}
