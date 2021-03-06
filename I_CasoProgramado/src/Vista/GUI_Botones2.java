/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_MantenimientoCursos;
import Controlador.Controlador_FRM_MantenimientoEstudiantes;
import Controlador.Controlador_FRM_Matricula;
import Controlador.Controlador_FRM_MantenimientoUsuarios;
/**
 *
 * @author tecnologiamultimedia
 */
public class GUI_Botones2 extends javax.swing.JPanel {

    /**
     * Creates new form GUI_Botones2
     */
    Controlador_FRM_MantenimientoEstudiantes controlador;
    Controlador_FRM_MantenimientoCursos controladorCursos;
    Controlador_FRM_Matricula controladorMatricula;
    Controlador_FRM_MantenimientoUsuarios controlador_FRM_MantenimientoUsuarios;
    
  
 
    public GUI_Botones2() {
        initComponents();
    }
    public void agregarEventos(Controlador_FRM_MantenimientoEstudiantes controlador)
    {
        this.controlador=controlador;
        this.btn_Consultar.addActionListener(controlador);
        this.btn_Agregar.addActionListener(controlador);
        this.btn_Modificar.addActionListener(controlador);
        this.btn_Eliminar.addActionListener(controlador);
    }
    public void agregarEventos(Controlador_FRM_MantenimientoCursos controlador)
    {
        this.controladorCursos=controlador;
        this.btn_Consultar.addActionListener(controlador);
        this.btn_Agregar.addActionListener(controlador);
        this.btn_Modificar.addActionListener(controlador);
        this.btn_Eliminar.addActionListener(controlador);
    }
    public void agregarEventos(Controlador_FRM_Matricula controlador)
    {
        this.controladorMatricula=controlador;
        this.btn_Consultar.addActionListener(controlador);
        this.btn_Agregar.addActionListener(controlador);
        this.btn_Modificar.addActionListener(controlador);
        this.btn_Eliminar.addActionListener(controlador);
    }
    public void agregarEventos(Controlador_FRM_MantenimientoUsuarios controlador_FRM_MantenimientoUsuarios)
    {
        this.controlador_FRM_MantenimientoUsuarios = this.controlador_FRM_MantenimientoUsuarios;
        this.btn_Agregar.addActionListener(controlador_FRM_MantenimientoUsuarios);
        this.btn_Consultar.addActionListener(controlador_FRM_MantenimientoUsuarios);
        this.btn_Modificar.addActionListener(controlador_FRM_MantenimientoUsuarios);
        this.btn_Eliminar.addActionListener(controlador_FRM_MantenimientoUsuarios);
        
    }
    public void estadoInicial()
    {
        this.btn_Agregar.setEnabled(false);
        this.btn_Eliminar.setEnabled(false);
        this.btn_Modificar.setEnabled(false);
    }
    public void habilitarAgregar()
    {
        this.btn_Agregar.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Consultar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        btn_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_Consultar.setActionCommand("Consultar");

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btn_Agregar.setActionCommand("Agregar");

        btn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        btn_Modificar.setActionCommand("Modificar");

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btn_Eliminar.setActionCommand("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_Consultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Eliminar)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Consultar)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Eliminar))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    // End of variables declaration//GEN-END:variables
}
