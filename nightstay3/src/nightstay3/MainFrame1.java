/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nightstay3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;


/**
 *
 * @author Turgut Reiss
 */
public class MainFrame1 extends javax.swing.JFrame {
    
    boolean isName = false;
     Room RM = new Room();
    boolean juniorisvisible = false;
    boolean presidentisvisible = false;
    boolean royalisvisible = false;
        

    /**
     * Creates new form mainFrame
     */
    public MainFrame1() {
         initComponents();
         home.setVisible(true);
         register.setVisible(false);
         roomOption.setVisible(false);
         summary.setVisible(false);
        showDate();
        showTime();
        
        Scanner inp = new Scanner(System.in);
        
        
        RM.InitializeRoom();
        
        
        //RM.book("A101", 4);
        //RM.getStat(0);
        
        //RM.displayAllRoom();
        
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/nightstay";
        String user = "root";
        String pass = "";
    }
    
      void showDate() {
        Date currentdate = new Date();
        
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat d = new SimpleDateFormat("dd");
        SimpleDateFormat m = new SimpleDateFormat("MM");
        SimpleDateFormat y = new SimpleDateFormat("yyyy");
        
          datelabel2.setText(d.format(currentdate));
          monthlabel.setText(m.format(currentdate));
          yearlabel.setText(y.format(currentdate));
          
    }

