package ejercicio2.servicio.carrito;


import ejercicio2.domain.Producto;

public interface CarritoServicio {
    void addProduct(Producto prod, int qty);

    boolean cerrarCarrito();
}
