/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberosgrupo47.Vistas;

import bomberosgrupo47.accesoADatos.CuartelData;
import bomberosgrupo47.accesoADatos.SiniestroData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.Timer;

/**
 *
 * @author hecto
 */
public class GestionBombero extends javax.swing.JFrame {
//    private escritorioP escritorio;
    private Timer timer ;
    
    /**
     * Creates new form GestionBombero
     */
    public GestionBombero() {
        try {
    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Metal".equals(info.getName())) {
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
    java.util.logging.Logger.getLogger(GestionBombero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setSize(1300, 750);
        transparencia();
//        escritorio= new escritorioP();
//        this.setContentPane(escritorio);
SiniestroData sini=new SiniestroData();
CuartelData cua=new CuartelData();
int tiempoEspera = 150; //  en milisegundos
        
String tex="                                                                                                                                                             "
        + "  Total de Siniestros : "+sini.TotalSiniestro()+"            Siniestros que han ocurrido entre ayer y hoy : "+sini.ayerHoySiniestro() + "      Cantidad de cuarteles activos registrados : "+cua.candidadDeCuarteles();
      
      final int[] contador = {0};
ActionListener cargarinfo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // carga el texto del banner inferior
               
                
                String info = tex;

                if (tex.length() > contador[0]) {
                    info = info.substring(contador[0]); // Borra la primera letra y asigna el resultado a info
                    jlInfo.setText(info);
                } else {
                    info = ""; 
                     contador[0] = 0;
                     jlInfo.setText(info);
                }
                
                contador[0]++; 
                

            }
        };
                
        timer = new Timer(tiempoEspera, cargarinfo);
        timer.start(); 



    }
    
public void transparencia(){
jButton1.setOpaque(false);
jButton1.setContentAreaFilled(false);
jButton1.setBorderPainted(false);

jBbrigada.setOpaque(false);
jBbrigada.setContentAreaFilled(false);
jBbrigada.setBorderPainted(false);

jBcuartel.setOpaque(false);
jBcuartel.setContentAreaFilled(false);
jBcuartel.setBorderPainted(false);

jBbombero.setOpaque(false);
jBbombero.setContentAreaFilled(false);
jBbombero.setBorderPainted(false);

jBsiniestro.setOpaque(false);
jBsiniestro.setContentAreaFilled(false);
jBsiniestro.setBorderPainted(false);


}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/fondobom.jpg"));
        Image gen= icono.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(gen,0,0,getWidth(),getHeight(),this);

            }
        };
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBbrigada = new javax.swing.JButton();
        jBcuartel = new javax.swing.JButton();
        jBbombero = new javax.swing.JButton();
        jBsiniestro = new javax.swing.JButton();
        ImageIcon icono2 = new ImageIcon(getClass().getResource("/imagenes/bannerInfo.png"));
        Image gen2= icono2.getImage();
        jDesktopPane3 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(gen2,0,0,getWidth(),getHeight(),this);

            }

        };
        jlInfo = new javax.swing.JLabel();
        ImageIcon icono3 = new ImageIcon(getClass().getResource("/imagenes/bannerInfo2b.png"));
        Image gen3= icono3.getImage();
        jDesktopPane4 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(gen3,0,0,getWidth(),getHeight(),this);

            }

        };
        jlTitulos = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMCuartel = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(160, 100));
        setPreferredSize(new java.awt.Dimension(1304, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1304, 700));

        jDesktopPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDesktopPane1MouseEntered(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bSalir.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));

        jBbrigada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bBrigada.png"))); // NOI18N
        jBbrigada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBbrigadaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBbrigadaMouseExited(evt);
            }
        });
        jBbrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbrigadaActionPerformed(evt);
            }
        });

        jBcuartel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bCuartel.png"))); // NOI18N
        jBcuartel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBcuartelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBcuartelMouseExited(evt);
            }
        });
        jBcuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcuartelActionPerformed(evt);
            }
        });

        jBbombero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bBombero.png"))); // NOI18N
        jBbombero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBbomberoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBbomberoMouseExited(evt);
            }
        });
        jBbombero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbomberoActionPerformed(evt);
            }
        });

        jBsiniestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bSiniestro.png"))); // NOI18N
        jBsiniestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBsiniestroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBsiniestroMouseExited(evt);
            }
        });
        jBsiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsiniestroActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBbrigada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBcuartel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBbombero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBsiniestro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243)
                        .addComponent(jBcuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBsiniestro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBbrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbombero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBsiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jBcuartel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)))
                .addComponent(jButton1)
                .addGap(37, 37, 37))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jBbrigada)
                .addGap(42, 42, 42)
                .addComponent(jBbombero, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane3.setBackground(new java.awt.Color(204, 255, 255));

        jlInfo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jlInfo.setForeground(new java.awt.Color(0, 0, 204));
        jlInfo.setText(" ");

        jDesktopPane3.setLayer(jlInfo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jDesktopPane4.setBackground(new java.awt.Color(204, 255, 255));

        jlTitulos.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jlTitulos.setForeground(new java.awt.Color(51, 153, 255));
        jlTitulos.setText("Menu principal");
        jlTitulos.setFocusTraversalPolicyProvider(true);

        jDesktopPane4.setLayer(jlTitulos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jlTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jlTitulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        jMCuartel.setText("Cuartel");
        jMCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCuartelActionPerformed(evt);
            }
        });

        jMenuItem7.setText("Formulario Cuartel");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMCuartel.add(jMenuItem7);

        jMenuBar1.add(jMCuartel);

        jMenu2.setText("Brigada");

        jMenuItem1.setText("Formulario Brigada");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Bombero");

        jMenuItem8.setText("Formulario Bomberos");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Siniestro");

        jMenuItem4.setText("formulario Siniestro");
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Consultas");

        jMenuItem5.setText("Bomberos por brigada");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("Brigadas por cuartel");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane4)
            .addComponent(jDesktopPane1)
            .addComponent(jDesktopPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
         // Consulta de los Bomberos por Brigada
        
        //EMPIEZA aca
        jlTitulos.setText("Consultas");
//        jDesktopPane1.removeAll();
//        jDesktopPane1.repaint();
        ConsultaDeBomberosPorBrigada conpbrig= new ConsultaDeBomberosPorBrigada ();
        conpbrig.setVisible(true);
       
        jDesktopPane1.add(conpbrig);
        jDesktopPane1.moveToFront (conpbrig);
        
        //TERMINA aca
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        
        jLabel1.setText("     SALIR");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        
        jLabel1.setText("");
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCuartelActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMCuartelActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
//        jDesktopPane1.removeAll();
//        jDesktopPane1.repaint();
        cuartelVista cua=new cuartelVista();
        cua.setVisible(true);
        jDesktopPane1.add(cua);
        jDesktopPane1.moveToFront(cua);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jBbrigadaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBbrigadaMouseEntered
        // TODO add your handling code here:
        jLabel1.setText("   BRIGADA");
    }//GEN-LAST:event_jBbrigadaMouseEntered

    private void jBbrigadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBbrigadaMouseExited
        // TODO add your handling code here:
        jLabel1.setText("");
    }//GEN-LAST:event_jBbrigadaMouseExited

    private void jBcuartelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBcuartelMouseEntered
        // TODO add your handling code here:
        jLabel1.setText("   CUARTEL");
    }//GEN-LAST:event_jBcuartelMouseEntered

    private void jBcuartelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBcuartelMouseExited
        // TODO add your handling code here:
        jLabel1.setText("");
    }//GEN-LAST:event_jBcuartelMouseExited

    private void jBbomberoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBbomberoMouseEntered
        // TODO add your handling code here:
        jLabel1.setText("BOMBEROS");
    }//GEN-LAST:event_jBbomberoMouseEntered

    private void jBbomberoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBbomberoMouseExited
        // TODO add your handling code here:
        jLabel1.setText("");
    }//GEN-LAST:event_jBbomberoMouseExited

    private void jBsiniestroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBsiniestroMouseEntered
        // TODO add your handling code here:
        jLabel1.setText(" SINIESTRO");
    }//GEN-LAST:event_jBsiniestroMouseEntered

    private void jBsiniestroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBsiniestroMouseExited
        // TODO add your handling code here:
        jLabel1.setText("");
    }//GEN-LAST:event_jBsiniestroMouseExited

    private void jBcuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcuartelActionPerformed
        // Boton del menu principal
        jlTitulos.setText("Cuarteles");
        cuartelVista cua=new cuartelVista();
        timer.stop();
        jlInfo.setText("");
        cua.setVisible(true);
        jDesktopPane1.add(cua);
        jDesktopPane1.moveToFront(cua);
    }//GEN-LAST:event_jBcuartelActionPerformed

    private void jBbrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbrigadaActionPerformed
        // TODO add your handling code here: brigadaVista
        jlTitulos.setText("Brigadas");
        brigadaVista brig=new brigadaVista();
        brig.setVisible(true);
        jDesktopPane1.add(brig);
        jDesktopPane1.moveToFront(brig);
        
    }//GEN-LAST:event_jBbrigadaActionPerformed

    private void jBsiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsiniestroActionPerformed
        // TODO add your handling code here:
        jlTitulos.setText("Siniestros");
        SiniestroVista sinies=new SiniestroVista();
        timer.stop();
        jlInfo.setText("");
        sinies.setVisible(true);
        jDesktopPane1.add(sinies);
        jDesktopPane1.moveToFront(sinies);
    }//GEN-LAST:event_jBsiniestroActionPerformed

    private void jBbomberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbomberoActionPerformed
        // TODO add your handling code here:
        jlTitulos.setText("Bomberos");
         BomberoVista bom=new BomberoVista();
        bom.setVisible(true);
        jDesktopPane1.add(bom);
        jDesktopPane1.moveToFront(bom);
    }//GEN-LAST:event_jBbomberoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
         // Consulta de Brigadas por Cuartel
        
        //EMPIEZA aca
        
        jlTitulos.setText("Consultas");
        ConsultaDeBrigadasPorCuartel bpc= new ConsultaDeBrigadasPorCuartel ();
        bpc.setVisible(true);
        
        jDesktopPane1.add(bpc);
        jDesktopPane1.moveToFront (bpc);
        
        //TERMINA aca
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jDesktopPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesktopPane1MouseEntered
        // TODO add your handling code here:
        jlTitulos.setText("Menu principal");
        timer.start();
        
    }//GEN-LAST:event_jDesktopPane1MouseEntered

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
            java.util.logging.Logger.getLogger(GestionBombero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionBombero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionBombero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionBombero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionBombero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbombero;
    private javax.swing.JButton jBbrigada;
    private javax.swing.JButton jBcuartel;
    private javax.swing.JButton jBsiniestro;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMCuartel;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JLabel jlInfo;
    private javax.swing.JLabel jlTitulos;
    // End of variables declaration//GEN-END:variables
}
