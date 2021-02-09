package ru.ruslmag.eurekabye.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ruslmag.eurekabye.model.Bye;
import ru.ruslmag.eurekabye.repository.ByeRepo;

@Service
public class ByeServiceImpl implements ByeService {

    private final ByeRepo byeRepo;

    @Autowired
    public ByeServiceImpl(ByeRepo byeRepo) {
        this.byeRepo = byeRepo;
    }

    @Override
    public void save(Bye bye) {
        byeRepo.save(bye);
    }

    @Override
    public Bye getById(Long id) {
        return byeRepo.getOne(id);
    }

    @Override
    public void setCount() {
        Bye bye = getById(1L);
        int count = bye.getCount() + 1;
        bye.setCount(count);
        save(bye);
    }

}
