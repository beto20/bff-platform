package com.bff.plataforma.controller;

import com.bff.plataforma.model.BffResponse;
import com.bff.plataforma.service.BffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/bff")
public class BffController {

    @Autowired
    private BffService bffService;

    @GetMapping()
    public List<BffResponse> getAll() {
        return bffService.getAll();
    }
}
