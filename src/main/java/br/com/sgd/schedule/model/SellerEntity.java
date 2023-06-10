package br.com.sgd.schedule.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "VENDEDOR")
@Data
public class SellerEntity implements Serializable {
    @Id
    @Column(name = "ID_VENDEDOR")
    private String idSeller;

    @Column(name = "RAZAO_SOCIAL", nullable = false)
    private String corporateName;

    @Column(name = "CNPJ_CPF", nullable = false)
    private Long cnpjCpf;


}
