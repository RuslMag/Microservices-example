package ru.ruslmag.eurekabye.service;

import ru.ruslmag.eurekabye.model.Bye;

public interface ByeService {

    void save(Bye bye);

    Bye getById(Long id);

    void setCount();
}
