package io.github.mahendrabagul.artajareactiveweb.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.Assert.*;

/**
 * Created by mahendra.hiraman on 1/19/2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArtajaReactiveWebApplicationTest {

    private WebTestClient webTestClient;

    @Before
    public void before() {
        this.webTestClient = WebTestClient.bindToServer().baseUrl("http://localhost:8080").build();
    }

    @Test
    public void eventById() throws Exception {
        this.webTestClient.get().uri("events/22").accept(MediaType.TEXT_EVENT_STREAM).exchange().expectStatus().isOk();
    }

}