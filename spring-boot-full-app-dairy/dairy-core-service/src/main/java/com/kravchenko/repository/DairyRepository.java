package com.kravchenko.repository;

import com.kravchenko.model.Dairy;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DairyRepository extends MongoRepository<Dairy, String> {
}
