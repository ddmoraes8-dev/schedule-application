package br.com.sgd.schedule.controller;

import br.com.sgd.schedule.model.dto.VendedorDTO;
import br.com.sgd.schedule.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agenda")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String cadastrarVendedor(@RequestBody VendedorDTO vendedorDTO){
//        return vendedorService.includeNewVendor(vendedorDTO);
        return null;
    }
}
