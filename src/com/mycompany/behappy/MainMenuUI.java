
package com.mycompany.behappy;

import java.awt.Dimension;

public class MainMenuUI extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    private DisplayManager mgr;
    public MainMenuUI(DisplayManager mgr) {
        this.mgr=mgr;
        initComponents();
        this.setSize(new Dimension(900, 650));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tt = new javax.swing.JLabel();
        st = new javax.swing.JLabel();
        rc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setSize(new java.awt.Dimension(900, 650));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(40, 153, 160));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 6, new java.awt.Color(255, 255, 255)));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/logo_full.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Main Menu");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/home.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/arrow.png"))); // NOI18N
        jLabel10.setFocusable(false);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(135, 135, 135)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 250, 650);

        jPanel2.setBackground(new java.awt.Color(147, 205, 186));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tt.setForeground(new java.awt.Color(0, 88, 81));
        tt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/test_80px.png"))); // NOI18N
        tt.setText("Take test");
        tt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ttMouseClicked(evt);
            }
        });

        st.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        st.setForeground(new java.awt.Color(0, 88, 81));
        st.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/doctor_male_100px.png"))); // NOI18N
        st.setText("Search Therapist");
        st.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        st.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        st.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stMouseClicked(evt);
            }
        });

        rc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rc.setForeground(new java.awt.Color(0, 88, 81));
        rc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/proactivity_80px.png"))); // NOI18N
        rc.setText("Refreshment Centre");
        rc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rcMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(st, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(230, 230, 230))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(tt)
                .addGap(21, 21, 21)
                .addComponent(st)
                .addGap(18, 18, 18)
                .addComponent(rc, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(250, 0, 650, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stMouseClicked
        // TODO add your handling code here:
        mgr.showST();
    }//GEN-LAST:event_stMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        mgr.showSU();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
       mgr.showSU();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void rcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rcMouseClicked
        // TODO add your handling code here:
        mgr.showRM();
        
    }//GEN-LAST:event_rcMouseClicked

    private void ttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ttMouseClicked
        // TODO add your handling code here:
        mgr.showTTU();
    }//GEN-LAST:event_ttMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel rc;
    private javax.swing.JLabel st;
    private javax.swing.JLabel tt;
    // End of variables declaration//GEN-END:variables
}
