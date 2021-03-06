/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManufacturerAdminRole;

import Business.Drug.ChemicalCompound;
import Business.Drug.Drug;
import Business.Enterprise.ManufactureEnterprise;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author chand
 */
public class DrugInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DrugInfoJPanel
     */
    JPanel userProcessContainer;
    ManufactureEnterprise enterprise;
    Drug drug;
    ButtonGroup buttonGroup;
    public DrugInfoJPanel(JPanel userProcessContainer,ManufactureEnterprise enterprise,Drug drug) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.drug=drug;
        drugnameLabel.setText(drug.toString());
            buttonGroup=new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);
        buttonGroup.add(jRadioButton4);
        if(drug.getSelectedDosage()>0)
        {
        populateDrugDetails();
        finishBtn.setEnabled(false);
        }
    }

    public void populateDrugDetails(){
        activeCompoundTxtFld.setEnabled(false);
        activeCompoundPercentTxtFld.setEnabled(false);
        activeCompoundTxtFld.setText(drug.getActiveCompound().getCompoundName());
        activeCompoundPercentTxtFld.setText(String.valueOf(drug.getActiveCompound().getPercentageInDrug()));
        
        
        
    }
    public int dosageSelected(){
        int dosage=0;
        if(jRadioButton1.isSelected())
        {
            dosage=25;
        }
        if(jRadioButton2.isSelected())
        {
            dosage=50;
        }
        if(jRadioButton3.isSelected())
        {
            dosage=75;
        }
        if(jRadioButton4.isSelected())
        {
            dosage=100;
        }
        
        return dosage;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        drugnameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        activeCompoundTxtFld = new javax.swing.JTextField();
        otherCompoundsLabel = new javax.swing.JLabel();
        activeCompoundPercentTxtFld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        compound1TxtFld = new javax.swing.JTextField();
        compound2TxtFld = new javax.swing.JTextField();
        compound3TxtFld = new javax.swing.JTextField();
        compound4TxtFld = new javax.swing.JTextField();
        compound5TxtFld = new javax.swing.JTextField();
        compound6TxtFld = new javax.swing.JTextField();
        finishBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        compound1PercentTxtFld = new javax.swing.JTextField();
        compound2PercentTxtFld = new javax.swing.JTextField();
        compound3PercentTxtFld = new javax.swing.JTextField();
        compound4PercentTxtFld = new javax.swing.JTextField();
        compound5PercentTxtFld = new javax.swing.JTextField();
        compound6PercentTxtFld = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();

        jLabel1.setText("Drug Information");

        drugnameLabel.setText("Drug name:");

        jLabel2.setText("dosage");

        jRadioButton1.setText("25mcg");

        jRadioButton2.setText("50mcg");

        jRadioButton3.setText("75mcg");

        jRadioButton4.setText("100mcg");

        jLabel3.setText("Active ingredient");

        otherCompoundsLabel.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        otherCompoundsLabel.setText("Inactive compounds:");

        jLabel5.setText("Percentage:");

        jLabel6.setText("Compound1:");

        jLabel7.setText("Compound2:");

        jLabel8.setText("Compound3:");

        jLabel9.setText("Compound4:");

        jLabel10.setText("Compound5:");

        jLabel11.setText("Compound6:");

        finishBtn.setText("Finish");
        finishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishBtnActionPerformed(evt);
            }
        });

        jLabel12.setText("Percentage:");

        jLabel13.setText("Percentage:");

        jLabel14.setText("Percentage:");

        jLabel15.setText("Percentage:");

        jLabel16.setText("Percentage:");

        jLabel17.setText("Percentage:");

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(activeCompoundTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel16)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel15)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel17))))
                                        .addGap(58, 58, 58))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(compound1TxtFld)
                                            .addComponent(compound2TxtFld)
                                            .addComponent(compound3TxtFld)
                                            .addComponent(compound4TxtFld)
                                            .addComponent(compound5TxtFld)
                                            .addComponent(compound6TxtFld))
                                        .addGap(199, 199, 199))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(backBtn)
                                        .addGap(316, 316, 316)
                                        .addComponent(finishBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(activeCompoundPercentTxtFld)
                                    .addComponent(compound1PercentTxtFld, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(compound2PercentTxtFld)
                                    .addComponent(compound3PercentTxtFld)
                                    .addComponent(compound4PercentTxtFld)
                                    .addComponent(compound5PercentTxtFld)
                                    .addComponent(compound6PercentTxtFld))
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(drugnameLabel)
                                                .addGap(251, 251, 251)
                                                .addComponent(jLabel1))
                                            .addComponent(otherCompoundsLabel))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)
                                        .addComponent(jRadioButton1)
                                        .addGap(81, 81, 81)
                                        .addComponent(jRadioButton2)
                                        .addGap(70, 70, 70)
                                        .addComponent(jRadioButton3)
                                        .addGap(65, 65, 65)
                                        .addComponent(jRadioButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(drugnameLabel)))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(activeCompoundTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activeCompoundPercentTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(44, 44, 44)
                .addComponent(otherCompoundsLabel)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(compound1TxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(compound1PercentTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(compound2TxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(compound2PercentTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(compound3TxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(compound3PercentTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(compound4TxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(compound4PercentTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(compound5TxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(compound5PercentTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(compound6TxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(compound6PercentTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finishBtn)
                    .addComponent(backBtn))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void finishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishBtnActionPerformed
        // TODO add your handling code here:
        
        drug.setSelectedDosage(dosageSelected());
        ChemicalCompound cc=new ChemicalCompound();
        cc.setCompoundName(activeCompoundTxtFld.getText());
        cc.setPercentageInDrug(Integer.parseInt(activeCompoundPercentTxtFld.getText()));
        drug.setActiveCompound(cc);
        drug.getChemicalCompounds().add(cc);
        
        //1st inactive compound
        cc=new ChemicalCompound();
        cc.setCompoundName(compound1TxtFld.getText());
        cc.setPercentageInDrug(Integer.parseInt(compound1PercentTxtFld.getText()));
        drug.getChemicalCompounds().add(cc);
        
        //2nd inactive compound
        cc=new ChemicalCompound();
        cc.setCompoundName(compound2TxtFld.getText());
        cc.setPercentageInDrug(Integer.parseInt(compound2PercentTxtFld.getText()));
        drug.getChemicalCompounds().add(cc);
        
        //3rd inactive compound
        cc=new ChemicalCompound();
        cc.setCompoundName(compound3TxtFld.getText());
        cc.setPercentageInDrug(Integer.parseInt(compound3PercentTxtFld.getText()));
        drug.getChemicalCompounds().add(cc);
        
        //4th inactive compound
        cc=new ChemicalCompound();
        cc.setCompoundName(compound4TxtFld.getText());
        cc.setPercentageInDrug(Integer.parseInt(compound4PercentTxtFld.getText()));
        drug.getChemicalCompounds().add(cc);
        
        //5th inactive compound
        cc=new ChemicalCompound();
        cc.setCompoundName(compound5TxtFld.getText());
        cc.setPercentageInDrug(Integer.parseInt(compound5PercentTxtFld.getText()));
        drug.getChemicalCompounds().add(cc);
        
        //6th inactive compound
        cc=new ChemicalCompound();
        cc.setCompoundName(compound6TxtFld.getText());
        cc.setPercentageInDrug(Integer.parseInt(compound6PercentTxtFld.getText()));
        drug.getChemicalCompounds().add(cc);
        
        //after all validations are done
        Boolean drugWithSameDosageExists=false;
        for(Drug drug:enterprise.getDrugList())
        {
            if(drug.getSelectedDosage()==dosageSelected())
            {
                drugWithSameDosageExists=true;
                JOptionPane.showMessageDialog(null, "You have already a drug manufactured with the same dosage");
                break;
            }
        }
        if(drugWithSameDosageExists==false)
        {
        enterprise.addDrug(drug.getName(),dosageSelected());
        drug.setManufactureEnterprise(enterprise);
        ChemicalCompound chch=new ChemicalCompound();
        chch.setCompoundName(activeCompoundTxtFld.getText());
        chch.setPercentageInDrug(Integer.parseInt(activeCompoundPercentTxtFld.getText()));
        drug.setActiveCompound(chch);
        }
    }//GEN-LAST:event_finishBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
      AdminWorkAreaJPanel awjp = (AdminWorkAreaJPanel) component;
        awjp.populateDrugTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backBtnActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField activeCompoundPercentTxtFld;
    private javax.swing.JTextField activeCompoundTxtFld;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField compound1PercentTxtFld;
    private javax.swing.JTextField compound1TxtFld;
    private javax.swing.JTextField compound2PercentTxtFld;
    private javax.swing.JTextField compound2TxtFld;
    private javax.swing.JTextField compound3PercentTxtFld;
    private javax.swing.JTextField compound3TxtFld;
    private javax.swing.JTextField compound4PercentTxtFld;
    private javax.swing.JTextField compound4TxtFld;
    private javax.swing.JTextField compound5PercentTxtFld;
    private javax.swing.JTextField compound5TxtFld;
    private javax.swing.JTextField compound6PercentTxtFld;
    private javax.swing.JTextField compound6TxtFld;
    private javax.swing.JLabel drugnameLabel;
    private javax.swing.JButton finishBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel otherCompoundsLabel;
    // End of variables declaration//GEN-END:variables
}
