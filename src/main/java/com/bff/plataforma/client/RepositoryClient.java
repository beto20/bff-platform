package com.bff.plataforma.client;

import com.bff.plataforma.model.RepositoryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(name = "RepositoryClient", url = "${url.repo}")
public interface RepositoryClient {

    @GetMapping
    List<RepositoryResponse> getAll();
}
