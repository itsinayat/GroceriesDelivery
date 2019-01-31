package org.inayat.novo.ringelweb.resource;

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

import org.inayat.novo.ringelweb.model.CelebrationModel;
import org.inayat.novo.ringelweb.model.FaqModel;
import org.inayat.novo.ringelweb.model.GfBfDataModel;
import org.inayat.novo.ringelweb.model.HelpTextModel;
import org.inayat.novo.ringelweb.model.MessageModel;
import org.inayat.novo.ringelweb.model.ReportUserModel;
import org.inayat.novo.ringelweb.model.UserModel;
import org.inayat.novo.ringelweb.service.UserService;
import org.inayat.novo.ringelweb.service.UtilityService;
import org.inayat.novo.ringelweb.serviceImpl.UserServiceImpl;
import org.inayat.novo.ringelweb.serviceImpl.UtilityServiceImpl;



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
	
	
	@POST
	@Path("/updategfbf")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveGfBfData(GfBfDataModel gfBfdataModel) {
		System.out.println("Entered in resources|saveGfBfData.");
		UserService service =new UserServiceImpl();
		gfBfdataModel = service.doSaveGfBfData(gfBfdataModel);
		return	Response.status(Status.CREATED).entity(gfBfdataModel).build();
		
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
	
	@GET
	@Path("/getHelpText")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getHelpText() {
		System.out.println("Entered in resource|helpText.");
		UtilityService service=new UtilityServiceImpl();
		HelpTextModel model= service.getHelpText();
		return	Response.status(Status.CREATED).entity(model).build();
	}
	
	@GET
	@Path("/getFaq")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FaqModel> getFaq() {
		System.out.println("Entered in resourcegetFAq.");
		UserService service=new UserServiceImpl();
		List<FaqModel> list= service.getFaqService();
		return	list;
	}
	
	
	@GET
	@Path("/getCelebrationDetails")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCelebrationModel() throws ParseException {
		System.out.println("Entered in getCelebrationModel.");
		UtilityService service=new UtilityServiceImpl() ;   
	    CelebrationModel model= service.getCelebration();
	    return	Response.status(Status.CREATED).entity(model).build();
	}
	
		@POST
		@Path("/sendMessage")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response SendMessage(MessageModel message) {
			System.out.println("Entered in resources|Sendmessage.");
			UserService service=new UserServiceImpl();
			message=service.sendMessage(message);
			return	Response.status(Status.CREATED).entity(message).build();
			
			
		}
		
		@POST
		@Path("/report")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response reportAbuse(ReportUserModel model) {
			System.out.println("Entered in resources|report.");
			UtilityService service=new UtilityServiceImpl();
			model=service.reportUser(model);
			return	Response.status(Status.CREATED).entity(model).build();
			
			
		}
	
	
	
	
	
	
	
	
}
