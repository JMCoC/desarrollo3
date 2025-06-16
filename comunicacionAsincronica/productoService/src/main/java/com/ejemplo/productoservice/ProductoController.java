package com.ejemplo.productoservice;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.ejemplo.productoservice.ProductoDTO;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productorService;

    @PostMapping("/enviar")
    public String enviarProductos(@RequestBody List<ProductoDTO> productos) {
        productorService.enviarListaProductos(productos);
        return "Productos enviados con éxito al pedido-service";
    }
}