package br.gov.bcb.batch.spring;

import javax.servlet.annotation.WebFilter;

/**
 * Created by andre on 9/21/14.
 */
@WebFilter(urlPatterns = "/*")
public class HiddenHttpMethodFilter extends org.springframework.web.filter.HiddenHttpMethodFilter {
}
