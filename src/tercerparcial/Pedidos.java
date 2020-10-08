//
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercerparcial;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keiinerp
 */
public class Pedidos extends javax.swing.JFrame {

    /**
     * Creates new form Pedidos
     */
    ArrayList<Producto> listaProductos;
    ArrayList<Producto> listaProductosCompra;
    ArrayList<Orden> listaFacturas;
    String nombreCliente = Login.nombreCliente, identificacionCliente = Login.identificacionCliente;

    public Pedidos() {
        initComponents();
        listaProductos = Archivos.leerEnTexto();
        listaProductosCompra = new ArrayList<>();
        listaFacturas = Archivos.leerOrden();
        llenarTabla();
    }
    public long valorUnitario;
    public long valorTotal;

    private void llenarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"CODIGO", "NOMBRE", "CANTIDAD", "VALOR A PAGAR"};
        for (int i = 0; i < columnas.length; i++) {
            modelo.setColumnIdentifiers(columnas);
        }
        for (Producto producto : listaProductosCompra) {
            String[] filas = {producto.getCodigo(), producto.getNombre(), String.valueOf(producto.getCantidad()), totalCompraLabel.getText()};
            modelo.addRow(filas);
        }
        compraTabla.setModel(modelo);
    }

    public void generarOrden() {
        /*     String nombre, codigo;
         Producto producto = new Producto();
         Orden orden = new Orden();
        int cantidad = 0, numeroOrden = 000000;
        nombre = nombreLabel.getText();
        codigo = codigoProductoText.getText();
        int cantidadRestada;
         for (int i = 0; i < listaProductos.size(); i++) {
                        Producto p = listaProductos.get(i);
                        if (p.getCodigo().equals(codigo) || p.getNombre().equals(nombre)) {
                            cantidadRestada = producto.getCantidad() - cantidad;
                            p.setCantidad(cantidadRestada);
                            listaProductos.set(i, p);
                            listaProductosCompra.add(p);
                            orden.setListaProductos(listaProductosCompra);
                            listaFacturas.add(orden);
                            Archivos.escribirEnTexto(listaProductos);
                            valorTotal = (valorTotal) + (producto.getPrecio() * Long.valueOf(cantidad));
                            disponiblesLabel.setText(String.valueOf(producto.getCantidad()));
                            totalCompraLabel.setText(String.valueOf(valorTotal));
                        }
                        }
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        producirOrdenBoton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        codigoProductoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cantidadText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        disponiblesLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        precioUnitarioLabel = new javax.swing.JLabel();
        encontrarBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        totalCompraLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tipoPago = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        compraTabla = new javax.swing.JTable();
        añadirProductoBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        producirOrdenBoton.setText("Producir Orden");
        producirOrdenBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producirOrdenBotonActionPerformed(evt);
            }
        });

        jLabel2.setText("Código del producto o nombre el producto");

        codigoProductoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoProductoTextActionPerformed(evt);
            }
        });
        codigoProductoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigoProductoTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoProductoTextKeyTyped(evt);
            }
        });

        jLabel3.setText("Cuántos desea llevar:");

        jLabel4.setText("Disponibles:");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Codigo:");

        jLabel7.setText("Precio unitario");

        encontrarBoton.setText("Encontrar");
        encontrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encontrarBotonActionPerformed(evt);
            }
        });

        jLabel1.setText("Total de la compra");

        jLabel8.setText("Tipo de pago");

        tipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "CREDITO", "CONTADO" }));
        tipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPagoActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(compraTabla);

        añadirProductoBoton.setText("Añadir Producto");
        añadirProductoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirProductoBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(22, 22, 22)
                                        .addComponent(totalCompraLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(precioUnitarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(añadirProductoBoton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(producirOrdenBoton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6))
                                                .addGap(19, 19, 19)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(nombreLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                                    .addComponent(disponiblesLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(codigoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(codigoProductoText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(encontrarBoton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoProductoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encontrarBoton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(disponiblesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(codigoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(precioUnitarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(totalCompraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(producirOrdenBoton)
                            .addComponent(añadirProductoBoton)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoProductoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoProductoTextActionPerformed

    }//GEN-LAST:event_codigoProductoTextActionPerformed

    private void codigoProductoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoProductoTextKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoProductoTextKeyTyped

    private void codigoProductoTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoProductoTextKeyPressed
        if (evt.getKeyCode() == 10) {
            encontrarProducto();
        }
    }//GEN-LAST:event_codigoProductoTextKeyPressed

    private void producirOrdenBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producirOrdenBotonActionPerformed
        generarOrden();
    }//GEN-LAST:event_producirOrdenBotonActionPerformed

    private void encontrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encontrarBotonActionPerformed
        encontrarProducto();
    }//GEN-LAST:event_encontrarBotonActionPerformed

    private void tipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPagoActionPerformed

    }//GEN-LAST:event_tipoPagoActionPerformed

    private void añadirProductoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirProductoBotonActionPerformed
        String nombre, codigo;
        int cantidad = 0;
        nombre = nombreLabel.getText();
        codigo = codigoProductoText.getText();
        try{
            cantidad = Integer.valueOf(cantidadText.getText());
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida");
        }
            
        /*  String nombre, codigo;
        int cantidad = 0, numeroOrden = 000000;
        nombre = nombreLabel.getText();
        codigo = codigoProductoText.getText();
        int cantidadRestada;
        try {
            cantidad = Integer.valueOf(cantidadText.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida " + e.getMessage());
        }
        encontrarProducto();
        for (Producto producto : listaProductos) {
            if ((producto.getNombre().equals(nombre)) || (producto.getCodigo().equals(codigo))) {
                disponiblesLabel.setText(String.valueOf(producto.getCantidad()));
                if (cantidad > producto.getCantidad()) {
                    JOptionPane.showMessageDialog(this, "No hay suficientes de este producto para concretar la venta");
                }
                if (tipoPago.getSelectedItem().equals("CREDITO") && Login.logueado != 1) {
                    int respuestaDialogo = JOptionPane.showConfirmDialog(this, "Para sacar algo a cuotas, necesita estar registrado. Desea registrarse");
                    if (respuestaDialogo == JOptionPane.OK_OPTION) {
                        Login loginVentana = new Login();
                        loginVentana.setVisible(true);
                    } else {
                        tipoPago.setSelectedItem("CONTADO");
                    }
                } else {
                    Orden orden = new Orden();
                    orden.setNombre(nombreCliente);
                    orden.setIdentificacion(identificacionCliente);
                    orden.setNumeroOrden(numeroOrden + 1);
                    orden.setTipo((String) tipoPago.getSelectedItem());
                    orden.setValorTotal(valorTotal);
                    llenarTabla();
                }
            }
        }*/
    }//GEN-LAST:event_añadirProductoBotonActionPerformed
    public void encontrarProducto() {
        for (Producto producto : listaProductos) {
            if ((producto.getNombre().equals(codigoProductoText.getText())) || (producto.getCodigo().equals(codigoProductoText.getText()))) {
                disponiblesLabel.setText(String.valueOf(producto.getCantidad()));
                nombreLabel.setText(producto.getNombre());
                codigoLabel.setText(String.valueOf(producto.getCodigo()));
                valorUnitario = producto.getPrecio();
                System.out.println(valorUnitario);
                precioUnitarioLabel.setText(String.valueOf(valorUnitario));
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirProductoBoton;
    private javax.swing.JTextField cantidadText;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoProductoText;
    private javax.swing.JTable compraTabla;
    private javax.swing.JLabel disponiblesLabel;
    private javax.swing.JButton encontrarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel precioUnitarioLabel;
    private javax.swing.JButton producirOrdenBoton;
    private javax.swing.JComboBox<String> tipoPago;
    private javax.swing.JLabel totalCompraLabel;
    // End of variables declaration//GEN-END:variables
}
