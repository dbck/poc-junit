package de.dbck.poc.pocjunit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

  @Test
  void test() {
    HelloWorld helloWorld = new HelloWorld();
    assertThat(helloWorld.helloWorld()).isEqualTo("Hello World!");
  }

}
