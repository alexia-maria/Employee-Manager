package com.baeldung.ls;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(value = LsApp.class)
@TestPropertySource(locations = "classpath:test.properties")
public class TestPropertySourceTest {
    @Value("${testproperty}")
    private String testproperty;

    @Value("${additional.info}")
    private String additional;

    @Test
    public void whenTestPropertySource_thenValuesRetreived() {
        assertEquals("Test Property Value", testproperty);
    }

    @Test
    public void whenPropertyDefinedInMain_thenValuesRetrieved() {
        assertEquals("Additional Info From Test", additional);
    }
}
