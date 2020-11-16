package de.dbck.poc.pocjunit;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloWorld {
  private static final String HELLO_WORLD = "Hello World!";
  
  public static void main(String[] args) {
    log.info(new HelloWorld().helloWorld());
  }
  
  public String helloWorld() {
    return HELLO_WORLD;
  }
}
