package de.dbck.poc.pocjunit;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@Tag("integration")
class SimpleTestMockIT {

  @Test
  void oneIsOneMockIT() throws Exception {
    assertThat(1).isEqualTo(1);
  }
}