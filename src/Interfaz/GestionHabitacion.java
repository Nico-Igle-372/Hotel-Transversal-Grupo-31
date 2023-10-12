package Interfaz;

import AccesoADatos.ABMHabitacion;
import Entidades.Habitacion;
import Entidades.TipoHabitacion;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionHabitacion extends javax.swing.JInternalFrame {

    ABMHabitacion ABMHabi = new ABMHabitacion();

    private final DefaultTableModel modeloT = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int colum) {
            return false;
        }
    };

    public GestionHabitacion() {
        initComponents();
        labelPrecio.setVisible(false);
        jTextoPrecio.setVisible(false);
        botonCambiarPrecio.setVisible(false);
        armarCabecera();
        cargarTipoH();
        limpiarT();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        labelHabitacion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        TextoNumero = new javax.swing.JTextField();
        ComboTipoH = new javax.swing.JComboBox<>();
        TextoEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHabitacion = new javax.swing.JTable();
        BotonBuscar = new javax.swing.JButton();
        BotonAltaBaja = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        botonPrecio = new javax.swing.JButton();
        labelPrecio = new javax.swing.JLabel();
        jTextoPrecio = new javax.swing.JTextField();
        botonCambiarPrecio = new javax.swing.JButton();

        titulo.setText("Gestión Habitación");

        labelHabitacion.setText("N° Habitación");

        jLabel3.setText("Tipo de Habitación");

        labelEstado.setText("Estado");

        ComboTipoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoHActionPerformed(evt);
            }
        });

        TablaHabitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaHabitacion);

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonAltaBaja.setText("Alta/baja");

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        botonPrecio.setText("Cambiar Precio");
        botonPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrecioActionPerformed(evt);
            }
        });

        labelPrecio.setText("Precio");

        botonCambiarPrecio.setText("Cambiar Precio");
        botonCambiarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEstado)
                            .addComponent(jLabel3)
                            .addComponent(labelHabitacion))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboTipoH, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(TextoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotonBuscar))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(TextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(85, 85, 85)
                                    .addComponent(BotonAltaBaja))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonGuardar)
                        .addGap(28, 28, 28)
                        .addComponent(BotonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(botonPrecio)
                        .addGap(54, 54, 54)
                        .addComponent(BotonSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelPrecio)
                        .addGap(85, 85, 85)
                        .addComponent(jTextoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCambiarPrecio)
                        .addGap(21, 21, 21)))
                .addGap(0, 17, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHabitacion)
                    .addComponent(TextoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscar))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboTipoH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstado)
                    .addComponent(TextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAltaBaja))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrecio)
                    .addComponent(jTextoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCambiarPrecio))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonModificar)
                            .addComponent(BotonGuardar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonPrecio)
                            .addComponent(BotonSalir))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        try {
            limpiarT();
            Habitacion habi = ABMHabi.buscarHabitacion(Integer.parseInt(TextoNumero.getText()));
            if (habi.getidHabitacion() != 0) {
                ComboTipoH.setSelectedItem(habi.gettipoHabitacion().getNombre());
                TextoEstado.setText(habi.isEstado() ? "Ocupada" : "Libre");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la habitación");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un número valido");
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void ComboTipoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoHActionPerformed
        TipoHabitacion tH = ABMHabi.buscarTipoHabitacionPorNombre(ComboTipoH.getSelectedItem() + "");
        limpiarT();
        cargarDatos(tH);
    }//GEN-LAST:event_ComboTipoHActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        Principal.contador--;
        dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        Habitacion h = new Habitacion();
        try {
            if (ABMHabi.buscarHabitacion(Integer.parseInt(TextoNumero.getText())).getidHabitacion() == 0) {
                h.setIdHabitacion(Integer.parseInt(TextoNumero.getText()));
                h.settipoHabitacion(ABMHabi.buscarTipoHabitacionPorNombre(ComboTipoH.getSelectedItem() + ""));
                h.setEstado(false);
                ABMHabi.crearHabitacion(h);
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe una habitacion con ese número");
            }
        } catch (NullPointerException | NumberFormatException ex) {

        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void botonPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrecioActionPerformed
        if (titulo.getText().equals("Gestión Habitación")) {
            labelPrecio.setVisible(true);
            jTextoPrecio.setVisible(true);
            botonCambiarPrecio.setVisible(true);
            BotonGuardar.setVisible(false);
            BotonModificar.setVisible(false);
            BotonBuscar.setVisible(false);
            BotonAltaBaja.setVisible(false);
            TextoEstado.setVisible(false);
            TextoNumero.setVisible(false);
            labelEstado.setVisible(false);
            labelHabitacion.setVisible(false);
            titulo.setText("Gestión Precio");
            botonPrecio.setText("Modificar Habitación");
        } else {
            labelPrecio.setVisible(false);
            jTextoPrecio.setVisible(false);
            botonCambiarPrecio.setVisible(false);
            BotonGuardar.setVisible(true);
            BotonModificar.setVisible(true);
            BotonBuscar.setVisible(true);
            BotonAltaBaja.setVisible(true);
            TextoEstado.setVisible(true);
            TextoNumero.setVisible(true);
            labelEstado.setVisible(true);
            labelHabitacion.setVisible(true);
            titulo.setText("Gestión Habitación");
            botonPrecio.setText("Cambiar Precio");
        }
    }//GEN-LAST:event_botonPrecioActionPerformed

    private void botonCambiarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarPrecioActionPerformed
        try {
            double precio = Double.parseDouble(jTextoPrecio.getText());
            TipoHabitacion tipoH = ABMHabi.buscarTipoHabitacionPorNombre((String) ComboTipoH.getSelectedItem());
            int idTH = tipoH.getIdTipo();
            ABMHabi.cambiarPrecio(idTH, precio);
            jTextoPrecio.setText("");
            TablaHabitacion.setValueAt(precio, 0, 4);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores numericos");
        }
    }//GEN-LAST:event_botonCambiarPrecioActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAltaBaja;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JComboBox<String> ComboTipoH;
    private javax.swing.JTable TablaHabitacion;
    private javax.swing.JTextField TextoEstado;
    private javax.swing.JTextField TextoNumero;
    private javax.swing.JButton botonCambiarPrecio;
    private javax.swing.JButton botonPrecio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextoPrecio;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelHabitacion;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void cargarTipoH() {
        List<TipoHabitacion> tipoHabitaciones = ABMHabi.listarTipoH();
        for (TipoHabitacion tipo : tipoHabitaciones) {
            ComboTipoH.addItem(tipo.getNombre());
        }
    }

    private void armarCabecera() {
        modeloT.addColumn("Nombre");
        modeloT.addColumn("Capacidad");
        modeloT.addColumn("Cantidad de Camas");
        modeloT.addColumn("Tipo de Camas");
        modeloT.addColumn("Precio Por Noche");
        TablaHabitacion.setModel(modeloT);
    }

    private void limpiarT() {
        int tamaño = TablaHabitacion.getRowCount();
        if (tamaño != -1) {
            for (int i = tamaño - 1; i >= 0; i--) {
                modeloT.removeRow(i);
            }
        }
    }

    public void cargarDatos(TipoHabitacion tH) {
        modeloT.addRow(new Object[]{tH.getNombre(), tH.getCapacidad(), tH.getCantCamas(), tH.getTipoCamas(), tH.getPrecioNoche()});
    }

}
