package ys276.core.dao;

import ys276.core.domain.Object2;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ObjectMongo extends MongoRepository<Object2, String> {

}
