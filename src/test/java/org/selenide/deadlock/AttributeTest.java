package org.selenide.deadlock;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.codeborne.selenide.conditions.Attribute;

public class AttributeTest {
  @Test
  void accessConditionClass() {
    assertThat(new Attribute("id")).hasToString("attribute id");
  }
}
