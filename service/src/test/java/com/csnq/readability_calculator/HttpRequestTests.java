package com.csnq.readability_calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        assertTrue((this.restTemplate.getForObject("http://localhost:" + port + "/",
                String.class)).contains("Hello, World"));
    }

    @Test
    public void showMetaDataShouldReturnMessage() throws Exception{
        assertTrue((this.restTemplate.getForObject("http://localhost:" + port + "/parse/metadata",
                String.class)).contains("Words: 379.0, Characters: 1798.0, Sentences: 16.0"));
    }

    @Test
    public void getGradeLevelShouldReturnMessage() throws Exception{
        assertTrue((this.restTemplate.getForObject("http://localhost:" + port + "/parse/level",
                String.class)).contains("difficult to read"));
    }


}