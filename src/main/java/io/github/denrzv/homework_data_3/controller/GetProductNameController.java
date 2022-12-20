package io.github.denrzv.homework_data_3.controller;

import io.github.denrzv.homework_data_3.service.Service;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetProductNameController {
    private final Service service;

    public GetProductNameController(Service service) {
        this.service = service;
    }

    @GetMapping("/products/fetch-product")
    @ResponseBody
    public String getProductName(@Valid @RequestParam String name) {
        return service.getProductName(name);
    }
}
