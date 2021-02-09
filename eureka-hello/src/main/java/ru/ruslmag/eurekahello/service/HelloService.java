package ru.ruslmag.eurekahello.service;


import ru.ruslmag.eurekahello.model.Hello;

public interface HelloService {

    void save(Hello hello);

    Hello getById(Long id);

    void getCount();
}
