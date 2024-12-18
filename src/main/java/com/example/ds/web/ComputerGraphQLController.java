package com.example.ds.web;


import com.example.ds.dto.ComputerDTO;
import com.example.ds.services.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller

public class ComputerGraphQLController {

    @Autowired
    private ComputerService computerService;

    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO computerDTO) {
        return computerService.save(computerDTO);
    }

    @QueryMapping
    public List<ComputerDTO> getComputerByProce(@Argument String proce){
        return computerService.getComputerByProce(proce);
    }
}
