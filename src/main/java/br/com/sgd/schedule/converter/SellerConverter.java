package br.com.sgd.schedule.converter;

import br.com.sgd.schedule.model.SellerEntity;
import br.com.sgd.schedule.model.dto.VendedorDTO;

public class SellerConverter {

    public SellerEntity toEntity(VendedorDTO vendedorDTO){
        if(vendedorDTO == null)
            return null;

        SellerEntity sellerEntity = new SellerEntity();

        sellerEntity.setIdSeller(vendedorDTO.getIdVendedor());
        sellerEntity.setCorporateName(vendedorDTO.getRazaoSocial());
        sellerEntity.setCnpjCpf(vendedorDTO.getCnpjCpf());

        return sellerEntity;
    }
}