    void showTime() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat o = new SimpleDateFormat("hh:mm:ss");
                SimpleDateFormat h = new SimpleDateFormat("hh");
                SimpleDateFormat m = new SimpleDateFormat("mm");
                SimpleDateFormat s = new SimpleDateFormat("ss");
                secondslabel.setText(s.format(d));
                minutelabel.setText(m.format(d));
                hourlabel.setText(h.format(d));
            }

        }).start();
    }
    
    /*
    void send_mail() {
        String Email1 = "ihsanshiddiq6513@gmail.com";
        String Email2 = "alif.zaky.c@students.esqbs.ac.id";

        String from = "nightstay165@gmail.com";
        final String username = "nightstay165@gmail.com";
        final String password = "Esqbs165*";
        String host = "smtp.gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));

            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(Email1));
            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(Email2));

            message.setSubject("Repport File");

            //message.setText(ReportTextArea.getText());

            Transport.send(message);

            System.out.println("Sent message successfully....");
            
            JOptionPane.showMessageDialog(null, "Sent successfully");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    */
   
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
        lblHome = new javax.swing.JLabel();
        lblAboutUs = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        lblBooking = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        hourlabel = new javax.swing.JLabel();
        minutelabel = new javax.swing.JLabel();
        secondslabel = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        datelabel2 = new javax.swing.JLabel();
        monthlabel = new javax.swing.JLabel();
        yearlabel = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        home = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        register = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        firstnameinput = new javax.swing.JTextField();
        lastnameinput = new javax.swing.JTextField();
        emailinput = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        nextbtnroomoption = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        roomOption = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        juniorroomtypecombobox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nextbtnsummary = new javax.swing.JButton();
        backbtnregister = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        checkin = new com.toedter.calendar.JDateChooser();
        checkout = new com.toedter.calendar.JDateChooser();
        royalroomnum = new javax.swing.JComboBox<>();
        presidentroomnum = new javax.swing.JComboBox<>();
        summary = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        finalroom = new javax.swing.JLabel();
        finalduration = new javax.swing.JLabel();
        finalroomprice = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        finalprice = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        savebtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        backbtnroomoption = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        finalcheckin = new javax.swing.JLabel();
        finalcheckout = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        finalroomnumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome To NIGHTSTAY HOTEL ");

        lblHome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setText("Home");
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });

        lblAboutUs.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAboutUs.setForeground(new java.awt.Color(255, 255, 255));
        lblAboutUs.setText("About Us");

        lblAdmin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin.setText("Admin");
        lblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminMouseClicked(evt);
            }
        });

        lblBooking.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblBooking.setForeground(new java.awt.Color(255, 255, 255));
        lblBooking.setText("Booking");
        lblBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBookingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addComponent(lblHome)
                .addGap(18, 18, 18)
                .addComponent(lblBooking)
                .addGap(18, 18, 18)
                .addComponent(lblAdmin)
                .addGap(18, 18, 18)
                .addComponent(lblAboutUs)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblHome)
                    .addComponent(lblBooking)
                    .addComponent(lblAdmin)
                    .addComponent(lblAboutUs))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        hourlabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        hourlabel.setForeground(new java.awt.Color(255, 255, 255));
        hourlabel.setText("HOUR");
        jPanel2.add(hourlabel);

        minutelabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        minutelabel.setForeground(new java.awt.Color(255, 255, 255));
        minutelabel.setText("MINS");
        jPanel2.add(minutelabel);

        secondslabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        secondslabel.setForeground(new java.awt.Color(255, 255, 255));
        secondslabel.setText("SECS");
        jPanel2.add(secondslabel);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("===");
        jPanel2.add(jLabel19);

        datelabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        datelabel2.setForeground(new java.awt.Color(255, 255, 255));
        datelabel2.setText("DATE");
        jPanel2.add(datelabel2);

        monthlabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        monthlabel.setForeground(new java.awt.Color(255, 255, 255));
        monthlabel.setText("MNTH");
        jPanel2.add(monthlabel);

        yearlabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        yearlabel.setForeground(new java.awt.Color(255, 255, 255));
        yearlabel.setText("YEAR");
        jPanel2.add(yearlabel);

        home.setBackground(new java.awt.Color(153, 153, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(153, 153, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("                                   5-STAR HOTEL IN MAKASAR\n\n     NightStay Hotel designed to bring you an upscale modern-day hotel \n        experience from your arrival to your next time. Perfectly located \n   in the heart of Makasar, near the highway and 30 minutes from Airport, \n our 5-star hotel is within easy reach of Makasar's prestigious corporations, \n   landmark attractions, and shopping centers, restaurants, and nightlife.");
        jTextArea1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton6.setText("Next");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(57, 57, 57))
        );

        jLayeredPane1.add(home);
        home.setBounds(0, 0, 740, 540);

        register.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel2.setText("Register");

        firstnameinput.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lastnameinput.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        emailinput.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        genderComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pria", "Wanita" }));

        nextbtnroomoption.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nextbtnroomoption.setText("Next");
        nextbtnroomoption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtnroomoptionActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel15.setText("First Name");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel17.setText("Last Name");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel18.setText("Email");

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerLayout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(64, 64, 64)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lastnameinput, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(firstnameinput, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailinput, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nextbtnroomoption))
                    .addComponent(jLabel2))
                .addGap(69, 69, 69))
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameinput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(46, 46, 46)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameinput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(46, 46, 46)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailinput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(46, 46, 46)
                .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(nextbtnroomoption)
                .addGap(70, 70, 70))
        );

        jLayeredPane1.add(register);
        register.setBounds(0, 0, 740, 540);

        roomOption.setBackground(new java.awt.Color(102, 204, 255));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "101", "102", "103" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel3.setText("Room Type");

        juniorroomtypecombobox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        juniorroomtypecombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Junior", "President", "Royal" }));
        juniorroomtypecombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juniorroomtypecomboboxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Check In");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Check Out");

        nextbtnsummary.setText("Next");
        nextbtnsummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtnsummaryActionPerformed(evt);
            }
        });

        backbtnregister.setText("Back");
        backbtnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnregisterActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton7.setText("Information Room");

        checkin.setDateFormatString("yyyy-MM-dd");

        checkout.setDateFormatString("yyyy-MM-dd");

        royalroomnum.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        royalroomnum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "301", "302", "303" }));
        royalroomnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                royalroomnumActionPerformed(evt);
            }
        });

        presidentroomnum.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        presidentroomnum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "201", "202", "203" }));
        presidentroomnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presidentroomnumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roomOptionLayout = new javax.swing.GroupLayout(roomOption);
        roomOption.setLayout(roomOptionLayout);
        roomOptionLayout.setHorizontalGroup(
            roomOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomOptionLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(roomOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomOptionLayout.createSequentialGroup()
                        .addGroup(roomOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(juniorroomtypecombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(roomOptionLayout.createSequentialGroup()
                        .addGroup(roomOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backbtnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(roomOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roomOptionLayout.createSequentialGroup()
                                    .addGap(221, 221, 221)
                                    .addComponent(jLabel5))
                                .addGroup(roomOptionLayout.createSequentialGroup()
                                    .addGap(202, 202, 202)
                                    .addComponent(checkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(87, 87, 87)))
                .addGroup(roomOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roomOptionLayout.createSequentialGroup()
                        .addGroup(roomOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(roomOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nextbtnsummary, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(presidentroomnum, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(roomOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7)
                            .addComponent(royalroomnum, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(roomOptionLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        roomOptionLayout.setVerticalGroup(
            roomOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomOptionLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addGroup(roomOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(juniorroomtypecombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(roomOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(royalroomnum, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presidentroomnum, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(roomOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roomOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roomOptionLayout.createSequentialGroup()
                        .addComponent(checkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(roomOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nextbtnsummary)
                            .addComponent(backbtnregister))
                        .addGap(86, 86, 86))
                    .addGroup(roomOptionLayout.createSequentialGroup()
                        .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLayeredPane1.add(roomOption);
        roomOption.setBounds(0, 0, 740, 540);

        summary.setBackground(new java.awt.Color(204, 255, 204));

        jLabel6.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel6.setText("Summary");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Type Room");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Duration");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Room/Night");

        finalroom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        finalroom.setText(": x");

        finalduration.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        finalduration.setText(": x");

        finalroomprice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        finalroomprice.setText(": x / Night");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Total");

        finalprice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        finalprice.setText(": x");

        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jCheckBox1.setText("Payed");

        savebtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton4.setText("Send to Mail");

        backbtnroomoption.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        backbtnroomoption.setText("Back");
        backbtnroomoption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnroomoptionActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Check in");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Check out");

        finalcheckin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        finalcheckin.setText(": x");

        finalcheckout.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        finalcheckout.setText(": x");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Room Number");

        finalroomnumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        finalroomnumber.setText("101");

        javax.swing.GroupLayout summaryLayout = new javax.swing.GroupLayout(summary);
        summary.setLayout(summaryLayout);
        summaryLayout.setHorizontalGroup(
            summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryLayout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(summaryLayout.createSequentialGroup()
                        .addComponent(backbtnroomoption)
                        .addGap(51, 51, 51)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(savebtn))
                    .addGroup(summaryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(summaryLayout.createSequentialGroup()
                                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(summaryLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(finalroomnumber))
                                    .addGroup(summaryLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(36, 36, 36)
                                        .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(finalduration)
                                            .addComponent(finalroom)
                                            .addComponent(finalcheckin)
                                            .addComponent(finalcheckout)
                                            .addComponent(finalroomprice)
                                            .addComponent(finalprice))))
                                .addGap(0, 134, Short.MAX_VALUE))
                            .addGroup(summaryLayout.createSequentialGroup()
                                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox1)))))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(108, 108, 108))
        );
        summaryLayout.setVerticalGroup(
            summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addGap(45, 45, 45)
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(finalroomnumber))
                .addGap(32, 32, 32)
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalroom)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalduration)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalcheckin)
                    .addComponent(jLabel10))
                .addGap(25, 25, 25)
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(finalcheckout))
                .addGap(28, 28, 28)
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(finalroomprice))
                .addGap(32, 32, 32)
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalprice)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(35, 35, 35)
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtn)
                    .addComponent(backbtnroomoption)
                    .addComponent(jButton4))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        jLayeredPane1.add(summary);
        summary.setBounds(0, 0, 740, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextbtnroomoptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnroomoptionActionPerformed
        String firstnameattempt = firstnameinput.getText();
        String lastnameattempt = lastnameinput.getText();
        String emailattempt = emailinput.getText();

        if (firstnameattempt.trim().isEmpty() || lastnameattempt.trim().isEmpty() || emailattempt.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error you did not enter a name/email properly, please try again.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            isName = true;
            home.setVisible(false);
            register.setVisible(false);
            roomOption.setVisible(true);
            summary.setVisible(false);
            
            jComboBox1.setVisible(false);
            presidentroomnum.setVisible(false);
            royalroomnum.setVisible(false);
        }
    }//GEN-LAST:event_nextbtnroomoptionActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

         home.setVisible(false);
         register.setVisible(true);
         roomOption.setVisible(false);
         summary.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void nextbtnsummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnsummaryActionPerformed
         
         String checkinattempt = ((JTextField) checkin.getDateEditor().getUiComponent()).getText();
        String checkoutattempt = ((JTextField) checkout.getDateEditor().getUiComponent()).getText();

        Date checkindate = checkin.getDate();
        Date checkoutdate = checkout.getDate();
        
        Date currentdate = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        String crtdt = (s.format(currentdate));
        // LocalDate chkinday = LocalDate.parse(checkinattempt);
        // LocalDate chkoutday = LocalDate.parse(checkoutattempt);

        // Long day_gap = ChronoUnit.DAYS.between(chkinday, chkoutday);

        
        String room = juniorroomtypecombobox.getSelectedItem().toString();
        String froom;
        String room_num = null;
        
        
        boolean roomnumerror = false;
        
        if( (juniorroomtypecombobox.getSelectedItem().toString().equalsIgnoreCase("Junior")) && juniorisvisible){
            room_num = jComboBox1.getSelectedItem().toString();
            roomnumerror = true;
            
        } else if ((juniorroomtypecombobox.getSelectedItem().toString().equalsIgnoreCase("President")) && presidentisvisible) {
            room_num = presidentroomnum.getSelectedItem().toString();
            roomnumerror = true;

        } else if (juniorroomtypecombobox.getSelectedItem().toString().equalsIgnoreCase("Royal") && royalisvisible) {
            room_num = royalroomnum.getSelectedItem().toString();
            roomnumerror = true;

        } else {
            room_num = "lmao";
            roomnumerror = false;
        }
        
        System.out.println(room_num);
        //int roomnum = Integer.parseInt(room_num);

        switch (room_num){
            case "101":
                froom = RM.roomchooser(101);
                break;
            case "102":
                froom = RM.roomchooser(102);
                break;
            case "103":
                froom = RM.roomchooser(103);
                break;
            case "201":
                froom = RM.roomchooser(201);
                break;
            case "202":
                froom = RM.roomchooser(202);
                break;
            case "203":
                froom = RM.roomchooser(203);
                break;
            case "301":
                froom = RM.roomchooser(301);
                break;
            case "302":
                froom = RM.roomchooser(302);
                break;
            case "303":
                froom = RM.roomchooser(303);
                break;
            default:
                froom = null;
                break;

        }
       
        System.out.println(froom);
        System.out.println("roomnumerror status: " + roomnumerror);
        
        if (roomnumerror && froom != null) {

            if (!(checkindate == null) && !(checkoutdate == null)) {

                LocalDate chkinday = LocalDate.parse(checkinattempt);
                LocalDate chkoutday = LocalDate.parse(checkoutattempt);

                Long day_gap = ChronoUnit.DAYS.between(chkinday, chkoutday);

                if (!(day_gap <= 0) && !(checkindate.before(currentdate))) {
                    int finaltotal = (int) (day_gap * RM.getHarga(Integer.parseInt(froom)));
                    home.setVisible(false);
                    register.setVisible(false);
                    roomOption.setVisible(false);
                    summary.setVisible(true);
                    finalroom.setText(": " + juniorroomtypecombobox.getSelectedItem().toString() + "(" + room_num + ")");
                    finalduration.setText(": " + String.valueOf(day_gap) + " hari");
                    finalroomprice.setText(": Rp" + RM.getHarga(Integer.parseInt(froom)) + " /malam");
                    finalprice.setText(": Rp" + finaltotal);
                    finalcheckin.setText(": " + chkinday.toString());
                    finalcheckout.setText(": " + chkoutday.toString());
                    finalroomnumber.setText(room_num);
                    backbtnroomoption.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Please input an appropriate date",
                            "Message!", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please input an appropriate date", "Message!",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid room", "Message!",
                    JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_nextbtnsummaryActionPerformed

    private void backbtnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnregisterActionPerformed
         
         home.setVisible(false);
         register.setVisible(true);
         roomOption.setVisible(false);
         summary.setVisible(false);
    }//GEN-LAST:event_backbtnregisterActionPerformed

    private void backbtnroomoptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnroomoptionActionPerformed
         
         home.setVisible(false);
         register.setVisible(false);
         roomOption.setVisible(true);
         summary.setVisible(false);
    }//GEN-LAST:event_backbtnroomoptionActionPerformed

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
         home.setVisible(true);
         register.setVisible(false);
         roomOption.setVisible(false);
         summary.setVisible(false);
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookingMouseClicked
         home.setVisible(false);
         register.setVisible(true);
         roomOption.setVisible(false);
         summary.setVisible(false);
    }//GEN-LAST:event_lblBookingMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void juniorroomtypecomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juniorroomtypecomboboxActionPerformed
        // TODO add your handling code here:
        String room = juniorroomtypecombobox.getSelectedItem().toString();
        
        switch (room){
            case "Junior":
                jComboBox1.setVisible(true);
                presidentroomnum.setVisible(false);
                royalroomnum.setVisible(false);
                
                juniorisvisible = true;
                presidentisvisible = false;
                royalisvisible = false;
                
                break;
            case "President":
                jComboBox1.setVisible(false);
                presidentroomnum.setVisible(true);
                royalroomnum.setVisible(false);
                
                juniorisvisible = false;
                presidentisvisible = true;
                royalisvisible = false;
                
                break;
            case "Royal":
                jComboBox1.setVisible(false);
                royalroomnum.setVisible(true);
                presidentroomnum.setVisible(false);
                
                juniorisvisible = false;
                presidentisvisible = false;
                royalisvisible = true;
                
                break;
            default:
                break;
                
        }
        
            
            
        /*
        try{
            switch (room) {
                case "Junior":
                    jComboBox1.removeAllItems();
                    jComboBox1.addItem("101");
                    jComboBox1.addItem("102");
                    jComboBox1.addItem("103");
                    break;
                case "President":
                    jComboBox1.removeAllItems();
                    jComboBox1.addItem("201");
                    jComboBox1.addItem("202");
                    jComboBox1.addItem("203");
                    break;
                case "Royal":
                    jComboBox1.removeAllItems();
                    jComboBox1.addItem("301");
                    jComboBox1.addItem("302");
                    jComboBox1.addItem("303");
                    break;
                default:
                    jComboBox1.removeAllItems();
                    break;
                    
                
            } }catch (Exception e) {
            throw new RuntimeException(e);

        }
        */
    }//GEN-LAST:event_juniorroomtypecomboboxActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        //String boookid = finalroomnumber.toString();
        //int bookid = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        int bookid = 0;
        //RM.setStatus(bookid);
        
        if( (juniorroomtypecombobox.getSelectedItem().toString().equalsIgnoreCase("Junior")) && juniorisvisible){
            bookid = Integer.parseInt(jComboBox1.getSelectedItem().toString());
            jComboBox1.removeItem(jComboBox1.getSelectedItem().toString());
            
        } else if ((juniorroomtypecombobox.getSelectedItem().toString().equalsIgnoreCase("President")) && presidentisvisible) {
            bookid = Integer.parseInt(presidentroomnum.getSelectedItem().toString());
            presidentroomnum.removeItem(presidentroomnum.getSelectedItem().toString());
            //roomnumerror = true;

        } else if (juniorroomtypecombobox.getSelectedItem().toString().equalsIgnoreCase("Royal") && royalisvisible) {
            bookid = Integer.parseInt(royalroomnum.getSelectedItem().toString());
            royalroomnum.removeItem(royalroomnum.getSelectedItem().toString());
            //roomnumerror = true;

        }
        RM.setStatus(bookid);
        
       
        //jComboBox1.removeItem(jComboBox1.getSelectedItem().toString());
        
        backbtnroomoption.setVisible(false);
        
                //================FILE HANDLING==================
                
                String path = "\\Users\\Public\\Documents";
        
        String res = null;
        boolean paid = jCheckBox1.isSelected();
        if (paid == true) {
            res = "Sudah dibayar.";
        } else {
            res = "Belum dibayar.";
        }
                
        //nama file
        String fname = firstnameinput.getText();
        String nameFile = fname + lastnameinput.getText() + "invoice";
        
        Document doc = new Document();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+ "\\" + nameFile + ".pdf"));
            doc.open();
            
            PdfPTable tbl = new PdfPTable(5 );
            Paragraph para = new Paragraph();
            
           
            //
            Font catFont = new Font(null, 24, Font.BOLD);
            Font fnameprint = new Font(null, 20, Font.BOLD);
            Font lnameprint = new Font(null, 18);
            Font desc = new Font(null,16);
            //title setting
            para.add(new Paragraph("NIGHTSTAYv2 INVOICE", catFont));
            para.add(new Paragraph("_________________", catFont));
            para.add(new Paragraph(""));
            para.add(new Paragraph("TN/NY " + fname, fnameprint));
            para.add(new Paragraph(lastnameinput.getText(),lnameprint));
            para.add(new Paragraph(""));
            para.add(new Paragraph("Kamar :  " + finalroom.getText(), desc));
            para.add(new Paragraph("Durasi Tinggal :  " + finalduration.getText(), desc));
            para.add(new Paragraph("Harga Kamar :  " + finalroomprice.getText(), desc));
            para.add(new Paragraph("Check In :  " + finalcheckin.getText(), desc));
            para.add(new Paragraph("Check Out :  " + finalcheckout.getText(), desc));
            para.add(new Paragraph(""));
            para.add(new Paragraph("TOTAL: Rp" + finalprice.getText(), fnameprint));
            para.add(new Paragraph("Status: " + res, desc));
            
            //table setting
            //adding header
            
            
            doc.add(para);
            //doc.add(tbl);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFrame1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(MainFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }

        doc.close();

        JOptionPane.showMessageDialog(null, "File created.");

        // ===================================================
        // ==========BELOW IS SEND TO EMAIL FUNCTION==========
        // ===================================================

        String to = emailinput.getText();

        String from = "nightstay165@gmail.com";
        final String username = "nightstay165@gmail.com";
        final String password = "Esqbs165*";
        String host = "smtp.gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        
        Boolean flag = true;

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

            message.setSubject("NIGHTSTAY INVOICE");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Invoice for " + fname +" "+ lastnameinput.getText());

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            messageBodyPart = new MimeBodyPart();
            // String filename = "\\Users\\LeSnovo\\Documents\\Subject1.txt";
            String filename = "\\Users\\Public\\Documents\\" + nameFile + ".pdf";
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("Night Stay Invoice.pdf");
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

            Transport.send(message);

            System.out.println("Sent message successfully....");
            
            //emailsentnotification.setVisible(true);
            //emailsentnotification.setSize(340, 180);
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error you did not enter an email properly, please try again.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
        
        
        firstnameinput.setText("");
        lastnameinput.setText("");
        emailinput.setText("");
        checkin.setCalendar(null);
                checkout.setCalendar(null);
                
       


