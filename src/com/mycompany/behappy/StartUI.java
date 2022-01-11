
package com.mycompany.behappy;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;


/**
 *
 * @author AKASH BARANWAL
 */
public class StartUI extends javax.swing.JFrame {

    /**
     * Creates new form FirstPageUI
     */
   private DisplayManager mgr;
    public StartUI(DisplayManager mgr) {
       this.mgr=mgr;
        initComponents();
        this.setSize(new Dimension(900, 650));
        this.setLocationRelativeTo(null);
        
        
        animate();

        
        jPanel2.add(jScrollPane1);
        jTextArea1.setText(mgr.BHM.SMgr.generateRandomString());
        jTextArea1.setFont(new Font("Gabriola", Font.BOLD, 24));
        jPanel2.add(jLabel1);
        jPanel2.add(jLabel3);
        jLabel1.setBounds(600, 300, 100, 120);
        jLabel3.setBounds(200, 300, 100, 120);
    }
    public void animate(){
        AnimationClass ac=new AnimationClass();
        ac.jLabelYUp(w.getY(),-1000, 15, 1, w);
        ac.jLabelYDown(d.getY(), 1000, 15, 1, d);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        w = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(176, 221, 194));
        jPanel2.setPreferredSize(new java.awt.Dimension(900, 590));

        w.setBackground(new java.awt.Color(40, 153, 160));
        w.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        w.setForeground(new java.awt.Color(255, 255, 255));
        w.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/logo_full.png"))); // NOI18N
        w.setText("BeHappy");
        w.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(255, 255, 255)));
        w.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        w.setOpaque(true);
        w.setPreferredSize(new java.awt.Dimension(200, 150));
        w.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        d.setBackground(new java.awt.Color(147, 205, 186));
        d.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        d.setForeground(new java.awt.Color(0, 88, 81));
        d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d.setText("WELCOME");
        d.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        d.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addComponent(w, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 900, 650);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/administrative_tools_100px.png"))); // NOI18N
        jLabel1.setText("Admin");
        jLabel1.setToolTipText("continue to admin login");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 100, 117);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/next_100px.png"))); // NOI18N
        jLabel3.setText("Continue");
        jLabel3.setToolTipText("contniue to next screen");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 100, 117);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 33, 13);

        jScrollPane1.setBackground(new java.awt.Color(176, 221, 194));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daily Quote", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI", 0, 36), new java.awt.Color(0, 88, 81))); // NOI18N
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jScrollPane1.setOpaque(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(176, 221, 194));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 17, 51));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(4);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 100, 700, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        mgr.showL();
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        mgr.showMMU();
    }//GEN-LAST:event_jLabel3MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel d;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel w;
    // End of variables declaration//GEN-END:variables
}
