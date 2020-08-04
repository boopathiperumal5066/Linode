package com.linode.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.linode.model.LinodeModel;

@Repository
public interface LinodeRepository extends MongoRepository<LinodeModel, String> {

}
