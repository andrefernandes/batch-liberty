package br.gov.bcb.batch.exemplo.util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

/**
 * Created by andre on 9/20/14.
 */
@WebServlet(loadOnStartup = 1, value = "init")
public class InitServlet extends HttpServlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Passei por InitServlet.init");
        super.init(servletConfig);
    }

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        System.out.println("Passei por InitServlet.doGet...");
        /*
        try {
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/batch");
            Connection con = ds.getConnection();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }
}
