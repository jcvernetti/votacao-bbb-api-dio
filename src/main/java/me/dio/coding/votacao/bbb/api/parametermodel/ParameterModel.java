package me.dio.coding.votacao.bbb.api.parametermodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("parametros")
public class ParameterModel {

    @Id
    private String chave;
    private String valor;
}
