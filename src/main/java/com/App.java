package com;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

public class App {

  protected static final String BASE_URI = "http://0.0.0.0:8123/";

  protected static HttpServer startServer() {
    final ResourceConfig rc = new ResourceConfig().packages("com");

    return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
  }

  public static void main(String[] args) {
    startServer();
    System.out.println(String.format("Endpoint dostepny na %sstatus", BASE_URI));
  }
}

