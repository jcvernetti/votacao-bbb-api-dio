package me.dio.coding.votacao.bbb.api.repository;

import me.dio.coding.votacao.bbb.api.parametermodel.ParameterModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParameterRepository extends MongoRepository<ParameterModel, String> {
}
