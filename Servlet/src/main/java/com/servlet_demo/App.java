package com.servlet_demo;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {

        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(8080);   // default:8080, optional, can change to other port if needed

        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "servlet1", new HelloServlet());
        context.addServletMappingDecoded("/test", "servlet1");

        tomcat.start();
        tomcat.getServer().await();
    }
}
