package br.gov.bcb.batch.spring;

import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by andre on 9/21/14.
 */
@WebServlet(name = "BatchServlet",loadOnStartup = 1,urlPatterns = {"/*"},
        initParams = {@WebInitParam(name = "contextConfigLocation",value = "classpath*:/org/springframework/batch/admin/web/resources/servlet-config.xml")})
public class BatchServlet extends org.springframework.web.servlet.DispatcherServlet {

}

