package com.ejemplo.pedidoservice.entities;

import com.ejemplo.pedidoservice.model.ProductoDTO;

public record Pedido(String id, ProductoDTO producto, int cantidad) {
}