package ru.ruslmag.eurekahello.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "hello")
public class Hello {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "count")
    private Integer count;

}
