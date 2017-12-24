/**
 * Resuelve la Guía 1.5 del módulo 7 "Integración Módulos de Software",
 * Programa CORFO "Mil Programadores".
 *
 * @autor Daniel Zúñiga Correa, 2017-12-21 (yyyy-mm-dd)
 */
package vista;

import modelo.*;

/**
 * Clase JFrame correspondiente a la vista que contiene principal del proyecto.
 *
 * @author Daniel Zúñiga Correa, 2017-12-21 (yyyy-mm-dd)
 */
public class Indicadores extends javax.swing.JFrame {
//    Declaración de variables de clase para su utilización en los métodos contenidos
//    en esta vista.
    public Indicador dolar;
    public Indicador utm;
    public Indicador uf;
    public Indicador euro;
    public Indicador ipc;
    public Indicador bitcoin;

    /**
     * Método para inicializar la vista
     */
    public Indicadores() {
        initComponents();
        dolar = Metodos.consumirIndicador("dolar");
        utm = Metodos.consumirIndicador("utm");
        uf = Metodos.consumirIndicador("uf");
        euro = Metodos.consumirIndicador("euro");
        ipc = Metodos.consumirIndicador("ipc");
        bitcoin = Metodos.consumirIndicador("bitcoin");
        tbIndicadores.setModel(Metodos.llenarTabla(indicadorSeleccionado()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbIndicadores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cboIndicadores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbIndicadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbIndicadores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbIndicadores);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setText("INDICADORES");

        cboIndicadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar", "UTM", "UF", "Euro", "IPC", "BitCoin" }));
        cboIndicadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboIndicadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(cboIndicadores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboIndicadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboIndicadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboIndicadoresActionPerformed
        tbIndicadores.setModel(Metodos.llenarTabla(indicadorSeleccionado()));


    }//GEN-LAST:event_cboIndicadoresActionPerformed

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
            java.util.logging.Logger.getLogger(Indicadores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Indicadores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Indicadores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Indicadores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        new Indicadores().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox<String> cboIndicadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tbIndicadores;
    // End of variables declaration//GEN-END:variables

    /**
     * Método para determinar cual objeto clase Indicador corresponde a la
     * opción seleccionada en el combo box respectivo
     *
     * @return retorna el objeto clase Indicador que corresponde a la opción
     * seleccionada en el combo box
     */
    private Indicador indicadorSeleccionado() {
        int index = cboIndicadores.getSelectedIndex();
        Indicador indicador = new Indicador();
        switch (index) {
            case 0:
                indicador = dolar;
                break;
            case 1:
                indicador = utm;
                break;
            case 2:
                indicador = uf;
                break;
            case 3:
                indicador = euro;
                break;
            case 4:
                indicador = ipc;
                break;
            case 5:
                indicador = bitcoin;
                break;
        }
        return indicador;
    }
}
