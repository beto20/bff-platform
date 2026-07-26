package com.bff.plataforma.client;

import com.bff.plataforma.model.PlatformResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(name = "PlatformClient", url = "${url.platform}")
public interface PlatformClient {

    @GetMapping
    List<PlatformResponse> getAll();
}
