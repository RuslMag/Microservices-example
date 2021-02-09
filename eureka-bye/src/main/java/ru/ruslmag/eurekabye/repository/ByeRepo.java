package ru.ruslmag.eurekabye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ruslmag.eurekabye.model.Bye;

@Repository
public interface ByeRepo extends JpaRepository<Bye, Long> {

}
