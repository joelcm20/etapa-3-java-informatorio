package ejercicios.caballero_java_jedi;

import java.util.HashMap;
import java.util.Scanner;

public class GestionInventario {
    HashMap<String, Producto> productos = new HashMap<>();

    public static void main(String[] args) {
        GestionInventario instancia = new GestionInventario();
        Scanner input = new Scanner(System.in);

        boolean continuearEjecucion;
        do {
            instancia.mostrarMenu();
            continuearEjecucion = instancia.ejecutarOpcion(input);
        } while (continuearEjecucion);
        input.close();
    }

    public void mostrarMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("[ ---------- GESTION INVENTARIO ---------- ]\n");
        menu.append("1. Listar productos.\n");
        menu.append("2. Agregar productos.\n");
        menu.append("3. Buscar productos.\n");
        menu.append("4. Actualizar producto.\n");
        menu.append("0. Salir.\n");
        System.out.println(menu);
    }

    public boolean ejecutarOpcion(Scanner input) {
        System.out.print("Seleccionar numero de opcion > ");
        String opcion = input.nextLine();

        boolean continuarEjecucion = Boolean.TRUE;
        switch (opcion) {
            case "1":
                this.listarProductos();
                break;
            case "2":
                this.agregarProducto(input);
                break;
            case "3":
                this.buscarProducto(input);
                break;
            case "4":
                this.actualizarProducto(input);
                break;
            case "0":
                continuarEjecucion = Boolean.FALSE;
                break;
            default:
                System.out.println("Opcion invalida.\n");
                ejecutarOpcion(input);
                break;
        }
        return continuarEjecucion;
    }

    private void listarProductos() {
        if (this.productos.isEmpty()) {
            System.out.printf("No hay productos.\n\n");
            return;
        }
        StringBuilder listaProductos = new StringBuilder();
        for (String key : this.productos.keySet()) {
            Producto p = this.productos.get(key);
            listaProductos.append(String.format("- ID[%s] %s: %s USD, %s stock.\n", p.getId(), p.getNombre(), p.getPrecio(), p.getStock()));
        }
        System.out.printf("%s\n\n", listaProductos);
    }

    private void agregarProducto(Scanner input) {
        Producto nuevoProducto = new Producto();
        nuevoProducto.setId(this.productos.size());

        System.out.print("Nombre del producto > ");
        nuevoProducto.setNombre(input.nextLine());
        System.out.print("Precio del producto > ");
        nuevoProducto.setPrecio(Float.parseFloat(input.nextLine()));
        System.out.print("Stock del producto > ");
        nuevoProducto.setStock(Integer.parseInt(input.nextLine()));

        this.productos.put(nuevoProducto.getNombre(), nuevoProducto);
        System.out.printf("Producto %s agregado.\n\n", nuevoProducto.getNombre());
    }

    private void buscarProducto(Scanner input) {
        StringBuilder productosEncontrados = new StringBuilder();
        System.out.print("Nombre del producto > ");
        String buscarProducto = input.nextLine();

        for (Producto p : this.productos.values()) {
            if (p.getNombre().contains(buscarProducto)) {
                productosEncontrados.append(String.format("- %s: %s USD, %s stock.\n", p.getNombre(), p.getPrecio(), p.getStock()));
            }
        }
        if (productosEncontrados.isEmpty()) {
            System.out.printf("Sin resultado para la busqueda \"%s\".\n\n", buscarProducto);
            return;
        }
        System.out.printf("%s\n\n", productosEncontrados);
    }

    private void actualizarProducto(Scanner input) {
        System.out.print("ID del producto > ");
        int idProducto;
        try {
            idProducto = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.printf("Asegurate de ingresar un numero.\n\n");
            return;
        }

        Producto producto = null;
        for (Producto p : this.productos.values()) {
            if (p.getId() == idProducto) {
                producto = p;
            }
        }
        if (producto == null) {
            System.out.println("Producto no encontrado.\n");
            return;
        }

        System.out.print("Nombre (dejar vacio para no cambiar) > ");
        String nombre = input.nextLine();
        if (!nombre.isEmpty()) producto.setNombre(nombre);

        System.out.print("Precio (dejar vacio para no cambiar) > ");
        String precio = input.nextLine();
        if (!precio.isEmpty()) producto.setPrecio(Float.parseFloat(precio));

        System.out.print("Stock (dejar vacio para no cambiar) > ");
        String stock = input.nextLine();
        if (!stock.isEmpty()) producto.setStock(Integer.parseInt(stock));

        System.out.printf("Producto %s actualizado.\n\n", producto.getNombre());
    }
}

class Producto {
    private String nombre;
    private float precio;
    private int stock;
    private int id;

    public Producto() {
    }

    public Producto(int id, String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}