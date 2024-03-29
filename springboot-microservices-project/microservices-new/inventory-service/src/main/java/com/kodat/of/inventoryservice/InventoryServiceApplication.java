package com.kodat.of.inventoryservice;

import com.kodat.of.inventoryservice.model.Inventory;
import com.kodat.of.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository){

        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("Iphone_13");
            inventory.setQuantity(100);

            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("Iphone_14");
            inventory1.setQuantity(200);

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory1);

        };
    }
}
