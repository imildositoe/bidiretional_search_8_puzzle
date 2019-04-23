package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import searchs.Bidirectional;
import searchs.BreadthFirst;
import searchs.DepthFirst;
import validacoes.Validacoes;

public class Test extends javax.swing.JFrame {

    private BreadthFirst bfs;
    private DepthFirst dfs;
    private Bidirectional bds;

    public Test() {
        initComponents();
        Validacoes.validarNumeros(txtEstadoInicial);
        Validacoes.validarNumeros(txtGoal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEstadoInicial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtGoal = new javax.swing.JTextField();
        cbTipoBusca = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblTotalTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("Estado Inicial");

        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("Goal");

        cbTipoBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amplitude - Amplitude", "Profundidade - Profundidade", "Amplitude - Profundidade", "Profundidade - Amplitude" }));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setText("Busca Bidirecional");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Tempo despendido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 289, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(317, 317, 317))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtGoal, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEstadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbTipoBusca, 0, 230, Short.MAX_VALUE)
                        .addComponent(lblTotalTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(cbTipoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)))
                .addGap(7, 7, 7)
                .addComponent(txtGoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.match();
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbTipoBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTotalTime;
    private javax.swing.JTextField txtEstadoInicial;
    private javax.swing.JTextField txtGoal;
    // End of variables declaration//GEN-END:variables

    
    private void match() {
        ArrayList<String> startToGoal;
        ArrayList<String> goalToStart;

        String initialState = txtEstadoInicial.getText();
        String goalState = txtGoal.getText();

        if (initialState.length() == 9 && goalState.length() == 9) {
            switch (cbTipoBusca.getSelectedIndex()) {
                case 0: {
                    // Largura - Largura
                    bfs = new BreadthFirst(initialState, goalState);
                    long startTime = System.currentTimeMillis();
                    bfs.bfs();
                    startToGoal = bfs.getSolutionPath();

                    bfs = new BreadthFirst(goalState, initialState);
                    bfs.bfs();
                    goalToStart = bfs.getSolutionPath();

                    bds = new Bidirectional(startToGoal, goalToStart);
                    long endTime = System.currentTimeMillis();

                    if (bds.match() != null) {
                        lblTotalTime.setText((endTime - startTime) + " ms");

                        String texto = "";
                        int i = 1;

                        for (String string : bds.match()) {

                            texto += i++ + "º -- " + string + "\n";
                        }

                        JOptionPane.showMessageDialog(null, texto);
                        
                    } else {
                        lblTotalTime.setText((endTime - startTime) + " ms");
                        JOptionPane.showMessageDialog(null, "Caminho nao encontrado");
                    }
                }
                break;
                case 1: {
                    // Profundidade - Profundidade
                    dfs = new DepthFirst(initialState, goalState);
                    long startTime = System.currentTimeMillis();
                    dfs.dfs();
                    startToGoal = dfs.getSolutionPath();

                    dfs = new DepthFirst(goalState, initialState);
                    dfs.dfs();
                    goalToStart = dfs.getSolutionPath();

                    bds = new Bidirectional(startToGoal, goalToStart);
                    long endTime = System.currentTimeMillis();

                    if (bds.match() != null) {
                        lblTotalTime.setText((endTime - startTime) + " ms");
                        
                        String texto = "";
                        int i = 1;

                        for (String string : bds.match()) {

                            texto += i++ + "º -- " + string + "\n";
                        }

                        JOptionPane.showMessageDialog(null, texto);
                        
                    } else {
                        lblTotalTime.setText((endTime - startTime) + " ms");
                        JOptionPane.showMessageDialog(null, "Caminho nao encontrado");
                    }
                }
                break;
                case 2: {
                    // Largura - Profundidade
                    bfs = new BreadthFirst(initialState, goalState);
                    long startTime = System.currentTimeMillis();
                    bfs.bfs();
                    startToGoal = bfs.getSolutionPath();

                    dfs = new DepthFirst(goalState, initialState);
                    dfs.dfs();
                    goalToStart = dfs.getSolutionPath();

                    bds = new Bidirectional(startToGoal, goalToStart);
                    long endTime = System.currentTimeMillis();

                    if (bds.match() != null) {
                        lblTotalTime.setText((endTime - startTime) + " ms");
                        
                        String texto = "";
                        int i = 1;

                        for (String string : bds.match()) {

                            texto += i++ + "º -- " + string + "\n";
                        }

                        JOptionPane.showMessageDialog(null, texto);
                        
                    } else {
                        lblTotalTime.setText((endTime - startTime) + " ms");
                        JOptionPane.showMessageDialog(null, "Caminho nao encontrado");
                    }
                }
                break;
                case 3: {
                    // Profundidade - Largura
                    dfs = new DepthFirst(initialState, goalState);
                    long startTime = System.currentTimeMillis();
                    dfs.dfs();
                    startToGoal = dfs.getSolutionPath();

                    bfs = new BreadthFirst(goalState, initialState);
                    bfs.bfs();
                    goalToStart = bfs.getSolutionPath();

                    bds = new Bidirectional(startToGoal, goalToStart);
                    long endTime = System.currentTimeMillis();

                    if (bds.match() != null) {
                        lblTotalTime.setText((endTime - startTime) + " ms");
                        
                        String texto = "";
                        int i = 1;

                        for (String string : bds.match()) {

                            texto += i++ + "º -- " + string + "\n";
                        }

                        JOptionPane.showMessageDialog(null, texto);
                        
                    } else {
                        lblTotalTime.setText((endTime - startTime) + " ms");
                        JOptionPane.showMessageDialog(null, "Caminho nao encontrado");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os estados devem ter 9 celulas(8 digitos e um espaco)");
        }

    }
}
