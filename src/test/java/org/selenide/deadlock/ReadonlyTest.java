package org.selenide.deadlock;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;

public class ReadonlyTest {
  @Test
  void accessConditionClass() {
    assertThat(Condition.readonly).hasToString("readonly");
  }
}
