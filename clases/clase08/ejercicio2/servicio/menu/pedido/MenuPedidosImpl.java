package ejercicio2.servicio.menu.pedido;

import ejercicio2.Main;
import ejercicio2.domain.Pedido;
import ejercicio2.entrada.InputConsoleService;
import ejercicio2.enums.EstadoPedido;
import ejercicio2.servicio.pedido.PedidoServicio;

import java.util.List;

public class MenuPedidosImpl implements MenuPedidos {
    public static final String MENSAJE_SELECCIONAR_TIPO_PEDIDO = "Selecciona porfavor el tipo de pedido";

    private PedidoServicio pedidoServicio;

    public MenuPedidosImpl(PedidoServicio pedidoServicio) {
        this.pedidoServicio = pedidoServicio;
    }

    @Override
    public void mostrarPedidos() {
        System.out.println(MENSAJE_SELECCIONAR_TIPO_PEDIDO);
        System.out.println("TIPO DE PEDIDOS : " + EstadoPedido.PENDIENTE + " - " + EstadoPedido.PAGADO);
        String tipoPedido = InputConsoleService.getScanner().next();

        EstadoPedido tipoPedidoSeleccionado = getPedidoSeleccionado(tipoPedido.toUpperCase().replace(" ", ""));

        List<Pedido> pedidos = pedidoServicio.obtenerPedidos(tipoPedidoSeleccionado, Main.getCarritoEnCurso().getCliente());

        if (!pedidos.isEmpty()) {
            for (Pedido pedido : pedidos) {
                System.out.println(pedido.toString());
            }
        } else {
            System.out.println("No existen pedidos para el tipo ingresado");
        }
    }

    private EstadoPedido getPedidoSeleccionado(String tipoPedido) {

        return switch (EstadoPedido.valueOf(tipoPedido)) {
            case PENDIENTE -> EstadoPedido.PENDIENTE;
            case PAGADO -> EstadoPedido.PAGADO;
            default -> null;
        };

    }
}
