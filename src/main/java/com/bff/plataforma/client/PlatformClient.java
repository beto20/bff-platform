package com.bff.plataforma.client;

import com.bff.plataforma.model.PlatformResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(name = "PlatformClient", url = "localhost:8082/api/v1/platforms")
public interface PlatformClient {

    @GetMapping
    List<PlatformResponse> getAll();
}
