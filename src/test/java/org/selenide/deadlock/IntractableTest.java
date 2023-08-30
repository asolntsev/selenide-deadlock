package org.selenide.deadlock;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;

public class IntractableTest {
  @Test
  void accessConditionClass() {
    assertThat(Condition.interactable).hasToString("interactable");
  }
}
