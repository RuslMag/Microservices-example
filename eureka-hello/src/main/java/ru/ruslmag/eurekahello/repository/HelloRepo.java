package ru.ruslmag.eurekahello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ruslmag.eurekahello.model.Hello;

@Repository
public interface HelloRepo extends JpaRepository<Hello, Long> {

}
