/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.behappy;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author AKASH BARANWAL
 */
public class FindTherapistsResultUI extends javax.swing.JFrame {

    /**
     * Creates new form FindTherapistsResultUI
     */
    private String city;
    private int budget;
    int count=0;
    private DisplayManager mgr;
    public FindTherapistsResultUI(DisplayManager mgr) {
        this.mgr=mgr;
        initComponents();
        this.setLocationRelativeTo(null);
//        jLabel7.setIcon(new ImageIcon("src/utils/logo.png"));
        
    }
    public void setCB(String city,int budget) {

        this.city=city;
        this.budget=budget;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nt = new javax.swing.JLabel();
        cnt = new javax.swing.JLabel();
        et = new javax.swing.JLabel();
        ft = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        at = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        urlt = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(40, 153, 160));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 6, new java.awt.Color(255, 255, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(260, 650));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/logo_full.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(176, 221, 194));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Results");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/arrow.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/home.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(225, 225, 225))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 260, 650);

        jPanel2.setBackground(new java.awt.Color(147, 205, 186));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 17, 51));
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 17, 51));
        jLabel5.setText("Contact No:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 17, 51));
        jLabel6.setText("Experience:");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 17, 51));
        jLabel1.setText("Fees:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 17, 51));
        jLabel2.setText("Address:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 17, 51));
        jLabel3.setText("URL:");

        nt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nt.setForeground(new java.awt.Color(0, 17, 51));
        nt.setPreferredSize(new java.awt.Dimension(100, 13));

        cnt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cnt.setForeground(new java.awt.Color(0, 17, 51));

        et.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        et.setForeground(new java.awt.Color(0, 17, 51));

        ft.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ft.setForeground(new java.awt.Color(0, 17, 51));

        jButton1.setBackground(new java.awt.Color(40, 153, 160));
        jButton1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Next");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(true);
        jButton1.setPreferredSize(new java.awt.Dimension(26, 15));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(40, 153, 160));
        jButton2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Previous");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setOpaque(true);
        jButton2.setPreferredSize(new java.awt.Dimension(26, 15));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        at.setEditable(false);
        at.setBackground(new java.awt.Color(147, 205, 186));
        at.setColumns(20);
        at.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        at.setForeground(new java.awt.Color(0, 17, 51));
        at.setLineWrap(true);
        at.setRows(5);
        at.setWrapStyleWord(true);
        at.setBorder(null);
        jScrollPane1.setViewportView(at);

        jScrollPane2.setBorder(null);

        urlt.setEditable(false);
        urlt.setBackground(new java.awt.Color(147, 205, 186));
        urlt.setColumns(20);
        urlt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        urlt.setForeground(new java.awt.Color(0, 17, 51));
        urlt.setLineWrap(true);
        urlt.setRows(5);
        urlt.setWrapStyleWord(true);
        urlt.setBorder(null);
        jScrollPane2.setViewportView(urlt);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/open_in_browser_50px.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 35, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nt, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(ft, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(119, 119, 119)
                                            .addComponent(jLabel6)
                                            .addGap(44, 44, 44)
                                            .addComponent(et, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cnt, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ft, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(et, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cnt, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(260, 0, 640, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void showDetails(ArrayList<Therapist> arr,int index){
      
        nt.setText(arr.get(index).getName());
        cnt.setText(arr.get(index).getContactNumber());
        et.setText(arr.get(index).getExperience());
        ft.setText(arr.get(index).getFees());
        at.setText(arr.get(index).getAddress());
        urlt.setText(arr.get(index).getWebsite());
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList<Therapist> therapists=new ArrayList<>();
//        FindTherapistManager ftm=new FindTherapistManager();
        therapists=mgr.BHM.FTMgr.recommend(city, budget);
        

        if(count<therapists.size()-1)
        {
            count+=1;
            nt.setText(therapists.get(count).getName().toString());
            cnt.setText(therapists.get(count).getContactNumber());
            et.setText(therapists.get(count).getExperience());
            ft.setText(therapists.get(count).getFees());
            at.setText(therapists.get(count).getAddress());
            urlt.setText(therapists.get(count).getWebsite());
            urlt.setCaretPosition(0);
//            jButton2.setContentAreaFilled(true);
            jButton2.setBackground(new Color(40,153,160));
            jButton2.setForeground(Color.WHITE);
            jButton2.setEnabled(true);
        }
        else{
            jButton1.setContentAreaFilled(true);
            jButton1.setForeground(Color.GRAY);
            jButton1.setBackground(Color.GRAY);
            jButton1.setEnabled(false);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ArrayList<Therapist> therapists=new ArrayList<>();
        FindTherapistManager ftm=new FindTherapistManager();
        therapists=mgr.BHM.FTMgr.recommend(city, budget);
        if(count>0)
        {
            if(count==therapists.size())
            {
                count-=1;
            }
            count-=1;
            nt.setText(therapists.get(count).getName().toString());
            cnt.setText(therapists.get(count).getContactNumber());
            et.setText(therapists.get(count).getExperience());
            ft.setText(therapists.get(count).getFees());
            at.setText(therapists.get(count).getAddress());
            urlt.setText(therapists.get(count).getWebsite());
            urlt.setCaretPosition(0);
//            jButton1.setContentAreaFilled(true);
            jButton1.setBackground(new Color(40,153,160));
            jButton1.setForeground(Color.WHITE);
            jButton1.setEnabled(true);
        }
        else{
            jButton2.setContentAreaFilled(true);
            jButton2.setForeground(Color.GRAY);
            jButton2.setBackground(Color.GRAY);
            jButton2.setEnabled(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
//        ManagerST mng=new ManagerST();
        mgr.BHM.Mgr.openWebsite(urlt.getText());
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
     
        mgr.showMMU();
        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        
        mgr.showPU();
       
    }//GEN-LAST:event_jLabel10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea at;
    private javax.swing.JLabel cnt;
    private javax.swing.JLabel et;
    private javax.swing.JLabel ft;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nt;
    private javax.swing.JTextArea urlt;
    // End of variables declaration//GEN-END:variables
}
