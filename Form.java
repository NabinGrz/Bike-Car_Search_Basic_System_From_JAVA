
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class Form extends javax.swing.JFrame {

    //bikeCarName, manufacturer, engineType, engineCC, bHP, engineTorque,Categories, price, mileage
    public static String bikeCarSelection, bikeCarName, engineCC, bHP, manufacturer, engineTorque, categories, engineType;
    public static double mileage;
    public static int price;

    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
        imgDesign();

    }
//method to add images in system

    void imgDesign() {
        ImageIcon ic = new javax.swing.ImageIcon(getClass().getResource("/Images/mylogo.png"));
        Image img = ic.getImage();
        Image imgScale = img.getScaledInstance(120, 62, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel1.setIcon(scaledIcon);

        ImageIcon ico = new javax.swing.ImageIcon(getClass().getResource("/Images/names.png"));
        Image imgs = ico.getImage();
        Image imgScale2 = imgs.getScaledInstance(270, 65, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
        jLabel2.setIcon(scaledIcon2);

        ImageIcon ic4 = new javax.swing.ImageIcon(getClass().getResource("/Images/clear.png"));
        Image img4 = ic4.getImage();
        Image imgScale4 = img4.getScaledInstance(27, 23, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon(imgScale4);
        clearBTN.setIcon(scaledIcon4);

        ImageIcon ic5 = new javax.swing.ImageIcon(getClass().getResource("/Images/exiticon.png"));
        Image img5 = ic5.getImage();
        Image imgScale5 = img5.getScaledInstance(25, 23, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon5 = new ImageIcon(imgScale5);
        exitBTN.setIcon(scaledIcon5);

        ImageIcon ic6 = new javax.swing.ImageIcon(getClass().getResource("/Images/ADD.png"));
        Image img6 = ic6.getImage();
        Image imgScale6 = img6.getScaledInstance(25, 23, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon6 = new ImageIcon(imgScale6);
        addVehicleBTN.setIcon(scaledIcon6);

        ImageIcon ic7 = new javax.swing.ImageIcon(getClass().getResource("/Images/Up.png"));
        Image img7 = ic7.getImage();
        Image imgScale7 = img7.getScaledInstance(25, 23, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon7 = new ImageIcon(imgScale7);
        updateBTN.setIcon(scaledIcon7);
//updateBTN

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField4 = new javax.swing.JTextField();
        jOptionPane1 = new javax.swing.JOptionPane();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        addVehicleBTN = new javax.swing.JButton();
        clearBTN = new javax.swing.JButton();
        manufacturerCB = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        bikeRB = new javax.swing.JRadioButton();
        carRB = new javax.swing.JRadioButton();
        engineTypeCB = new javax.swing.JComboBox<>();
        engineTorqueTextField = new javax.swing.JTextField();
        bikeCarNameTextField = new javax.swing.JTextField();
        engineCCTextField = new javax.swing.JTextField();
        bhpTextField = new javax.swing.JTextField();
        categoriesTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        exitBTN = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mileageTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        updateBTN = new javax.swing.JButton();

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 102));
        jLabel3.setText("YOUR VEHICLE");

        jTextField4.setBackground(new java.awt.Color(255, 255, 0));
        jTextField4.setFont(new java.awt.Font("Bell MT", 0, 15)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Wheels&Deals");
        setLocation(new java.awt.Point(700, 140));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(51, 255, 51));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 0));
        jLabel6.setText("Bike/Car Name:");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 0));
        jLabel7.setText("Manufacturer:");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 0));
        jLabel8.setText("Engine Type:");

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 0));
        jLabel9.setText("Engine CC:");

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 255, 0));
        jLabel10.setText("Engine Torque:");

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 255, 0));
        jLabel11.setText("BHP:");

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 255, 0));
        jLabel12.setText("Categories:");

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 255, 0));
        jLabel13.setText("Price:");

        addVehicleBTN.setBackground(new java.awt.Color(255, 255, 0));
        addVehicleBTN.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        addVehicleBTN.setText("ADD VEHICLE");
        addVehicleBTN.setBorder(null);
        addVehicleBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehicleBTNActionPerformed(evt);
            }
        });

        clearBTN.setBackground(new java.awt.Color(255, 0, 0));
        clearBTN.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        clearBTN.setText("CLEAR");
        clearBTN.setBorder(null);
        buttonGroup1.add(clearBTN);
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });

        manufacturerCB.setBackground(new java.awt.Color(51, 255, 0));
        manufacturerCB.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        manufacturerCB.setForeground(new java.awt.Color(255, 255, 255));
        manufacturerCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECT BRAND---", "KTM", "HONDA", "YAMAHA", "DUCATI", "KAWASHAKI", "BMW", "SUZUKI", "APRILLA", "TRIYUMPH", "NISSAN", "FORD", "VOLKSWAGEN", "FERARRI", "LAMBORGHINI", "MCLAREN", "HYUNDAI" }));
        manufacturerCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturerCBActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 255, 0));
        jLabel14.setText("Bike or Car:");

        bikeRB.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup1.add(bikeRB);
        bikeRB.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        bikeRB.setForeground(new java.awt.Color(255, 255, 255));
        bikeRB.setText("BIKE");

        carRB.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup1.add(carRB);
        carRB.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        carRB.setForeground(new java.awt.Color(255, 255, 255));
        carRB.setText("CAR");

        engineTypeCB.setBackground(new java.awt.Color(51, 255, 0));
        engineTypeCB.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        engineTypeCB.setForeground(new java.awt.Color(255, 255, 255));
        engineTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECT TYPE---", "V FOUR", "INLINE THREE", "INLINE FOUR", "SUPERCHARGED", "CROSSPLANE", "L TWIN", "BOXER", "PARALELL TWIN", "V TWIN", "V SIX", "SINGLE CYLINDER", "V TWELVE", "V EIGHT" }));

        engineTorqueTextField.setFont(new java.awt.Font("Bell MT", 0, 15)); // NOI18N
        engineTorqueTextField.setForeground(new java.awt.Color(102, 102, 102));
        engineTorqueTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                engineTorqueTextFieldMouseClicked(evt);
            }
        });
        engineTorqueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engineTorqueTextFieldActionPerformed(evt);
            }
        });
        engineTorqueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                engineTorqueTextFieldKeyPressed(evt);
            }
        });

        bikeCarNameTextField.setFont(new java.awt.Font("Bell MT", 0, 15)); // NOI18N
        bikeCarNameTextField.setForeground(new java.awt.Color(102, 102, 102));
        bikeCarNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bikeCarNameTextFieldMouseClicked(evt);
            }
        });
        bikeCarNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bikeCarNameTextFieldActionPerformed(evt);
            }
        });
        bikeCarNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bikeCarNameTextFieldKeyPressed(evt);
            }
        });

        engineCCTextField.setFont(new java.awt.Font("Bell MT", 0, 15)); // NOI18N
        engineCCTextField.setForeground(new java.awt.Color(102, 102, 102));
        engineCCTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                engineCCTextFieldMouseClicked(evt);
            }
        });
        engineCCTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                engineCCTextFieldKeyPressed(evt);
            }
        });

        bhpTextField.setFont(new java.awt.Font("Bell MT", 0, 15)); // NOI18N
        bhpTextField.setForeground(new java.awt.Color(102, 102, 102));
        bhpTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bhpTextFieldMouseClicked(evt);
            }
        });
        bhpTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhpTextFieldActionPerformed(evt);
            }
        });
        bhpTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bhpTextFieldKeyPressed(evt);
            }
        });

        categoriesTextField.setFont(new java.awt.Font("Bell MT", 0, 15)); // NOI18N
        categoriesTextField.setForeground(new java.awt.Color(102, 102, 102));
        categoriesTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoriesTextFieldMouseClicked(evt);
            }
        });
        categoriesTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                categoriesTextFieldKeyPressed(evt);
            }
        });

        priceTextField.setFont(new java.awt.Font("Bell MT", 0, 15)); // NOI18N
        priceTextField.setForeground(new java.awt.Color(102, 102, 102));
        priceTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priceTextFieldMouseClicked(evt);
            }
        });
        priceTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceTextFieldKeyPressed(evt);
            }
        });

        exitBTN.setBackground(new java.awt.Color(255, 0, 0));
        exitBTN.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        exitBTN.setText("EXIT");
        exitBTN.setBorder(null);
        buttonGroup1.add(exitBTN);
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(0, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("V 1.0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        mileageTextField.setFont(new java.awt.Font("Bell MT", 0, 15)); // NOI18N
        mileageTextField.setForeground(new java.awt.Color(102, 102, 102));
        mileageTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mileageTextFieldMouseClicked(evt);
            }
        });
        mileageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mileageTextFieldKeyPressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 255, 0));
        jLabel15.setText("Mileage:");

        updateBTN.setBackground(new java.awt.Color(255, 255, 0));
        updateBTN.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        updateBTN.setText("UPDATE");
        updateBTN.setBorder(null);
        buttonGroup1.add(updateBTN);
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(clearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addVehicleBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(engineCCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bhpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(engineTorqueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoriesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(bikeRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(carRB))
                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(engineTypeCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manufacturerCB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bikeCarNameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mileageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(bikeRB)
                    .addComponent(carRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bikeCarNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(manufacturerCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(engineTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(engineCCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(engineTorqueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(bhpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(categoriesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(mileageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addVehicleBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manufacturerCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturerCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturerCBActionPerformed

    private void addVehicleBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehicleBTNActionPerformed
        try {
            if (bikeCarNameTextField.getText().isEmpty()
                    && bikeRB.isSelected() == false
                    && carRB.isSelected() == false
                    && engineCCTextField.getText().isEmpty()
                    && manufacturerCB.getSelectedIndex() == 0
                    && engineTypeCB.getSelectedIndex() == 0
                    && engineTorqueTextField.getText().isEmpty()
                    && bhpTextField.getText().isEmpty()
                    && priceTextField.getText().isEmpty()
                    && categoriesTextField.getText().isEmpty()
                    && mileageTextField.getText().isEmpty()) {

                JOptionPane.showMessageDialog(rootPane, "PLEASE FILL UP ALL THE AVAILBLE FIELD");
            } else {

                if (manufacturerCB.getSelectedIndex() != 0) {

                    if (engineTypeCB.getSelectedIndex() != 0) {

                        if (isValid(bikeCarNameTextField.getText(), "STR")
                                && isValid(engineCCTextField.getText(), "INT")
                                && isValid(engineTorqueTextField.getText(), "INT")
                                && isValid(bhpTextField.getText(), "INT")
                                && isValid(priceTextField.getText(), "INT")
                                && isValid(categoriesTextField.getText(), "STR")
                                && isValid(mileageTextField.getText(), "INT")) {

                            bikeCarName = bikeCarNameTextField.getText();
                            manufacturer = manufacturerCB.getSelectedItem().toString();
                            engineType = engineTypeCB.getSelectedItem().toString();
                            engineCC = engineCCTextField.getText();
                            engineTorque = engineTorqueTextField.getText();
                            bHP = bhpTextField.getText().toString();
                            categories = categoriesTextField.getText();
                            price = Integer.parseInt(priceTextField.getText());
                            mileage = Double.parseDouble(mileageTextField.getText());
                            Main.addRowToTable(bikeCarName.toUpperCase(), manufacturer.toUpperCase(), engineType.toUpperCase(), engineCC, engineTorque, bHP, categories.toUpperCase(), price, mileage);
                            if (bikeRB.isSelected()) {
                                JOptionPane.showMessageDialog(rootPane, "BIKE DETAILS ADDED SUCCESSFULLY");
                            } else if (carRB.isSelected()) {
                                JOptionPane.showMessageDialog(rootPane, "CAR DETAILS ADDED SUCCESSFULLY");
                            }
                        } else {

                            JFrame f2 = new JFrame();
                            JOptionPane.showMessageDialog(f2, "INVALID INPUT!! PLEASE ENTER VALID DETAILS.");

                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "PLEASE SELECT ENGINE TYPE FOR ");
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "PLEASE SELECT MANUFACTURER FOR ADDING");
                }

                if (bikeRB.isSelected() == false && carRB.isSelected() == false) {
                    JOptionPane.showMessageDialog(rootPane, "PLEASE SELECT BIKE/CAR TABLE TO ADD");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "TABLE IS FULL");
        }
    }//GEN-LAST:event_addVehicleBTNActionPerformed
//method to check validation

    private boolean isValid(String str, String checkFor) {
        boolean valid = false;

        if (checkFor.equals("STR")) {
            valid = checkString(str);

        } else if (checkFor.equals("INT")) {
            valid = checkInteger(str);
        }
        return valid;
    }
//method to check String input

    private boolean checkString(String str) {
        if (str.equals("")) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
//method to check integer input

    private boolean checkInteger(String str) {
        if (str.equals("")) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        dispose();
    }//GEN-LAST:event_exitBTNActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed

        buttonGroup1.clearSelection();
        bikeCarNameTextField.setText(null);
        manufacturerCB.setSelectedIndex(0);
        engineTypeCB.setSelectedIndex(0);
        engineCCTextField.setText(null);
        engineTorqueTextField.setText(null);
        bhpTextField.setText(null);
        categoriesTextField.setText(null);
        priceTextField.setText(null);
        mileageTextField.setText(null);
    }//GEN-LAST:event_clearBTNActionPerformed

    private void bikeCarNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bikeCarNameTextFieldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();
        if (keyCode == 48 || keyCode == 49 || keyCode == 50 || keyCode == 51 || keyCode == 52 || keyCode == 53 || keyCode == 54 || keyCode == 55 || keyCode == 56 || keyCode == 57 || keyCode == 96 || keyCode == 97 || keyCode == 98 || keyCode == 99 || keyCode == 100 || keyCode == 101 || keyCode == 102 || keyCode == 103 || keyCode == 104 || keyCode == 105) {
            bikeCarNameTextField.setForeground(Color.red);
        } else {
            bikeCarNameTextField.setForeground(Color.black);
        }
    }//GEN-LAST:event_bikeCarNameTextFieldKeyPressed

    private void priceTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceTextFieldKeyPressed
        int keyCode = evt.getKeyCode();

        if (keyCode == 48 || keyCode == 49 || keyCode == 50 || keyCode == 51 || keyCode == 52 || keyCode == 53 || keyCode == 54 || keyCode == 55 || keyCode == 56 || keyCode == 57 || keyCode == 96 || keyCode == 97 || keyCode == 98 || keyCode == 99 || keyCode == 100 || keyCode == 101 || keyCode == 102 || keyCode == 103 || keyCode == 104 || keyCode == 105) {
            priceTextField.setForeground(Color.black);
        } else {
            priceTextField.setForeground(Color.red);
        }

    }//GEN-LAST:event_priceTextFieldKeyPressed

    private void mileageTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mileageTextFieldKeyPressed
        int keyCode = evt.getKeyCode();
        if (keyCode == 48 || keyCode == 49 || keyCode == 50 || keyCode == 51 || keyCode == 52 || keyCode == 53 || keyCode == 54 || keyCode == 55 || keyCode == 56 || keyCode == 57 || keyCode == 96 || keyCode == 97 || keyCode == 98 || keyCode == 99 || keyCode == 100 || keyCode == 101 || keyCode == 102 || keyCode == 103 || keyCode == 104 || keyCode == 105) {
            mileageTextField.setForeground(Color.black);
        } else {
            mileageTextField.setForeground(Color.red);
        }
    }//GEN-LAST:event_mileageTextFieldKeyPressed

    private void bikeCarNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bikeCarNameTextFieldMouseClicked
        bikeCarNameTextField.setText(null);
        bikeCarNameTextField.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        bikeCarNameTextField.setForeground(Color.black);
        bikeCarNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
    }//GEN-LAST:event_bikeCarNameTextFieldMouseClicked

    private void bikeCarNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bikeCarNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bikeCarNameTextFieldActionPerformed

    private void engineCCTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_engineCCTextFieldMouseClicked
        engineCCTextField.setText(null);
        engineCCTextField.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        engineCCTextField.setForeground(Color.black);
        engineCCTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
    }//GEN-LAST:event_engineCCTextFieldMouseClicked

    private void engineTorqueTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_engineTorqueTextFieldMouseClicked
        engineTorqueTextField.setText(null);
        engineTorqueTextField.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        engineTorqueTextField.setForeground(Color.black);
        engineTorqueTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
    }//GEN-LAST:event_engineTorqueTextFieldMouseClicked

    private void bhpTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bhpTextFieldMouseClicked
        bhpTextField.setText(null);
        bhpTextField.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        bhpTextField.setForeground(Color.black);
        bhpTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
    }//GEN-LAST:event_bhpTextFieldMouseClicked

    private void categoriesTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriesTextFieldMouseClicked
        categoriesTextField.setText(null);
        categoriesTextField.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        categoriesTextField.setForeground(Color.black);
        categoriesTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
    }//GEN-LAST:event_categoriesTextFieldMouseClicked

    private void priceTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceTextFieldMouseClicked
        priceTextField.setText(null);
        priceTextField.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        priceTextField.setForeground(Color.black);
        priceTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
    }//GEN-LAST:event_priceTextFieldMouseClicked

    private void mileageTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mileageTextFieldMouseClicked
        mileageTextField.setText(null);
        mileageTextField.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        mileageTextField.setForeground(Color.black);
        mileageTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
    }//GEN-LAST:event_mileageTextFieldMouseClicked

    private void engineTorqueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engineTorqueTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_engineTorqueTextFieldActionPerformed

    private void engineCCTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_engineCCTextFieldKeyPressed

        int keyCode = evt.getKeyCode();
        if (keyCode == 48 || keyCode == 49 || keyCode == 50 || keyCode == 51 || keyCode == 52 || keyCode == 53 || keyCode == 54 || keyCode == 55 || keyCode == 56 || keyCode == 57 || keyCode == 96 || keyCode == 97 || keyCode == 98 || keyCode == 99 || keyCode == 100 || keyCode == 101 || keyCode == 102 || keyCode == 103 || keyCode == 104 || keyCode == 105) {
            engineCCTextField.setForeground(Color.black);
        } else {
            engineCCTextField.setForeground(Color.red);
        }
    }//GEN-LAST:event_engineCCTextFieldKeyPressed

    private void engineTorqueTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_engineTorqueTextFieldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();
        if (keyCode == 48 || keyCode == 49 || keyCode == 50 || keyCode == 51 || keyCode == 52 || keyCode == 53 || keyCode == 54 || keyCode == 55 || keyCode == 56 || keyCode == 57 || keyCode == 96 || keyCode == 97 || keyCode == 98 || keyCode == 99 || keyCode == 100 || keyCode == 101 || keyCode == 102 || keyCode == 103 || keyCode == 104 || keyCode == 105) {
            engineTorqueTextField.setForeground(Color.black);
        } else {
            engineTorqueTextField.setForeground(Color.red);
        }
    }//GEN-LAST:event_engineTorqueTextFieldKeyPressed

    private void bhpTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bhpTextFieldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();
        if (keyCode == 48 || keyCode == 49 || keyCode == 50 || keyCode == 51 || keyCode == 52 || keyCode == 53 || keyCode == 54 || keyCode == 55 || keyCode == 56 || keyCode == 57 || keyCode == 96 || keyCode == 97 || keyCode == 98 || keyCode == 99 || keyCode == 100 || keyCode == 101 || keyCode == 102 || keyCode == 103 || keyCode == 104 || keyCode == 105) {
            bhpTextField.setForeground(Color.black);
        } else {
            bhpTextField.setForeground(Color.red);
        }
    }//GEN-LAST:event_bhpTextFieldKeyPressed

    private void categoriesTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoriesTextFieldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();
        if (keyCode == 48 || keyCode == 49 || keyCode == 50 || keyCode == 51 || keyCode == 52 || keyCode == 53 || keyCode == 54 || keyCode == 55 || keyCode == 56 || keyCode == 57 || keyCode == 96 || keyCode == 97 || keyCode == 98 || keyCode == 99 || keyCode == 100 || keyCode == 101 || keyCode == 102 || keyCode == 103 || keyCode == 104 || keyCode == 105) {
            categoriesTextField.setForeground(Color.red);
        } else {
            categoriesTextField.setForeground(Color.black);
        }
    }//GEN-LAST:event_categoriesTextFieldKeyPressed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        // TODO add your handling code here:

        if (bikeRB.isSelected() == true) {
            int i = Main.bikeTable.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) Main.bikeTable.getModel();
            if (i >= 0) {

                model.setValueAt(bikeCarNameTextField.getText(), i, 0);//
                model.setValueAt(manufacturerCB.getSelectedItem().toString(), i, 1);
                model.setValueAt(engineTypeCB.getSelectedItem().toString(), i, 2);
                model.setValueAt(engineCCTextField.getText(), i, 3);//
                model.setValueAt(engineTorqueTextField.getText(), i, 4);
                model.setValueAt(bhpTextField.getText(), i, 5);
                model.setValueAt(categoriesTextField.getText(), i, 6);//
                model.setValueAt(priceTextField.getText(), i, 7);
                model.setValueAt(mileageTextField.getText(), i, 8);

                JOptionPane.showMessageDialog(rootPane, "BIKE DETAIL UPDATED SUCCESSFULLY");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }

        } else if (carRB.isSelected() == true) {
            int i = Main.carTable.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) Main.carTable.getModel();
            if (i >= 0) {

                model.setValueAt(bikeCarNameTextField.getText(), i, 0);//
                model.setValueAt(manufacturerCB.getSelectedItem().toString(), i, 1);
                model.setValueAt(engineTypeCB.getSelectedItem().toString(), i, 2);
                model.setValueAt(engineCCTextField.getText(), i, 3);//
                model.setValueAt(engineTorqueTextField.getText(), i, 4);
                model.setValueAt(bhpTextField.getText(), i, 5);
                model.setValueAt(categoriesTextField.getText(), i, 6);//
                model.setValueAt(priceTextField.getText(), i, 7);
                model.setValueAt(mileageTextField.getText(), i, 8);

                JOptionPane.showMessageDialog(rootPane, "CAR DETAIL UPDATED SUCCESSFULLY");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }//GEN-LAST:event_updateBTNActionPerformed

    private void bhpTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhpTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bhpTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVehicleBTN;
    public static javax.swing.JTextField bhpTextField;
    public static javax.swing.JTextField bikeCarNameTextField;
    public static javax.swing.JRadioButton bikeRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public static javax.swing.JRadioButton carRB;
    public static javax.swing.JTextField categoriesTextField;
    private javax.swing.JButton clearBTN;
    public static javax.swing.JTextField engineCCTextField;
    public static javax.swing.JTextField engineTorqueTextField;
    public static javax.swing.JComboBox<String> engineTypeCB;
    public static javax.swing.JButton exitBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField4;
    public static javax.swing.JComboBox<String> manufacturerCB;
    public static javax.swing.JTextField mileageTextField;
    public static javax.swing.JTextField priceTextField;
    public static javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
