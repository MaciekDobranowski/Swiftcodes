package com.example.swiftcodes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SwiftApp {

    public static void main(String[] args) {
        SpringApplication.run(SwiftApp.class, args);
    }

    @Bean
    CommandLineRunner runOnStart(SwiftCodeRepository repository) {
        return args -> {
            String filePath = "Interns_2025_SWIFT_CODES.xlsx";
            List<SwiftCodeEntry> entries = ExcelParser.parse(filePath);
            //entries.forEach(System.out::println);
            repository.saveAll(entries);
            System.out.println("Zapisano do bazy: " + entries.size());
        };
    }
}