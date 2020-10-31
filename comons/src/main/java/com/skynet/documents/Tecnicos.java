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
@Document(collection = "TB_TECNICOS")
public class Tecnicos {
    @Id
    @Name("ID")
    String id;
    @Name("NOME")
    String nome;
    @Name("NOMERG")
    String rg;
    @Name("CPF")
    String cpf;
    @Name("DATA_NASCIMENTO")
    String datanascimento;
    @Name("MAE")
    String mae;
    @Name("ENDERECO")
    String endereco;
    @Name("CIDADE")
    String cidade;
    @Name("ESTADO")
    String estado;
    @Name("PAIS")
    String pais;
    @Name("TELEFONE")
    String telefone;
    @Name("BANCO")
    String banco;
    @Name("AGENCIA")
    String agencia;
    @Name("CONTA")
    String conta;
    @Name("TITULAR_CONTA")
    String titularconta;
    @Name("CPF_TITULAR_CONTA")
    String cpftitularconta;
    @Name("VALOR_CHAMADO")
    String valorchamado;
    @Name("VALOR_HORA")
    String valorhora;
    @Name("VALOR_MENSAL")
    String valormensal;
}
