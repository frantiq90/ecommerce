package com.ecommerce.inventoryservice.service.seed;

import com.ecommerce.inventoryservice.model.Inventory;
import com.ecommerce.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InventorySeedService {
    private final InventoryRepository inventoryRepository;

    public void seed() {
        List<String> skuCodes1 = new ArrayList<>();
        skuCodes1.add("TEST_SKU_1");

        if (inventoryRepository.findBySkuCodeIn(skuCodes1).isEmpty()) {
            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("TEST_SKU_1");
            inventory1.setQuantity(100);

            inventoryRepository.save(inventory1);
        }

        List<String> skuCodes2 = new ArrayList<>();
        skuCodes2.add("TEST_SKU_2");

        if (inventoryRepository.findBySkuCodeIn(skuCodes2).isEmpty()) {
            Inventory inventory2 = new Inventory();
            inventory2.setSkuCode("TEST_SKU_2");
            inventory2.setQuantity(0);

            inventoryRepository.save(inventory2);
        }
    }
}
