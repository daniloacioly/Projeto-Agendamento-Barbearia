package main.java.br.com.dio.Barbearia.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ClientDetailResponse(
        @JsonProperty("id")
        Long id,
        @JsonProperty("name")
        String name,
        @JsonProperty("email")
        String email,
        @JsonProperty("phone")
        String phone
) {}