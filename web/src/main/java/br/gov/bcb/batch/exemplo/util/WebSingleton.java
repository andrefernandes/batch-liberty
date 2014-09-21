package br.gov.bcb.batch.exemplo.util;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Created by andre on 9/21/14.
 */
@Singleton
@Startup
public class WebSingleton {
    @PostConstruct
    void init() {
        System.out.println("WebSingleton init");
    }
}
