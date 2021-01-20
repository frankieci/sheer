package com.frankieci.agile;

import reactor.core.publisher.Mono;

import java.util.function.Function;

public class ServerHttpBearerAuthenticationConverter implements Function<String, Mono<String>> {

    @Override
    public Mono<String> apply(String s) {
        return Mono.justOrEmpty("Without data");
    }
}
