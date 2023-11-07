package ejercicio2.servicio.menu.compra;

import ejercicio2.domain.Producto;

import java.util.Optional;

public interface MenuCompra {
    Optional<Producto> seleccionarProducto();

    int seleccionarCantidad();

    void mostarProductos();
}
