/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Tablas.Comida;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vetto
 */
public class MainFrame extends javax.swing.JFrame {
ConexionSQLbase c=new ConexionSQLbase();
public List<Comida> comidas;
public Connection co;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        co=c.ConexionSQL();
        initComponents();
        this.setLocationRelativeTo(null); // Coloca la ventana en la posicion central de el escritorio
        jScrollPaneFoodInventory.setVisible(false);
        jLabelBack.setVisible(false);
        jLabelProductInventory.setVisible(false);
        jLabelEnterProduct.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jTextFieldEnterProductName.setVisible(false);
        jTextFieldEnterProductPrice.setVisible(false);
        jTextFieldEnterProductQuantity.setVisible(false);
        jButtonEnterProduct.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelInventory = new javax.swing.JLabel();
        jLabelBack = new javax.swing.JLabel();
        jScrollPaneFoodInventory = new javax.swing.JScrollPane();
        jTableFoodInventory = new javax.swing.JTable();
        jLabelProductInventory = new javax.swing.JLabel();
        jLabelPurchases = new javax.swing.JLabel();
        jLabelEnterProduct = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEnterProductName = new javax.swing.JTextField();
        jTextFieldEnterProductPrice = new javax.swing.JTextField();
        jTextFieldEnterProductQuantity = new javax.swing.JTextField();
        jLabelShop = new javax.swing.JLabel();
        jButtonEnterProduct = new javax.swing.JButton();
        jLabelMenuWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cerrar sesión");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        jLabelInventory.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabelInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventory.png"))); // NOI18N
        jLabelInventory.setText("     Inventario");
        jLabelInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInventoryMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabelBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelBack.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BackWhite.png"))); // NOI18N
        jLabelBack.setText(" Regresar");
        jLabelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTableFoodInventory.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jTableFoodInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Existencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneFoodInventory.setViewportView(jTableFoodInventory);

        getContentPane().add(jScrollPaneFoodInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 460, -1));

        jLabelProductInventory.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabelProductInventory.setText("Inventario de productos");
        getContentPane().add(jLabelProductInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 380, 40));

        jLabelPurchases.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabelPurchases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Purchases.png"))); // NOI18N
        jLabelPurchases.setText("    Compras");
        jLabelPurchases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPurchasesMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelPurchases, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        jLabelEnterProduct.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabelEnterProduct.setText("Ingresar producto");
        getContentPane().add(jLabelEnterProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 260, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Precio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cantidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jTextFieldEnterProductName.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldEnterProductName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldEnterProductName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldEnterProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 190, -1));

        jTextFieldEnterProductPrice.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldEnterProductPrice.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldEnterProductPrice.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldEnterProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 190, -1));

        jTextFieldEnterProductQuantity.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldEnterProductQuantity.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldEnterProductQuantity.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldEnterProductQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 190, -1));

        jLabelShop.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabelShop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shop.png"))); // NOI18N
        jLabelShop.setText("    Tienda");
        jLabelShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelShopMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jButtonEnterProduct.setBackground(new java.awt.Color(51, 0, 0));
        jButtonEnterProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEnterProduct.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEnterProduct.setText("Ingresar");
        jButtonEnterProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEnterProductMouseClicked(evt);
            }
        });
        jButtonEnterProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterProductActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEnterProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 190, -1));

        jLabelMenuWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu.jpg"))); // NOI18N
        getContentPane().add(jLabelMenuWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0); //Sale de la aplicacion
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        System.exit(0); //Sale de la aplicacion
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        Interface InterfaceWindow = new Interface();
        InterfaceWindow.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabelInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInventoryMouseClicked
        // TODO add your handling code here:
        jLabelInventory.setVisible(false);
        jLabelPurchases.setVisible(false);
        jScrollPaneFoodInventory.setVisible(true);
        jLabelShop.setVisible(false);
        jLabelBack.setVisible(true);
        jLabelProductInventory.setVisible(true);
        
        
        Comida com=new Comida();
        comidas=new ArrayList<>();
        comidas=com.obtenerTodas(co);
        DefaultTableModel dt=(DefaultTableModel) jTableFoodInventory.getModel();
        dt.setRowCount(0);
        for (int i=0;i<comidas.size();i++){
            dt.addRow(new Object[]{
                comidas.get(i).getNombre(),comidas.get(i).getPrecio(),comidas.get(i).getExistencia()
            });
            System.out.println(comidas.get(i).getNombre());
        }     
    }//GEN-LAST:event_jLabelInventoryMouseClicked

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        // Muestra todos los elementos de inicio de sesion  y oculta todos los elementos para el registro de un nuevo usuario
        jButtonEnterProduct.setVisible(false);
         jLabelShop.setVisible(true);
        jLabelEnterProduct.setVisible(false);
        jLabelBack.setVisible(false);
        jScrollPaneFoodInventory.setVisible(false);
        jLabelProductInventory.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jTextFieldEnterProductName.setVisible(false);
        jTextFieldEnterProductPrice.setVisible(false);
        jTextFieldEnterProductQuantity.setVisible(false);
        jLabelPurchases.setVisible(true);
        jLabelInventory.setVisible(true);
    }//GEN-LAST:event_jLabelBackMouseClicked

    private void jLabelPurchasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPurchasesMouseClicked
        // TODO add your handling code here:
        jLabelInventory.setVisible(false);
        jLabelPurchases.setVisible(false);
        jLabelBack.setVisible(true);
        jLabelEnterProduct.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jTextFieldEnterProductName.setVisible(true);
        jTextFieldEnterProductPrice.setVisible(true);
        jTextFieldEnterProductQuantity.setVisible(true);
        jLabelShop.setVisible(false);
        jButtonEnterProduct.setVisible(true);
        
    }//GEN-LAST:event_jLabelPurchasesMouseClicked

    private void jButtonEnterProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnterProductMouseClicked
        // TODO add your handling code here:
        Comida comida=new Comida();
        comida=comida.VerificarExistenciaDeComida(co, jTextFieldEnterProductName.getText());
        if(comida==null){
            comida=new Comida();
            comida.InsertarComida(co, jTextFieldEnterProductName.getText() ,Double.parseDouble(jTextFieldEnterProductPrice.getText()), Integer.parseInt(jTextFieldEnterProductQuantity.getText()));
            //modificar apariencia
            JOptionPane.showMessageDialog( null, "Se ha ingresado el insumo a la base de datos perrrfectamente" + "\n"+" :D");
            MainFrame ventana=new MainFrame();
            ventana.setVisible(true);
            this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog( null, "El insumo ya existe"+"\n"+"Puedes Ingresar su nuevo ingreso");
            MainFrame ventana=new MainFrame();
            ventana.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_jButtonEnterProductMouseClicked

    private void jButtonEnterProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEnterProductActionPerformed

    private void jLabelShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelShopMouseClicked
        // TODO add your handling code here:
        Sales StoreWindow = new Sales();
        StoreWindow.setVisible(true);
        jLabelShop.setVisible(false);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabelShopMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonEnterProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelEnterProduct;
    private javax.swing.JLabel jLabelInventory;
    private javax.swing.JLabel jLabelMenuWallpaper;
    private javax.swing.JLabel jLabelProductInventory;
    private javax.swing.JLabel jLabelPurchases;
    private javax.swing.JLabel jLabelShop;
    private javax.swing.JScrollPane jScrollPaneFoodInventory;
    private javax.swing.JTable jTableFoodInventory;
    private javax.swing.JTextField jTextFieldEnterProductName;
    private javax.swing.JTextField jTextFieldEnterProductPrice;
    private javax.swing.JTextField jTextFieldEnterProductQuantity;
    // End of variables declaration//GEN-END:variables
}