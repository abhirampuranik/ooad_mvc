package com.example.handlingformsubmission;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String> {

	public Car findByCarName(String CarName);
	public List<Car> findByOwnerName(String OwnerName);

}
