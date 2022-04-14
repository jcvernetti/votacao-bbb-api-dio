package me.dio.coding.votacao.bbb.api.controller;

import lombok.AllArgsConstructor;
import me.dio.coding.votacao.bbb.api.parametermodel.ParameterModel;
import me.dio.coding.votacao.bbb.api.parametermodel.ParticipanteModel;
import me.dio.coding.votacao.bbb.api.repository.ParameterRepository;
import me.dio.coding.votacao.bbb.api.repository.ParticipanteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/participantes")
@AllArgsConstructor
public class ParticipanteController {

    private final ParticipanteRepository repository;

    @PostMapping("/salvar")
    public ResponseEntity<ParticipanteModel> salvar(@RequestBody ParticipanteModel participante) {
        ParticipanteModel entity = repository.save(participante);
        return ResponseEntity.ok(entity);
    }

    @GetMapping("/consultar")
    public ResponseEntity<ParticipanteModel> consultar(@RequestParam String  id) {
        Optional<ParticipanteModel> opt = repository.findById(id);
        if (opt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(opt.get());
    }
}
