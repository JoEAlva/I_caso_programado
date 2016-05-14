/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_MantenimientoCursos;
import javax.swing.JOptionPane;

/**
 *
 * @author tecnologiamultimedia
 */
public class FRM_MantenimientoCursos extends javax.swing.JFrame {

    //Se declaran las variables
    String sistemaInfo = "";
    
    //Referencias
    public Controlador_FRM_MantenimientoCursos controlador;
    
    public FRM_MantenimientoCursos(String sistemaInfo) {
        initComponents();
        this.sistemaInfo = sistemaInfo;
        controlador = new Controlador_FRM_MantenimientoCursos(this, sistemaInfo);
        this.gUI_Botones1.agregarEventos(controlador);
    }
    public String[] devolverInformacion()
    {
        return this.gUI_InformacionCursos1.devolverInformacion();
    }
    public String devolverSigla()
    {
        return this.gUI_InformacionCursos1.devolverSigla();
    }
    public void mostrarInformacion(String arreglo[])
    {
        this.gUI_InformacionCursos1.mostrarInformacion(arreglo);
    }
    public void mostrarMensaje(String mensaje) 
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void limpiarCampos()
    {
        this.gUI_InformacionCursos1.limpiarCampos();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_InformacionCursos1 = new Vista.GUI_InformacionCursos();
        gUI_Botones1 = new Vista.GUI_Botones2();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gUI_InformacionCursos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gUI_InformacionCursos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        controlador.metodos.escribirInformacionArchivo();
    }//GEN-LAST:event_formComponentHidden

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_Botones2 gUI_Botones1;
    private Vista.GUI_InformacionCursos gUI_InformacionCursos1;
    // End of variables declaration//GEN-END:variables
}
