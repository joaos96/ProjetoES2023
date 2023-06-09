
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author joaom
 */
public class PaginaEvento extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public PaginaEvento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        panel1 = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        provasList = new javax.swing.JList<>();
        lblProvas = new javax.swing.JLabel();
        btnCriarProva = new javax.swing.JButton();
        btnEditarProva = new javax.swing.JButton();
        btnEliminarProva = new javax.swing.JButton();
        btnMostrarProva = new javax.swing.JButton();
        btnVerInscritos = new javax.swing.JButton();
        btnImportarInscricao = new javax.swing.JButton();
        btnLancarEvento = new javax.swing.JButton();
        btnMostrarMedalhas = new javax.swing.JButton();
        btnImportarProva = new javax.swing.JButton();
        btnPrograma = new javax.swing.JButton();

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Evento X");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0));

        btnVoltar.setText("<-");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(btnVoltar))
        );

        provasList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Prova X - 2023-06-23/2023-06-26 - A decorrer", "Prova Y - 2023-06-23/2023-04-24 - Finalizada" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(provasList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblProvas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblProvas.setText("Provas");

        btnCriarProva.setBackground(new java.awt.Color(153, 153, 153));
        btnCriarProva.setForeground(new java.awt.Color(255, 255, 255));
        btnCriarProva.setText("Criar Prova");
        btnCriarProva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarProvaActionPerformed(evt);
            }
        });

        btnEditarProva.setBackground(new java.awt.Color(153, 153, 153));
        btnEditarProva.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarProva.setText("Editar Prova");
        btnEditarProva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProvaActionPerformed(evt);
            }
        });

        btnEliminarProva.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarProva.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProva.setText("Eliminar Prova");
        btnEliminarProva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProvaActionPerformed(evt);
            }
        });

        btnMostrarProva.setBackground(new java.awt.Color(153, 153, 153));
        btnMostrarProva.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarProva.setText("Ver Prova");
        btnMostrarProva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProvaActionPerformed(evt);
            }
        });

        btnVerInscritos.setBackground(new java.awt.Color(153, 153, 153));
        btnVerInscritos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerInscritos.setText("Ver Inscritos");
        btnVerInscritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerInscritosActionPerformed(evt);
            }
        });

        btnImportarInscricao.setBackground(new java.awt.Color(153, 153, 153));
        btnImportarInscricao.setForeground(new java.awt.Color(255, 255, 255));
        btnImportarInscricao.setText("Importar Inscrição");
        btnImportarInscricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarInscricaoActionPerformed(evt);
            }
        });

        btnLancarEvento.setBackground(new java.awt.Color(153, 153, 153));
        btnLancarEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnLancarEvento.setText("Lançar Evento");
        btnLancarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLancarEventoActionPerformed(evt);
            }
        });

        btnMostrarMedalhas.setBackground(new java.awt.Color(153, 153, 153));
        btnMostrarMedalhas.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarMedalhas.setText("Ver Países mais Medalhados");
        btnMostrarMedalhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarMedalhasActionPerformed(evt);
            }
        });

        btnImportarProva.setBackground(new java.awt.Color(153, 153, 153));
        btnImportarProva.setForeground(new java.awt.Color(255, 255, 255));
        btnImportarProva.setText("Importar Prova");
        btnImportarProva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarProvaActionPerformed(evt);
            }
        });

        btnPrograma.setBackground(new java.awt.Color(153, 153, 153));
        btnPrograma.setForeground(new java.awt.Color(255, 255, 255));
        btnPrograma.setText("Ver Programa");
        btnPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgramaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProvas, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnImportarInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMostrarMedalhas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImportarProva, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrarProva, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarProva, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCriarProva, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarProva, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnPrograma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLancarEvento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(lblProvas)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMostrarProva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCriarProva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarProva)
                        .addGap(12, 12, 12)
                        .addComponent(btnEliminarProva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnImportarProva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVerInscritos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrograma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLancarEvento))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarMedalhas)
                    .addComponent(btnImportarInscricao))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarProvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProvaActionPerformed
        
        JFrame home = new PaginaProva();
        home.show();
        dispose();  
    }//GEN-LAST:event_btnMostrarProvaActionPerformed

    private void btnEliminarProvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProvaActionPerformed
        UIManager.put("OptionPane.noButtonText", "Cancelar");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        int result = JOptionPane.showConfirmDialog(this, "Esta ação vai pagar a prova 'Prova X'. \n Deseja proceder?", "Eliminar Evento",  JOptionPane.YES_NO_OPTION);        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProvaActionPerformed

    private void btnEditarProvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProvaActionPerformed
        
        JFrame home = new PaginaProvaEditar();
        home.show();
        dispose();   
    }//GEN-LAST:event_btnEditarProvaActionPerformed

    private void btnVerInscritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInscritosActionPerformed
        
        JFrame home = new PaginaEventoInscritos();
        home.show();
        dispose();      
    }//GEN-LAST:event_btnVerInscritosActionPerformed

    private void btnImportarInscricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarInscricaoActionPerformed
        
        JFrame home = new PaginaInscricaoImportar();
        home.show();
        dispose();      
    }//GEN-LAST:event_btnImportarInscricaoActionPerformed

    private void btnLancarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLancarEventoActionPerformed
        UIManager.put("OptionPane.noButtonText", "Cancelar");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        int result = JOptionPane.showConfirmDialog(this, "Esta ação vai lançar o Evento X, abrindo as suas inscrições. \n Deseja proceder?", "Lançar Evento",  JOptionPane.YES_NO_OPTION);        
    }//GEN-LAST:event_btnLancarEventoActionPerformed

    private void btnMostrarMedalhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMedalhasActionPerformed

        JFrame home = new PaginaEventoMedalhas();
        home.show();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarMedalhasActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        JFrame home = new Home();
        home.show();
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnImportarProvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarProvaActionPerformed
        
        JFrame home = new PaginaProvaImportar();
        home.show();
        dispose();         // T
    }//GEN-LAST:event_btnImportarProvaActionPerformed

    private void btnCriarProvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarProvaActionPerformed
        
        JFrame home = new PaginaProvaCriar();
        home.show();
        dispose();   
    }//GEN-LAST:event_btnCriarProvaActionPerformed

    private void btnProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgramaActionPerformed
        
        JFrame home = new PaginaEventoPrograma();
        home.show();
        dispose();   
    }//GEN-LAST:event_btnProgramaActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarProva;
    private javax.swing.JButton btnEditarProva;
    private javax.swing.JButton btnEliminarProva;
    private javax.swing.JButton btnImportarInscricao;
    private javax.swing.JButton btnImportarProva;
    private javax.swing.JButton btnLancarEvento;
    private javax.swing.JButton btnMostrarMedalhas;
    private javax.swing.JButton btnMostrarProva;
    private javax.swing.JButton btnPrograma;
    private javax.swing.JButton btnVerInscritos;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProvas;
    private java.awt.List list1;
    private java.awt.Panel panel1;
    private javax.swing.JList<String> provasList;
    // End of variables declaration//GEN-END:variables
}
