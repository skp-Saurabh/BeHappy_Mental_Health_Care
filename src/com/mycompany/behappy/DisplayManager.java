/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.behappy;

import java.util.ArrayList;

/**
 *
 * @author ROHIT KUMAR GUPTA & AKASH BARANWAL
 */
public class DisplayManager {

    StartUI SU;
    FindTherapistsResultUI FTR;
    MainMenuUI MMU;
    ManageTherapistMainUI MTMU;
    ManageTherapistAddUI MTAU;
    ManageTherapistDSUUI MTDSU;
    PreferencesUI PU;
    QuoteGUI QG;
    SearchTherapistUI ST;
    MusicGUI SG;
    Story1GUI S1;
    Story2GUI S2;
    loginUI L;
    Refreshment_Menu RM;
    TakeTestUI TTU;
    BehappyManager BHM;
    
    public DisplayManager() {
        
    }

    public void hideALL() {
        SU.setVisible(false);
        FTR.setVisible(false);
        MMU.setVisible(false);
        MTMU.setVisible(false);
        MTAU.setVisible(false);

        MTDSU.setVisible(false);
        PU.setVisible(false);
        QG.setVisible(false);
        ST.setVisible(false);
        SG.setVisible(false);
        S1.setVisible(false);
        S2.setVisible(false);
        L.setVisible(false);
        RM.setVisible(false);
        TTU.setVisible(false);
    }

    public void showSU() {
        this.hideALL();
         SU.setVisible(true);
        SU.animate();
       
    }

    public void showFTR(String City,int budget,ArrayList<Therapist> Therapist) {
        
        this.hideALL();
        FTR.setCB(City, budget);
        FTR.showDetails(Therapist, 0);
        FTR.setVisible(true);
    }

    public void showMMU() {
        this.hideALL();
        MMU.setVisible(true);
    }

    public void showMTMU() {
        this.hideALL();
        MTMU.setVisible(true);
    }

    public void showMTAU() {
        this.hideALL();
        MTAU.setVisible(true);
    }

    public void showMTDSU(String type) {
        this.hideALL();
        MTDSU.setUIType(type);
        MTDSU.setVisible(true);

    }

    public void showPU() {
        this.hideALL();
        PU.setVisible(true);
    }

    public void showQG() {
        this.hideALL();
        QG.setVisible(true);
    }

    public void showST() {
        this.hideALL();
        ST.setVisible(true);
    }

    public void showSG() {
        this.hideALL();
        SG.setVisible(true);
    }

    public void showS1() {
        this.hideALL();
        S1.setVisible(true);
    }

    public void showS2(MotivationalStory ms) {
        this.hideALL();
        S2.setStory(ms);
        S2.setVisible(true);
    }

    public void showL() {
        this.hideALL();
        L.setVisible(true);
    }

    public void showRM() {
        this.hideALL();
        RM.setVisible(true);
    }
    public void showTTU(){
        this.hideALL();
        TTU.setVisible(true);
    }


}
