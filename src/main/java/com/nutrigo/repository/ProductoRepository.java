package com.nutrigo.repository;

import com.nutrigo.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // JpaRepository ya trae métodos como save(), findAll() y delete() listos para usar.
}