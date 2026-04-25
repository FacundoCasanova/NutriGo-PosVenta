package com.nutrigo.views;

import com.nutrigo.model.Producto;
import com.nutrigo.repository.ProductoRepository;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

    public MainView(ProductoRepository repository) {
        add(new H1("NutriGo - Gestión de Inventario"));
        
        Grid<Producto> grid = new Grid<>(Producto.class);
        grid.setItems(repository.findAll()); // Esto trae los datos que cargamos arriba
        grid.setColumns("nombre", "categoria", "precioVenta", "unidadMedida", "stockActual");
        
        add(grid);
    }
}