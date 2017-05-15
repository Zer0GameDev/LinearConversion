/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ermaz0018
 */
public class MetricConversion extends javax.swing.JFrame {

    /**
     * Creates new form MetricConversion
     */
    public MetricConversion() {
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

        mainPanel = new javax.swing.JPanel();
        headerTitle = new javax.swing.JLabel();
        headerSeparator = new javax.swing.JSeparator();
        conversionPanel = new javax.swing.JPanel();
        convertLabel1 = new javax.swing.JLabel();
        convertLabel2 = new javax.swing.JLabel();
        convertLabel3 = new javax.swing.JLabel();
        convertLabel4 = new javax.swing.JLabel();
        choiceLabel = new javax.swing.JLabel();
        inputLabel = new javax.swing.JLabel();
        choiceInput = new javax.swing.JTextField();
        valueInput = new javax.swing.JTextField();
        convertButton = new javax.swing.JButton();
        output = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        headerTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        headerTitle.setForeground(new java.awt.Color(0, 0, 255));
        headerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerTitle.setText("Linear Conversion");

        headerSeparator.setForeground(new java.awt.Color(0, 0, 0));

        conversionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        convertLabel1.setText("1. Inches to Centimeters");

        convertLabel2.setText("2. Feet to Centimeters");

        convertLabel3.setText("3. Yards to Meters");

        convertLabel4.setText("4. Miles to Kilometers");

        javax.swing.GroupLayout conversionPanelLayout = new javax.swing.GroupLayout(conversionPanel);
        conversionPanel.setLayout(conversionPanelLayout);
        conversionPanelLayout.setHorizontalGroup(
            conversionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conversionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conversionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convertLabel1)
                    .addComponent(convertLabel2)
                    .addComponent(convertLabel3)
                    .addComponent(convertLabel4))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        conversionPanelLayout.setVerticalGroup(
            conversionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conversionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(convertLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convertLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convertLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convertLabel4)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        choiceLabel.setText("Conversion Choice:");

        inputLabel.setText("Value to be converted:");

        choiceInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceInputActionPerformed(evt);
            }
        });

        convertButton.setText("Convert");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        output.setForeground(new java.awt.Color(255, 0, 0));
        output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        output.setText("Awaiting Input...");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(headerTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(inputLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valueInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(choiceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(choiceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addComponent(conversionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(convertButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conversionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choiceLabel)
                    .addComponent(choiceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLabel)
                    .addComponent(valueInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(convertButton)
                .addGap(18, 18, 18)
                .addComponent(output)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choiceInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceInputActionPerformed

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        int choice = 0;
        int value = 0;
        int converted = 0;
        int after = 0;
        String unit1 = null;
        String unit2 = null;

        choice = Integer.parseInt(choiceInput.getText());
        value = Integer.parseInt(valueInput.getText());

        switch (choice) {
            case 1:
                after = ItoC(value, converted);
                unit1 = "Inches";
                unit2 = "Centimeters";
                break;
            case 2:
                after = FtoC(value, converted);
                unit1 = "Feet";
                unit2 = "Centimeters";
                break;
            case 3:
                after = YtoM(value, converted);
                unit1 = "Yards";
                unit2 = "Meters";
                break;
            case 4:
                after = MtoK(value, converted);
                unit1 = "Miles";
                unit2 = "Kilometers";
                break;
            default:
                output.setText("Please select a valid choice (1-4)");
                break;
        }
        output.setText(value + " " + unit1 + " = " + after + " " + unit2);
    }//GEN-LAST:event_convertButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MetricConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetricConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetricConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetricConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetricConversion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField choiceInput;
    private javax.swing.JLabel choiceLabel;
    private javax.swing.JPanel conversionPanel;
    private javax.swing.JButton convertButton;
    private javax.swing.JLabel convertLabel1;
    private javax.swing.JLabel convertLabel2;
    private javax.swing.JLabel convertLabel3;
    private javax.swing.JLabel convertLabel4;
    private javax.swing.JSeparator headerSeparator;
    private javax.swing.JLabel headerTitle;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel output;
    private javax.swing.JTextField valueInput;
    // End of variables declaration//GEN-END:variables

    private int ItoC(int value, int converted) {
        converted = (int) (value * 2.54);
        return (converted);
    }

    private int FtoC(int value, int converted) {
        converted = (int) (value * 30);
        return (converted);
    }

    private int MtoK(int value, int converted) {
        converted = (int) (value * 1.6);
        System.out.println(converted);
        return (converted);
    }

    private int YtoM(int value, int converted) {
        converted = (int) (value * 0.91);
        return (converted);
    }
}
