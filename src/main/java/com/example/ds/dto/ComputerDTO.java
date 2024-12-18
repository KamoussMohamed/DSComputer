package com.example.ds.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ComputerDTO {
    private String proce;
    private String ram;
    private String hardDrive;
    private double price;
}
