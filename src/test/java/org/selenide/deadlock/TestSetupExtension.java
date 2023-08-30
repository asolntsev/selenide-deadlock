package org.selenide.deadlock;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class TestSetupExtension implements BeforeAllCallback {

  @Override
  public void beforeAll(ExtensionContext context) {
    // Uncommenting this line fixed the deadlock:
    // assertThat(com.codeborne.selenide.Condition.visible).isNotNull();
  }
}
