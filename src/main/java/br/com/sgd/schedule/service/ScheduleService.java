package br.com.sgd.schedule.service;

import br.com.sgd.schedule.converter.SellerConverter;
import br.com.sgd.schedule.model.SellerEntity;
import br.com.sgd.schedule.model.dto.VendedorDTO;
import br.com.sgd.schedule.repository.ScheduleRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ScheduleService {

    @Autowired
    private final ScheduleRepository scheduleRepository;

    public String includeNewSchedule(VendedorDTO vendedorDTO){
        UUID uuid = UUID.randomUUID();
        vendedorDTO.setIdVendedor(String.valueOf(uuid));
        SellerConverter sellerConverter = new SellerConverter();
        SellerEntity sellerEntity = sellerConverter.toEntity(vendedorDTO);
//        agendaRepository.save(vendedorEntity);
        return vendedorDTO.getIdVendedor();
    }
}
