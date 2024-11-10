package com.example.maquinaexpendedora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class HelloController {
    @FXML
    private Label totalDinero;
    @FXML
    private Label totalDineroDos;
    @FXML
    private Label estadoCompra;

    private double totalIngresado = 0.0;
    private double precioProducto = 0.0;

    // Métodos para agregar dinero
    @FXML
    public void adduncent(ActionEvent event) {
        totalIngresado += 0.01;
        actualizarEstadoCompra();
    }

    @FXML
    public void adddiezcent(ActionEvent event) {
        totalIngresado += 0.10;
        actualizarEstadoCompra();
    }

    @FXML
    public void addveintecent(ActionEvent event) {
        totalIngresado += 0.20;
        actualizarEstadoCompra();
    }

    @FXML
    public void adduno(ActionEvent event) {
        totalIngresado += 1.00;
        actualizarEstadoCompra();
    }

    @FXML
    public void adddos(ActionEvent event) {
        totalIngresado += 2.00;
        actualizarEstadoCompra();
    }

    @FXML
    public void adddoscent(ActionEvent event) {
        totalIngresado += 0.02;
        actualizarEstadoCompra();
    }

    @FXML
    public void addcincuentacent(ActionEvent event) {
        totalIngresado += 0.50;
        actualizarEstadoCompra();
    }

    @FXML
    public void addcincocent(ActionEvent event) {
        totalIngresado += 0.05;
        actualizarEstadoCompra();
    }

    // Métodos para manejar compras
    @FXML
    public void compraHecha(ActionEvent event) {
        if (totalIngresado >= precioProducto) {
            double cambio = totalIngresado - precioProducto;
            estadoCompra.setText("Compra realizada. Cambio: " + cambio + "€");
            totalIngresado = 0.0; // Resetear el total ingresado
            precioProducto = 0.0; // Resetear el precio del producto
            actualizarEstadoCompra();
        } else {
            estadoCompra.setText("No hay suficiente dinero.");
        }
    }


    @FXML
    public void compraCancelada(ActionEvent event) {
        estadoCompra.setText("Compra cancelada.");
        totalIngresado = 0.0; // Resetear el total ingresado
        actualizarEstadoCompra();
    }

    // Métodos para seleccionar productos
    @FXML
    public void compragoma(ActionEvent event) {
        precioProducto = 1.50;  // Precio del producto "Goma"
        totalDineroDos.setText("1,50€");  // Mostrar el precio del producto
        estadoCompra.setText("Producto seleccionado: Goma.");
    }

    @FXML
    public void compralapiz(ActionEvent event) {
        precioProducto = 0.80;  // Precio del producto "Lápiz"
        totalDineroDos.setText("0,80€");
        estadoCompra.setText("Producto seleccionado: Lápiz.");
    }

    @FXML
    public void comprasacapuntas(ActionEvent event) {
        precioProducto = 1.00;  // Precio del producto "Sacapuntas"
        totalDineroDos.setText("1,00€");
        estadoCompra.setText("Producto seleccionado: Sacapuntas.");
    }

    @FXML
    public void compraboli(ActionEvent event) {
        precioProducto = 2.00;  // Precio del producto "Bolígrafo"
        totalDineroDos.setText("2,00€");
        estadoCompra.setText("Producto seleccionado: Bolígrafo.");
    }

    @FXML
    public void compratipex(ActionEvent event) {
        precioProducto = 1.20;  // Precio del producto "Tipex"
        totalDineroDos.setText("1,20€");
        estadoCompra.setText("Producto seleccionado: Tipex.");
    }

    @FXML
    public void compraagua(ActionEvent event) {
        precioProducto = 1.00;  // Precio del producto "Agua"
        totalDineroDos.setText("1,00€");
        estadoCompra.setText("Producto seleccionado: Agua.");
    }

    // Método para actualizar el estado de la compra
    private void actualizarEstadoCompra() {
        totalDinero.setText(String.format("%.2f€", totalIngresado));
    }
}


