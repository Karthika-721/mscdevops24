package com.atu.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
    public void testAddition() {
        int sum = 2 + 2;
        assertEquals(4, sum, "2 + 2 should equal 4");
    }
}
