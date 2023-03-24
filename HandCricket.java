
package miniprojects;

import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.Cursor.cursor;
import javax.swing.JProgressBar;

public class HandCricket extends javax.swing.JFrame {

Random random = new Random();
 String s1;
 int input,target,score;
 Cursor c;
    public HandCricket() {
        initComponents();
         c = new Cursor(WAIT_CURSOR);
//         this.setCursor(c);
        visibleFalse();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttarget = new javax.swing.JTextField();
        bowlingbtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtinputRnd = new javax.swing.JTextField();
        lblRandomno = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();
        battingbtn = new javax.swing.JButton();
        restartbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("      HAND CRICKET");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jPanel3.setBackground(new java.awt.Color(240, 147, 58));
        jPanel3.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setText("BOWLING");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(76, 16, 241));
        jLabel3.setText("   Target");

        txttarget.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txttarget.setEnabled(false);

        bowlingbtn.setBackground(new java.awt.Color(153, 0, 255));
        bowlingbtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bowlingbtn.setForeground(new java.awt.Color(255, 2, 99));
        bowlingbtn.setText("BOWL");
        bowlingbtn.setToolTipText("Click to set the Target");
        bowlingbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bowlingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bowlingbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txttarget, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(bowlingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(127, 127, 127))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txttarget, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(bowlingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.magenta);
        jLabel4.setText("  BATTING  ||  ALL THE BEST ");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Enter Number between 1 to 6 ");

        txtinputRnd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtinputRnd.setText(" ");

        lblRandomno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblRandomno.setForeground(new java.awt.Color(58, 250, 9));

        lblScore.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblScore.setForeground(new java.awt.Color(251, 236, 0));

        lblStatus.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(35, 255, 67));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(251, 236, 0));
        jLabel12.setText("Score :");

        lblMsg.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        lblMsg.setForeground(new java.awt.Color(255, 102, 0));

        battingbtn.setBackground(new java.awt.Color(255, 255, 153));
        battingbtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        battingbtn.setForeground(new java.awt.Color(255, 0, 0));
        battingbtn.setText("Click here for Batting ");
        battingbtn.setBorder(new javax.swing.border.MatteBorder(null));
        battingbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        battingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                battingbtnActionPerformed(evt);
            }
        });

        restartbtn.setBackground(new java.awt.Color(255, 255, 153));
        restartbtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        restartbtn.setForeground(new java.awt.Color(255, 0, 0));
        restartbtn.setText("Restart");
        restartbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 51));
        jLabel2.setText("Status : ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(43, 43, 43)
                        .addComponent(txtinputRnd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(lblRandomno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(restartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(battingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(171, 171, 171)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblScore))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblScore))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtinputRnd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRandomno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(battingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(restartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniprojects/cropedvirat4.jpg"))); // NOI18N
        jLabel13.setText(" ");

        lblname.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        lblname.setToolTipText("Your Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(128, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bowlingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bowlingbtnActionPerformed
            setTarget();    
    }//GEN-LAST:event_bowlingbtnActionPerformed

    private void battingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_battingbtnActionPerformed
           Batting();  
    }//GEN-LAST:event_battingbtnActionPerformed

    private void restartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartbtnActionPerformed
              this.dispose();
            setVisible(true);
    }//GEN-LAST:event_restartbtnActionPerformed

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
            java.util.logging.Logger.getLogger(HandCricket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HandCricket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HandCricket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HandCricket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HandCricket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton battingbtn;
    private javax.swing.JButton bowlingbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblRandomno;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblStatus;
    public javax.swing.JLabel lblname;
    private javax.swing.JButton restartbtn;
    private javax.swing.JTextField txtinputRnd;
    private javax.swing.JTextField txttarget;
    // End of variables declaration//GEN-END:variables

    private void visibleFalse() {
     jPanel5.setVisible(false);
    }

    private void setTarget() {
         jPanel5.setVisible(true);
         target = random.nextInt(30);
         txttarget.setText(String.valueOf(target));
    }           
                     
    private void Batting() {

        int x1 = random.nextInt(6); // random number generator 

        lblRandomno.setText(String.valueOf(x1));

        input = Integer.parseInt(txtinputRnd.getText());  //user sa random no leya 
        System.out.println(input);
        score = score + input;  // score ko update keya
        
        if (score == target || score >= target) {
            lblScore.setText(String.valueOf(score));
            lblStatus.setForeground(Color.orange);
            lblMsg.setText("Congratulation ! you won the match");
            lblMsg.setForeground(Color.decode("RED"));
            battingbtn.setEnabled(false);
        }
        if (input != x1) {
            lblScore.setText(String.valueOf(score));
            lblStatus.setText("NOTOUT");
        } //        
        else if (input == x1) {
            lblScore.setText(String.valueOf(score));
            lblStatus.setForeground(Color.red);
            lblStatus.setText("OUT");
            lblMsg.setText("Sorry ! you lose the match");
            battingbtn.setEnabled(false);
        }
    }
}
