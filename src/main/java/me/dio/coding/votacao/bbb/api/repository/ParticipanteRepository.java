package me.dio.coding.votacao.bbb.api.repository;


import me.dio.coding.votacao.bbb.api.parametermodel.ParticipanteModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParticipanteRepository extends MongoRepository<ParticipanteModel, String> {
}
