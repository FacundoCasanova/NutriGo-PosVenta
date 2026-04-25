package com.nutrigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import com.nutrigo.repository.ProductoRepository;
import com.nutrigo.model.Producto;

@SpringBootApplication
public class PosVentaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PosVentaApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(ProductoRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                Producto p1 = new Producto();
                p1.setNombre("Nueces Mariposa");
                p1.setCategoria("Frutos Secos");
                p1.setPrecioCosto(10000.0); // 👈 Agregá esta línea
                p1.setPrecioVenta(15000.0);
                p1.setUnidadMedida("kg");
                p1.setStockActual(10.5);
                p1.setStockMinimo(2.0);    // 👈 Agregá esta también por las dudas
                
                repository.save(p1);
                System.out.println("✅ Datos de prueba cargados con éxito");
            }
        };
    }
    }