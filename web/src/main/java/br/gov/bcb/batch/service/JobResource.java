package br.gov.bcb.batch.service;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.Properties;

/**
 * Created by andre on 9/22/14.
 */
@Path("/job")
public class JobResource {

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media
    // type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello from JobResource JSR 352 Helper";
    }

    @GET
    @Produces("text/plain")
    @Path("{jobname}/start")
    public String startJob(@PathParam("jobname") String jobname) {
        JobOperator jobOperator = BatchRuntime.getJobOperator();
        long jobExecutionId = jobOperator.start(jobname, new Properties());
        return String.valueOf(jobExecutionId);
    }

    @GET
    @Produces("text/plain")
    @Path("{jobExecutionId}/stop")
    public String stopJob(@PathParam("jobExecutionId") int jobExecutionId) {
        String result = "STOPPED";
        System.out.println("Parando " + jobExecutionId);
        JobOperator jobOperator = BatchRuntime.getJobOperator();
        try {
            jobOperator.stop(jobExecutionId);
        } catch (Exception e) {
            result = "ERROR";
        }
        return result;
    }

    @GET
    @Produces("text/plain")
    @Path("{jobExecutionId}/restart")
    public String restartJob(@PathParam("jobExecutionId") int jobExecutionId) {
        String result = "RESTARTED";
        System.out.println("Reiniciando " + jobExecutionId);
        JobOperator jobOperator = BatchRuntime.getJobOperator();
        try {
            jobOperator.restart(jobExecutionId,new Properties());
        } catch (Exception e) {
            result = "ERROR";
        }
        return result;
    }

}
