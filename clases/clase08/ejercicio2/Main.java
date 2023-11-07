package ejercicio2;

import ejercicio2.basededatos.BdProductos;
import ejercicio2.domain.Carrito;
import ejercicio2.domain.Cliente;
import ejercicio2.domain.Producto;
import ejercicio2.entrada.InputConsoleService;
import ejercicio2.servicio.carrito.CarritoServicio;
import ejercicio2.servicio.carrito.CarritoServicioImpl;
import ejercicio2.servicio.menu.compra.MenuCompra;
import ejercicio2.servicio.menu.compra.MenuCompraImpl;
import ejercicio2.servicio.menu.pedido.MenuPedidos;
import ejercicio2.servicio.menu.pedido.MenuPedidosImpl;
import ejercicio2.servicio.menu.principal.MenuPrincipal;
import ejercicio2.servicio.menu.principal.MenuPrincipalImpl;
import ejercicio2.servicio.menu.producto.MenuProducto;
import ejercicio2.servicio.menu.producto.MenuProductoImpl;
import ejercicio2.servicio.pedido.PedidoServicioImpl;
import ejercicio2.servicio.producto.ProductoServicioImpl;
import ejercicio2.servicio.stock.StockServicioImpl;


import java.util.HashMap;
import java.util.Optional;

public class Main {

    private static Carrito carritoEnCurso;

    public static void main(String[] args) {
        BdProductos.initProducts();
        //Creacion del cliente
        createClient();
        //Creacion de scanner
        InputConsoleService.createScanner();

        CarritoServicio carritoServicio = new CarritoServicioImpl(new StockServicioImpl(), new PedidoServicioImpl());
        MenuCompra menuCompra = new MenuCompraImpl(new ProductoServicioImpl());
        MenuPedidos menuPedidos = new MenuPedidosImpl(new PedidoServicioImpl());
        MenuProducto menuProducto = new MenuProductoImpl();

        MenuPrincipal menuPrincipal = new MenuPrincipalImpl(carritoServicio, menuCompra, menuPedidos, menuProducto);
        menuPrincipal.iniciar();

        //Cerrar el scanner
        InputConsoleService.closeScanner();
    }

    public static Carrito getCarritoEnCurso() {
        return carritoEnCurso;
    }

    public static void setCarritoEnCurso(Carrito carritoEnCurso) {
        carritoEnCurso.setId(1L);
        carritoEnCurso.setPedido(null);
        carritoEnCurso.setProducts(new HashMap<>());

        Main.carritoEnCurso = carritoEnCurso;
    }

    private static void createClient() {
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNombre("Ian");
        cliente.setDireccion("Calle falsa 123");
        cliente.setEmail("CorreoFalso@gmail.com");
        cliente.setCarrito(new Carrito());
        setCarritoEnCurso(cliente.getCarrito());
        getCarritoEnCurso().setCliente(cliente);
    }

}