// TODO add your handling code here:
    }//GEN-LAST:event_savebtnActionPerformed

    private void royalroomnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_royalroomnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_royalroomnumActionPerformed

    private void presidentroomnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presidentroomnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presidentroomnumActionPerformed

    private void lblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblAdminMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtnregister;
    private javax.swing.JButton backbtnroomoption;
    private com.toedter.calendar.JDateChooser checkin;
    private com.toedter.calendar.JDateChooser checkout;
    private javax.swing.JLabel datelabel2;
    private javax.swing.JTextField emailinput;
    private javax.swing.JLabel finalcheckin;
    private javax.swing.JLabel finalcheckout;
    private javax.swing.JLabel finalduration;
    private javax.swing.JLabel finalprice;
    private javax.swing.JLabel finalroom;
    private javax.swing.JLabel finalroomnumber;
    private javax.swing.JLabel finalroomprice;
    private javax.swing.JTextField firstnameinput;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JPanel home;
    private javax.swing.JLabel hourlabel;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> juniorroomtypecombobox;
    private javax.swing.JTextField lastnameinput;
    private javax.swing.JLabel lblAboutUs;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblBooking;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel minutelabel;
    private javax.swing.JLabel monthlabel;
    private javax.swing.JButton nextbtnroomoption;
    private javax.swing.JButton nextbtnsummary;
    private javax.swing.JComboBox<String> presidentroomnum;
    private javax.swing.JPanel register;
    private javax.swing.JPanel roomOption;
    private javax.swing.JComboBox<String> royalroomnum;
    private javax.swing.JButton savebtn;
    private javax.swing.JLabel secondslabel;
    private javax.swing.JPanel summary;
    private javax.swing.JLabel yearlabel;
    // End of variables declaration//GEN-END:variables
}
