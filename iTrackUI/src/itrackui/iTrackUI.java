/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itrackui;

/**
 *
 * @author francis.brero
 */
public class iTrackUI extends javax.swing.JPanel {

    /**
     * Creates new form MainMenu
     */
    public iTrackUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNextAction = new javax.swing.JButton();
        jPreviousAction = new javax.swing.JButton();
        jValidateAction = new javax.swing.JButton();
        jCancelAction = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jActionNameText = new javax.swing.JTextField();

        jNextAction.setText("next");
        jNextAction.setToolTipText("");

        jPreviousAction.setText("previous");
        jPreviousAction.setToolTipText("");

        jValidateAction.setText("validate");

        jCancelAction.setText("cancel");

        jActionNameText.setText("actionName");
        jActionNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActionNameTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPreviousAction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jNextAction)
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCancelAction)
                            .addComponent(jValidateAction)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jActionNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jActionNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jValidateAction)
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPreviousAction)
                    .addComponent(jNextAction))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(jCancelAction)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jActionNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActionNameTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jActionNameTextActionPerformed

    private void jNextActionClicked(java.awt.event.ActionEvent evt){
    System.out.println("next");
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jActionNameText;
    private javax.swing.JButton jCancelAction;
    private javax.swing.JButton jNextAction;
    private javax.swing.JButton jPreviousAction;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jValidateAction;
    // End of variables declaration//GEN-END:variables
}
