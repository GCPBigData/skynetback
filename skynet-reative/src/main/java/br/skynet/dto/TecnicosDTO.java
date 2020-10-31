package br.skynet.dto;

import com.skynet.documents.Tecnicos;
import lombok.*;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 30/10/2020
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class TecnicosDTO {
    String id;
    String nome;
    String rg;
    String cpf;
    String datanascimento;
    String mae;
    String endereco;
    String cidade;
    String estado;
    String pais;
    String telefone;
    String banco;
    String agencia;
    String conta;
    String titularconta;
    String cpftitularconta;
    String valorchamado;
    String valorhora;
    String valormensal;

    public TecnicosDTO(Tecnicos objTecnicos) {
        id = objTecnicos.getId();
        nome = objTecnicos.getNome();
        rg = objTecnicos.getRg();
        cpf = objTecnicos.getCpf();
        datanascimento = objTecnicos.getDatanascimento();
        mae = objTecnicos.getMae();
        endereco = objTecnicos.getEndereco();
        cidade = objTecnicos.getCidade();
        estado = objTecnicos.getEstado();
        pais = objTecnicos.getPais();
        telefone = objTecnicos.getTelefone();
        banco = objTecnicos.getBanco();
        agencia = objTecnicos.getAgencia();
        conta = objTecnicos.getConta();
        titularconta = objTecnicos.getTitularconta();
        cpftitularconta = objTecnicos.getCpftitularconta();
        valorchamado = objTecnicos.getValorchamado();
        valorhora = objTecnicos.getValorhora();
        valormensal = objTecnicos.getValormensal();

    }
}
