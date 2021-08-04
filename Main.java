
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
/**
 *
 * @author Nabin Gurung
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    String bikeCarSelection2, bikeCarName2, manufacturer2, engineType2, bHP2, categories2, engineTorque2;
    double engineCC2, price2, topSpeed2, mileage2;
    int pointRow;

    public Main() {

        initComponents();
        tableDecoration();
        imgDesign();

    }
//methods for merge sorting

    public static void mergeSort(int myArray[]) {
        if (myArray.length <= 1) {
            return;
        }
        int leftArray[] = new int[myArray.length / 2];
        int rightArray[] = new int[myArray.length - leftArray.length];
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = myArray[i];
        }
        for (int j = 0; j < rightArray.length; j++) {
            rightArray[j] = myArray[leftArray.length + j];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, myArray);

    }
//method for dividing arrays into single element

    public static void merge(int leftArray[], int rightArray[], int sortedArray[]) {

        int leftIndex = 0;
        int rightIndex = 0;
        int sorted = 0;
        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {

            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                sortedArray[sorted] = leftArray[leftIndex];
                leftIndex++;

            } else {
                sortedArray[sorted] = rightArray[rightIndex];
                rightIndex++;
            }
            sorted++;

        }
        while (leftIndex < leftArray.length) {
            sortedArray[sorted] = leftArray[leftIndex];
            sorted++;
            leftIndex++;
        }
        while (rightIndex < rightArray.length) {
            sortedArray[sorted] = rightArray[rightIndex];
            sorted++;
            rightIndex++;

        }

    }
//nethod for binary searching

    public static int binarySearch(int array[], int x) {
        mergeSort(array);
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;
            //it checks if the x element is present in the middle of the arr[]
            if (array[mid] == x) {
                return array[mid];
            } //if x is bigger than the array then the  elementsrightt to the mid element of the array are ignored
            else if (x > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }

        }
        //it will return -1 since the element is not present in the arr[]
        return -1;

    }
//method for table decoration

    void tableDecoration() {
        bikeTable.getTableHeader().setFont(new java.awt.Font("Bell MT", Font.BOLD, 15));
        bikeTable.setSelectionBackground(Color.YELLOW);
        bikeTable.setSelectionForeground(Color.BLACK);

        carTable.getTableHeader().setFont(new java.awt.Font("Bell MT", Font.BOLD, 15));
        carTable.setSelectionBackground(Color.YELLOW);
        carTable.setSelectionForeground(Color.BLACK);

    }
//method for adding images in system

    void imgDesign() {
        ImageIcon ic = new javax.swing.ImageIcon(getClass().getResource("/Images/mylogo.png"));
        Image img = ic.getImage();
        Image imgScale = img.getScaledInstance(140, 78, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel5.setIcon(scaledIcon);

        ImageIcon ic2 = new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"));
        Image img2 = ic2.getImage();
        Image imgScale2 = img2.getScaledInstance(22, 23, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
        searchPriceLabel.setIcon(scaledIcon2);
        searchPriceLabelBrand.setIcon(scaledIcon2);

        ImageIcon ic3 = new javax.swing.ImageIcon(getClass().getResource("/Images/del.png"));
        Image img3 = ic3.getImage();
        Image imgScale3 = img3.getScaledInstance(20, 23, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon(imgScale3);
        deleteBTN.setIcon(scaledIcon3);

        ImageIcon ic4 = new javax.swing.ImageIcon(getClass().getResource("/Images/Up.png"));
        Image img4 = ic4.getImage();
        Image imgScale4 = img4.getScaledInstance(25, 23, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon(imgScale4);
        updateBTN.setIcon(scaledIcon4);

        ImageIcon ic5 = new javax.swing.ImageIcon(getClass().getResource("/Images/exiticon.png"));
        Image img5 = ic5.getImage();
        Image imgScale5 = img5.getScaledInstance(25, 23, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon5 = new ImageIcon(imgScale5);
        exitBTN.setIcon(scaledIcon5);

        ImageIcon ic6 = new javax.swing.ImageIcon(getClass().getResource("/Images/ADD.png"));
        Image img6 = ic6.getImage();
        Image imgScale6 = img6.getScaledInstance(25, 23, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon6 = new ImageIcon(imgScale6);
        addBTN.setIcon(scaledIcon6);

        //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        yourVehicle = new javax.swing.JLabel();
        customPanel = new javax.swing.JPanel();
        yourVehicle1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        bikeScrollPane = new javax.swing.JScrollPane();
        bikeTable = new javax.swing.JTable();
        carScrollPane = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        sortingCB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        availableBikesNumber = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        availableCarsNumber = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        addBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        searchBtnForCC = new javax.swing.JButton();
        searchCCTextField = new javax.swing.JTextField();
        searchBrandCB = new javax.swing.JComboBox<>();
        searchPriceLabel = new javax.swing.JLabel();
        searchPriceLabelBrand = new javax.swing.JLabel();
        searchBtnForBrand = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        closeMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        addMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        updateMenuItem = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        yourVehicle.setBackground(new java.awt.Color(0, 0, 0));
        yourVehicle.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        yourVehicle.setForeground(new java.awt.Color(102, 255, 0));
        yourVehicle.setText("YOUR VEHICLE");

        customPanel.setBackground(new java.awt.Color(0, 0, 0));

        yourVehicle1.setBackground(new java.awt.Color(0, 0, 0));
        yourVehicle1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        yourVehicle1.setForeground(new java.awt.Color(102, 255, 0));
        yourVehicle1.setText("YOUR VEHICLE");

        javax.swing.GroupLayout customPanelLayout = new javax.swing.GroupLayout(customPanel);
        customPanel.setLayout(customPanelLayout);
        customPanelLayout.setHorizontalGroup(
            customPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(customPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(customPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(yourVehicle1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        customPanelLayout.setVerticalGroup(
            customPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(customPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(customPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(yourVehicle1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wheels&Deals");
        setLocation(new java.awt.Point(135, 20));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                shortCutKey(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(15, 15, 15));
        jPanel2.setForeground(new java.awt.Color(0, 255, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("V 1.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(15, 15, 15));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Wheels&Deals", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Bell MT", 1, 12), new java.awt.Color(0, 255, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 255, 51));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 0));
        jTabbedPane1.setForeground(new java.awt.Color(0, 255, 51));
        jTabbedPane1.setFont(new java.awt.Font("Bell MT", 1, 17)); // NOI18N

        bikeTable.setAutoCreateRowSorter(true);
        bikeTable.setBackground(new java.awt.Color(0, 0, 0));
        bikeTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bikeTable.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bikeTable.setForeground(new java.awt.Color(255, 255, 255));
        bikeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"PANIGALE V4 R", "DUCATI", "V FOUR", "1103 CC", "214 PS", "124 NM", "SPORTS", "55000", "9 kml"},
                {"TURISMO VELOCE", "MV AUGUSTA", "INLINE FOUR", "802 CC", "94 PS", "83 NM", "TOURING", "27800", "35 kml"},
                {"TIGER 1200", "TRIYUMPH", "INLINE THREE", "892 CC", "141.4 PS", "122.67 NM", "TOURING", "13000", "31 kml"},
                {"BMW S 1000RR", "BMW", "INLINE FOUR", "999 CC", "206.6 PS", "113 NM", "SPORTS", "28600", "11 kml"},
                {"NINJA H2", "KAWASHAKI", "SUPERCHARGED", "998 CC", "211 PS", "127 NM", "SPORTS", "65000", "7 kml"},
                {"YAMAHA YZF R1", "YAMAHA", "CROSSPLANE", "998 CC", "195.30 PS", "112.5 NM", "SPORTS", "31000", "15 kml"},
                {"GSXR 1000", "SUZUKI", "INLINE FOUR", "999 CC", "202 PS", "117.6 NM", "SPORTS", "32000", "14 kml"},
                {"XDIAVEL 1260", "DUCATI", "L TWIN", "1262 CC", "157.7 PS", "129.7 NM", "CRUISER", "24500", "20 kml"},
                {"BMW R 18", "BMW", "BOXER", "1802 CC", "90 PS", "132.4 NM", "CRUISER", "35000", "25 kml"},
                {"ROCKET 3 R", "TRIYUMPH", "INLINE THREE", "2458 CC", "165 PS", "145.4 NM", "CRUISER", "33500", "35 kml"},
                {"REBEL 1100", "HONDA", "PARALLEL TWIN", "1084 CC", "86 PS", "123.4 NM", "CRUISER", "77000", "32 kml"},
                {"SUPERDUKE", "KTM", "V TWIN", "1301 CC", "177 PS", "167.4 NM", "NAKED SPORTS", "54000", "8 kml"},
                {"MT 09", "YAMAHA", "INLINE THREE", "847 CC", "114 PS", "123.4 NM", "NAKED SPORTS", "45000", "10 kml"},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "BIKE NAME", "BRAND", "ENGINE TYPE", "ENGINE SIZE", "BHP", "TORQUE", "CATEGORY", "PRICE($)", "MILEAGE"
            }
        ));
        bikeTable.setAutoscrolls(false);
        bikeTable.setGridColor(new java.awt.Color(51, 255, 0));
        bikeTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        bikeTable.setRowHeight(25);
        bikeTable.setSelectionBackground(new java.awt.Color(0, 255, 204));
        bikeTable.setSelectionForeground(new java.awt.Color(0, 255, 204));
        bikeTable.setShowHorizontalLines(false);
        bikeTable.getTableHeader().setReorderingAllowed(false);
        bikeScrollPane.setViewportView(bikeTable);

        jTabbedPane1.addTab("Motorbikes", bikeScrollPane);

        carTable.setAutoCreateRowSorter(true);
        carTable.setBackground(new java.awt.Color(0, 0, 0));
        carTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        carTable.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        carTable.setForeground(new java.awt.Color(255, 255, 255));
        carTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"HONDA CIVIC", "HONDA", "V FOUR", "1000 CC", "189 PS", "144 NM", "SEDAN", "52000", "20 kml"},
                {"KIA RIO", "KIA", "V SIX", "890 CC", "114 PS", "134 NM", "SEDAN", "46000", "29 kml"},
                {"FORD MUSTANG", "FORD", "V FOUR", "1980 CC", " 204 PS", "178 NM", "COUPE", "75000", "30 kml"},
                {"PORSCHE 911", "VOLKSWAGEN", "INLINE FOUR", "987 CC", "266 PS ", "124 NM", "SPORTS", "97000", "29 kml"},
                {"AUDI A4 ALLFROAD", "AUDI", "SINGLE CYLINDER", "1106 CC", "200 PS", "124 NM", "STATION WAGON", "66000", "20 kml"},
                {"VOLKSWAGEN GOLF", "VOLKSWAGEN", "PARALLEL TWIN", "1083 CC", "117 PS", "186 NM", "HATCHBACK", "59000", "25 kml"},
                {"VOLKSWAGEN TARGA", "VOLKSWAGEN", "BOXER", "1003 CC", "116 PS", "122 NM", "CONVERTIBLE", "35000", "29 kml"},
                {"HYUNDAI KONA", "HYUNDAI", "L TWIN", "999 CC", "115 PS", "128 NM", "SUV", "54000", "19 kml"},
                {"NISSAN KICKS", "NISSAN", "INLINE FOUR", "1103 CC", "214 PS", "104 NM", "SUV", "55000", "27 kml"},
                {"LAMBORGHINI HURRACANE", "LAMBORGHINI", "V TWELEVE", "6498 CC", "770 PS", "720 NM", "SUPER", "2000000", "4 kml"},
                {"LAMBORGHINI SVJ", "LAMBORGHINI", "V TWELEVE", "7058 CC", "820 PS", "840 NM", "SUPER", "2650000", "3 kml"},
                {"MC LAREN 720 S SPIDER", "MC LAREN", "V EIGHT", "3990 CC", "650 PS", "690 NM", "SUPER", "1200000", "9 kml"},
                {"LA FERRARI", "FERARRI", "V TWELEVE", "4200 CC", "949 PS", "665 NM", "SUPER", "3000000", "6 kml"},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CAR NAME", "BRAND", "ENGINE TYPE", "ENGINE SIZE", "BHP", "TORQUE", "CATEGORY", "PRICE($)", "MILEAGE"
            }
        ));
        carTable.setAutoscrolls(false);
        carTable.setGridColor(new java.awt.Color(51, 255, 0));
        carTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        carTable.setRowHeight(25);
        carTable.setSelectionBackground(new java.awt.Color(0, 255, 204));
        carTable.setSelectionForeground(new java.awt.Color(0, 255, 204));
        carTable.setShowHorizontalLines(false);
        carTable.getTableHeader().setReorderingAllowed(false);
        carScrollPane.setViewportView(carTable);

        jTabbedPane1.addTab("Cars", carScrollPane);

        jPanel6.setBackground(new java.awt.Color(15, 15, 15));
        jPanel6.setForeground(new java.awt.Color(51, 51, 51));

        sortingCB.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        sortingCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SORT VEHICLE BY---", "POPULARITY", "PRICE: LOW TO HIGH", "PRICE: HIGH TO LOW" }));
        sortingCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortingCBActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Available Bikes: ");

        availableBikesNumber.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        availableBikesNumber.setForeground(new java.awt.Color(255, 255, 255));
        availableBikesNumber.setText("13");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Available Cars: ");

        availableCarsNumber.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        availableCarsNumber.setForeground(new java.awt.Color(255, 255, 255));
        availableCarsNumber.setText("13");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(availableBikesNumber)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(availableCarsNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 633, Short.MAX_VALUE)
                .addComponent(sortingCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sortingCB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availableBikesNumber)
                    .addComponent(jLabel8)
                    .addComponent(availableCarsNumber)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("'Where performance is our ");

        jLabel7.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("PASSION.'");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/names.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(15, 15, 15));
        jPanel4.setForeground(new java.awt.Color(102, 102, 102));

        addBTN.setBackground(new java.awt.Color(255, 231, 21));
        addBTN.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        addBTN.setText("ADD DATA");
        addBTN.setToolTipText("ADD DATA(Ctrl + A)");
        addBTN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addBTNMouseMoved(evt);
            }
        });
        addBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBTNMouseExited(evt);
            }
        });
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        updateBTN.setBackground(new java.awt.Color(255, 231, 21));
        updateBTN.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        updateBTN.setText("Update");
        updateBTN.setToolTipText("UPDATE DATAS(Ctrl + U)");
        updateBTN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                updateBTNMouseMoved(evt);
            }
        });
        updateBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateBTNMouseExited(evt);
            }
        });
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        deleteBTN.setBackground(new java.awt.Color(255, 231, 21));
        deleteBTN.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        deleteBTN.setText("DELETE ROW");
        deleteBTN.setToolTipText("Delete Row(Del)");
        deleteBTN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                deleteBTNMouseMoved(evt);
            }
        });
        deleteBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteBTNMouseExited(evt);
            }
        });
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        exitBTN.setBackground(new java.awt.Color(248, 196, 12));
        exitBTN.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        exitBTN.setText("EXIT");
        exitBTN.setToolTipText("Exit(Ctrl + X)");
        exitBTN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                exitBTNMouseMoved(evt);
            }
        });
        exitBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBTNMouseExited(evt);
            }
        });
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(deleteBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBTN)
                .addGap(2, 2, 2))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBTN)
                    .addComponent(updateBTN)
                    .addComponent(addBTN)
                    .addComponent(exitBTN))
                .addGap(2, 2, 2))
        );

        jPanel5.setBackground(new java.awt.Color(15, 15, 15));

        searchBtnForCC.setBackground(new java.awt.Color(255, 231, 21));
        searchBtnForCC.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        searchBtnForCC.setText("Search");
        searchBtnForCC.setToolTipText("Search By Price");
        searchBtnForCC.setBorder(null);
        searchBtnForCC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                searchBtnForCCMouseMoved(evt);
            }
        });
        searchBtnForCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchBtnForCCMouseExited(evt);
            }
        });
        searchBtnForCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnForCCActionPerformed(evt);
            }
        });

        searchCCTextField.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        searchCCTextField.setForeground(new java.awt.Color(102, 102, 102));
        searchCCTextField.setText("   --Enter Price Here--");
        searchCCTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        searchCCTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchCCTextFieldMouseClicked(evt);
            }
        });
        searchCCTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCCTextFieldActionPerformed(evt);
            }
        });
        searchCCTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchCCTextFieldKeyPressed(evt);
            }
        });

        searchBrandCB.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        searchBrandCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECT BRAND---", "KTM", "HONDA", "YAMAHA", "DUCATI", "KAWASHAKI", "MV AUGUSTA", "BMW", "SUZUKI", "APRILLA", "TRIYUMPH", "NISSAN", "FORD", "VOLKSWAGEN", "FERARRI", "LAMBORGHINI", "AUDI", "KIA", "HYUNDAI", "MCLAREN" }));

        searchPriceLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchPriceLabel.setForeground(new java.awt.Color(255, 255, 255));

        searchPriceLabelBrand.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchPriceLabelBrand.setForeground(new java.awt.Color(255, 255, 255));

        searchBtnForBrand.setBackground(new java.awt.Color(255, 231, 21));
        searchBtnForBrand.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        searchBtnForBrand.setText("Search");
        searchBtnForBrand.setToolTipText("Search By Brand");
        searchBtnForBrand.setBorder(null);
        searchBtnForBrand.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        searchBtnForBrand.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                searchBtnForBrandMouseMoved(evt);
            }
        });
        searchBtnForBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchBtnForBrandMouseExited(evt);
            }
        });
        searchBtnForBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnForBrandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(searchBtnForBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBrandCB, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPriceLabelBrand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchBtnForCC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchCCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPriceLabel)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBtnForCC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchCCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchBrandCB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchBtnForBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchPriceLabelBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(433, 433, 433))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 231, 21));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(0, 153, 255), new java.awt.Color(0, 153, 255), new java.awt.Color(0, 153, 255)));
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));

        jMenu1.setBackground(new java.awt.Color(0, 255, 51));
        jMenu1.setText("File");

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenuItem.setText("OPEN");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(openMenuItem);

        closeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        closeMenuItem.setText("CLOSE");
        jMenu1.add(closeMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        exitMenuItem.setText("EXIT");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuItem);

        helpMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        helpMenuItem.setText("HELP");
        helpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(helpMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(0, 153, 255));
        jMenu2.setText("Edit");

        addMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        addMenuItem.setText("ADD");
        addMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(addMenuItem);

        deleteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        deleteMenuItem.setText("DELETE");
        jMenu2.add(deleteMenuItem);

        updateMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        updateMenuItem.setText("UPDATE");
        updateMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(updateMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
        if (jTabbedPane1.getSelectedIndex() == 0) {

            String bikesNum = availableBikesNumber.getText();
            int importDataNum = 4 + Integer.parseInt(bikesNum);
            String importCount = String.valueOf(importDataNum);
            availableBikesNumber.setText(importCount);

            String filepath = "C:\\Users\\Dell\\OneDrive\\Desktop\\COURSEWORK\\Emerging\\bikedata.txt";
            File file = new File(filepath);

            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String firstLine = br.readLine();
                String[] columnsName = firstLine.split(",");
                DefaultTableModel model = (DefaultTableModel) bikeTable.getModel();
                model.setColumnIdentifiers(columnsName);

                Object[] tableLines = br.lines().toArray();

                for (int i = 1; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split("/");
                    model.addRow(dataRow);

                }

                JOptionPane.showMessageDialog(rootPane, "Bikes Detail Loaded Successfully");

            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (jTabbedPane1.getSelectedIndex() == 1) {

            String carsNum = availableCarsNumber.getText();
            int importDataNum = 4 + Integer.parseInt(carsNum);
            String importCount = String.valueOf(importDataNum);
            availableCarsNumber.setText(importCount);

            String filepath = "C:\\Users\\Dell\\OneDrive\\Desktop\\COURSEWORK\\Emerging\\cardata.txt";
            File file = new File(filepath);

            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String firstLine = br.readLine();
                String[] columnsName = firstLine.split(",");
                DefaultTableModel model = (DefaultTableModel) carTable.getModel();
                model.setColumnIdentifiers(columnsName);

                Object[] tableLines = br.lines().toArray();

                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split("/");
                    model.addRow(dataRow);
                }
                JOptionPane.showMessageDialog(rootPane, "Cars Detail Loaded Successfully");

            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_openMenuItemActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void searchBtnForBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnForBrandActionPerformed
        String categorySearch = (String) (searchBrandCB.getSelectedItem());
        int categoryCount = 0;
        String itemsFound = "";
        if (jTabbedPane1.getSelectedIndex() == 0) {

            if (searchBrandCB.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "PLEASE SELECT A BRAND BEFORE SEARCHING");

            } else {

                DefaultTableModel model = (DefaultTableModel) bikeTable.getModel();
                int row = model.getRowCount();
                for (int i = 0; i < row; i++) {
                    String temp = bikeTable.getValueAt(i, 1).toString();
                    if (temp.equals(categorySearch)) {
                        categoryCount++;
                        itemsFound = itemsFound + "\n" + "Name: " + bikeTable.getValueAt(i, 0) + "\nBrand: " + bikeTable.getValueAt(i, 1) + "\nEngine Type: " + bikeTable.getValueAt(i, 2) + "\nEngine Size:" + bikeTable.getValueAt(i, 3) + "\nBHP: " + bikeTable.getValueAt(i, 4) + "\nTorque: " + bikeTable.getValueAt(i, 5) + "\nCategory: " + bikeTable.getValueAt(i, 6) + "\nPrice: " + bikeTable.getValueAt(i, 7) + " $" + "\nMileage: " + bikeTable.getValueAt(i, 8) + "\n";
                    }
                }
                if (categoryCount == 0) {

                    JOptionPane.showMessageDialog(null, "NO BIKES FOUND OF " + categorySearch + " BRAND");
                } else if (!"DUCATI".equals(categorySearch)) {
                    JOptionPane.showMessageDialog(null, "FOUND " + categoryCount + " BIKES OF " + categorySearch);
                    JOptionPane.showMessageDialog(null, "YOUR BIKES" + "\n" + itemsFound);
                } else {
                    JOptionPane.showMessageDialog(null, "FOUND " + categoryCount + " BIKES OF " + categorySearch);
                    JOptionPane.showMessageDialog(null, "YOUR BIKES" + "\nDISCOUNT UPTO 20% ON ANY PURCHASE OF DUCATI UNTIL FEBRURAY 12" + "\n" + itemsFound + "\n");
                }
            }
        } else if (jTabbedPane1.getSelectedIndex() == 1) {

            if (searchBrandCB.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "PLEASE SELECT A BRAND BEFORE SEARCHING");

            } else {

                DefaultTableModel model = (DefaultTableModel) carTable.getModel();
                int row = model.getRowCount();
                for (int i = 0; i < row; i++) {
                    String temp = carTable.getValueAt(i, 1).toString();
                    if (temp.equals(categorySearch.toUpperCase())) {
                        categoryCount++;
                        itemsFound = itemsFound + "\n" + "Name: " + carTable.getValueAt(i, 0) + "\nBrand: " + carTable.getValueAt(i, 1) + "\nEngine Type: " + carTable.getValueAt(i, 2) + "\nEngine Size:" + carTable.getValueAt(i, 3) + "\nBHP: " + carTable.getValueAt(i, 4) + "\nTorque: " + carTable.getValueAt(i, 5) + "\nCategory: " + carTable.getValueAt(i, 6) + "\nPrice: " + carTable.getValueAt(i, 7) + " $" + "\nMileage: " + carTable.getValueAt(i, 8) + "\n";

                    }
                }
                if (categoryCount == 0) {
                    JOptionPane.showMessageDialog(null, "NO CARS FOUND OF " + categorySearch);
                } else if (!"VOLKSWAGEN".equals(categorySearch)) {
                    JOptionPane.showMessageDialog(null, "FOUND " + categoryCount + " CARS OF " + categorySearch);
                    JOptionPane.showMessageDialog(null, "YOUR CARS" + "\n" + itemsFound);

                } else {
                    JOptionPane.showMessageDialog(null, "FOUND " + categoryCount + " CARS OF " + categorySearch);
                    JOptionPane.showMessageDialog(null, "YOUR CARS" + "\nDISCOUNT UPTO 20% ON ANY PURCHASE OF VOLKSWAGEN UNTIL JANUARY 10" + "\n" + itemsFound + "\n");
                }
            }
        }
    }//GEN-LAST:event_searchBtnForBrandActionPerformed

    private void searchBtnForCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnForCCActionPerformed

        if (jTabbedPane1.getSelectedIndex() == 0) {

            if (searchCCTextField != null) {
                int rows = bikeTable.getRowCount() - 1;
                int columns = bikeTable.getColumnCount() - 1;
                int[] unsorted = new int[rows + 1];
                Object[][] sortdata = new Object[rows + 1][columns + 1];
                for (int i = 0; i <= rows; i++) {
                    unsorted[i] = Integer.parseInt(bikeTable.getValueAt(i, 7).toString());
                    for (int j = 0; j <= columns; j++) {
                        sortdata[i][j] = bikeTable.getValueAt(i, j);
                    }
                }
                mergeSort(unsorted);
                int[] sorted = unsorted;

                int price = Integer.parseInt(searchCCTextField.getText());
                int searchIndex = 7;
                if (searchCCTextField.getText() != "") {
                    int datarows = 0;
                    for (int i = 0; i < rows; i++) {
                        if ((bikeTable.getValueAt(i, searchIndex)) == null) {
                            break;
                        }
                        datarows++;
                    }
                    if (!"".equals(price) && datarows != 0) {
                        int start = 0;
                        int end = sorted.length - 1;
                        double searchResult = binarySearch(sorted, price); //converts value from searchTextField to double data type.
                        if (searchResult != -1) {
                            for (int i = 0; i < bikeTable.getRowCount(); i++) {
                                if (Double.parseDouble(bikeTable.getValueAt(i, searchIndex).toString()) == searchResult) {
                                    String Name = bikeTable.getValueAt(i, 0).toString().toUpperCase();
                                    String Brand = bikeTable.getValueAt(i, 1).toString().toUpperCase();
                                    String Engine_Type = bikeTable.getValueAt(i, 2).toString().toUpperCase();
                                    String Engine_CC = bikeTable.getValueAt(i, 3).toString().toUpperCase();
                                    String BHP = bikeTable.getValueAt(i, 4).toString().toUpperCase();
                                    String Torque = bikeTable.getValueAt(i, 5).toString().toUpperCase();
                                    String Category = bikeTable.getValueAt(i, 6).toString().toUpperCase();
                                    String Price = bikeTable.getValueAt(i, 7).toString().toUpperCase();
                                    String Mileage = bikeTable.getValueAt(i, 8).toString().toUpperCase();

                                    JOptionPane.showMessageDialog(rootPane, "YOUR BIKES\n" + "\nName: " + Name + "\nBrand: " + Brand + "\nEngine Type: " + Engine_Type + "\nEngine Size: " + Engine_CC + "\nBHP: " + BHP + "\nTorque: " + Torque + "\nCategory: " + Category + "\nPrice: " + Price + " $" + "\nMileage: " + Mileage, "VEHICLE", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "NO BIKES FOUND WITH THAT PRICE.SORRY!", "Message", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "PLEASE ENTER THE PRICE OF BIKE TO SEARCH", "Message", JOptionPane.WARNING_MESSAGE);
            }
        } else if (jTabbedPane1.getSelectedIndex() == 1) {

            if (searchCCTextField != null) {
                int rows = carTable.getRowCount() - 1;
                int columns = carTable.getColumnCount() - 1;
                int[] unsorted = new int[rows + 1];
                Object[][] sortdata = new Object[rows + 1][columns + 1];
                for (int i = 0; i <= rows; i++) {
                    unsorted[i] = Integer.parseInt(carTable.getValueAt(i, 7).toString());
                    for (int j = 0; j <= columns; j++) {
                        sortdata[i][j] = carTable.getValueAt(i, j);
                    }
                }
                mergeSort(unsorted);
                int[] sorted = unsorted;

                int price = Integer.parseInt(searchCCTextField.getText());
                int searchIndex = 7;
                if (searchCCTextField.getText() != "") {
                    int datarows = 0;
                    for (int i = 0; i < rows; i++) {
                        if ((carTable.getValueAt(i, searchIndex)) == null) {
                            break;
                        }
                        datarows++;
                    }
                    if (!"".equals(price) && datarows != 0) {
                        int start = 0;
                        int end = sorted.length - 1;
                        double searchResult = binarySearch(sorted, price);
                        if (searchResult != -1) {
                            for (int i = 0; i < carTable.getRowCount(); i++) {
                                if (Double.parseDouble(carTable.getValueAt(i, searchIndex).toString()) == searchResult) {
                                    String Name = carTable.getValueAt(i, 0).toString().toUpperCase();
                                    String Brand = carTable.getValueAt(i, 1).toString().toUpperCase();
                                    String Engine_Type = carTable.getValueAt(i, 2).toString().toUpperCase();
                                    String Engine_CC = carTable.getValueAt(i, 3).toString().toUpperCase();
                                    String BHP = carTable.getValueAt(i, 4).toString().toUpperCase();
                                    String Torque = carTable.getValueAt(i, 5).toString().toUpperCase();
                                    String Category = carTable.getValueAt(i, 6).toString().toUpperCase();
                                    String Price = carTable.getValueAt(i, 7).toString().toUpperCase();
                                    String Mileage = carTable.getValueAt(i, 8).toString().toUpperCase();

                                    JOptionPane.showMessageDialog(rootPane, "YOUR CARS\n" + "\nName: " + Name + "\nBrand: " + Brand + "\nEngine Type: " + Engine_Type + "\nEngine Size: " + Engine_CC + "\nBHP: " + BHP + "\nTorque: " + Torque + "\nCategory: " + Category + "\nPrice: " + Price + " $" + "\nMileage: " + Mileage, "VEHICLE", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "NO CARS FOUND WITH THAT PRICE.SORRY!", "Message", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "PLEASE ENTER THE PRICE OF CAR TO SEARCH", "Message", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_searchBtnForCCActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed

        new Form().setVisible(true);

    }//GEN-LAST:event_addBTNActionPerformed
//method to get values through parameters and add in tables

    public static void addRowToTable(String val1, String val2, String val3, String val4, String val5, String val6, String val7, Integer val8, Double val9) {
        String a = val4 + " CC";
        String b = val5 + " PS";
        String c = val6 + " NM";
        String d = val8.toString();
        String e = val9 + " kml";
//to add values in bike table
        if (Form.bikeRB.isSelected() == true) {
            String details[] = {val1, val2, val3, a, b, c, val7, d, e};
            String value;
            int pointRow = 0;
            int rowCount = bikeTable.getRowCount();
            int colCount = bikeTable.getColumnCount();
            int availableBikes = 0;
            boolean empty = false;

            do {
                value = (String) bikeTable.getValueAt(pointRow, 0);
                if (value != null && value.length() != 0) {
                    pointRow++;
                } else {
                    empty = true;
                }
            } while (pointRow < rowCount && !empty);
            for (int i = 0; i < colCount; i++) {
                bikeTable.setValueAt(details[i], pointRow, i);
                availableBikes++;

                String bikesNum = String.valueOf(pointRow + 1);
                availableBikesNumber.setText(bikesNum);
            }
//to add values in car table
        } else if (Form.carRB.isSelected() == true) {
            String details2[] = {val1, val1, val3, val4.toString(), val5, val6, val7, val8.toString(), val9.toString()};
            String value2;
            int pointRow2 = 0;
            int rowCount2 = carTable.getRowCount();
            int colCount2 = carTable.getColumnCount();
            int availableCars = 0;
            boolean empty2 = false;

            do {
                value2 = (String) carTable.getValueAt(pointRow2, 0);
                if (value2 != null && value2.length() != 0) {
                    pointRow2++;
                } else {
                    empty2 = true;
                }
            } while (pointRow2 < rowCount2 && !empty2);
            for (int i = 0; i < colCount2; i++) {
                carTable.setValueAt(details2[i], pointRow2, i);
                availableCars++;
                String carsNum = String.valueOf(pointRow2 + 1);
                availableCarsNumber.setText(carsNum);

            }
        }
    }

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed

//to update bike table
        if (jTabbedPane1.getSelectedIndex() == 0) {

            int selectedRow = bikeTable.getSelectedRow();

            if (selectedRow >= 0) {
                DefaultTableModel model = (DefaultTableModel) bikeTable.getModel();
                new Form().setVisible(true);
                Form.bikeRB.setSelected(true);
                Form.bikeCarNameTextField.setText(model.getValueAt(selectedRow, 0).toString());

                if (model.getValueAt(selectedRow, 1).toString().equals("KTM")) {
                    Form.manufacturerCB.setSelectedItem("KTM");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("HONDA")) {
                    Form.manufacturerCB.setSelectedItem("HONDA");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("YAMAHA")) {
                    Form.manufacturerCB.setSelectedItem("YAMAHA");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("DUCATI")) {
                    Form.manufacturerCB.setSelectedItem("DUCATI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("KAWASHAKI")) {
                    Form.manufacturerCB.setSelectedItem("KAWASHAKI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("BMW")) {
                    Form.manufacturerCB.setSelectedItem("BMW");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("SUZUKI")) {
                    Form.manufacturerCB.setSelectedItem("SUZUKI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("APRILLA")) {
                    Form.manufacturerCB.setSelectedItem("APRILLA");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("TRIYUMPH")) {
                    Form.manufacturerCB.setSelectedItem("TRIYUMPH");
                }

                if (model.getValueAt(selectedRow, 1).toString().equals("NISSAN")) {
                    Form.manufacturerCB.setSelectedItem("NISSAN");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("FORD")) {
                    Form.manufacturerCB.setSelectedItem("FORD");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("VOLKSWAGEN")) {
                    Form.manufacturerCB.setSelectedItem("VOLKSWAGEN");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("FERARRI")) {
                    Form.manufacturerCB.setSelectedItem("FERARRI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("LAMBORGHINI")) {
                    Form.manufacturerCB.setSelectedItem("LAMBORGHINI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("MCLAREN")) {
                    Form.manufacturerCB.setSelectedItem("MCLAREN");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("HYUNDAI")) {
                    Form.manufacturerCB.setSelectedItem("HYUNDAI");
                }

                if (model.getValueAt(selectedRow, 2).toString().equals("V FOUR")) {
                    Form.engineTypeCB.setSelectedItem("V FOUR");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("INLINE THREE")) {
                    Form.engineTypeCB.setSelectedItem("INLINE THREE");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("INLINE FOUR")) {
                    Form.engineTypeCB.setSelectedItem("INLINE FOUR");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("SUPERCHARGED")) {
                    Form.engineTypeCB.setSelectedItem("SUPERCHARGED");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("CROSSPLANE")) {
                    Form.engineTypeCB.setSelectedItem("CROSSPLANE");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("L TWIN")) {
                    Form.engineTypeCB.setSelectedItem("L TWIN");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("BOXER")) {
                    Form.engineTypeCB.setSelectedItem("BOXER");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("PARALLEL TWIN")) {
                    Form.engineTypeCB.setSelectedItem("PARALLEL TWIN");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("V TWIN")) {
                    Form.engineTypeCB.setSelectedItem("V TWIN");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("V SIX")) {
                    Form.engineTypeCB.setSelectedItem("V SIX");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("SINGLE CYLINDER")) {
                    Form.engineTypeCB.setSelectedItem("SINGLE CYLINDER");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("V TWELEVE")) {
                    Form.engineTypeCB.setSelectedItem("V TWELEVE");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("V EIGHT")) {
                    Form.engineTypeCB.setSelectedItem("V EIGHT");
                }

                Form.engineCCTextField.setText(model.getValueAt(selectedRow, 3).toString());
                Form.engineTorqueTextField.setText(model.getValueAt(selectedRow, 5).toString());
                Form.bhpTextField.setText(model.getValueAt(selectedRow, 4).toString());
                Form.categoriesTextField.setText(model.getValueAt(selectedRow, 6).toString());
                Form.priceTextField.setText(model.getValueAt(selectedRow, 7).toString());
                Form.mileageTextField.setText(model.getValueAt(selectedRow, 8).toString());

            } else {
                JOptionPane.showMessageDialog(rootPane, "PLEASE SELECT A ROW TO UPDATE");
            }
//to update car table
        } else if (jTabbedPane1.getSelectedIndex() == 1) {

            int selectedRow = carTable.getSelectedRow();
            if (selectedRow >= 0) {

                DefaultTableModel model = (DefaultTableModel) carTable.getModel();
                new Form().setVisible(true);
                Form.carRB.setSelected(true);
                //HONDA", "NISSAN", "FORD", "VOLKSWAGEN", "FERARRI", "LAMBORGHINI", "MCLAREN", "HYUNDAI
                Form.bikeCarNameTextField.setText(model.getValueAt(selectedRow, 0).toString());

                if (model.getValueAt(selectedRow, 1).toString().equals("HONDA")) {
                    Form.manufacturerCB.setSelectedItem("HONDA");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("NISSAN")) {
                    Form.manufacturerCB.setSelectedItem("NISSAN");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("FORD")) {
                    Form.manufacturerCB.setSelectedItem("FORD");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("DUCATI")) {
                    Form.manufacturerCB.setSelectedItem("DUCATI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("VOLKSWAGEN")) {
                    Form.manufacturerCB.setSelectedItem("VOLKSWAGEN");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("FERARRI")) {
                    Form.manufacturerCB.setSelectedItem("FERARRI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("LAMBORGHINI")) {
                    Form.manufacturerCB.setSelectedItem("LAMBORGHINI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("MCLAREN")) {
                    Form.manufacturerCB.setSelectedItem("MCLAREN");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("HYUNDAI")) {
                    Form.manufacturerCB.setSelectedItem("HYUNDAI");
                }

                if (model.getValueAt(selectedRow, 2).toString().equals("V SIX")) {
                    Form.engineTypeCB.setSelectedItem("V SIX");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("V FOUR")) {
                    Form.engineTypeCB.setSelectedItem("V FOUR");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("INLINE FOUR")) {
                    Form.engineTypeCB.setSelectedItem("INLINE FOUR");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("SINGLE CYLINDER")) {
                    Form.engineTypeCB.setSelectedItem("SINGLE CYLINDER");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("PARALLEL TWIN")) {
                    Form.engineTypeCB.setSelectedItem("PARALLEL TWIN");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("BOXER")) {
                    Form.engineTypeCB.setSelectedItem("BOXER");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("L TWIN")) {
                    Form.engineTypeCB.setSelectedItem("L TWIN");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("V TWELVE")) {
                    Form.engineTypeCB.setSelectedItem("V TWELVE");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("V EIGHT")) {
                    Form.engineTypeCB.setSelectedItem("V EIGHT");
                }

                Form.engineCCTextField.setText(model.getValueAt(selectedRow, 3).toString());
                Form.engineTorqueTextField.setText(model.getValueAt(selectedRow, 5).toString());
                Form.bhpTextField.setText(model.getValueAt(selectedRow, 4).toString());
                Form.categoriesTextField.setText(model.getValueAt(selectedRow, 6).toString());
                Form.priceTextField.setText(model.getValueAt(selectedRow, 7).toString());
                Form.mileageTextField.setText(model.getValueAt(selectedRow, 8).toString());

                JOptionPane.showMessageDialog(rootPane, "CAR DETAIL UPDATED SUCCESSFULLY");
            } else {
                JOptionPane.showMessageDialog(rootPane, "PLEASE SELECT A ROW TO UPDATE");
            }
        }
    }//GEN-LAST:event_updateBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        //to delete selected row of bike table
        if (jTabbedPane1.getSelectedIndex() == 0) {
            DefaultTableModel model1 = (DefaultTableModel) bikeTable.getModel();

            try {
                int SelectedRowIndexB = bikeTable.getSelectedRow();
                int selectedOption = JOptionPane.showConfirmDialog(rootPane, "DO YOU WANT TO DELETE THIS ROW?", "CHOOSE", JOptionPane.YES_NO_OPTION);
                if (selectedOption == JOptionPane.YES_OPTION) {
                    model1.removeRow(SelectedRowIndexB);
                }

                int delAvailableDataBike = Integer.parseInt(availableBikesNumber.getText()) - 1;
                System.out.println(delAvailableDataBike);
                String s1 = String.valueOf(delAvailableDataBike);
                availableBikesNumber.setText(s1);
                JOptionPane.showMessageDialog(rootPane, "ROW SUCCESSFULLY DELETED");
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "ERROR!! SELECT A ROW TO DELETE");
            }
//to delete selected car of bike table
        } else if (jTabbedPane1.getSelectedIndex() == 1) {
            DefaultTableModel model2 = (DefaultTableModel) carTable.getModel();

            try {
                int SelectedRowIndexC = carTable.getSelectedRow();
                int selectedOption = JOptionPane.showConfirmDialog(rootPane, "DO YOU WANT TO DELETE THIS ROW?", "CHOOSE", JOptionPane.YES_NO_OPTION);
                if (selectedOption == JOptionPane.YES_OPTION) {
                    model2.removeRow(SelectedRowIndexC);
                }
                int delAvailableDataCar = Integer.parseInt(availableCarsNumber.getText()) - 1;
                String s2 = String.valueOf(delAvailableDataCar);
                availableCarsNumber.setText(s2);
                JOptionPane.showMessageDialog(rootPane, "ROW SUCCESSFULLY DELETED");
            } catch (Exception ex2) {
                JOptionPane.showMessageDialog(null, "ERROR!!  SELECT A ROW TO DELETE");
            }
        }
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void searchCCTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCCTextFieldMouseClicked

        searchCCTextField.setText(null);
        searchCCTextField.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        searchCCTextField.setForeground(Color.black);
        searchCCTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
    }//GEN-LAST:event_searchCCTextFieldMouseClicked

    //When mouse hovers on "Search" Button, color changes
    private void searchBtnForBrandMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnForBrandMouseMoved
        searchBtnForBrand.setForeground(new java.awt.Color(0, 0, 0));
        searchBtnForBrand.setBackground(new java.awt.Color(255, 255, 153));

    }//GEN-LAST:event_searchBtnForBrandMouseMoved
    //When mouse exit fromm hover on "Search" Button, back to default color
    private void searchBtnForBrandMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnForBrandMouseExited
        searchBtnForBrand.setForeground(new java.awt.Color(0, 0, 0));
        searchBtnForBrand.setBackground(new java.awt.Color(255, 231, 21));
    }//GEN-LAST:event_searchBtnForBrandMouseExited

    private void searchBtnForCCMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnForCCMouseMoved
        //searchBtnForCC
        searchBtnForCC.setForeground(new java.awt.Color(0, 0, 0));
        searchBtnForCC.setBackground(new java.awt.Color(255, 255, 153));

    }//GEN-LAST:event_searchBtnForCCMouseMoved

    private void searchBtnForCCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnForCCMouseExited
        searchBtnForCC.setForeground(new java.awt.Color(0, 0, 0));
        searchBtnForCC.setBackground(new java.awt.Color(255, 255, 0));
    }//GEN-LAST:event_searchBtnForCCMouseExited

    private void deleteBTNMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBTNMouseMoved
        //deleteBTN
        deleteBTN.setForeground(new java.awt.Color(255, 255, 255));
        deleteBTN.setBackground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_deleteBTNMouseMoved

    private void deleteBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBTNMouseExited
        deleteBTN.setForeground(new java.awt.Color(0, 0, 0));
        deleteBTN.setBackground(new java.awt.Color(255, 231, 21));
    }//GEN-LAST:event_deleteBTNMouseExited

    private void updateBTNMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBTNMouseMoved

        updateBTN.setForeground(new java.awt.Color(0, 0, 0));
        updateBTN.setBackground(new java.awt.Color(255, 255, 153));
    }//GEN-LAST:event_updateBTNMouseMoved

    private void updateBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBTNMouseExited
        updateBTN.setForeground(new java.awt.Color(0, 0, 0));
        updateBTN.setBackground(new java.awt.Color(255, 231, 21));
    }//GEN-LAST:event_updateBTNMouseExited

    private void addBTNMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBTNMouseMoved
        //addBTN
        addBTN.setForeground(new java.awt.Color(0, 0, 0));
        addBTN.setBackground(new java.awt.Color(255, 255, 153));
    }//GEN-LAST:event_addBTNMouseMoved

    private void addBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBTNMouseExited
        addBTN.setForeground(new java.awt.Color(0, 0, 0));
        addBTN.setBackground(new java.awt.Color(255, 231, 21));
    }//GEN-LAST:event_addBTNMouseExited

    private void exitBTNMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBTNMouseMoved
        exitBTN.setForeground(new java.awt.Color(255, 255, 255));
        exitBTN.setBackground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_exitBTNMouseMoved

    private void exitBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBTNMouseExited
        exitBTN.setForeground(new java.awt.Color(0, 0, 0));
        exitBTN.setBackground(new java.awt.Color(255, 231, 21));
    }//GEN-LAST:event_exitBTNMouseExited

    private void shortCutKey(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_shortCutKey

    }//GEN-LAST:event_shortCutKey

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void addMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuItemActionPerformed
        new Form().setVisible(true);
    }//GEN-LAST:event_addMenuItemActionPerformed

    private void searchCCTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchCCTextFieldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();
        if (keyCode == 48 || keyCode == 49 || keyCode == 50 || keyCode == 51 || keyCode == 52 || keyCode == 53 || keyCode == 54 || keyCode == 55 || keyCode == 56 || keyCode == 57 || keyCode == 96 || keyCode == 97 || keyCode == 98 || keyCode == 99 || keyCode == 100 || keyCode == 101 || keyCode == 102 || keyCode == 103 || keyCode == 104 || keyCode == 105) {
            searchCCTextField.setForeground(Color.black);
        } else {
            searchCCTextField.setForeground(Color.red);
        }
    }//GEN-LAST:event_searchCCTextFieldKeyPressed

    private void helpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuItemActionPerformed
        // TODO add your handling code here:
        Runtime open = Runtime.getRuntime();
        try {
            Desktop.getDesktop().open(new java.io.File("C:\\Users\\Dell\\OneDrive\\Desktop\\COURSEWORK\\Emerging\\help.pdf")); // Returns the Desktop instance of the current browser context.
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "SORRY!! FILE NOT FOUND");
        }
    }//GEN-LAST:event_helpMenuItemActionPerformed

    private void sortingCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortingCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortingCBActionPerformed

    private void updateMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMenuItemActionPerformed
        // TODO add your handling code here:
        if (jTabbedPane1.getSelectedIndex() == 0) {

            int selectedRow = bikeTable.getSelectedRow();

            if (selectedRow >= 0) {
                DefaultTableModel model = (DefaultTableModel) bikeTable.getModel();
                new Form().setVisible(true);
                Form.bikeRB.setSelected(true);
                Form.bikeCarNameTextField.setText(model.getValueAt(selectedRow, 0).toString());

                if (model.getValueAt(selectedRow, 1).toString().equals("KTM")) {
                    Form.manufacturerCB.setSelectedItem("KTM");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("HONDA")) {
                    Form.manufacturerCB.setSelectedItem("HONDA");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("YAMAHA")) {
                    Form.manufacturerCB.setSelectedItem("YAMAHA");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("DUCATI")) {
                    Form.manufacturerCB.setSelectedItem("DUCATI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("KAWASHAKI")) {
                    Form.manufacturerCB.setSelectedItem("KAWASHAKI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("BMW")) {
                    Form.manufacturerCB.setSelectedItem("BMW");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("SUZUKI")) {
                    Form.manufacturerCB.setSelectedItem("SUZUKI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("APRILLA")) {
                    Form.manufacturerCB.setSelectedItem("APRILLA");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("TRIYUMPH")) {
                    Form.manufacturerCB.setSelectedItem("TRIYUMPH");
                }

                if (model.getValueAt(selectedRow, 1).toString().equals("NISSAN")) {
                    Form.manufacturerCB.setSelectedItem("NISSAN");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("FORD")) {
                    Form.manufacturerCB.setSelectedItem("FORD");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("VOLKSWAGEN")) {
                    Form.manufacturerCB.setSelectedItem("VOLKSWAGEN");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("FERARRI")) {
                    Form.manufacturerCB.setSelectedItem("FERARRI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("LAMBORGHINI")) {
                    Form.manufacturerCB.setSelectedItem("LAMBORGHINI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("MCLAREN")) {
                    Form.manufacturerCB.setSelectedItem("MCLAREN");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("HYUNDAI")) {
                    Form.manufacturerCB.setSelectedItem("HYUNDAI");
                }

                if (model.getValueAt(selectedRow, 2).toString().equals("V FOUR")) {
                    Form.engineTypeCB.setSelectedItem("V FOUR");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("INLINE THREE")) {
                    Form.engineTypeCB.setSelectedItem("INLINE THREE");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("INLINE FOUR")) {
                    Form.engineTypeCB.setSelectedItem("INLINE FOUR");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("SUPERCHARGED")) {
                    Form.engineTypeCB.setSelectedItem("SUPERCHARGED");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("CROSSPLANE")) {
                    Form.engineTypeCB.setSelectedItem("CROSSPLANE");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("L TWIN")) {
                    Form.engineTypeCB.setSelectedItem("L TWIN");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("BOXER")) {
                    Form.engineTypeCB.setSelectedItem("BOXER");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("PARALLEL TWIN")) {
                    Form.engineTypeCB.setSelectedItem("PARALLEL TWIN");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("V TWIN")) {
                    Form.engineTypeCB.setSelectedItem("V TWIN");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("V SIX")) {
                    Form.engineTypeCB.setSelectedItem("V SIX");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("SINGLE CYLINDER")) {
                    Form.engineTypeCB.setSelectedItem("SINGLE CYLINDER");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("V TWELEVE")) {
                    Form.engineTypeCB.setSelectedItem("V TWELEVE");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("V EIGHT")) {
                    Form.engineTypeCB.setSelectedItem("V EIGHT");
                }

                Form.engineCCTextField.setText(model.getValueAt(selectedRow, 3).toString());
                Form.engineTorqueTextField.setText(model.getValueAt(selectedRow, 5).toString());
                Form.bhpTextField.setText(model.getValueAt(selectedRow, 4).toString());
                Form.categoriesTextField.setText(model.getValueAt(selectedRow, 6).toString());
                Form.priceTextField.setText(model.getValueAt(selectedRow, 7).toString());
                Form.mileageTextField.setText(model.getValueAt(selectedRow, 8).toString());
            } else {
                JOptionPane.showMessageDialog(rootPane, "PLEASE SELECT A ROW TO UPDATE");
            }

        } else if (jTabbedPane1.getSelectedIndex() == 1) {

            int selectedRow = carTable.getSelectedRow();
            if (selectedRow >= 0) {

                DefaultTableModel model = (DefaultTableModel) carTable.getModel();
                new Form().setVisible(true);
                Form.carRB.setSelected(true);
                Form.bikeCarNameTextField.setText(model.getValueAt(selectedRow, 0).toString());

                if (model.getValueAt(selectedRow, 1).toString().equals("HONDA")) {
                    Form.manufacturerCB.setSelectedItem("HONDA");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("NISSAN")) {
                    Form.manufacturerCB.setSelectedItem("NISSAN");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("FORD")) {
                    Form.manufacturerCB.setSelectedItem("FORD");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("DUCATI")) {
                    Form.manufacturerCB.setSelectedItem("DUCATI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("VOLKSWAGEN")) {
                    Form.manufacturerCB.setSelectedItem("VOLKSWAGEN");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("FERARRI")) {
                    Form.manufacturerCB.setSelectedItem("FERARRI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("LAMBORGHINI")) {
                    Form.manufacturerCB.setSelectedItem("LAMBORGHINI");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("MCLAREN")) {
                    Form.manufacturerCB.setSelectedItem("MCLAREN");
                }
                if (model.getValueAt(selectedRow, 1).toString().equals("HYUNDAI")) {
                    Form.manufacturerCB.setSelectedItem("HYUNDAI");
                }

                if (model.getValueAt(selectedRow, 2).toString().equals("V SIX")) {
                    Form.engineTypeCB.setSelectedItem("V SIX");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("V FOUR")) {
                    Form.engineTypeCB.setSelectedItem("V FOUR");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("INLINE FOUR")) {
                    Form.engineTypeCB.setSelectedItem("INLINE FOUR");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("SINGLE CYLINDER")) {
                    Form.engineTypeCB.setSelectedItem("SINGLE CYLINDER");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("PARALLEL TWIN")) {
                    Form.engineTypeCB.setSelectedItem("PARALLEL TWIN");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("BOXER")) {
                    Form.engineTypeCB.setSelectedItem("BOXER");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("L TWIN")) {
                    Form.engineTypeCB.setSelectedItem("L TWIN");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("V TWELVE")) {
                    Form.engineTypeCB.setSelectedItem("V TWELVE");
                }
                if (model.getValueAt(selectedRow, 2).toString().equals("V EIGHT")) {
                    Form.engineTypeCB.setSelectedItem("V EIGHT");
                }

                Form.engineCCTextField.setText(model.getValueAt(selectedRow, 3).toString());
                Form.engineTorqueTextField.setText(model.getValueAt(selectedRow, 5).toString());
                Form.bhpTextField.setText(model.getValueAt(selectedRow, 4).toString());
                Form.categoriesTextField.setText(model.getValueAt(selectedRow, 6).toString());
                Form.priceTextField.setText(model.getValueAt(selectedRow, 7).toString());
                Form.mileageTextField.setText(model.getValueAt(selectedRow, 8).toString());

            } else {
                JOptionPane.showMessageDialog(rootPane, "PLEASE SELECT A ROW TO UPDATE");
            }
        }
    }//GEN-LAST:event_updateMenuItemActionPerformed

    private void searchCCTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCCTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchCCTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        LoadingScreen sc = new LoadingScreen();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sc.setVisible(true);
            }

        });
        Main obj = new Main();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                sc.jProgressBar1.setValue(i);
                sc.jLabel3.setText(Integer.toString(i) + "%");
            }
        } catch (Exception e) {

        }
        new LoadingScreen().setVisible(false);
        obj.setVisible(true);
        sc.dispose();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JMenuItem addMenuItem;
    public static javax.swing.JLabel availableBikesNumber;
    public static javax.swing.JLabel availableCarsNumber;
    private static javax.swing.JScrollPane bikeScrollPane;
    public static javax.swing.JTable bikeTable;
    public static javax.swing.JScrollPane carScrollPane;
    public static javax.swing.JTable carTable;
    private javax.swing.JMenuItem closeMenuItem;
    private javax.swing.JPanel customPanel;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JButton exitBTN;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem helpMenuItem;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JComboBox<String> searchBrandCB;
    private javax.swing.JButton searchBtnForBrand;
    private javax.swing.JButton searchBtnForCC;
    private javax.swing.JTextField searchCCTextField;
    public static javax.swing.JLabel searchPriceLabel;
    public static javax.swing.JLabel searchPriceLabelBrand;
    private javax.swing.JComboBox<String> sortingCB;
    private javax.swing.JButton updateBTN;
    private javax.swing.JMenuItem updateMenuItem;
    public static javax.swing.JLabel yourVehicle;
    public static javax.swing.JLabel yourVehicle1;
    // End of variables declaration//GEN-END:variables
}
