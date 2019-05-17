package br.com.toyota.ws.tdbmonitor.rest.web;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import br.com.toyota.ws.tdbmonitor.rest.dto.WrapupLogDTO;

@Path("/wrapupinteg")
public class WrapUpIntegrationWS {
	
	/*
     * expected standard JSON 
     * {"id":"Xpto123",
      	"execution_status":"success",
 		"execution_end_date":"2019-05-15T18:25:43.511Z",
 		"messages":[{"message_status":"success", "message":"Successful message"},{"message_status":"warning", "message":"Warning message"},
 		            {"message_status":"error", "message":"Error message"}]
		}
     */
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/persist")
    public String persist(WrapupLogDTO wrapupLog){
		
        return wrapupLog.getExecutionStatus();
    }

}
