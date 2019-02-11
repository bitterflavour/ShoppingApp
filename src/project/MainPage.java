package project;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class MainPage extends javax.swing.JFrame {

    //Boolean isVisible = true;
    static Object[] data = new Object[4];   
    static int total = 0;
    static String tot = "";
    static boolean signInStatus = false;
    static int wrongPass = 0;
    
    public MainPage() {
        initComponents();
        
        //Adding last three entries from every categories in home
        
        ArrayList<ProductList> list = LaptopsDB.homePageContent();
        
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel) homeTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/laptops/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
        list.clear();
        
        list = MobileDB.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/mobiles/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        list.clear();
        
        list = TabletsDB.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/tablets/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
        
    }
    
    public void doPanelHideShow()
    {
       
            
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        searchButton = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        newlyAdded = new javax.swing.JButton();
        laptopsButton = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        cartButton = new javax.swing.JButton();
        mobilesButton = new javax.swing.JButton();
        tabletsButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        homeTable = new javax.swing.JTable();
        cardParentPanel = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        laptopsPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        laptopsTable = new javax.swing.JTable();
        cartPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartItemTable = new javax.swing.JTable();
        billLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        mobilesPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mobileTable = new javax.swing.JTable();
        tabletsPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabletsTable = new javax.swing.JTable();
        signUpPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        signUpNameField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        signUpEmailField = new javax.swing.JTextField();
        emptyField = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        signUpCardNumberField = new javax.swing.JTextField();
        signUpPasswordField = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();
        LogUpButton = new javax.swing.JButton();
        signUpUsernameField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        usernameExists = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        signInPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        signInUsernameField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        signInPasswordField = new javax.swing.JPasswordField();
        LogInButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        showPassword1 = new javax.swing.JCheckBox();
        warningLabel = new javax.swing.JTextField();
        homePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1199, 72));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setText("ShoppingApp");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator6.setOpaque(true);

        searchButton.setBackground(new java.awt.Color(51, 153, 255));
        searchButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("GO!");
        searchButton.setToolTipText("Search");
        searchButton.setBorderPainted(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setOpaque(true);
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchButtonMouseReleased(evt);
            }
        });
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchBar.setBackground(new java.awt.Color(51, 153, 255));
        searchBar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        searchBar.setForeground(new java.awt.Color(255, 255, 255));
        searchBar.setBorder(null);
        searchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBarMouseClicked(evt);
            }
        });
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton)
                .addGap(101, 101, 101))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 60));

        jPanel3.setBackground(new java.awt.Color(102, 51, 255));

        newlyAdded.setBackground(new java.awt.Color(153, 51, 255));
        newlyAdded.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        newlyAdded.setForeground(new java.awt.Color(255, 255, 255));
        newlyAdded.setText("What's New");
        newlyAdded.setToolTipText("Check what's new!");
        newlyAdded.setBorderPainted(false);
        newlyAdded.setContentAreaFilled(false);
        newlyAdded.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newlyAdded.setOpaque(true);
        newlyAdded.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newlyAddedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newlyAddedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newlyAddedMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newlyAddedMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newlyAddedMouseReleased(evt);
            }
        });
        newlyAdded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newlyAddedActionPerformed(evt);
            }
        });

        laptopsButton.setBackground(new java.awt.Color(153, 0, 255));
        laptopsButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        laptopsButton.setForeground(new java.awt.Color(255, 255, 255));
        laptopsButton.setToolTipText("Laptops");
        laptopsButton.setBorderPainted(false);
        laptopsButton.setContentAreaFilled(false);
        laptopsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laptopsButton.setLabel("Laptops");
        laptopsButton.setOpaque(true);
        laptopsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laptopsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                laptopsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                laptopsButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                laptopsButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                laptopsButtonMouseReleased(evt);
            }
        });
        laptopsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laptopsButtonActionPerformed(evt);
            }
        });

        accountButton.setBackground(new java.awt.Color(153, 0, 255));
        accountButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        accountButton.setForeground(new java.awt.Color(255, 255, 255));
        accountButton.setText("User");
        accountButton.setToolTipText("Account Info");
        accountButton.setBorderPainted(false);
        accountButton.setContentAreaFilled(false);
        accountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountButton.setOpaque(true);
        accountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accountButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                accountButtonMouseReleased(evt);
            }
        });
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });

        cartButton.setBackground(new java.awt.Color(153, 51, 255));
        cartButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        cartButton.setForeground(new java.awt.Color(255, 255, 255));
        cartButton.setText("Cart");
        cartButton.setToolTipText("View your cart.");
        cartButton.setBorderPainted(false);
        cartButton.setContentAreaFilled(false);
        cartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartButton.setMaximumSize(new java.awt.Dimension(67, 49));
        cartButton.setOpaque(true);
        cartButton.setPreferredSize(new java.awt.Dimension(67, 49));
        cartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cartButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cartButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cartButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cartButtonMouseReleased(evt);
            }
        });
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
            }
        });

        mobilesButton.setBackground(new java.awt.Color(153, 0, 255));
        mobilesButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        mobilesButton.setForeground(new java.awt.Color(255, 255, 255));
        mobilesButton.setText("Mobiles");
        mobilesButton.setToolTipText("Latest mobiles available on store!");
        mobilesButton.setBorderPainted(false);
        mobilesButton.setContentAreaFilled(false);
        mobilesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mobilesButton.setOpaque(true);
        mobilesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mobilesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mobilesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mobilesButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mobilesButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mobilesButtonMouseReleased(evt);
            }
        });
        mobilesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilesButtonActionPerformed(evt);
            }
        });

        tabletsButton.setBackground(new java.awt.Color(153, 0, 255));
        tabletsButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        tabletsButton.setForeground(new java.awt.Color(255, 255, 255));
        tabletsButton.setText("Tablets");
        tabletsButton.setToolTipText("Tablets");
        tabletsButton.setBorderPainted(false);
        tabletsButton.setContentAreaFilled(false);
        tabletsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabletsButton.setOpaque(true);
        tabletsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabletsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabletsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tabletsButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabletsButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabletsButtonMouseReleased(evt);
            }
        });
        tabletsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabletsButtonActionPerformed(evt);
            }
        });

        homeTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        homeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Model", "Price", "Stock", "Features", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        homeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        homeTable.getTableHeader().setReorderingAllowed(false);
        homeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(homeTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(newlyAdded)
                        .addGap(23, 23, 23)
                        .addComponent(laptopsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(tabletsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(mobilesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(cartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(laptopsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mobilesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tabletsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(newlyAdded, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        BackgroundPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 1210, 50));

        cardParentPanel.setLayout(new java.awt.CardLayout());

        searchTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Model", "Price", "Stock", "Features", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        searchTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        searchTable.getTableHeader().setReorderingAllowed(false);
        searchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(searchTable);

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1207, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(searchPanel, "card9");

        laptopsTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        laptopsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Model", "Price", "Stock", "Features", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        laptopsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laptopsTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        laptopsTable.getTableHeader().setReorderingAllowed(false);
        laptopsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laptopsTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(laptopsTable);

        javax.swing.GroupLayout laptopsPanelLayout = new javax.swing.GroupLayout(laptopsPanel);
        laptopsPanel.setLayout(laptopsPanelLayout);
        laptopsPanelLayout.setHorizontalGroup(
            laptopsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1207, Short.MAX_VALUE)
        );
        laptopsPanelLayout.setVerticalGroup(
            laptopsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(laptopsPanel, "card4");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        cartItemTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cartItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Model", "Price", "Quantity"
            }
        ));
        cartItemTable.setEnabled(false);
        cartItemTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(cartItemTable);

        billLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        billLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("Euro");

        buyButton.setBackground(new java.awt.Color(0, 77, 64));
        buyButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        buyButton.setForeground(new java.awt.Color(255, 255, 255));
        buyButton.setText("Buy");
        buyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("Total Bill:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(462, 462, 462)
                .addComponent(billLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 392, Short.MAX_VALUE)
                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(377, 377, 377)
                    .addComponent(jLabel5)
                    .addContainerGap(746, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(billLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(435, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(49, 49, 49)))
        );

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1207, Short.MAX_VALUE)
            .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cartPanelLayout.createSequentialGroup()
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 40, Short.MAX_VALUE)))
        );

        cardParentPanel.add(cartPanel, "card8");

        mobileTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mobileTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Model", "Price", "Stock", "Features", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        mobileTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mobileTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        mobileTable.getTableHeader().setReorderingAllowed(false);
        mobileTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mobileTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mobileTable);

        javax.swing.GroupLayout mobilesPanelLayout = new javax.swing.GroupLayout(mobilesPanel);
        mobilesPanel.setLayout(mobilesPanelLayout);
        mobilesPanelLayout.setHorizontalGroup(
            mobilesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1207, Short.MAX_VALUE)
        );
        mobilesPanelLayout.setVerticalGroup(
            mobilesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(mobilesPanel, "card3");

        tabletsTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tabletsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Model", "Price", "Stock", "Features", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        tabletsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabletsTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        tabletsTable.getTableHeader().setReorderingAllowed(false);
        tabletsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabletsTableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tabletsPanelLayout = new javax.swing.GroupLayout(tabletsPanel);
        tabletsPanel.setLayout(tabletsPanelLayout);
        tabletsPanelLayout.setHorizontalGroup(
            tabletsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1207, Short.MAX_VALUE)
            .addGroup(tabletsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabletsPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabletsTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        tabletsPanelLayout.setVerticalGroup(
            tabletsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
            .addGroup(tabletsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabletsPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabletsTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        cardParentPanel.add(tabletsPanel, "card2");

        signUpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 77, 64));
        jLabel9.setText("Name");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 77, 64));
        jSeparator1.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator1.setOpaque(true);
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 310, 2));

        signUpNameField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        signUpNameField.setForeground(new java.awt.Color(0, 77, 64));
        signUpNameField.setBorder(null);
        signUpNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpNameFieldActionPerformed(evt);
            }
        });
        jPanel4.add(signUpNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 310, 50));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 77, 64));
        jLabel10.setText("Email");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 77, 64));
        jSeparator2.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator2.setOpaque(true);
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 310, 2));

        signUpEmailField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        signUpEmailField.setForeground(new java.awt.Color(0, 77, 64));
        signUpEmailField.setBorder(null);
        signUpEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpEmailFieldActionPerformed(evt);
            }
        });
        jPanel4.add(signUpEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 310, 50));

        emptyField.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        emptyField.setForeground(new java.awt.Color(255, 51, 0));
        jPanel4.add(emptyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 270, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 77, 64));
        jSeparator3.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator3.setOpaque(true);
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 310, 2));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 77, 64));
        jLabel12.setText("Password");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 77, 64));
        jSeparator4.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator4.setOpaque(true);
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 310, 2));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 77, 64));
        jLabel13.setText("Already a member?");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 77, 64));
        jSeparator5.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator5.setOpaque(true);
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 310, 2));

        signUpCardNumberField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        signUpCardNumberField.setForeground(new java.awt.Color(0, 77, 64));
        signUpCardNumberField.setBorder(null);
        signUpCardNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpCardNumberFieldActionPerformed(evt);
            }
        });
        jPanel4.add(signUpCardNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 310, 50));

        signUpPasswordField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        signUpPasswordField.setForeground(new java.awt.Color(0, 77, 64));
        signUpPasswordField.setBorder(null);
        jPanel4.add(signUpPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 310, 50));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 77, 64));
        jLabel14.setText("Card No.(Optional)");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        signInButton.setBackground(new java.awt.Color(255, 255, 255));
        signInButton.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        signInButton.setForeground(new java.awt.Color(0, 150, 136));
        signInButton.setText("Sign In.");
        signInButton.setToolTipText("Sign In with your existed credentials.");
        signInButton.setBorder(null);
        signInButton.setBorderPainted(false);
        signInButton.setContentAreaFilled(false);
        signInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signInButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signInButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signInButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signInButtonMouseReleased(evt);
            }
        });
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        jPanel4.add(signInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 502, 90, 30));

        showPassword.setBackground(new java.awt.Color(255, 255, 255));
        showPassword.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        showPassword.setForeground(new java.awt.Color(0, 77, 64));
        showPassword.setToolTipText("Show/Hide Password");
        showPassword.setBorderPaintedFlat(true);
        showPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showPassword.setPreferredSize(new java.awt.Dimension(30, 30));
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        jPanel4.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 20, 20));

        LogUpButton.setBackground(new java.awt.Color(0, 77, 64));
        LogUpButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        LogUpButton.setForeground(new java.awt.Color(255, 255, 255));
        LogUpButton.setText("Sign Up");
        LogUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogUpButtonActionPerformed(evt);
            }
        });
        jPanel4.add(LogUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 140, 50));

        signUpUsernameField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        signUpUsernameField.setForeground(new java.awt.Color(0, 77, 64));
        signUpUsernameField.setBorder(null);
        signUpUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpUsernameFieldActionPerformed(evt);
            }
        });
        jPanel4.add(signUpUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 310, 50));

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 77, 64));
        jLabel24.setText("Username");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        usernameExists.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        usernameExists.setForeground(new java.awt.Color(255, 51, 0));
        jPanel4.add(usernameExists, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 160, 30));

        signUpPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 770, 590));

        jPanel5.setBackground(new java.awt.Color(51, 0, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sign Up!");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 149, -1, 168));

        signUpPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 590));

        cardParentPanel.add(signUpPanel, "card6");

        signInPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(153, 0, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel17.setFont(new java.awt.Font("Roboto Light", 0, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Log In");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel17)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel17)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        signInPanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 590));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel6FocusGained(evt);
            }
        });
        jPanel6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel6ComponentShown(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 77, 64));
        jLabel19.setText("Username");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 77, 64));
        jSeparator8.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator8.setOpaque(true);
        jPanel6.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 310, 2));

        signInUsernameField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        signInUsernameField.setForeground(new java.awt.Color(0, 77, 64));
        signInUsernameField.setBorder(null);
        signInUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInUsernameFieldActionPerformed(evt);
            }
        });
        jPanel6.add(signInUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 310, 50));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 77, 64));
        jLabel20.setText("Password");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jSeparator9.setBackground(new java.awt.Color(0, 77, 64));
        jSeparator9.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator9.setOpaque(true);
        jPanel6.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 310, 2));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 77, 64));
        jLabel21.setText("Haven't signed up?");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        signInPasswordField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        signInPasswordField.setForeground(new java.awt.Color(0, 77, 64));
        signInPasswordField.setBorder(null);
        jPanel6.add(signInPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 310, 50));

        LogInButton.setBackground(new java.awt.Color(0, 77, 64));
        LogInButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(255, 255, 255));
        LogInButton.setText("Sign In");
        LogInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        jPanel6.add(LogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 130, 50));

        signUpButton.setBackground(new java.awt.Color(255, 255, 255));
        signUpButton.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(0, 150, 136));
        signUpButton.setText("Sign Up now.");
        signUpButton.setToolTipText("Sign In with your existed credentials.");
        signUpButton.setBorderPainted(false);
        signUpButton.setContentAreaFilled(false);
        signUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signUpButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signUpButtonMouseReleased(evt);
            }
        });
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        jPanel6.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 502, 130, 30));

        showPassword1.setBackground(new java.awt.Color(255, 255, 255));
        showPassword1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        showPassword1.setForeground(new java.awt.Color(0, 77, 64));
        showPassword1.setToolTipText("Show/Hide Password");
        showPassword1.setBorderPaintedFlat(true);
        showPassword1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showPassword1.setPreferredSize(new java.awt.Dimension(30, 30));
        showPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassword1ActionPerformed(evt);
            }
        });
        jPanel6.add(showPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 20, 20));

        warningLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 0, 0));
        warningLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        warningLabel.setBorder(null);
        warningLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warningLabelActionPerformed(evt);
            }
        });
        jPanel6.add(warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 310, 50));

        signInPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 770, 590));

        cardParentPanel.add(signInPanel, "card7");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(homePanel, "card5");

        BackgroundPanel.add(cardParentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1200, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    }//GEN-LAST:event_jLabel1MouseClicked

    private void newlyAddedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newlyAddedActionPerformed
        cardParentPanel.removeAll();
        cardParentPanel.add(homePanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
        
        //Adding last three entries from every categories in home
        
        ArrayList<ProductList> list = LaptopsDB.homePageContent();
        
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel) homeTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/laptops/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
        list.clear();
        
        list = MobileDB.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/mobiles/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        list.clear();
        
        list = TabletsDB.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/tablets/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
        
    }//GEN-LAST:event_newlyAddedActionPerformed

    private void newlyAddedMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newlyAddedMouseReleased
        // TODO add your handling code here:
        newlyAdded.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_newlyAddedMouseReleased

    private void newlyAddedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newlyAddedMousePressed
        // TODO add your handling code here:
        newlyAdded.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_newlyAddedMousePressed

    private void newlyAddedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newlyAddedMouseExited
        // TODO add your handling code here:
        newlyAdded.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_newlyAddedMouseExited

    private void newlyAddedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newlyAddedMouseEntered
        // TODO add your handling code here:;
        newlyAdded.setBackground(new Color(0, 137, 123));

    }//GEN-LAST:event_newlyAddedMouseEntered

    private void newlyAddedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newlyAddedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_newlyAddedMouseClicked

    private void laptopsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laptopsButtonMouseClicked
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(laptopsPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_laptopsButtonMouseClicked

    private void laptopsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laptopsButtonMouseEntered
        // TODO add your handling code here:
         laptopsButton.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_laptopsButtonMouseEntered

    private void laptopsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laptopsButtonMouseExited
        // TODO add your handling code here:
        laptopsButton.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_laptopsButtonMouseExited

    private void laptopsButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laptopsButtonMousePressed
        // TODO add your handling code here:
        laptopsButton.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_laptopsButtonMousePressed

    private void laptopsButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laptopsButtonMouseReleased
        // TODO add your handling code here:
         laptopsButton.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_laptopsButtonMouseReleased

    private void laptopsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laptopsButtonActionPerformed
        // TODO add your handling code here:
        ProductInformation.categoryChooser = "laptops";
        ArrayList<ProductList> list = LaptopsDB.TableGenerator();
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel) laptopsTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        laptopsTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        laptopsTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        laptopsTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        laptopsTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        laptopsTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/laptops/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            laptopsTable.setRowHeight(150);
            laptopsTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
    }//GEN-LAST:event_laptopsButtonActionPerformed

    private void accountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_accountButtonMouseClicked

    private void accountButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseEntered
        // TODO add your handling code here:
        accountButton.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_accountButtonMouseEntered

    private void accountButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseExited
        // TODO add your handling code here:
        accountButton.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_accountButtonMouseExited

    private void accountButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMousePressed
        // TODO add your handling code here:
        accountButton.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_accountButtonMousePressed

    private void accountButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseReleased
        // TODO add your handling code here:
        accountButton.setBackground(new Color(0, 150, 136));

    }//GEN-LAST:event_accountButtonMouseReleased

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        // TODO add your handling code here:
        if(signInStatus==false){
            cardParentPanel.removeAll();
            cardParentPanel.add(signUpPanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();
        }
        else{
            SignedIn si = new SignedIn();
            si.setVisible(true);
            si.loggerName.setText(logger);
        }
    }//GEN-LAST:event_accountButtonActionPerformed

    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonActionPerformed
        cardParentPanel.removeAll();
        cardParentPanel.add(cartPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
        
         DefaultTableModel model =  (DefaultTableModel) cartItemTable.getModel();
         model.setRowCount(0);
         total = 0;
         tot = "";
        
        for(int i=0; i<ProductInformation.cartItem.size(); i++){
            data[0] = ProductInformation.cartItem.get(i).getBrand();
            data[1] = ProductInformation.cartItem.get(i).getModel();
            data[2] = ProductInformation.cartItem.get(i).getPrice();
            data[3] = ProductInformation.cartItem.get(i).getQty();
            
            model.addRow(data);
            cartItemTable.setRowHeight(20);
            total+=Integer.parseInt(cartItemTable.getValueAt(i, 2)+"");
            
        }
        
        billLabel.setText(String.valueOf(total));
    }//GEN-LAST:event_cartButtonActionPerformed

    private void cartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cartButtonMouseClicked

    private void cartButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMouseEntered
        // TODO add your handling code here:
        cartButton.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_cartButtonMouseEntered

    private void cartButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMouseExited
        // TODO add your handling code here:
        cartButton.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_cartButtonMouseExited

    private void cartButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMousePressed
        // TODO add your handling code here:
        cartButton.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_cartButtonMousePressed

    private void cartButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMouseReleased
        // TODO add your handling code here:
        cartButton.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_cartButtonMouseReleased

    private void mobilesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobilesButtonMouseClicked
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(mobilesPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_mobilesButtonMouseClicked

    private void mobilesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobilesButtonMouseEntered
        // TODO add your handling code here:
        mobilesButton.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_mobilesButtonMouseEntered

    private void mobilesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobilesButtonMouseExited
        // TODO add your handling code here:
        mobilesButton.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_mobilesButtonMouseExited

    private void mobilesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobilesButtonMousePressed
        // TODO add your handling code here:
        mobilesButton.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_mobilesButtonMousePressed

    private void mobilesButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobilesButtonMouseReleased
        // TODO add your handling code here:
        mobilesButton.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_mobilesButtonMouseReleased

    
    private void mobilesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobilesButtonActionPerformed
        // TODO add your handling code here:
        ProductInformation.categoryChooser = "mobiles";
        ArrayList<ProductList> list = MobileDB.TableGenerator();
        String[] columnName = {};
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel) mobileTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        mobileTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        mobileTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        mobileTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        mobileTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        mobileTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/mobiles/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            mobileTable.setRowHeight(150);
            mobileTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
    }//GEN-LAST:event_mobilesButtonActionPerformed

    private void tabletsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabletsButtonMouseClicked
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(tabletsPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_tabletsButtonMouseClicked

    private void tabletsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabletsButtonMouseEntered
        // TODO add your handling code here:
        tabletsButton.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_tabletsButtonMouseEntered

    private void tabletsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabletsButtonMouseExited
        // TODO add your handling code here:
        tabletsButton.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_tabletsButtonMouseExited

    private void tabletsButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabletsButtonMousePressed
        // TODO add your handling code here:
        tabletsButton.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_tabletsButtonMousePressed

    private void tabletsButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabletsButtonMouseReleased
        // TODO add your handling code here:
        tabletsButton.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_tabletsButtonMouseReleased

    private void tabletsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabletsButtonActionPerformed
        // TODO add your handling code here:
        ProductInformation.categoryChooser = "tablets";
        ArrayList<ProductList> list = TabletsDB.TableGenerator();
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel) tabletsTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tabletsTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        tabletsTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        tabletsTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        tabletsTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        tabletsTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/Tablets/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            tabletsTable.setRowHeight(150);
            tabletsTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
    }//GEN-LAST:event_tabletsButtonActionPerformed

    private void signInUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInUsernameFieldActionPerformed
    static String logger;
    
    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        // TODO add your handling code here: 
        
        JFrame adminPanel = new AdminPanel();
        if(signInUsernameField.getText().equals("admin") && signInPasswordField.getText().equals("root")){
            signInStatus = true;
            adminPanel.setVisible(true);
            logger = signInUsernameField.getText();
            signInUsernameField.setText("");
            signInPasswordField.setText("");
            warningLabel.setText("");
            cardParentPanel.removeAll();
            cardParentPanel.add(homePanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();
            wrongPass = 0;
        }
        else{
            
            boolean flag = DbConnector.signer(signInUsernameField.getText(), signInPasswordField.getText());
            
            if(flag){
                signInStatus = true;
                cardParentPanel.removeAll();
                cardParentPanel.add(homePanel);
                cardParentPanel.repaint();
                cardParentPanel.revalidate();
                logger = signInUsernameField.getText();
                warningLabel.setText("");
                signInUsernameField.setText("");
                signInPasswordField.setText("");
                wrongPass = 0;
            }
                
            else{
                warningLabel.setText("Wrong username/password!");
                wrongPass++;
                
                if(wrongPass>=3){
                    ForgotPasswordFrame fpf = new ForgotPasswordFrame();
                }
                
                signInUsernameField.setText("");
                signInPasswordField.setText("");
            }
                
        }
        
        
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void signUpButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseEntered
        // TODO add your handling code here:
        signUpButton.setForeground(new Color(48, 79, 254));
    }//GEN-LAST:event_signUpButtonMouseEntered

    private void signUpButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseExited
        // TODO add your handling code here:
        signUpButton.setForeground(new Color(0, 150, 136));
    }//GEN-LAST:event_signUpButtonMouseExited

    private void signUpButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMousePressed
        // TODO add your handling code here:
        signUpButton.setForeground(new Color(0, 77, 64));
    }//GEN-LAST:event_signUpButtonMousePressed

    private void signUpButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseReleased
        // TODO add your handling code here:
        signUpButton.setForeground(new Color(0, 150, 136));
    }//GEN-LAST:event_signUpButtonMouseReleased

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(signUpPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void showPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassword1ActionPerformed
        // TODO add your handling code here:
        if(showPassword1.isSelected()){
           signInPasswordField.setEchoChar((char)0);
        }
        else
            signInPasswordField.setEchoChar('*');
    }//GEN-LAST:event_showPassword1ActionPerformed

    private void jPanel6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel6FocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanel6FocusGained

    private void jPanel6ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel6ComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel6ComponentShown

    private void signUpUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpUsernameFieldActionPerformed

    private void LogUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogUpButtonActionPerformed
        // TODO add your handling code here:
        if(signUpUsernameField.getText().equals("")||signUpNameField.getText().equals("")||signUpEmailField.getText().equals("")
           ||signUpPasswordField.getText().equals(""))
            emptyField.setText("*One or more required fields are empty!");
        else{
            int test = DbConnector.insertToUser(signUpUsernameField.getText(), signUpNameField.getText(),
                signUpEmailField.getText(), signUpPasswordField.getText(),
                signUpCardNumberField.getText());

            if(test == 19){
                usernameExists.setText("Username exists!");
                emptyField.setText("");
                signUpUsernameField.setText("");
            }

            else{
                signUpUsernameField.setText("");
                signUpNameField.setText("");
                signUpEmailField.setText("");
                signUpPasswordField.setText("");
                signUpCardNumberField.setText("");
                emptyField.setText("");
            }
        }

    }//GEN-LAST:event_LogUpButtonActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        // TODO add your handling code here:
        if(showPassword.isSelected()){
            signUpPasswordField.setEchoChar((char)0);
        }
        else
        signUpPasswordField.setEchoChar('*');
    }//GEN-LAST:event_showPasswordActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(signInPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();

    }//GEN-LAST:event_signInButtonActionPerformed

    private void signInButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonMouseReleased
        // TODO add your handling code here:
        signInButton.setForeground(new Color(0, 150, 136));
    }//GEN-LAST:event_signInButtonMouseReleased

    private void signInButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonMousePressed
        // TODO add your handling code here:
        signInButton.setForeground(new Color(0, 77, 64));
    }//GEN-LAST:event_signInButtonMousePressed

    private void signInButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonMouseExited
        // TODO add your handling code here:
        signInButton.setForeground(new Color(0, 150, 136));
    }//GEN-LAST:event_signInButtonMouseExited

    private void signInButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonMouseEntered
        // TODO add your handling code here:
        signInButton.setForeground(new Color(48, 79, 254));
    }//GEN-LAST:event_signInButtonMouseEntered

    private void signUpCardNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpCardNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpCardNumberFieldActionPerformed

    private void signUpEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpEmailFieldActionPerformed

    private void signUpNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpNameFieldActionPerformed

    ProductInformation pi = new ProductInformation();
    
    private void mobileTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileTableMouseClicked
        // TODO add your handling code here:
        pi.setVisible(true);
        pi.pack();
        
        int selectedRow = mobileTable.getSelectedRow();
        TableModel tm = mobileTable.getModel();
        
        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);
        
        pi.productInfoBrandName.setText(brand);
        pi.productInfoModel.setText(model);
        pi.productInfoPrice.setText(price);
        pi.productInfoStock.setText(stock);
        pi.productInfoFeature.setText(feature);
        pi.productPhoto.setIcon(img);
    }//GEN-LAST:event_mobileTableMouseClicked

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        // TODO add your handling code here:
        if(!signInStatus){
        cardParentPanel.removeAll();
        cardParentPanel.add(signInPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
        
        warningLabel.setText("Please Sign In first.");

        }
        else{
            Date date = new Date();
            JFrame da = new DeliveryAddress(logger, Integer.parseInt(billLabel.getText()), date.toString());
            da.setVisible(true);
        }
    }//GEN-LAST:event_buyButtonActionPerformed

    private void warningLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warningLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warningLabelActionPerformed

    private void laptopsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laptopsTableMouseClicked
        // TODO add your handling code here:
        pi.setVisible(true);
        pi.pack();
        
        int selectedRow = laptopsTable.getSelectedRow();
        TableModel tm = laptopsTable.getModel();
        
        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);
        
        pi.productInfoBrandName.setText(brand);
        pi.productInfoModel.setText(model);
        pi.productInfoPrice.setText(price);
        pi.productInfoStock.setText(stock);
        pi.productInfoFeature.setText(feature);
        pi.productPhoto.setIcon(img);
    }//GEN-LAST:event_laptopsTableMouseClicked

    private void tabletsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabletsTableMouseClicked
        // TODO add your handling code here:
        pi.setVisible(true);
        pi.pack();
        
        int selectedRow = tabletsTable.getSelectedRow();
        TableModel tm = tabletsTable.getModel();
        
        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);
        
        pi.productInfoBrandName.setText(brand);
        pi.productInfoModel.setText(model);
        pi.productInfoPrice.setText(price);
        pi.productInfoStock.setText(stock);
        pi.productInfoFeature.setText(feature);
        pi.productPhoto.setIcon(img);
    }//GEN-LAST:event_tabletsTableMouseClicked

    private void homeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeTableMouseClicked
        // TODO add your handling code here:
        int rowIndex = homeTable.getSelectedRow();
        
        if(rowIndex<=2)
            ProductInformation.categoryChooser = "laptops";
        else if(rowIndex>2 && rowIndex<=5)
            ProductInformation.categoryChooser = "mobiles";
        else 
            ProductInformation.categoryChooser = "Tablets";
        
        pi.setVisible(true);
        pi.pack();
        
        int selectedRow = homeTable.getSelectedRow();
        TableModel tm = homeTable.getModel();
        
        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);
        
        pi.productInfoBrandName.setText(brand);
        pi.productInfoModel.setText(model);
        pi.productInfoPrice.setText(price);
        pi.productInfoStock.setText(stock);
        pi.productInfoFeature.setText(feature);
        pi.productPhoto.setIcon(img);
        
        
        
        
    }//GEN-LAST:event_homeTableMouseClicked

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonMouseClicked

    private void searchButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonMouseEntered

    private void searchButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonMouseExited

    private void searchButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMousePressed
        // TODO add your handling code here:
        searchButton.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_searchButtonMousePressed

    private void searchButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseReleased
        // TODO add your handling code here:
        searchButton.setBackground(new Color(0, 121, 107));
    }//GEN-LAST:event_searchButtonMouseReleased

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        //ProductInformation.categoryChooser = "mobiles";
        Search.laptops=0;
        Search.mobile=0;
        Search.tablets=0;
        
        ArrayList<ProductList> list = Search.mobileSearch(searchBar.getText());
        Object rowData[] = new Object[6];
        int i, j, k;
        
        
        if(searchBar.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Search field empty!");
        else if(Search.laptops==0 && Search.mobile==0 && Search.tablets==0)
            JOptionPane.showMessageDialog(null, "Sorry! Product does not exist!");
        else{
            cardParentPanel.removeAll();
            cardParentPanel.add(searchPanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();
                    
            DefaultTableModel model =  (DefaultTableModel) searchTable.getModel();
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            searchTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );


            model.setRowCount(0);
            for(i=0 ; i<Search.laptops; i++){
                rowData[0] = list.get(i).getBrand();
                rowData[1] = list.get(i).getModel();
                rowData[2] = list.get(i).getPrice();
                rowData[3] = list.get(i).getQty();
                rowData[4] = list.get(i).getDescription();
                String temp = list.get(i).getMimage();
                ImageIcon ii = new ImageIcon(getClass().getResource("/products/laptops/"+temp));
                Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[5] = ii;
                model.addRow(rowData);
                searchTable.setRowHeight(150);
                searchTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            }
            for(k=i; k<Search.mobile+Search.laptops; k++){
                rowData[0] = list.get(k).getBrand();
                rowData[1] = list.get(k).getModel();
                rowData[2] = list.get(k).getPrice();
                rowData[3] = list.get(k).getQty();
                rowData[4] = list.get(k).getDescription();
                String temp = list.get(k).getMimage();
                ImageIcon ii = new ImageIcon(getClass().getResource("/products/mobiles/"+temp));
                Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[5] = ii;
                model.addRow(rowData);
                searchTable.setRowHeight(150);
                searchTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            }
            System.out.println();
            for(j=k; j<Search.mobile+Search.laptops+Search.tablets; j++){
                rowData[0] = list.get(j).getBrand();
                rowData[1] = list.get(j).getModel();
                rowData[2] = list.get(j).getPrice();
                rowData[3] = list.get(j).getQty();
                rowData[4] = list.get(j).getDescription();
                String temp = list.get(j).getMimage();
                ImageIcon ii = new ImageIcon(getClass().getResource("/products/tablets/"+temp));
                Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[5] = ii;
                model.addRow(rowData);
                searchTable.setRowHeight(150);
                searchTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            }
        }
        
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBarMouseClicked
        // TODO add your handling code here:
        searchBar.setText("");
    }//GEN-LAST:event_searchBarMouseClicked

    private void searchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTableMouseClicked
        // TODO add your handling code here:
        int rowIndex = searchTable.getSelectedRow();
        
        if(Search.laptops!=0 && rowIndex<Search.laptops)
            ProductInformation.categoryChooser = "laptops";
        else if(Search.mobile!=0 && rowIndex>=Search.laptops && rowIndex<Search.laptops+Search.mobile)
            ProductInformation.categoryChooser = "mobiles";
        else 
            ProductInformation.categoryChooser = "tablets";
        
        pi.setVisible(true);
        pi.pack();
        
        int selectedRow = searchTable.getSelectedRow();
        TableModel tm = searchTable.getModel();
        
        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);
        
        pi.productInfoBrandName.setText(brand);
        pi.productInfoModel.setText(model);
        pi.productInfoPrice.setText(price);
        pi.productInfoStock.setText(stock);
        pi.productInfoFeature.setText(feature);
        pi.productPhoto.setIcon(img);
        
        
        
    }//GEN-LAST:event_searchTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        JFrame newMain = new MainPage();
        newMain.setTitle("ShoppingApp");
        newMain.setVisible(true);
        newMain.setResizable(false);
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton LogInButton;
    private javax.swing.JButton LogUpButton;
    private javax.swing.JButton accountButton;
    public static javax.swing.JLabel billLabel;
    private javax.swing.JButton buyButton;
    private javax.swing.JPanel cardParentPanel;
    private javax.swing.JButton cartButton;
    public static javax.swing.JTable cartItemTable;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JLabel emptyField;
    private javax.swing.JPanel homePanel;
    private javax.swing.JTable homeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton laptopsButton;
    private javax.swing.JPanel laptopsPanel;
    private javax.swing.JTable laptopsTable;
    private javax.swing.JTable mobileTable;
    private javax.swing.JButton mobilesButton;
    private javax.swing.JPanel mobilesPanel;
    private javax.swing.JButton newlyAdded;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable searchTable;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JCheckBox showPassword1;
    private javax.swing.JButton signInButton;
    private javax.swing.JPanel signInPanel;
    private javax.swing.JPasswordField signInPasswordField;
    private javax.swing.JTextField signInUsernameField;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField signUpCardNumberField;
    private javax.swing.JTextField signUpEmailField;
    private javax.swing.JTextField signUpNameField;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JPasswordField signUpPasswordField;
    private javax.swing.JTextField signUpUsernameField;
    private javax.swing.JButton tabletsButton;
    private javax.swing.JPanel tabletsPanel;
    private javax.swing.JTable tabletsTable;
    private javax.swing.JLabel usernameExists;
    private javax.swing.JTextField warningLabel;
    // End of variables declaration//GEN-END:variables
}
