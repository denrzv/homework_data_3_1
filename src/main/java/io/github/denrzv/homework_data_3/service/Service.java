package io.github.denrzv.homework_data_3.service;

import io.github.denrzv.homework_data_3.repository.Repository;

@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public String getProductName(String name) {
        return repository.getProductName(name);
    }
}
