/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberosgrupo47.Vistas;

import bomberosgrupo47.accesoADatos.BomberoData;
import bomberosgrupo47.accesoADatos.BrigadaData;
import bomberosgrupo47.accesoADatos.CuartelData;
import bomberosgrupo47.entidades.Bombero;
import bomberosgrupo47.entidades.Brigada;
import bomberosgrupo47.entidades.Cuartel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class ConsultaDeBrigadasPorCuartel extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo= new DefaultTableModel (){

    public boolean isCellEditable (int f, int c) {
    
        return false;
    }
    };
    
    /**
     * Creates new form ConsultaDeBrigadasPorCuartel
     */
    public ConsultaDeBrigadasPorCuartel() {
        initComponents();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtcodcuartel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbrigada = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jbBuscarCuartel = new javax.swing.JButton();

        jLabel1.setText("Consulta de Brigadas por Cuartel");

        jLabel2.setText("Ingrese el \"Codigo\" del \"Cuartel\" a Consultar.");

        jLabel3.setText("Codigo:");

        jtbrigada.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtbrigada);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver-al-menu-principal.jpeg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jbBuscarCuartel.setText("BUSCAR");
        jbBuscarCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarCuartelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtcodcuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jbBuscarCuartel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtcodcuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscarCuartel))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbBuscarCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarCuartelActionPerformed
        // BuscarCUARTEL (para ver las Brigadas):
        
        //con el ActionPerformed
        
         try{
            int code=Integer.parseInt(jtcodcuartel.getText());
            BrigadaData buscar=new BrigadaData();
            Cuartel cua=new Cuartel();
            
            
            ArrayList<Brigada> list = new ArrayList<>();
            list=buscar.buscarBrigadaPorCuartel2(code);
            eliminarLimpiar();
        for (int i = 0; i < list.size(); i++) {
                 

                 
                 
                    modelo.addRow(new Object[]{list.get(i).getCodBrigada(),list.get(i).getNombreBr(),list.get(i).getEspecialidad(),list.get(i).isLibre(),code});
                    
                 
             
             }
            
        }catch (NumberFormatException nf){
            JOptionPane.showMessageDialog(this, "Ingrese un Codigo Valido");
        }
    }//GEN-LAST:event_jbBuscarCuartelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarCuartel;
    private javax.swing.JTable jtbrigada;
    private javax.swing.JTextField jtcodcuartel;
    // End of variables declaration//GEN-END:variables

private void armarCabecera() {
        modelo.addColumn("CodBrigada");
        modelo.addColumn("NombreBr");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Estado");
        modelo.addColumn("NroCuartel");
        jtbrigada.setModel(modelo);
    }
    public void eliminarLimpiar(){
        DefaultTableModel tb = (DefaultTableModel) jtbrigada.getModel();
        int a = jtbrigada.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
        tb.removeRow(tb.getRowCount()-1);
        }
        
    }
}
