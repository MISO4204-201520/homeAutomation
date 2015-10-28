package com.uniandes.edu.co.homeServer;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
 
import javax.ws.rs.core.UriBuilder;
 
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpServer;
 
/**
 * @author Nicolas Bonet
 */
@SuppressWarnings("restriction")
public class EmbeddedHTTPServer {
 
    public static void main(String[] args) throws IOException
    {
        HttpServer HomeAutomationHTTPServer = createHttpServer();
        HomeAutomationHTTPServer.start();
        System.out.println("Started Crunchify's Embedded Jersey HTTPServer Successfully !!!");
    }
 
    private static HttpServer createHttpServer() throws IOException
    {
        ResourceConfig configServer = new PackagesResourceConfig("com.uniandes.edu.co.homeServer");
        return HttpServerFactory.create(getURI(), configServer);
    }
 
    private static URI getURI()
    {
        return UriBuilder.fromUri("http://" + getHostName() + "/").port(8085).build();
    }
 
    private static String getHostName()
    {
        String hostName = "localhost";
        try {
            hostName = InetAddress.getLocalHost().getCanonicalHostName();
        }
        catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return hostName;
    }
}