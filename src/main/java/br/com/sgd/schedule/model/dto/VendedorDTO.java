package br.com.sgd.schedule.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VendedorDTO {
    private String idVendedor;
    private String razaoSocial;
    private Long cnpjCpf;
}
