package com.example.ds.services;

import com.example.ds.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {
    public ComputerDTO save(ComputerDTO computerDTO);
    public List<ComputerDTO> getComputerByProce(String proce);
    public List<ComputerDTO> saveComputers(List<ComputerDTO> computerDTOList);
    public List<ComputerDTO> getAllComputers();
}
