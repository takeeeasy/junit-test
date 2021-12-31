package com.company;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Test;
import org.junit.Assert;

public class AssertExample {
  @Test
  public void testAssertArrayEquals() {
    byte[] expected = "trial".getBytes();
    byte[] actual = "trial".getBytes();
    Assert.assertEquals("failure - strings are not equal", "text", "text");
  }

  @Test
  public void testAssertFalse() {
    Assert.assertFalse("failure - should be false", false);
  }

  @Test
  public void testAssertNotNull() {
    Assert.assertNotNull("should not be null", new Object());
  }
  @Test
  public void testAssertNotSame() {
    Assert.assertNotSame("should not be same Object", new Object(), new Object());

  }

  @Test
  public void testAssertNull() {
    Assert.assertNull("should be null", null);
  }

  @Test
  public void testAssertSame() {
    Integer aNumber = Integer.valueOf(768);
    Assert.assertSame("should be same", aNumber, aNumber);
  }

  // JUnit Matchers의 assertThat 메서드
  @Test
  public void testAssertThatBothContaisString() {
    Assert.assertThat("albumen", both(containsString("a")).and(containsString("b")));
    assertThat("albumen", both(containsString("a")).and(containsString("b")));
  }

  @Test
  public void testAssertThathasItemsContainsString() {
    Assert.assertThat(Arrays.asList("one", "tow", "three"), hasItems("one", "three"));
  }

  @Test
  public void testAssertThatEveryItemContainsString() {
    Assert.assertThat(Arrays.asList(new String[] {"fun", "ban", "net"}), everyItem(containsString("n")));
  }

  // JUnit의 assertThat 메서드와 hamcrest의 Matcher조합한 형태
  @Test
  public void testAssertThatHamcrestCoreMatchers() {
    assertThat("good", allOf(equalTo("good")));
    assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
    assertThat("good", not(anyOf(equalTo("bad"), equalTo("good"))));
    assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
  }
}
