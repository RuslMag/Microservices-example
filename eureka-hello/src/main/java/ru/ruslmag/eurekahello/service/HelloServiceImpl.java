package ru.ruslmag.eurekahello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ruslmag.eurekahello.model.Hello;
import ru.ruslmag.eurekahello.repository.HelloRepo;

@Service
public class HelloServiceImpl implements HelloService {

    private final HelloRepo helloRepo;
    private final KafkaService kafkaService;

    @Autowired
    public HelloServiceImpl(HelloRepo helloRepo, KafkaService kafkaService) {
        this.helloRepo = helloRepo;
        this.kafkaService = kafkaService;
    }

    @Override
    public void save(Hello hello) {
        helloRepo.save(hello);
    }

    @Override
    public Hello getById(Long id) {
        return helloRepo.getOne(id);
    }

    @Override
    public void getCount() {
        Hello hello = getById(1L);
        int count = hello.getCount() + 1;
        hello.setCount(count);
        save(hello);
        kafkaService.send(count);
    }

}
