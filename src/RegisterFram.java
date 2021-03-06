
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class RegisterFram extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    
    DBConnnector dbConnector=new DBConnnector();
    public RegisterFram() {
        dbConnector.dbConnectNow();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        phoneTF = new javax.swing.JTextField();
        UserMobileNumberLabel = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        UserPasswordLabel = new javax.swing.JLabel();
        UserPasswordTextField = new javax.swing.JTextField();
        UserEmailAddressTextField = new javax.swing.JTextField();
        UserEmailAddressLabel = new javax.swing.JLabel();
        UserRegisterButton = new javax.swing.JButton();
        UserExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("New User Registration Form");

        UserMobileNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserMobileNumberLabel.setText("Mobile");

        UserNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserNameLabel.setText("User Name: ");

        UserPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserPasswordLabel.setText("Password: ");

        UserEmailAddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserEmailAddressLabel.setText(" Email Address");

        UserRegisterButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        UserRegisterButton.setForeground(new java.awt.Color(51, 51, 255));
        UserRegisterButton.setText("Register");
        UserRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserRegisterButtonActionPerformed(evt);
            }
        });

        UserExitButton.setText("Exit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UserExitButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UserMobileNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UserRegisterButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UserPasswordLabel)
                                    .addComponent(UserEmailAddressLabel))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UserEmailAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UserPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserMobileNumberLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserEmailAddressLabel)
                            .addComponent(UserEmailAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserExitButton))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserRegisterButtonActionPerformed
        // TODO add your handling code here:
        
        RegisterClass registerClass=new RegisterClass();
        String name="",password="",email="",phone="";
        Boolean isEmpty=false;
           
           
        //name
              try {
            name=UserNameTextField.getText();
            
            if(name.isEmpty()){
               JOptionPane.showMessageDialog(this, "Name Cannot be Empty");
                isEmpty=true;
            }
            
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
              
              
          
              
              //phone
                   try {
            phone=phoneTF.getText();
            
            if(phone.isEmpty()){
               JOptionPane.showMessageDialog(this, "Phone Cannot be Empty");
                  isEmpty=true;
            }
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
                   
     
              
              
              //address
              try {
            email=UserEmailAddressTextField.getText();
            
            if(email.isEmpty()){
               JOptionPane.showMessageDialog(this, "Email Cannot be Empty");
                  isEmpty=true;
            }
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
             
         
              
          
            //password
                               try {
            password=UserPasswordTextField.getText();
            
            if(password.isEmpty()){
               JOptionPane.showMessageDialog(this, "Password Cannot be Empty");
                  isEmpty=true;
            }
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
              
              //data assing on register class
           if(isEmpty==false){
//                registerClass.setValue(name, phone, email, password);
//             
//                registerClass.dataWriteinFile();
//                
//                //go to login
//                LoginFrame fram=new LoginFrame();
//                fram.setVisible(true);
//                dispose();

              try {
                   PreparedStatement pst;
                   pst = dbConnector.con.
                           prepareStatement("insert into users(name,phone,email,password)values(?,?,?,?)");
                   pst.setString(1, name);
                   pst.setString(2, phone);
                   pst.setString(3, email);
                   pst.setString(4, password);
                   pst.executeUpdate();

                   UserNameTextField.setText("");
                   phoneTF.setText("");
                   UserEmailAddressTextField.setText("");
                   UserPasswordTextField.setText("");
               }

                catch (SQLException throwables) {
                   throwables.printStackTrace();
               }
               JOptionPane.showMessageDialog(this, "Successfully Register User");
                        
           }
            
    }//GEN-LAST:event_UserRegisterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserEmailAddressLabel;
    private javax.swing.JTextField UserEmailAddressTextField;
    private javax.swing.JButton UserExitButton;
    private javax.swing.JLabel UserMobileNumberLabel;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JLabel UserPasswordLabel;
    private javax.swing.JTextField UserPasswordTextField;
    private javax.swing.JButton UserRegisterButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField phoneTF;
    // End of variables declaration//GEN-END:variables
}
