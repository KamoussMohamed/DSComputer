package com.example.ds.services;

import com.example.ds.dao.entities.Computer;
import com.example.ds.dao.repositories.ComputerRepository;
import com.example.ds.dto.ComputerDTO;
import com.example.ds.mapper.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ComputerManager implements ComputerService{

    @Autowired
    private ComputerRepository computerRepository;
    @Autowired
    private ComputerMapper computerMapper;

    @Override
    public ComputerDTO save(ComputerDTO computerDTO) {
        computerRepository.save(computerMapper.fromComputerDTOToComputer(computerDTO));
        return computerDTO;
    }


    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDTO> computerDTOS = new ArrayList<>();
        for(Computer computer : computers){
            computerDTOS.add(computerMapper.fromComputerToComputerDTO(computer));
        }
        return computerDTOS;
    }

    @Override
    public List<ComputerDTO> saveComputers(List<ComputerDTO> computerDTOList) {
        for(ComputerDTO computerDTO : computerDTOList){
            computerRepository.save(computerMapper.fromComputerDTOToComputer(computerDTO));
        }
        return computerDTOList;
    }

    @Override
    public List<ComputerDTO> getAllComputers() {
        return computerRepository.findAll().stream().map(computerMapper::fromComputerToComputerDTO).collect(Collectors.toList());
    }
}
