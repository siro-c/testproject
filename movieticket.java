/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticket;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Siro
 */
public class movieticket extends javax.swing.JFrame {

    /**
     * Creates new form movieticket
     */
    public movieticket() {
        initComponents();
        Choiceshow_branches();
        Choiceshow_movies();
        
    }


    DefaultTableModel model = new DefaultTableModel();
    Connection con;
    PreparedStatement ps1;
    PreparedStatement ps2;
    
    ResultSet rss;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        branches_jComboBox = new javax.swing.JComboBox<>();
        movies_jComboBox = new javax.swing.JComboBox<>();
        honeymoon_jCheckBox = new javax.swing.JCheckBox();
        delux_jCheckBox = new javax.swing.JCheckBox();
        normal_jCheckBox = new javax.swing.JCheckBox();
        honeymoon_jSpinner = new javax.swing.JSpinner();
        delux_jSpinner = new javax.swing.JSpinner();
        normaljSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        add_jButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cusphone_jTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        print_jButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TextField_subtotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextField_pay = new javax.swing.JTextField();
        balance_jLabel = new javax.swing.JLabel();
        TextField_balance = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(226, 184, 8));

        jPanel1.setBackground(new java.awt.Color(145, 12, 0));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Movie Ticket Booking");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(145, 12, 0));

        branches_jComboBox.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        branches_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -" }));

        movies_jComboBox.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        movies_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -" }));

        honeymoon_jCheckBox.setBackground(new java.awt.Color(145, 12, 0));
        honeymoon_jCheckBox.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        honeymoon_jCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        honeymoon_jCheckBox.setText("Honey Moon");
        honeymoon_jCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        delux_jCheckBox.setBackground(new java.awt.Color(145, 12, 0));
        delux_jCheckBox.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        delux_jCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        delux_jCheckBox.setText("Delux");

        normal_jCheckBox.setBackground(new java.awt.Color(145, 12, 0));
        normal_jCheckBox.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        normal_jCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        normal_jCheckBox.setText("Normal");

        honeymoon_jSpinner.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N

        delux_jSpinner.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N

        normaljSpinner.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Branches : ");

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Movies : ");

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seat : ");

        add_jButton.setText("ADD");
        add_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_jButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone number : ");

        cusphone_jTextField.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(branches_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(movies_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cusphone_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(normal_jCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(normaljSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(delux_jCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delux_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(honeymoon_jCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(honeymoon_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(add_jButton)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(branches_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movies_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(honeymoon_jCheckBox)
                    .addComponent(honeymoon_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delux_jCheckBox)
                    .addComponent(delux_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(normal_jCheckBox)
                    .addComponent(normaljSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(cusphone_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(add_jButton)
                .addGap(65, 65, 65))
        );

        jTable1.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Theater", "Movies", "SeatType", "Price", "Amount", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        print_jButton.setText("Print Invoice");
        print_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_jButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jLabel5.setText("Subtotal : ");

        TextField_subtotal.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jLabel6.setText("Pay : ");

        balance_jLabel.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        balance_jLabel.setText("Balance : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextField_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(balance_jLabel))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(46, 46, 46)
                                            .addComponent(TextField_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TextField_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(print_jButton)
                                .addGap(83, 83, 83)))
                        .addGap(211, 211, 211))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TextField_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TextField_pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField_balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balance_jLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(print_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void print_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_jButtonActionPerformed
        // TODO add your handling code here:
        int subtotal = Integer.parseInt(TextField_subtotal.getText());
        int pay = Integer.parseInt(TextField_pay.getText());
        int bal = pay - subtotal;
        TextField_balance.setText(String.valueOf(bal));

        sales();
    }//GEN-LAST:event_print_jButtonActionPerformed

    public void sales() {
        try {
            String subtotal = TextField_subtotal.getText();
            String pay = TextField_pay.getText();
            String balance = TextField_balance.getText();

            int lastid = 0;

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/movieticket", "root", "");
            String query = "insert into sales(subtotal,pay,balance)values(?,?,?)";
            ps1 = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            ps1.setString(1, subtotal);
            ps1.setString(2, pay);
            ps1.setString(3, balance);
            ps1.executeUpdate();

            ResultSet rs = ps1.getGeneratedKeys();

            if (rs.next()) {
                lastid = rs.getInt(1);
            }

            int rows = jTable1.getRowCount();
            String query1 = "insert into sale_detail(sales_id, customer_phone, branches, movies, ticket_type, price, qty, total)values(?,?,?,?,?,?,?,?)";

            ps2 = con.prepareStatement(query1);

            String customer_phone = "";
            String branches = "";
            String movies = "";
            String tickettype = "";
            int price;
            int qty;
            int total = 0;

            for (int i = 0; i < jTable1.getRowCount(); i++) {

                //sales_id
                //customer_phone = (String)jTable1.getValueAt(i, 2);
                branches = (String) jTable1.getValueAt(i, 0);
                movies = (String) jTable1.getValueAt(i, 1);
                tickettype = (String) jTable1.getValueAt(i, 2);
                price = (int) jTable1.getValueAt(i, 3);
                qty = (int) jTable1.getValueAt(i, 4);
                total = (int) jTable1.getValueAt(i, 5);

                ps2.setInt(1, lastid);
                ps2.setString(2, cusphone_jTextField.getText());
                ps2.setString(3, branches);
                ps2.setString(4, movies);
                ps2.setString(5, tickettype);
                ps2.setInt(6, price);
                ps2.setInt(7, qty);
                ps2.setInt(8, total);
                ps2.executeUpdate();

            }
            JOptionPane.showMessageDialog(this, "Booking Complete!");
            HashMap a = new HashMap();
            a.put("invo", lastid);
            try {
                JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\Siro\\Documents\\NetBeansProjects\\ MovieTicket_project\\src\\report1.jrxml");
                JasperReport jreport = JasperCompileManager.compileReport(jdesign);
                
                JasperPrint jprint = JasperFillManager.fillReport(jreport, a, con);
                JasperViewer.viewReport(jprint);
                
            } catch (JRException ex) {
                Logger.getLogger(movieticket.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
               
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(movieticket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(movieticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void add_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_jButtonActionPerformed
        // TODO add your handling code here:
        int sum = 0;
        int price;
        int qty;
        int total;
        int index1 = branches_jComboBox.getSelectedIndex();
        int index2 = movies_jComboBox.getSelectedIndex();

        if (index1 == 0) {
            if (index2 == 0) {
                JOptionPane.showMessageDialog(null, "Please fill out all information", "InfoBox : " + "Missing information", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Please fill out all information", "InfoBox : " + "Missing information", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            if (index2 == 0) {
                JOptionPane.showMessageDialog(null, "Please fill out all information", "InfoBox : " + "Missing information", JOptionPane.WARNING_MESSAGE);
            } else {
                if (honeymoon_jCheckBox.isSelected()) {
                    String branches = branches_jComboBox.getSelectedItem().toString();
                    String movies = movies_jComboBox.getSelectedItem().toString();
                    String honeymoon = honeymoon_jCheckBox.getText();
                    price = 300;
                    qty = Integer.parseInt(honeymoon_jSpinner.getValue().toString());
                    total = price * qty;
                    model = (DefaultTableModel) jTable1.getModel();
                    model.addRow(new Object[]{
                        branches,
                        movies,
                        honeymoon,
                        price,
                        qty,
                        total
                    });
                }
                if (delux_jCheckBox.isSelected()) {
                    String branches = branches_jComboBox.getSelectedItem().toString();
                    String movies = movies_jComboBox.getSelectedItem().toString();
                    String delux = delux_jCheckBox.getText();
                    price = 200;
                    qty = Integer.parseInt(delux_jSpinner.getValue().toString());
                    total = price * qty;
                    model = (DefaultTableModel) jTable1.getModel();
                    model.addRow(new Object[]{
                        branches,
                        movies,
                        delux,
                        price,
                        qty,
                        total
                    });
                }
                if (normal_jCheckBox.isSelected()) {
                    String branches = branches_jComboBox.getSelectedItem().toString();
                    String movies = movies_jComboBox.getSelectedItem().toString();
                    String normal = normal_jCheckBox.getText();
                    price = 100;
                    qty = Integer.parseInt(normaljSpinner.getValue().toString());
                    total = price * qty;
                    model = (DefaultTableModel) jTable1.getModel();
                    model.addRow(new Object[]{
                        branches,
                        movies,
                        normal,
                        price,
                        qty,
                        total
                    });
                }
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    sum = sum + Integer.parseInt(jTable1.getValueAt(i, 5).toString());
                }
                TextField_subtotal.setText(String.valueOf(sum));

            }
        }
        


    }//GEN-LAST:event_add_jButtonActionPerformed
        public void Choiceshow_branches(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/movieticket", "root", "");
            String query = "select * from branches";
            ps1 = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            rss = ps1.executeQuery();
            while(rss.next()){
                String choice = rss.getString("branches_name");
                branches_jComboBox.addItem(choice);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(movieticket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(movieticket.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    }
        public void Choiceshow_movies(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/movieticket", "root", "");
            String query = "select * from movies_detail";
            ps1 = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            rss = ps1.executeQuery();
            while(rss.next()){
                String choice = rss.getString("movies_name");
                movies_jComboBox.addItem(choice);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(movieticket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(movieticket.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    }
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
            java.util.logging.Logger.getLogger(movieticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(movieticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(movieticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(movieticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new movieticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextField_balance;
    private javax.swing.JTextField TextField_pay;
    private javax.swing.JTextField TextField_subtotal;
    private javax.swing.JButton add_jButton;
    private javax.swing.JLabel balance_jLabel;
    private javax.swing.JComboBox<String> branches_jComboBox;
    private javax.swing.JTextField cusphone_jTextField;
    private javax.swing.JCheckBox delux_jCheckBox;
    private javax.swing.JSpinner delux_jSpinner;
    private javax.swing.JCheckBox honeymoon_jCheckBox;
    private javax.swing.JSpinner honeymoon_jSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> movies_jComboBox;
    private javax.swing.JCheckBox normal_jCheckBox;
    private javax.swing.JSpinner normaljSpinner;
    private javax.swing.JButton print_jButton;
    // End of variables declaration//GEN-END:variables
}
