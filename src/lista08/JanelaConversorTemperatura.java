/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JanelaConversorTemperatura.java
 *
 * Created on 21/11/2011, 20:48:41
 */

package lista08;

/**
 *
 * @author LABCCET
 */
public class JanelaConversorTemperatura extends javax.swing.JFrame {

    /** Creates new form JanelaConversorTemperatura */
    public JanelaConversorTemperatura() {
        initComponents();
    }

    private void converterParaCelsius() throws NumberFormatException {
        String strFahrenheit = txtFahrenheit.getText();
        double fahrenheit = Double.parseDouble(strFahrenheit);
        double tempCelsius = ConversorTemperatura.fahrenheitToCelsius(fahrenheit);
        txtCelsius.setText(String.valueOf(tempCelsius));
    }

    private void converterParaFahrenheit() throws NumberFormatException {
        String strCelsius = txtCelsius.getText();
        double celsius = Double.parseDouble(strCelsius);
        double tempFahrenheit = ConversorTemperatura.celsiusToFahrenheit(celsius);
        txtFahrenheit.setText(String.valueOf(tempFahrenheit));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCelsius = new javax.swing.JTextField();
        txtFahrenheit = new javax.swing.JTextField();
        btnCelsius = new javax.swing.JButton();
        btnFahrenheit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Temperatura");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setName("frameConversorTemperatura"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Celsius");

        jLabel2.setText("Fahrenheit");

        txtCelsius.setName("celsiusInput"); // NOI18N
        txtCelsius.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelsiusFocusLost(evt);
            }
        });

        txtFahrenheit.setName("fahrenheitInput"); // NOI18N
        txtFahrenheit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFahrenheitFocusLost(evt);
            }
        });

        btnCelsius.setText("Para Fahrenheit");
        btnCelsius.setName("btFahrenheit"); // NOI18N
        btnCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelsiusActionPerformed(evt);
            }
        });

        btnFahrenheit.setText("Para celsius");
        btnFahrenheit.setName("btCelsius"); // NOI18N
        btnFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFahrenheitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFahrenheit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txtCelsius, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnFahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCelsius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCelsius))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFahrenheit))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelsiusActionPerformed
        converterParaFahrenheit();

    }//GEN-LAST:event_btnCelsiusActionPerformed

    private void btnFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFahrenheitActionPerformed
        converterParaCelsius();
    }//GEN-LAST:event_btnFahrenheitActionPerformed

    private void txtCelsiusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelsiusFocusLost
        converterParaFahrenheit();
        
    }//GEN-LAST:event_txtCelsiusFocusLost

    private void txtFahrenheitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFahrenheitFocusLost
        converterParaCelsius();

    }//GEN-LAST:event_txtFahrenheitFocusLost

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaConversorTemperatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCelsius;
    private javax.swing.JButton btnFahrenheit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCelsius;
    private javax.swing.JTextField txtFahrenheit;
    // End of variables declaration//GEN-END:variables

}