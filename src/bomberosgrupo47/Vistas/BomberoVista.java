/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberosgrupo47.Vistas;

import bomberosgrupo47.accesoADatos.BomberoData;
import bomberosgrupo47.accesoADatos.BrigadaData;
import bomberosgrupo47.entidades.Bombero;
import bomberosgrupo47.entidades.Brigada;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import javax.swing.JOptionPane;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDateChooser;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author usuario
 */
public class BomberoVista extends javax.swing.JInternalFrame {
//    A, B, AB, O, A-
    private String[] Sanguineo= {"A","B","AB","O","A-"};
    private BomberoData bomdata = new BomberoData ();
    private Bombero bomberoActual=null;
    
    
    
    /**
     * Creates new form BomberoVista
     */
    public BomberoVista() {
        initComponents();
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jDesktopPane2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/fondoBomberovista.png"));
        Image gen= icono.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(gen,0,0,getWidth(),getHeight(),this);

            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtidbombero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtdni = new javax.swing.JTextField();
        jtnombreapellido = new javax.swing.JTextField();
        jtnrocelular = new javax.swing.JTextField();
        jtcodbrigada = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        jDesktopPane2 = new javax.swing.JDesktopPane(){

        };
        jButton6 = new javax.swing.JButton();
        jcSangre = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1300, 640));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("idBombero");

        jLabel2.setText("Dni");

        jLabel3.setText("Nombre & Apellido");

        jLabel4.setText("Fecha Nacimiento");

        jLabel5.setText("Nro Celular");

        jLabel6.setText("Codigo de Brigada");

        jtidbombero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtidbomberoActionPerformed(evt);
            }
        });

        jLabel7.setText("Grupo Sanguineo:");

        jtcodbrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcodbrigadaActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver-al-menu-principal.jpeg"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Nuevo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Alta, Baja y Modificacion de Bomberos");

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        jButton6.setText("lista bomberos x brigada");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jcSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O", "A-" }));

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtidbombero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtdni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtnombreapellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtnrocelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtcodbrigada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcSangre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(39, 39, 39)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(jtnombreapellido, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jButton5)
                                                                    .addComponent(jtcodbrigada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(43, 43, 43)
                                                                .addComponent(jButton3)))
                                                        .addComponent(jtnrocelular, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(47, 47, 47))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jcSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(82, 82, 82)))
                                        .addComponent(jButton4))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(88, 88, 88)
                                .addComponent(jtidbombero, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(179, 179, 179)
                                .addComponent(jButton2))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(60, 60, 60))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8)
                    .addContainerGap(998, Short.MAX_VALUE)))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtidbombero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jButton6))
                        .addGap(80, 80, 80)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtnombreapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtnrocelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jtcodbrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jcSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8)
                    .addContainerGap(609, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtidbomberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtidbomberoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtidbomberoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // limpiar campos de carga de Bomberos
        jDate.setDate(null);
        jtidbombero.setText("");
        jtdni.setText("");
        jtnombreapellido.setText("");
       
        jtnrocelular.setText("");
        jtcodbrigada.setText("");
       
        bomberoActual = null;
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // guardar o actualizar datos de los Bomberos
        
        try{
            
           
            //int idBombero = 0;
            
            
            int dni=Integer.parseInt(jtdni.getText());
            String nomape=jtnombreapellido.getText();
            String sangre=jcSangre.getSelectedItem()+"";
            java.util.Date sfecha = jDate.getDate();
            LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            //Date date = Date.from(sin.getFechaSiniestro().atStartOfDay(ZoneId.systemDefault()).toInstant());
           
            
             if (fechaNac.isAfter(LocalDate.now().minusYears(18)) ) {
                              JOptionPane.showMessageDialog(this, " no se permite registrar menores de 18 años ");
                              return;
                          }
            
            String nrocel=jtnrocelular.getText();
            int codbrig=Integer.parseInt(jtcodbrigada.getText());
            BrigadaData bd=new BrigadaData();
            Brigada bri=bd.buscarBrigada(codbrig);
            
            

//            if (idBom==1||dni==null) {
//                JOptionPane.showMessageDialog(this," * campos requeridos ");
//                return ;
//            }
            


            if (bomberoActual==null) {
               
if (bd.BrigadaEspacio(codbrig)==false) {
                 JOptionPane.showMessageDialog(this," la brigada esta completa no se puede agregar un nuevo bombero ");
                 
                    return;
            }
                bomberoActual=new Bombero(dni,nomape,fechaNac,nrocel,sangre,bri);
                bomdata.guardarBombero(bomberoActual);
            }else {
                 int idBombero = Integer.parseInt(jtidbombero.getText());
                bomberoActual.setIdBombero(idBombero);
                bomberoActual.setDni(dni);
                bomberoActual.setNombreApellido(nomape);
                bomberoActual.setGrupoSanguineo(sangre);
                bomberoActual.setFechaNac(fechaNac);
                
                //bomberoActual.setActivo(est);
                bomdata.modificarBombero(bomberoActual);

            }

        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "error debe ingresar un Codigo Valido");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // buscar un bombero
                     
        try {
            int code=Integer.parseInt(jtidbombero.getText());
            int idBombero = code;
            

            bomberoActual=bomdata.buscarBombero(idBombero);

            if (bomberoActual!=null) {
                setSanguineo(bomberoActual.getGrupoSanguineo());
                jtdni.setText(bomberoActual.getDni()+"");
                jtnombreapellido.setText(bomberoActual.getNombreApellido());
                LocalDate lc = bomberoActual.getFechaNac();
                //LocalDate date=java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                //Date date = Date.from(sin.getFechaSiniestro().atStartOfDay(ZoneId.systemDefault()).toInstant());
                //jdFecha.setDate(date);
                jDate.setDate(java.sql.Date.valueOf(lc));
                jtnrocelular.setText(bomberoActual.getCelular());
                jtcodbrigada.setText(bomberoActual.getBrigada().getCodBrigada()+"");
                
//                jrestado.setSelected(bomberoActual.isActivo());
            //}else{
              //  JOptionPane.showMessageDialog(this, "intente otra vez");
            }

        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Debe ingresar un Nro");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtcodbrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcodbrigadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcodbrigadaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Eliminar un Bombero de la Basede Datos
        
        if (bomberoActual!=null) {
        
            bomdata.bajaBombero(bomberoActual.getIdBombero());
            bomberoActual=null;
            jtidbombero.setText("");
            
            jtdni.setText("");
            jtnombreapellido.setText("");
            
            jtnrocelular.setText("");
            jtcodbrigada.setText("");
            
            
        }else{
            JOptionPane.showMessageDialog(this, "No Selecciono ningun Bombero para Eliminar");
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        jDesktopPane2.setVisible(!jDesktopPane2.isVisible());

        if (jDesktopPane2.isVisible()==true) {

            ConsultaDeBomberosPorBrigada bpc= new ConsultaDeBomberosPorBrigada ();
            bpc.setVisible(true);

            jDesktopPane2.add(bpc);
            jDesktopPane2.moveToFront (bpc);
            jButton6.setText("Cerrar lista");
        }else
        jButton6.setText("Listar bomberos x brigada");

    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> jcSangre;
    private javax.swing.JTextField jtcodbrigada;
    private javax.swing.JTextField jtdni;
    private javax.swing.JTextField jtidbombero;
    private javax.swing.JTextField jtnombreapellido;
    private javax.swing.JTextField jtnrocelular;
    // End of variables declaration//GEN-END:variables

private void setSanguineo(String ep){
   
    
    
        
        for (int i = 0; i < Sanguineo.length; i++) {
            
            if (Sanguineo[i].equals(ep)) {
                jcSangre.setSelectedIndex(i);
               
            }

        }

    }
}
