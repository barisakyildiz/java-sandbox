
package NerdleBack;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class StartWindow extends javax.swing.JFrame {

    JButton b1;
    JLabel l1;
    public StartWindow() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTest = new javax.swing.JButton();
        btnYeniOyun = new javax.swing.JButton();
        btnDevamEt1 = new javax.swing.JButton();
        lblWinCount = new javax.swing.JLabel();
        lblLoseCount = new javax.swing.JLabel();
        lblDroppedGame = new javax.swing.JLabel();
        lblAverageGuess = new javax.swing.JLabel();
        lblAverageTime = new javax.swing.JLabel();
        lblNameStart = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTest.setBackground(new java.awt.Color(255, 255, 0));
        btnTest.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTest.setText("Test");
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });

        btnYeniOyun.setBackground(new java.awt.Color(51, 255, 51));
        btnYeniOyun.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnYeniOyun.setText("Yeni Oyun");
        btnYeniOyun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniOyunActionPerformed(evt);
            }
        });

        btnDevamEt1.setBackground(new java.awt.Color(255, 51, 51));
        btnDevamEt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDevamEt1.setText("Devam Et");

        lblWinCount.setBackground(new java.awt.Color(255, 255, 255));
        lblWinCount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblWinCount.setForeground(new java.awt.Color(102, 102, 102));
        lblWinCount.setText("Kazanılan Oyun Sayısı: 0");

        lblLoseCount.setBackground(new java.awt.Color(255, 255, 255));
        lblLoseCount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLoseCount.setForeground(new java.awt.Color(102, 102, 102));
        lblLoseCount.setText("Kaybedilen Oyun Sayısı: 0");

        lblDroppedGame.setBackground(new java.awt.Color(255, 255, 255));
        lblDroppedGame.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDroppedGame.setForeground(new java.awt.Color(102, 102, 102));
        lblDroppedGame.setText("Yarıda Bırakılan Oyun Sayısı: 0");

        lblAverageGuess.setBackground(new java.awt.Color(255, 255, 255));
        lblAverageGuess.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAverageGuess.setForeground(new java.awt.Color(102, 102, 102));
        lblAverageGuess.setText("Ortalama Tahmin Sayısı: 0");

        lblAverageTime.setBackground(new java.awt.Color(255, 255, 255));
        lblAverageTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAverageTime.setForeground(new java.awt.Color(102, 102, 102));
        lblAverageTime.setText("Ortalama Harcanan Süre: 0 Saniye");

        lblNameStart.setBackground(new java.awt.Color(255, 255, 255));
        lblNameStart.setFont(new java.awt.Font("Rasa SemiBold", 1, 18)); // NOI18N
        lblNameStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameStart.setText("Nerdle --- Daily Equation Game");
        lblNameStart.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 6, 6, 6, new java.awt.Color(255, 204, 102)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnDevamEt1)
                        .addGap(71, 71, 71)
                        .addComponent(btnYeniOyun))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWinCount)
                            .addComponent(lblLoseCount)
                            .addComponent(lblDroppedGame)
                            .addComponent(lblAverageGuess)
                            .addComponent(lblAverageTime))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(btnTest, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblNameStart, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameStart, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(lblWinCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLoseCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDroppedGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAverageGuess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAverageTime)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTest, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYeniOyun, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDevamEt1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnYeniOyunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniOyunActionPerformed
        dispose();
        NewGameFrame newgame = new NewGameFrame();
        newgame.setVisible(true);
    }//GEN-LAST:event_btnYeniOyunActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        dispose();
        TestFrame testF = new TestFrame();
        testF.setVisible(true);
    }//GEN-LAST:event_btnTestActionPerformed

    
    public static void main(String args[]) {
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartWindow().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevamEt1;
    private javax.swing.JButton btnTest;
    private javax.swing.JButton btnYeniOyun;
    private javax.swing.JLabel lblAverageGuess;
    private javax.swing.JLabel lblAverageTime;
    private javax.swing.JLabel lblDroppedGame;
    private javax.swing.JLabel lblLoseCount;
    private javax.swing.JLabel lblNameStart;
    private javax.swing.JLabel lblWinCount;
    // End of variables declaration//GEN-END:variables
}
