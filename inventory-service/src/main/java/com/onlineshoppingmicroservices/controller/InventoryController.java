package com.onlineshoppingmicroservices.controller;

import com.onlineshoppingmicroservices.dto.InventoryResponse;
import com.onlineshoppingmicroservices.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> inStock(@RequestParam List<String> skuCode){
        return inventoryService.isInStock(skuCode);
    }
}
