package io.github.mahendrabagul.artajareactiveweb.client;

import io.github.mahendrabagul.artajareactiveweb.Event;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;

/**
 * Created by mahendra.hiraman on 1/18/2018.
 */
@SpringBootApplication
public class ArtajaReactiveClientApplication {

    @Bean
    WebClient client() {
        return WebClient.create("http://localhost:8080");
    }

    @Bean
    CommandLineRunner demo(WebClient client) {
        return args -> {
            client
                    .get()
                    .uri("/events")
                    .accept(MediaType.TEXT_EVENT_STREAM)
                    .exchange()
                    //not working
                    .flatMap(cr -> cr.bodyToFlux(Event.class))
                    .subscribe(System.out::println);
        };
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(ArtajaReactiveClientApplication.class)
                .properties(Collections.singletonMap("server.port", "8081"))
                .run(args);
    }
}

