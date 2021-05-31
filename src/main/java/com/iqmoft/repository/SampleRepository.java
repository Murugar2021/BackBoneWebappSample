package com.iqmoft.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iqmoft.model.Sample;

public interface SampleRepository extends MongoRepository<Sample, String> {

}
