package com.skynet.documents;

import jdk.jfr.Name;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 30/10/2020
 */
@Data
@Document(collection = "TB_CHAMADOS")
public class Chamados {
    @Id
    @Name("ID")
    String id;
    @Name("DATA_ABERTURA")
    String dataabertura;
    @Name("DATA_ATENDIMENTO")
    String dataatendimento;
    @Name("ID_TECNICO")
    Tecnicos idtecnico;
    @Name("ID_CLIENTE")
    Clientes idcliente;
    @Name("ATIVIDADE")
    String atividade;
    @Name("LOCALIDADE")
    String localidade;
    @Name("STATUS")
    String status;
}
