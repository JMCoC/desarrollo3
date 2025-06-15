package com.ejemplo.pedidoservice.client;

import com.ejemplo.pedidoservice.model.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "producto-service", path = "/productos")
public interface ProductoClient {
    
    @GetMapping
    List<Producto> getAllProductos();
    
    @GetMapping("/{id}")
    Producto getProductoById(@PathVariable("id") Long id);
    
    @PostMapping
    Producto createProducto(@RequestBody Producto producto);
    
    @PutMapping("/{id}")
    Producto updateProducto(@PathVariable("id") Long id, @RequestBody Producto producto);
    
    @DeleteMapping("/{id}")
    void deleteProducto(@PathVariable("id") Long id);
} 