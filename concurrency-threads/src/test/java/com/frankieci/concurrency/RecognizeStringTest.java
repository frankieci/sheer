package com.frankieci.concurrency;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RecognizeStringTest {
  @Test
  public void should_return_true_when_equalSign() {
    String s1 = "hello";
    String s2 = "hello";
    Boolean flag = s1 == s2;
    Assert.assertTrue(flag);
  }

  @Test
  public void should_return_true_when_equals() {
    String s1 = "hello";
    String s3 = new String("hello");
    Boolean anotherFlag = s1.equals(s3);
    Assert.assertTrue(anotherFlag);
  }
}
