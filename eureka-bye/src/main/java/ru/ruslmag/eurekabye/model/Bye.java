package ru.ruslmag.eurekabye.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bye")
public class Bye {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "count")
    private Integer count;

}
