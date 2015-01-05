

package Vista;

import Controlador.*;
import Modelo.Usuario;
import static Vista.PantallaIngresar.usuario;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


public class PantallaAdminTablaUsuarios extends javax.swing.JFrame {

     DefaultTableModel modelo;
     private boolean resultado = false;
     static String idaux;
     
     private TableRowSorter trsfiltro;
     
     DaoUsuarioXml datosUsuario = new DaoUsuarioXml();//Creo objeto del controlador del usuario

    public PantallaAdminTablaUsuarios(java.awt.Frame parent, boolean modal,String id) {
        initComponents();
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Cedula");
        modelo.addColumn("Username");
        modelo.addColumn("Password");
        modelo.addColumn("Correo");
        modelo.addColumn("Dirección");
        modelo.addColumn("Fecha de Nacimiento");
        modelo.addColumn("Método de Pago");
        modelo.addColumn("Fecha de Registro");
        modelo.addColumn("Rol");
        modelo.addColumn("Id");
        modelo.addColumn("Estado");//Lleno mi tabla de tipo defaulttable
        
        this.Table.setModel(modelo);//a mi tabla table le asigno el tipo modelo que cree ahora
        
        llenaTabla(id);
        //idaux = id;
        
        //imagen de fondo
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Pantalla");
        
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/PantallaAdmin.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }
    
    public void filtro() {
   trsfiltro.setRowFilter(RowFilter.regexFilter(jTextField1.getText(), 0));
   }

    private void llenaTabla(String id)
    {   
        DefaultTableModel modelo = (DefaultTableModel) Table.getModel();
        modelo.setRowCount(0);
        
        ArrayList<Usuario> Lista = datosUsuario.todosLosUsuarios();
        

        for (Usuario usu : Lista)
        {
           
        
            
        
        
            
             if (usu != null) {
               String[] row = {usu.getNombre(),usu.getApellido(),usu.getCedula(),usu.getUsername(),usu.getPassword(),usu.getCorreo(),usu.getDireccionFisica(),usu.getFechaDeNacimiento(),usu.getMetodoDePago(),usu.getFechaDeRegistro(),usu.getRol(),usu.getIdUsuario(),usu.getEstadoUsuario()};
               modelo.addRow(row);
             }
            
            
        Table.setModel(modelo);
            
            
            
        }
            
     }   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBAgregarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        JBEliminarUsuario = new javax.swing.JButton();
        JBModficarUsuario = new javax.swing.JButton();
        JBVolver = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(860, 410));

        JBAgregarUsuario.setText("Agregar ");
        JBAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarUsuarioActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Table);

        JBEliminarUsuario.setText("Eliminar");
        JBEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarUsuarioActionPerformed(evt);
            }
        });

        JBModficarUsuario.setText("Modificar");
        JBModficarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBModficarUsuarioActionPerformed(evt);
            }
        });

        JBVolver.setText("Volver");
        JBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVolverActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel1.setText("Buscar Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JBModficarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBAgregarUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(JBModficarUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(JBEliminarUsuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBVolver)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarUsuarioActionPerformed
        PantallaAdminAgregarUsuario _PantallaAdminAgregarUsuario = new PantallaAdminAgregarUsuario();
        _PantallaAdminAgregarUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JBAgregarUsuarioActionPerformed

    private void JBEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarUsuarioActionPerformed
        
        String idUsuarioSeleccionado;
        
        int filaseleccionada = Table.getSelectedRow();// le asigno a la variable la fila seleccionada
        
        
        
        if (filaseleccionada >= 0){
        
            
            idUsuarioSeleccionado = Table.getValueAt(filaseleccionada, 11).toString();
            //System.out.println("EL id del usuario es: "+idUsuarioSeleccionado);Tomo el id del usuario seleccionado  
            
            datosUsuario.borrarUsuario(idUsuarioSeleccionado);//Borro el usuario con el id seleccionado
            modelo.removeRow(filaseleccionada);
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Tabla vacía o no seleccionó fila");
        
        }
        
    }//GEN-LAST:event_JBEliminarUsuarioActionPerformed

    private void JBModficarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBModficarUsuarioActionPerformed
        
         
        int filaSeleccionada = Table.getSelectedRow();//Obtengo la fila seleccionada
        String nombre, apellido, cedula, username, password, correo, direccion, fechaDeNacimiento, metodoDePago, FechaDeRegistro, rol, idUsuario, estadoUsuario;
        
         
        if (filaSeleccionada >= 0 ){
        
        //meto los valores de la fila en mis variables
        nombre = Table.getValueAt(filaSeleccionada, 0).toString();
        apellido = Table.getValueAt(filaSeleccionada, 1).toString();
        cedula = Table.getValueAt(filaSeleccionada, 2).toString();
        username = Table.getValueAt(filaSeleccionada, 3).toString();
        password = Table.getValueAt(filaSeleccionada, 4).toString();
        correo = Table.getValueAt(filaSeleccionada, 5).toString();
        direccion = Table.getValueAt(filaSeleccionada, 6).toString();
        fechaDeNacimiento = Table.getValueAt(filaSeleccionada, 7).toString();
        metodoDePago = Table.getValueAt(filaSeleccionada, 8).toString();
        FechaDeRegistro = Table.getValueAt(filaSeleccionada, 9).toString();
        rol = Table.getValueAt(filaSeleccionada, 10).toString();
        idUsuario = Table.getValueAt(filaSeleccionada, 11).toString();
        estadoUsuario = Table.getValueAt(filaSeleccionada, 12).toString();
        
        //Creo un objeto Usuario
        Usuario user = new Usuario(nombre, apellido, cedula, username, password, correo, direccion, fechaDeNacimiento, metodoDePago, FechaDeRegistro, rol, idUsuario, estadoUsuario);
        //Abro la pantalla de modificar usuario y le paso por parámetro mi objeto usuario
        PantallaAdminModificarUsuario _PantallaAdminModificarUsuario = new PantallaAdminModificarUsuario(user);
            
        
        _PantallaAdminModificarUsuario.setVisible(true);
        
        this.setVisible(false);
        
        }else{
        
            JOptionPane.showMessageDialog(null, "No has seleccionado ningun usuario");
            
        }
        
        
    }//GEN-LAST:event_JBModficarUsuarioActionPerformed

    private void JBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVolverActionPerformed
       java.awt.EventQueue.invokeLater(new Runnable() {
                   
                   public void run() {
                   new PantallaInicialAdminUsuario(usuario).setVisible(true);
                   }
                   });
                   this.setVisible(false); 
    }//GEN-LAST:event_JBVolverActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        
    jTextField1.addKeyListener(new KeyAdapter() {
    public void keyReleased(final KeyEvent e) {
    String cadena = (jTextField1.getText());
    jTextField1.setText(cadena);
    repaint();
    filtro();
    }
    });
    trsfiltro = new TableRowSorter(Table.getModel());
    Table.setRowSorter(trsfiltro);
        
    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(PantallaAdminTablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaAdminTablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaAdminTablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaAdminTablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantallaAdminTablaUsuarios tabla = new PantallaAdminTablaUsuarios(new javax.swing.JFrame(), true, idaux);
                tabla.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAgregarUsuario;
    private javax.swing.JButton JBEliminarUsuario;
    private javax.swing.JButton JBModficarUsuario;
    private javax.swing.JButton JBVolver;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
