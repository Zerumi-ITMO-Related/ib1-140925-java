package io.github.zerumi.ib1140925java.repository;

import io.github.zerumi.ib1140925java.repository.domain.AirportEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends CrudRepository<AirportEntity, Long> { }
