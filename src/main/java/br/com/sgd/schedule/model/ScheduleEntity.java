package br.com.sgd.schedule.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AGENDA")
@Data
public class ScheduleEntity implements Serializable {

    @Id
    @Column(name = "ID_AGENDA")
    private String idSchedule;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VENDEDOR")
    private SellerEntity sellerEntity;
}