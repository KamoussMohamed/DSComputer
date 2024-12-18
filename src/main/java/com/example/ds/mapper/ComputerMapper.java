package com.example.ds.mapper;


import com.example.ds.dao.entities.Computer;
import com.example.ds.dto.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public Computer fromComputerDTOToComputer(ComputerDTO computerDTO) {
        return modelMapper.map(computerDTO, Computer.class);
    }
    public ComputerDTO fromComputerToComputerDTO(Computer computer) {
        return modelMapper.map(computer, ComputerDTO.class);
    }
}
