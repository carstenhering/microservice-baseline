package com.thoughtworks;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;


public class HelloWorldControllerTests {

	// Subject under Test = der Controller
	HelloWorldController subject = new HelloWorldController();
	
	@Test
	public void shouldEchoHelloWorld() {
		String answer = subject.helloWorld();
		Assert.assertEquals("Hello World", answer);
		MatcherAssert.assertThat(answer, Is.is("Hello World"));
	}

}
