package br.com.toyota.ws.tdbmonitor.rest.web;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import br.com.toyota.ws.tdbmonitor.rest.dto.StartupLogDTO;
 
@Path("/startupinteg") // o @path define a URI do recurso que nesse caso será /startupinteg
public class StartUpIntegrationWS {
 
    /*
     * expected standard JSON 
     * {"id":"Xpto123", 
 		"execution_start_date":"15/05/2019",
 		"interface_name":"SGMP_teste",
 		"dealer_id":"5344",
 		"file_name":"fileTeste"
		}
     */
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/persist")
    public String persist(StartupLogDTO startupLog){
		
    	/*String id = inputJsonObj.getString("id");
    	String executionStartDate = inputJsonObj.getString("execution_start_date");
    	String interfaceName = inputJsonObj.getString("interface_name");
    	Integer dealerId = inputJsonObj.getInt("dealer_id");
    	String fileName = inputJsonObj.getString("file_name");
    	
    	StringBuilder builder = new StringBuilder();
    	builder.append("Id: " ).append(id);
    	builder.append("Date: " ).append(executionStartDate);
    	builder.append("interface: " ).append(interfaceName);
    	builder.append("dealer id: " ).append(dealerId);
    	builder.append("File name: " ).append(fileName);*/
    	
    	
        return startupLog.getFileName();
    }
}