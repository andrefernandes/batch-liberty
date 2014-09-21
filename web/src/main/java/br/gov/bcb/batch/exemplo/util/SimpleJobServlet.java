package br.gov.bcb.batch.exemplo.util;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by andre on 9/21/14.
 */
@WebServlet(value="simple-job")
public class SimpleJobServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        System.out.println("Passei por SimpleJobServlet.doGet...");
        JobOperator jobOperator = BatchRuntime.getJobOperator();
        long jobExecutionId = jobOperator.start("simple-job", new Properties());
    }
}
