package org.inayat.novo.ringelweb.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.inayat.novo.ringelweb.model.ReportUserModel;
import org.inayat.novo.ringelweb.service.UtilityService;
import org.inayat.novo.ringelweb.serviceImpl.UtilityServiceImpl;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class UnknownResource {
	
	@POST
	@Path("/report")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response reportAbuse(ReportUserModel model) {
		System.out.println("Entered in UnknownResources|report.");
		UtilityService service=new UtilityServiceImpl();
		model=service.reportUser(model);
		return	Response.status(Status.CREATED).entity(model).build();
		
		
	}


}
