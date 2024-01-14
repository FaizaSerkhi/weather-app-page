/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanagement;

import java.awt.CardLayout;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import myutil.Database;
import myutil.GradientPanel;
import myutil.*;

/**
 *
 * @author haris
 */
public class Home extends javax.swing.JFrame {


    /**
     * Creates new form Home
     */
    
    CardLayout card; 
    Container container;
    String page_showing= "dashboard";
    LineBorder HOVER_BTN_BORDER = new LineBorder(new Color(0x7C7CF1),2,true);
     LineBorder DEFAULT_BTN_BORDER = new LineBorder(Color.WHITE,1,true);
     LineBorder DEFAULT_BORDER = new LineBorder(Color.blue,1,true);
  final  LineBorder INPUT_BORDER = new LineBorder(new Color(0x7c7cf1),1,true);
  final LineBorder HOVER_BORDER=new LineBorder(new Color(0x7C7CF1),2,true);
  
       
  JPanel newDashboardPanel = new NewDashboardPanel();
   
  Database database = Database.getInstance();
  
   int medicine_row = 0;
   DefaultTableModel tableModel;
  public  JComponent getAllMonthlyTable()
    {

      
//        ArrayList<PatientDetails> patientDetailsArrayList = database.getMonthlyPatient();
//        int row = patientDetailsArrayList.size();
//
//        String data[][] = new String[row][3];
//        int i=0;
//        for(PatientDetails patient : patientDetailsArrayList)
//        {
//            // System.out.println(patient.getName() + " " + patient.getGender());
//            data[i][0] = Integer.toString(patient.getPid());
//            data[i][1] = patient.getName();
//            data[i][2] = patient.getDate().toString();
//            i++;
//        }
//       int data[][] ={
//        
//    };
        Object data[][]={};
        String column[] = {"Name" ,"Dosess" };
        
        MultipleComponentCellTest t1 = new MultipleComponentCellTest(data);
        tableModel  = t1.getTableModel();
        // MultipleComponentCellTest new_memeber_table = t1.getTable();

        //defaultTableModel= (DefaultTableModel)new_memeber_table.getModel();

       // new_memeber_table.setTextColor(new Color(0x363659));

       // new_memeber_table.setRowColor(Color.white,Color.white);

        //JScrollPane tableScrollPane = new JScrollPane(t1.getTable(),JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        return  t1.getTable();
    }
  public Home() {
      
         setSize(1100,700);
         setLocationRelativeTo(null);
         initComponents();
         menu_panel.setBackground(new Color(0x021036));
         Dashboard.setLayout(new BorderLayout());
         
         Dashboard.add(newDashboardPanel , BorderLayout.CENTER);
         card = (CardLayout)main_panel.getLayout();
         card.show(main_panel,"prescription");
         
         
          selected_medicine_panel.add(getAllMonthlyTable());
        
        
        
         JScrollPane medicineScrollPane;
         
         DocumentListener dl = new DocumentListener(){
             @Override
             public void insertUpdate(DocumentEvent e) {
                 updateFieldState();
             }

             @Override
             public void removeUpdate(DocumentEvent e) {
                    updateFieldState(); 
             }

             @Override
             public void changedUpdate(DocumentEvent e) {
                updateFieldState();
        }
             
             protected void updateFieldState()
                 {
                     Database database = Database.getInstance();
                     String text = medicine_input.getText();
                     ArrayList<String> medi = database.getLikeMedicine(text);
                     
                     DefaultListModel lm  = new DefaultListModel();
                     String br[] = new String[1000];
                     int i=0;
                     for(String m : medi)
                     {
                        
                        lm.addElement(m);
                      

                     }
                      medicine_list.setModel(lm);

                    
                    // medicine_list.setPreferredSize(new Dimension(80,100));

                 }

             
         };
          medicine_input.getDocument().addDocumentListener(dl);
         
       //    medicineScrollPane = new JScrollPane(medicine_list,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

           
         
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender_radio_group = new javax.swing.ButtonGroup();
        header = header = new GradientPanel(new Color(0x589BE8),new Color(0x5AEEB2),1100,50);
        heade_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        doctor_icon_panel = new JPanel();
        doctor_icon_panel.add(new SetImageIcon(new ImageIcon("./images/doctor_icon1.png"),35,35)) ;
        footer = footer = new GradientPanel(new Color(0x5AEEB2),new Color(0x9FC3EE),1100,30);
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menu_panel = new javax.swing.JPanel();
        dashboard_label = new javax.swing.JLabel();
        patient_label = new javax.swing.JLabel();
        prescription_label = new javax.swing.JLabel();
        reports_label = new javax.swing.JLabel();
        dashboard_icon = new JPanel();
        dashboard_icon.add(new SetImageIcon(new ImageIcon("./images/dashboard_icon.png"),30,30)) ;
        patient_icon = new JPanel();
        patient_icon.add(new SetImageIcon(new ImageIcon("./images/patient_icon1.png"),30,30)) ;
        prescription_icon = new JPanel();
        prescription_icon.add(new SetImageIcon(new ImageIcon("./images/prescription_icon.png"),30,30)) ;
        reports_icon = new JPanel();
        reports_icon.add(new SetImageIcon(new ImageIcon("./images/reports_icon.png"),30,30)) ;
        main_panel = new javax.swing.JPanel();
        Prescription = new javax.swing.JPanel();
        prescription_form_panel = prescription_form_panel = new GradientPanel(new Color(0xe8feff),new Color(0xe8f3ff) , 300,600);
        prescription_form = new JPanel();
        prescription_form.setBackground(new Color(202,177,18));
        mobile_number_input1 = new javax.swing.JTextField();
        name_label16 = new javax.swing.JLabel();
        name_input1 = new javax.swing.JTextField();
        name_label17 = new javax.swing.JLabel();
        prescription_save_btn = new javax.swing.JButton();
        next_btn1 = new javax.swing.JButton();
        name_label23 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        date_input1 = new com.toedter.calendar.JDateChooser();
        status_label1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        medicine_input = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        add_medicine_btn = new javax.swing.JButton();
        medicine_list = new javax.swing.JList<>();
        selected_medicine_panel = new javax.swing.JPanel();
        prescription_panel_head1 = new javax.swing.JPanel();
        patient_panel_header_title1 = new javax.swing.JLabel();
        Reports = new javax.swing.JPanel();
        Dashboard = new javax.swing.JPanel();
        Patient = new javax.swing.JPanel();
        patient_panel_head = new javax.swing.JPanel();
        patient_panel_header_title = new javax.swing.JLabel();
        patient_form_panel = patient_form_panel = new GradientPanel(new Color(0xe8feff),new Color(0xe8f3ff) , 300,600);
        patient_form_panel1 = new JPanel();
        patient_form_panel1.setBackground(new Color(202,177,18));
        mobile_number_input = new javax.swing.JTextField();
        name_label7 = new javax.swing.JLabel();
        age_input = new javax.swing.JTextField();
        blood_pressure_input = new javax.swing.JTextField();
        name_input = new javax.swing.JTextField();
        name_label8 = new javax.swing.JLabel();
        pulse_input = new javax.swing.JTextField();
        name_label9 = new javax.swing.JLabel();
        weight_input = new javax.swing.JTextField();
        name_label10 = new javax.swing.JLabel();
        name_label11 = new javax.swing.JLabel();
        name_label12 = new javax.swing.JLabel();
        name_label13 = new javax.swing.JLabel();
        male_radio_btn = new javax.swing.JRadioButton();
        female_radio_btn = new javax.swing.JRadioButton();
        save_btn = new javax.swing.JButton();
        next_btn = new javax.swing.JButton();
        name_label14 = new javax.swing.JLabel();
        sugar_input = new javax.swing.JTextField();
        vomiting_chk = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        cold_and_flue_chk = new javax.swing.JCheckBox();
        fever_chk = new javax.swing.JCheckBox();
        runny_nose_chk = new javax.swing.JCheckBox();
        headache_chk = new javax.swing.JCheckBox();
        cough_chk = new javax.swing.JCheckBox();
        diarrhea_chk = new javax.swing.JCheckBox();
        weakness_chk = new javax.swing.JCheckBox();
        bodyache_chk = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        other_symptoms_input = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        name_label15 = new javax.swing.JLabel();
        date_input = new com.toedter.calendar.JDateChooser();
        status_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 700));

        header.setBackground(new java.awt.Color(153, 255, 255));
        header.setPreferredSize(new java.awt.Dimension(1100, 49));

        heade_label.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        heade_label.setText("SHRIGURU CLINIC");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Dr.Ajit Pawar");

        doctor_icon_panel.setPreferredSize(new java.awt.Dimension(35, 35));
        doctor_icon_panel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heade_label, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1190, Short.MAX_VALUE)
                .addComponent(doctor_icon_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(52, 52, 52))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(heade_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(doctor_icon_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        footer.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText(" By PatilInfo Tech");

        jLabel5.setText("2023 Copyright");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(17, 17, 17))
        );

        getContentPane().add(footer, java.awt.BorderLayout.PAGE_END);

        menu_panel.setBackground(new java.awt.Color(0, 255, 204));
        menu_panel.setForeground(new java.awt.Color(255, 255, 255));
        menu_panel.setMaximumSize(new java.awt.Dimension(3000, 32767));

        dashboard_label.setBackground(new java.awt.Color(255, 51, 51));
        dashboard_label.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        dashboard_label.setForeground(new java.awt.Color(255, 255, 255));
        dashboard_label.setText("Dashbord");
        dashboard_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboard_labelMouseClicked(evt);
            }
        });

        patient_label.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        patient_label.setForeground(new java.awt.Color(255, 255, 255));
        patient_label.setText("Patient");
        patient_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patient_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patient_labelMouseClicked(evt);
            }
        });

        prescription_label.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        prescription_label.setForeground(new java.awt.Color(255, 255, 255));
        prescription_label.setText("Prescription");
        prescription_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prescription_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prescription_labelMouseClicked(evt);
            }
        });

        reports_label.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        reports_label.setForeground(new java.awt.Color(255, 255, 255));
        reports_label.setText("Reports");
        reports_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reports_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reports_labelMouseClicked(evt);
            }
        });

        dashboard_icon.setBackground(new java.awt.Color(0, 0, 102));
        dashboard_icon.setForeground(new java.awt.Color(0, 0, 102));
        dashboard_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard_icon.setPreferredSize(new java.awt.Dimension(30, 30));
        dashboard_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboard_iconMouseClicked(evt);
            }
        });
        dashboard_icon.setLayout(new java.awt.CardLayout());

        patient_icon.setBackground(new java.awt.Color(0, 0, 102));
        patient_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patient_icon.setPreferredSize(new java.awt.Dimension(30, 30));
        patient_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patient_iconMouseClicked(evt);
            }
        });
        patient_icon.setLayout(new java.awt.CardLayout());

        prescription_icon.setBackground(new java.awt.Color(0, 0, 102));
        prescription_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prescription_icon.setPreferredSize(new java.awt.Dimension(30, 30));
        prescription_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prescription_iconMouseClicked(evt);
            }
        });
        prescription_icon.setLayout(new java.awt.CardLayout());

        reports_icon.setBackground(new java.awt.Color(0, 0, 102));
        reports_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reports_icon.setPreferredSize(new java.awt.Dimension(30, 30));
        reports_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reports_iconMouseClicked(evt);
            }
        });
        reports_icon.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout menu_panelLayout = new javax.swing.GroupLayout(menu_panel);
        menu_panel.setLayout(menu_panelLayout);
        menu_panelLayout.setHorizontalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_panelLayout.createSequentialGroup()
                        .addGroup(menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dashboard_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patient_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prescription_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(menu_panelLayout.createSequentialGroup()
                        .addComponent(reports_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(reports_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patient_label, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(dashboard_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prescription_label, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap())
        );
        menu_panelLayout.setVerticalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboard_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboard_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patient_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patient_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prescription_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prescription_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reports_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reports_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(811, Short.MAX_VALUE))
        );

        getContentPane().add(menu_panel, java.awt.BorderLayout.LINE_START);

        main_panel.setLayout(new java.awt.CardLayout());

        Prescription.setBackground(new java.awt.Color(255, 153, 153));
        Prescription.setForeground(new java.awt.Color(255, 255, 255));
        Prescription.setLayout(new java.awt.BorderLayout());

        prescription_form_panel.setBackground(new java.awt.Color(255, 255, 255));
        prescription_form_panel.setPreferredSize(new java.awt.Dimension(1100, 700));

        prescription_form.setBackground(new java.awt.Color(251, 252, 224));
        prescription_form.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        prescription_form.setPreferredSize(new java.awt.Dimension(910, 530));

        mobile_number_input1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(124, 124, 241), 1, true));
        mobile_number_input1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mobile_number_input1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mobile_number_input1MouseExited(evt);
            }
        });
        mobile_number_input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_number_input1ActionPerformed(evt);
            }
        });

        name_label16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        name_label16.setText("Name :-");

        name_input1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(124, 124, 241), 1, true));
        name_input1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                name_input1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                name_input1MouseExited(evt);
            }
        });
        name_input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_input1ActionPerformed(evt);
            }
        });

        name_label17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        name_label17.setText("Mobile no:-");

        prescription_save_btn.setBackground(new java.awt.Color(51, 102, 255));
        prescription_save_btn.setForeground(new java.awt.Color(255, 255, 255));
        prescription_save_btn.setText("Save");
        prescription_save_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        prescription_save_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prescription_save_btn.setFocusPainted(false);
        prescription_save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescription_save_btnActionPerformed(evt);
            }
        });

        next_btn1.setBackground(new java.awt.Color(153, 255, 153));
        next_btn1.setText("Next");
        next_btn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        next_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next_btn1.setFocusPainted(false);
        next_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                next_btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                next_btn1MouseExited(evt);
            }
        });
        next_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_btn1ActionPerformed(evt);
            }
        });

        name_label23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        name_label23.setText("Date :-");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        date_input1.setDateFormatString("dd-MM-yyyy");

        status_label1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        status_label1.setForeground(new java.awt.Color(0, 153, 51));

        jLabel8.setText("Enter Medicine :-");

        medicine_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicine_inputActionPerformed(evt);
            }
        });

        jLabel9.setText("Selected Medicine :-");

        add_medicine_btn.setBackground(new java.awt.Color(0, 51, 255));
        add_medicine_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_medicine_btn.setText("Add");
        add_medicine_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        add_medicine_btn.setFocusPainted(false);
        add_medicine_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_medicine_btnActionPerformed(evt);
            }
        });

        medicine_list.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        selected_medicine_panel.setBackground(new java.awt.Color(255, 255, 255));
        selected_medicine_panel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout prescription_formLayout = new javax.swing.GroupLayout(prescription_form);
        prescription_form.setLayout(prescription_formLayout);
        prescription_formLayout.setHorizontalGroup(
            prescription_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prescription_formLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(prescription_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medicine_list, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(prescription_formLayout.createSequentialGroup()
                        .addComponent(medicine_input, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_medicine_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(prescription_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prescription_formLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(status_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(prescription_formLayout.createSequentialGroup()
                        .addComponent(selected_medicine_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))))
            .addGroup(prescription_formLayout.createSequentialGroup()
                .addGroup(prescription_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prescription_formLayout.createSequentialGroup()
                        .addGroup(prescription_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(prescription_formLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(prescription_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(prescription_formLayout.createSequentialGroup()
                                        .addGap(217, 217, 217)
                                        .addComponent(prescription_save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(next_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(prescription_formLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(name_label16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name_input1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(name_label17, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(mobile_number_input1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(name_label23, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_input1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prescription_formLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2)))
                .addContainerGap())
        );
        prescription_formLayout.setVerticalGroup(
            prescription_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prescription_formLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(prescription_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_input1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(prescription_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name_label23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mobile_number_input1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name_label17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name_input1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name_label16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(prescription_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prescription_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(medicine_input, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add_medicine_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(prescription_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(status_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(prescription_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prescription_formLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(selected_medicine_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(prescription_formLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(medicine_list, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(prescription_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prescription_save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        prescription_form_panel.add(prescription_form);

        Prescription.add(prescription_form_panel, java.awt.BorderLayout.CENTER);

        prescription_panel_head1.setBackground(new java.awt.Color(0, 0, 102));
        prescription_panel_head1.setForeground(new java.awt.Color(51, 255, 255));
        prescription_panel_head1.setMinimumSize(new java.awt.Dimension(169, 40));
        prescription_panel_head1.setPreferredSize(new java.awt.Dimension(169, 35));

        patient_panel_header_title1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        patient_panel_header_title1.setForeground(new java.awt.Color(102, 255, 255));
        patient_panel_header_title1.setText("Prescription");
        prescription_panel_head1.add(patient_panel_header_title1);

        Prescription.add(prescription_panel_head1, java.awt.BorderLayout.PAGE_START);

        main_panel.add(Prescription, "prescription");

        Reports.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout ReportsLayout = new javax.swing.GroupLayout(Reports);
        Reports.setLayout(ReportsLayout);
        ReportsLayout.setHorizontalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1471, Short.MAX_VALUE)
        );
        ReportsLayout.setVerticalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );

        main_panel.add(Reports, "reports");

        Dashboard.setBackground(new java.awt.Color(255, 255, 0));
        Dashboard.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1471, Short.MAX_VALUE)
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );

        main_panel.add(Dashboard, "dashboard");

        Patient.setBackground(new java.awt.Color(204, 255, 255));
        Patient.setLayout(new java.awt.BorderLayout());

        patient_panel_head.setBackground(new java.awt.Color(0, 0, 102));
        patient_panel_head.setForeground(new java.awt.Color(51, 255, 255));
        patient_panel_head.setMinimumSize(new java.awt.Dimension(169, 40));
        patient_panel_head.setPreferredSize(new java.awt.Dimension(169, 35));

        patient_panel_header_title.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        patient_panel_header_title.setForeground(new java.awt.Color(102, 255, 255));
        patient_panel_header_title.setText("Patient Information");
        patient_panel_head.add(patient_panel_header_title);

        Patient.add(patient_panel_head, java.awt.BorderLayout.PAGE_START);

        patient_form_panel.setBackground(new java.awt.Color(255, 255, 255));
        patient_form_panel.setPreferredSize(new java.awt.Dimension(1100, 700));

        patient_form_panel1.setBackground(new java.awt.Color(251, 252, 224));
        patient_form_panel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        patient_form_panel1.setPreferredSize(new java.awt.Dimension(830, 530));

        mobile_number_input.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(124, 124, 241), 1, true));
        mobile_number_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mobile_number_inputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mobile_number_inputMouseExited(evt);
            }
        });
        mobile_number_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_number_inputActionPerformed(evt);
            }
        });

        name_label7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        name_label7.setText("Name :-");

        age_input.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(124, 124, 241), 1, true));
        age_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                age_inputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                age_inputMouseExited(evt);
            }
        });
        age_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age_inputActionPerformed(evt);
            }
        });

        blood_pressure_input.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(124, 124, 241), 1, true));
        blood_pressure_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                blood_pressure_inputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                blood_pressure_inputMouseExited(evt);
            }
        });
        blood_pressure_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blood_pressure_inputActionPerformed(evt);
            }
        });

        name_input.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(124, 124, 241), 1, true));
        name_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                name_inputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                name_inputMouseExited(evt);
            }
        });
        name_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_inputActionPerformed(evt);
            }
        });

        name_label8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        name_label8.setText("Mobile no:-");

        pulse_input.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(124, 124, 241), 1, true));
        pulse_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pulse_inputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pulse_inputMouseExited(evt);
            }
        });
        pulse_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulse_inputActionPerformed(evt);
            }
        });

        name_label9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        name_label9.setText("Age :-");

        weight_input.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(124, 124, 241), 1, true));
        weight_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                weight_inputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                weight_inputMouseExited(evt);
            }
        });
        weight_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weight_inputActionPerformed(evt);
            }
        });

        name_label10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        name_label10.setText("Gender :-");

        name_label11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        name_label11.setText("Weight :-");

        name_label12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        name_label12.setText("Blood Pressure :-");

        name_label13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        name_label13.setText("Pulse :-");

        male_radio_btn.setBackground(new java.awt.Color(251, 252, 224));
        gender_radio_group.add(male_radio_btn);
        male_radio_btn.setText("Male");
        male_radio_btn.setToolTipText("");
        male_radio_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        male_radio_btn.setFocusPainted(false);
        male_radio_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_radio_btnActionPerformed(evt);
            }
        });

        female_radio_btn.setBackground(new java.awt.Color(251, 252, 224));
        gender_radio_group.add(female_radio_btn);
        female_radio_btn.setText("Female");
        female_radio_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        female_radio_btn.setFocusPainted(false);
        female_radio_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_radio_btnActionPerformed(evt);
            }
        });

        save_btn.setBackground(new java.awt.Color(51, 102, 255));
        save_btn.setForeground(new java.awt.Color(255, 255, 255));
        save_btn.setText("Save");
        save_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        save_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save_btn.setFocusPainted(false);
        save_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                save_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                save_btnMouseExited(evt);
            }
        });
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        next_btn.setBackground(new java.awt.Color(153, 255, 153));
        next_btn.setText("Next");
        next_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        next_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next_btn.setFocusPainted(false);
        next_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                next_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                next_btnMouseExited(evt);
            }
        });
        next_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_btnActionPerformed(evt);
            }
        });

        name_label14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        name_label14.setText("Date :-");

        sugar_input.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(124, 124, 241), 1, true));
        sugar_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sugar_inputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sugar_inputMouseExited(evt);
            }
        });
        sugar_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sugar_inputActionPerformed(evt);
            }
        });

        vomiting_chk.setBackground(new java.awt.Color(251, 252, 224));
        vomiting_chk.setText("Vomiting");
        vomiting_chk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vomiting_chk.setFocusPainted(false);
        vomiting_chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vomiting_chkActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Symptoms");

        cold_and_flue_chk.setBackground(new java.awt.Color(251, 252, 224));
        cold_and_flue_chk.setText("Cold and Flue");
        cold_and_flue_chk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cold_and_flue_chk.setFocusPainted(false);
        cold_and_flue_chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cold_and_flue_chkActionPerformed(evt);
            }
        });

        fever_chk.setBackground(new java.awt.Color(251, 252, 224));
        fever_chk.setText("Fever");
        fever_chk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fever_chk.setFocusPainted(false);
        fever_chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fever_chkActionPerformed(evt);
            }
        });

        runny_nose_chk.setBackground(new java.awt.Color(251, 252, 224));
        runny_nose_chk.setText("Runny Nose");
        runny_nose_chk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        runny_nose_chk.setFocusable(false);
        runny_nose_chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runny_nose_chkActionPerformed(evt);
            }
        });

        headache_chk.setBackground(new java.awt.Color(251, 252, 224));
        headache_chk.setText("Headache");
        headache_chk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        headache_chk.setFocusPainted(false);
        headache_chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headache_chkActionPerformed(evt);
            }
        });

        cough_chk.setBackground(new java.awt.Color(251, 252, 224));
        cough_chk.setText("Cough");
        cough_chk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cough_chk.setFocusPainted(false);
        cough_chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cough_chkActionPerformed(evt);
            }
        });

        diarrhea_chk.setBackground(new java.awt.Color(251, 252, 224));
        diarrhea_chk.setText("Diarrhea");
        diarrhea_chk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        diarrhea_chk.setFocusPainted(false);
        diarrhea_chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diarrhea_chkActionPerformed(evt);
            }
        });

        weakness_chk.setBackground(new java.awt.Color(251, 252, 224));
        weakness_chk.setText("Weakness");
        weakness_chk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        weakness_chk.setFocusPainted(false);
        weakness_chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weakness_chkActionPerformed(evt);
            }
        });

        bodyache_chk.setBackground(new java.awt.Color(251, 252, 224));
        bodyache_chk.setText("Bodyache");
        bodyache_chk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bodyache_chk.setFocusPainted(false);
        bodyache_chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodyache_chkActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel2.setText("Other :-");

        other_symptoms_input.setColumns(20);
        other_symptoms_input.setRows(5);
        other_symptoms_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(124, 124, 241)));
        other_symptoms_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                other_symptoms_inputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                other_symptoms_inputMouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(other_symptoms_input);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        name_label15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        name_label15.setText("Sugar :-");

        date_input.setDateFormatString("dd-MM-yyyy");

        status_label.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        status_label.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout patient_form_panel1Layout = new javax.swing.GroupLayout(patient_form_panel1);
        patient_form_panel1.setLayout(patient_form_panel1Layout);
        patient_form_panel1Layout.setHorizontalGroup(
            patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_form_panel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cough_chk, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cold_and_flue_chk)
                    .addComponent(fever_chk, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(patient_form_panel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patient_form_panel1Layout.createSequentialGroup()
                        .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(name_label12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(name_label11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(name_label13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(name_label9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_label7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patient_form_panel1Layout.createSequentialGroup()
                                .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(vomiting_chk, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pulse_input, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(blood_pressure_input, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(weight_input, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                                        .addComponent(age_input, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(diarrhea_chk, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(weakness_chk, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bodyache_chk, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(headache_chk, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(runny_nose_chk, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(394, Short.MAX_VALUE))
                    .addGroup(patient_form_panel1Layout.createSequentialGroup()
                        .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patient_form_panel1Layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(next_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(patient_form_panel1Layout.createSequentialGroup()
                        .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(patient_form_panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name_label8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_label10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patient_form_panel1Layout.createSequentialGroup()
                                        .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(name_label14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(name_label15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mobile_number_input, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sugar_input, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(patient_form_panel1Layout.createSequentialGroup()
                                        .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(date_input, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(male_radio_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(female_radio_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4))))
                            .addGroup(patient_form_panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(status_label, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)))
                        .addGap(64, 64, 64))))
        );
        patient_form_panel1Layout.setVerticalGroup(
            patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_form_panel1Layout.createSequentialGroup()
                .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patient_form_panel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_label10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_label9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_label11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weight_input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sugar_input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_label15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(patient_form_panel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_label7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_label8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobile_number_input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(female_radio_btn)
                                .addComponent(male_radio_btn))
                            .addComponent(age_input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name_label12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(blood_pressure_input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name_label14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(date_input, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_label13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pulse_input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patient_form_panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cough_chk)
                            .addComponent(vomiting_chk)
                            .addComponent(bodyache_chk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cold_and_flue_chk)
                            .addComponent(diarrhea_chk)
                            .addComponent(headache_chk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(runny_nose_chk, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weakness_chk)
                            .addComponent(fever_chk))
                        .addGap(18, 18, 18)
                        .addComponent(status_label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(patient_form_panel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(patient_form_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(next_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        patient_form_panel.add(patient_form_panel1);

        Patient.add(patient_form_panel, java.awt.BorderLayout.CENTER);

        main_panel.add(Patient, "patient");

        getContentPane().add(main_panel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void dashboard_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard_labelMouseClicked
       
        
     
        Dashboard.remove(newDashboardPanel);
        newDashboardPanel =new NewDashboardPanel(); 
        Dashboard.add( newDashboardPanel, BorderLayout.CENTER); //to refresh while running system    
        
        card = (CardLayout)main_panel.getLayout();
        card.show(main_panel, "dashboard");
        
        page_showing = "dashboard";
        
        dashboard_label.setForeground(Color.CYAN);
        patient_label.setForeground(Color.white);
        prescription_label.setForeground(Color.white);
        reports_label.setForeground(Color.white);
          
        System.out.println("label clicked");
         
    }//GEN-LAST:event_dashboard_labelMouseClicked

    private void patient_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patient_labelMouseClicked

        resetPatientInfoForm();
        card = (CardLayout)main_panel.getLayout();
        card.show(main_panel, "patient");
        page_showing = "patient";
       
        dashboard_label.setForeground(Color.white);
        patient_label.setForeground(Color.CYAN);
        prescription_label.setForeground(Color.white);
        reports_label.setForeground(Color.white);
    }//GEN-LAST:event_patient_labelMouseClicked

    private void prescription_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prescription_labelMouseClicked
       card = (CardLayout)main_panel.getLayout();
        card.show(main_panel, "prescription");
        page_showing = "prescription";
         dashboard_label.setForeground(Color.white);
        patient_label.setForeground(Color.white);
        prescription_label.setForeground(Color.cyan);
        reports_label.setForeground(Color.white);
        
    }//GEN-LAST:event_prescription_labelMouseClicked

    private void reports_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reports_labelMouseClicked
        // TODO add your handling code here:
        card = (CardLayout)main_panel.getLayout();
        card.show(main_panel, "reports");
        page_showing = "reports";
         dashboard_label.setForeground(Color.white);
        patient_label.setForeground(Color.white);
        prescription_label.setForeground(Color.white);
        reports_label.setForeground(Color.cyan);
    }//GEN-LAST:event_reports_labelMouseClicked

    private void mobile_number_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_number_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobile_number_inputActionPerformed

    private void age_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age_inputActionPerformed

    private void blood_pressure_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blood_pressure_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blood_pressure_inputActionPerformed

    private void name_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_inputActionPerformed

    private void pulse_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulse_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pulse_inputActionPerformed

    private void weight_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weight_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weight_inputActionPerformed

    private void male_radio_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_radio_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_male_radio_btnActionPerformed

    private void female_radio_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_radio_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_female_radio_btnActionPerformed

    private void sugar_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sugar_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sugar_inputActionPerformed

    private void vomiting_chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vomiting_chkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vomiting_chkActionPerformed

    private void cold_and_flue_chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cold_and_flue_chkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cold_and_flue_chkActionPerformed

    private void fever_chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fever_chkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fever_chkActionPerformed

    private void runny_nose_chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runny_nose_chkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_runny_nose_chkActionPerformed

    private void headache_chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headache_chkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_headache_chkActionPerformed

    private void cough_chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cough_chkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cough_chkActionPerformed

    private void diarrhea_chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diarrhea_chkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diarrhea_chkActionPerformed

    private void weakness_chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weakness_chkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weakness_chkActionPerformed

    private void bodyache_chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodyache_chkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bodyache_chkActionPerformed

    private Date getCurrentDate()
    {
        SimpleDateFormat fr = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        fr.format(date);
        return date;
        
    }
    private StringBuffer getAllSymptoms()
    {
        StringBuffer symptoms = new StringBuffer() ;
        if(bodyache_chk.isSelected()){
            symptoms.append("bodyache, ");
        }
         if(headache_chk.isSelected()){
            symptoms.append("headache, ");
        }
        if(cold_and_flue_chk.isSelected())
        {
            symptoms.append("cold and flue, ");
        }
         if(cough_chk.isSelected())
        {
            symptoms.append("cough, ");
        }
          if(vomiting_chk.isSelected())
        {
            symptoms.append("vomiting, ");
        }
           if(weakness_chk.isSelected())
        {
            symptoms.append("weakness, ");
        } if(runny_nose_chk.isSelected())
        {
            symptoms.append("runny nose, ");
        }
         if(diarrhea_chk.isSelected())
        {
            symptoms.append("diarrhea, ");
        }
          if(fever_chk.isSelected())
        {
            symptoms.append("fever, ");
        }
           
        if(other_symptoms_input.getText().length()!=0)
        {
            symptoms.append(other_symptoms_input.getText());
            
        }
        return symptoms;
    }
    private void resetPatientInfoForm()
    {
        name_input.setText("");
        mobile_number_input.setText("");
        age_input.setText("");
        weight_input.setText("");
        sugar_input.setText("");
        blood_pressure_input.setText("");
        male_radio_btn.setSelected(true);
        date_input.setDate(getCurrentDate());
        pulse_input.setText("");
        
        bodyache_chk.setSelected(false);
        headache_chk.setSelected(false);
        cold_and_flue_chk.setSelected(false);
        cough_chk.setSelected(false);
        vomiting_chk.setSelected(false);
        weakness_chk.setSelected(false);
        runny_nose_chk.setSelected(false);
        diarrhea_chk.setSelected(false);
        runny_nose_chk.setSelected(false);
        fever_chk.setSelected(false);
        
        other_symptoms_input.setText("");
         status_label.setText("");
           
    }
    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        // TODO add your handling code here:\
        
        String name = name_input.getText();
        String mobile = mobile_number_input.getText();
        String age = age_input.getText();
        String weight = weight_input.getText();
        String sugar = sugar_input.getText();
        String bp = blood_pressure_input.getText();
        Date date =date_input.getDate();
        String pulse = pulse_input.getText();
        
        String gender ="Male";
        if(female_radio_btn.isSelected()){
            gender = "Female";
        }
        
        System.out.println("Name :" + name);
        System.out.println("Mobile :" + mobile);
        System.out.println("Age :" + age);
        System.out.println("Weight :" + weight);
        System.out.println("Suagar :" + sugar);
        System.out.println("Date :" + date.toString());
        System.out.println("Gender :" + gender);
        System.out.println("Bp :" + bp);
//        
        PatientDetails patient_details = new PatientDetails();
        patient_details.setName(name);
        patient_details.setMobileNo(mobile);
        patient_details.setAge(Integer.parseInt(age));
        patient_details.setWeight(Integer.parseInt(weight));
        patient_details.setSugar(sugar);
        patient_details.setPulse(pulse);
        patient_details.setGender(gender);
        patient_details.setDate(date);
        patient_details.setBloodPressure(bp);
        patient_details.setSymptoms(new String(getAllSymptoms()));
       // System.out.println(patient_details.getDate());
        
        Database patient_table = Database.getInstance();
        patient_table.insertRecord(patient_details);
        status_label.setText("Patient Details Saved Successfully.!!");
        setDetailsOnPrecriptionPage(patient_details);
     
        
 //JOptionPane.showMessageDialog( Patient , "Patient Details Saved Successfully.");
        
        
//        Object[] options = {"Next", "Cancle"};
//        
//        int msg =  JOptionPane.showOptionDialog(container,"Patient Details Saved Successfully. Click next for Prescription","Status",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options,options[1]);
//        
//        
//        if(msg == JOptionPane.OK_OPTION)
//        {
//           //System.out.println("OK");
//          
//           redirectOnPrecriptionPage();
//        }
//        else if(msg==JOptionPane.CANCEL_OPTION)
//        {
//           System.out.println("Cancle");
//        }
        
        
               
    }//GEN-LAST:event_save_btnActionPerformed

    private void dashboard_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard_iconMouseClicked
        Dashboard.remove(newDashboardPanel);
        newDashboardPanel =new NewDashboardPanel(); 
        Dashboard.add( newDashboardPanel, BorderLayout.CENTER); //to refresh while running system    
        
        card = (CardLayout)main_panel.getLayout();
        card.show(main_panel, "dashboard");
        dashboard_label.setForeground(Color.CYAN);
         
        patient_label.setForeground(Color.white);
        prescription_label.setForeground(Color.white);
        reports_label.setForeground(Color.white);      
    }//GEN-LAST:event_dashboard_iconMouseClicked

    private void patient_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patient_iconMouseClicked
    
        resetPatientInfoForm();
        card = (CardLayout)main_panel.getLayout();
        card.show(main_panel, "patient");
         
        dashboard_label.setForeground(Color.white);
        patient_label.setForeground(Color.CYAN);
        prescription_label.setForeground(Color.white);
        reports_label.setForeground(Color.white);
        
    }//GEN-LAST:event_patient_iconMouseClicked

    private void prescription_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prescription_iconMouseClicked
         card = (CardLayout)main_panel.getLayout();
         card.show(main_panel, "prescription");
        
         dashboard_label.setForeground(Color.white);
        patient_label.setForeground(Color.white);
        prescription_label.setForeground(Color.cyan);
        reports_label.setForeground(Color.white);
        
    }//GEN-LAST:event_prescription_iconMouseClicked

    private void reports_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reports_iconMouseClicked
         card = (CardLayout)main_panel.getLayout();
         card.show(main_panel, "reports");
         
         dashboard_label.setForeground(Color.white);
          patient_label.setForeground(Color.white);
          prescription_label.setForeground(Color.white);
          reports_label.setForeground(Color.cyan);
    }//GEN-LAST:event_reports_iconMouseClicked

    private void save_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_btnMouseEntered
        // TODO add your handling code here:
        save_btn.setBorder(new LineBorder(Color.BLACK,2,true));
    }//GEN-LAST:event_save_btnMouseEntered

    private void save_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_btnMouseExited
         save_btn.setBorder(DEFAULT_BTN_BORDER);
    }//GEN-LAST:event_save_btnMouseExited

    private void next_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next_btnMouseEntered
       next_btn.setBorder(HOVER_BTN_BORDER);
    }//GEN-LAST:event_next_btnMouseEntered

    private void next_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next_btnMouseExited
        next_btn.setBorder(DEFAULT_BTN_BORDER);
    }//GEN-LAST:event_next_btnMouseExited

    private void name_inputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_inputMouseEntered
       name_input.setBorder(HOVER_BORDER);
    }//GEN-LAST:event_name_inputMouseEntered

    private void name_inputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_inputMouseExited
        name_input.setBorder(INPUT_BORDER);
    }//GEN-LAST:event_name_inputMouseExited

    private void age_inputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_age_inputMouseEntered
        age_input.setBorder(HOVER_BORDER);
    }//GEN-LAST:event_age_inputMouseEntered

    private void age_inputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_age_inputMouseExited
        age_input.setBorder(INPUT_BORDER);
    }//GEN-LAST:event_age_inputMouseExited

    private void weight_inputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weight_inputMouseEntered
         weight_input.setBorder(HOVER_BORDER);
    }//GEN-LAST:event_weight_inputMouseEntered

    private void weight_inputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weight_inputMouseExited
        weight_input.setBorder(INPUT_BORDER);
    }//GEN-LAST:event_weight_inputMouseExited

    private void pulse_inputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pulse_inputMouseEntered
       pulse_input.setBorder(HOVER_BORDER);
    }//GEN-LAST:event_pulse_inputMouseEntered

    private void pulse_inputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pulse_inputMouseExited
      pulse_input.setBorder(INPUT_BORDER);
    }//GEN-LAST:event_pulse_inputMouseExited

    private void mobile_number_inputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobile_number_inputMouseEntered
         mobile_number_input.setBorder(HOVER_BORDER);
    }//GEN-LAST:event_mobile_number_inputMouseEntered

    private void mobile_number_inputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobile_number_inputMouseExited
        mobile_number_input.setBorder(INPUT_BORDER);
    }//GEN-LAST:event_mobile_number_inputMouseExited

    private void sugar_inputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sugar_inputMouseEntered
       sugar_input.setBorder(HOVER_BORDER);
    }//GEN-LAST:event_sugar_inputMouseEntered

    private void sugar_inputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sugar_inputMouseExited
       sugar_input.setBorder(INPUT_BORDER);
    }//GEN-LAST:event_sugar_inputMouseExited

    private void other_symptoms_inputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_other_symptoms_inputMouseEntered
        // other_symptoms_input.setBorder(HOVER_BORDER);
    }//GEN-LAST:event_other_symptoms_inputMouseEntered

    private void other_symptoms_inputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_other_symptoms_inputMouseExited
       // other_symptoms_input.setBorder(INPUT_BORDER);
    }//GEN-LAST:event_other_symptoms_inputMouseExited

    private void blood_pressure_inputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blood_pressure_inputMouseEntered
       blood_pressure_input.setBorder(HOVER_BORDER);
    }//GEN-LAST:event_blood_pressure_inputMouseEntered

    private void blood_pressure_inputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blood_pressure_inputMouseExited
        blood_pressure_input.setBorder(INPUT_BORDER);
    }//GEN-LAST:event_blood_pressure_inputMouseExited

  
    private void setDetailsOnPrecriptionPage(PatientDetails patientDetails)
    {   
        // patient_name.setText(patientDetails.getName());
        
    }
    private void next_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_btnActionPerformed
     
        card = (CardLayout)main_panel.getLayout();
         card.show(main_panel, "prescription");
        // redirectOnPrecriptionPage();
        
         dashboard_label.setForeground(Color.white);
        patient_label.setForeground(Color.white);
        prescription_label.setForeground(Color.cyan);
        reports_label.setForeground(Color.white);
        
        resetPatientInfoForm();

    }//GEN-LAST:event_next_btnActionPerformed

    private void medicine_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicine_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicine_inputActionPerformed

    private void next_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_next_btn1ActionPerformed

    private void next_btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next_btn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_next_btn1MouseExited

    private void next_btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next_btn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_next_btn1MouseEntered

    private void prescription_save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescription_save_btnActionPerformed

        int total_row = tableModel.getRowCount();
        for(int i=0;i<total_row;i++)
        {
          BandType bt = (BandType  )tableModel.getValueAt(i, 0);
          System.out.println(bt.medicine_name);
          System.out.println(bt.morning_status);
          System.out.println(bt.afternoon_status);
          System.out.println(bt.evening_status);
          System.out.println(bt.before);
          System.out.println(bt.after);
          System.out.println(bt.tab);
    }//GEN-LAST:event_prescription_save_btnActionPerformed
    }
    private void name_input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_input1ActionPerformed
        // TODO add your handling code here:
        System.out.println(" ");
    }//GEN-LAST:event_name_input1ActionPerformed

    private void name_input1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_input1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_name_input1MouseExited

    private void name_input1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_input1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_name_input1MouseEntered

    private void mobile_number_input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_number_input1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobile_number_input1ActionPerformed

    private void mobile_number_input1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobile_number_input1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_mobile_number_input1MouseExited

    private void mobile_number_input1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobile_number_input1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_mobile_number_input1MouseEntered

    private void add_medicine_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_medicine_btnActionPerformed
      
        String medicine_name = medicine_list.getSelectedValue();
       // medicine_input.setText(medicine_name);
     JPanel doses =   new JPanel();
     doses.add(new JLabel("hello"));
     
     Object[] r ={new BandType(medicine_name,  true,false,true,true,true,4,0)};
      tableModel.addRow(r);
      
      
       medicine_row++;

    }//GEN-LAST:event_add_medicine_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel Patient;
    private javax.swing.JPanel Prescription;
    private javax.swing.JPanel Reports;
    private javax.swing.JButton add_medicine_btn;
    private javax.swing.JTextField age_input;
    private javax.swing.JTextField blood_pressure_input;
    private javax.swing.JCheckBox bodyache_chk;
    private javax.swing.JCheckBox cold_and_flue_chk;
    private javax.swing.JCheckBox cough_chk;
    private javax.swing.JPanel dashboard_icon;
    private javax.swing.JLabel dashboard_label;
    private com.toedter.calendar.JDateChooser date_input;
    private com.toedter.calendar.JDateChooser date_input1;
    private javax.swing.JCheckBox diarrhea_chk;
    private javax.swing.JPanel doctor_icon_panel;
    private javax.swing.JRadioButton female_radio_btn;
    private javax.swing.JCheckBox fever_chk;
    private javax.swing.JPanel footer;
    private javax.swing.ButtonGroup gender_radio_group;
    private javax.swing.JCheckBox headache_chk;
    private javax.swing.JLabel heade_label;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel main_panel;
    private javax.swing.JRadioButton male_radio_btn;
    private javax.swing.JTextField medicine_input;
    private javax.swing.JList<String> medicine_list;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JTextField mobile_number_input;
    private javax.swing.JTextField mobile_number_input1;
    private javax.swing.JTextField name_input;
    private javax.swing.JTextField name_input1;
    private javax.swing.JLabel name_label10;
    private javax.swing.JLabel name_label11;
    private javax.swing.JLabel name_label12;
    private javax.swing.JLabel name_label13;
    private javax.swing.JLabel name_label14;
    private javax.swing.JLabel name_label15;
    private javax.swing.JLabel name_label16;
    private javax.swing.JLabel name_label17;
    private javax.swing.JLabel name_label23;
    private javax.swing.JLabel name_label7;
    private javax.swing.JLabel name_label8;
    private javax.swing.JLabel name_label9;
    private javax.swing.JButton next_btn;
    private javax.swing.JButton next_btn1;
    private javax.swing.JTextArea other_symptoms_input;
    private javax.swing.JPanel patient_form_panel;
    private javax.swing.JPanel patient_form_panel1;
    private javax.swing.JPanel patient_icon;
    private javax.swing.JLabel patient_label;
    private javax.swing.JPanel patient_panel_head;
    private javax.swing.JLabel patient_panel_header_title;
    private javax.swing.JLabel patient_panel_header_title1;
    private javax.swing.JPanel prescription_form;
    private javax.swing.JPanel prescription_form_panel;
    private javax.swing.JPanel prescription_icon;
    private javax.swing.JLabel prescription_label;
    private javax.swing.JPanel prescription_panel_head1;
    private javax.swing.JButton prescription_save_btn;
    private javax.swing.JTextField pulse_input;
    private javax.swing.JPanel reports_icon;
    private javax.swing.JLabel reports_label;
    private javax.swing.JCheckBox runny_nose_chk;
    private javax.swing.JButton save_btn;
    private javax.swing.JPanel selected_medicine_panel;
    private javax.swing.JLabel status_label;
    private javax.swing.JLabel status_label1;
    private javax.swing.JTextField sugar_input;
    private javax.swing.JCheckBox vomiting_chk;
    private javax.swing.JCheckBox weakness_chk;
    private javax.swing.JTextField weight_input;
    // End of variables declaration//GEN-END:variables
}
