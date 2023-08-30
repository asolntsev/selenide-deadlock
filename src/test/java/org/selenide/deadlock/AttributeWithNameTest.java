package org.selenide.deadlock;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.codeborne.selenide.conditions.AttributeWithValue;

public class AttributeWithNameTest {
  @Test
  void accessConditionClass() {
    assertThat(new AttributeWithValue("id", "value")).hasToString("attribute id=\"value\"");
  }
}
