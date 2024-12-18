package com.example.ds;

import com.example.ds.dto.ComputerDTO;
import com.example.ds.services.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ComputerService computerService) {
        return  args -> {
            computerService.saveComputers(
                    List.of(
                            ComputerDTO.builder().proce("i3").ram("8go").hardDrive("256go").price(2000).build(),
                            ComputerDTO.builder().proce("i5").ram("16go").hardDrive("512go").price(3000).build(),
                            ComputerDTO.builder().proce("i7").ram("32go").hardDrive("1tb").price(4000).build(),
                            ComputerDTO.builder().proce("i9").ram("64go").hardDrive("2tb").price(5000).build()
                    )

            );
        };
    }

}
