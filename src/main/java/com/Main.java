package com;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import java.net.URI;

public class Main {
  protected static final String URI = "http://0.0.0.0:8123/";

  public static void main(String[] args) {
    startServer();
    System.out.println(String.format("Endpoint dostepny na %sstatus", URI));
  }
  
  protected static HttpServer startServer() {
    final ResourceConfig rc = new ResourceConfig().packages("com");
    return GrizzlyHttpServerFactory.createHttpServer(URI.create(URI), rc);
  }
}

