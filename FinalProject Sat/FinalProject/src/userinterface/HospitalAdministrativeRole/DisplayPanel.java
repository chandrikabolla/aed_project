/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdministrativeRole;

import java.awt.CardLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author chand
 */
public class DisplayPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayPanel
     */
    JPanel userProcessContainer;
    ChartPanel chPAnel;
    public DisplayPanel(JPanel userParocessContainer,ChartPanel chPanel) {
        initComponents();
        this.userProcessContainer=userParocessContainer;
        this.chPAnel=chPanel;
        targetPAnel.add(chPAnel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        targetPAnel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        targetPAnel.setBackground(new java.awt.Color(0, 255, 51));
        targetPAnel.setLayout(new java.awt.BorderLayout());

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\chand\\Pictures\\Untitled.png")); // NOI18N
        jButton1.setText("<<Back");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(targetPAnel, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(targetPAnel, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel targetPAnel;
    // End of variables declaration//GEN-END:variables
}