package ru.ruslmag.eurekabye.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ruslmag.eurekabye.service.ByeService;
import ru.ruslmag.eurekabye.service.KafkaService;

@RestController
public class ByeController {

    private final ByeService byeService;

    private final KafkaService kafkaService;

    @Autowired
    public ByeController(ByeService byeService, KafkaService kafkaService) {
        this.byeService = byeService;
        this.kafkaService = kafkaService;
    }

    @GetMapping("/bye")
    public String sayBye() {
        byeService.setCount();
        return "Всего доброго! Вы здоровались " + kafkaService.getCount() + " раз";
    }

}
