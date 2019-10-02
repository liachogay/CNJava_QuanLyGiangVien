/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlgv;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author ASUS
 */
public class GiangVien extends javax.swing.JFrame {
    public final static GiangVien Instance=new GiangVien();
    /**
     * Creates new form GiangVien
     */
    public GiangVien() {
        initComponents();
        _InitColumNameJTableGV();
    }
    
    @SuppressWarnings("unchecked")
    private void _InitColumNameJTableGV(){
        Vector RowData = new Vector();
        jTableGV.setModel(new DefaultTableModel(RowData,GetColumNameJTableGB()));
    }
    
    @SuppressWarnings("unchecked")
    private Vector GetColumNameJTableGB(){
        
        Vector ColumnName = new Vector();
        ColumnName.add(("Ten"));
        ColumnName.add(("Gioi tinh"));
        ColumnName.add(("Hoc vi"));
        ColumnName.add(("Que quan"));
        ColumnName.add(("Dia chi"));
        ColumnName.add(("Luong"));
        ColumnName.add(("MaGV"));
        return ColumnName;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        GV = new javax.swing.JPanel();
        jPanelGVUp = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        Sex = new javax.swing.JLabel();
        Degree = new javax.swing.JLabel();
        Country = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        Salary = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSex = new javax.swing.JTextField();
        txtDegree = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        MaGV = new javax.swing.JLabel();
        txtMaGV = new javax.swing.JTextField();
        jPanelGVDown = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGV = new javax.swing.JTable();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Khoa = new javax.swing.JPanel();
        jPanelKhoaUp = new javax.swing.JPanel();
        TenKhoa = new javax.swing.JLabel();
        MaKhoa = new javax.swing.JLabel();
        Ngaythanhlap = new javax.swing.JLabel();
        txtTenKhoa = new javax.swing.JTextField();
        txtMaKhoa = new javax.swing.JTextField();
        txtNgayThanhLap = new javax.swing.JTextField();
        jPanelKhoaDown = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableKhoa = new javax.swing.JTable();
        Add1 = new javax.swing.JButton();
        Delete1 = new javax.swing.JButton();
        Edit1 = new javax.swing.JButton();
        Lop = new javax.swing.JPanel();
        jPanelLopDown = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableLop = new javax.swing.JTable();
        Add2 = new javax.swing.JButton();
        Delete2 = new javax.swing.JButton();
        Edit2 = new javax.swing.JButton();
        jPanelLopUp = new javax.swing.JPanel();
        TenLop = new javax.swing.JLabel();
        MaLop = new javax.swing.JLabel();
        LopKhoa = new javax.swing.JLabel();
        txtTenLop = new javax.swing.JTextField();
        txtMaLop = new javax.swing.JTextField();
        txtLopKhoa = new javax.swing.JTextField();
        Lich = new javax.swing.JPanel();
        jPanelLichUp = new javax.swing.JPanel();
        TenGV = new javax.swing.JLabel();
        LichKhoa = new javax.swing.JLabel();
        txttenGV = new javax.swing.JTextField();
        txtLichKhoa = new javax.swing.JTextField();
        jPanel8LichDown = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableLich = new javax.swing.JTable();
        Add3 = new javax.swing.JButton();
        Delete3 = new javax.swing.JButton();
        Edit3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quan ly giang vien");

        Name.setText("Ho ten");

        Sex.setText("Gioi tinh");

        Degree.setText("Hoc vi");

        Country.setText("Que quan");

        Address.setText("Dia chi");

        Salary.setText("Luong");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexActionPerformed(evt);
            }
        });

        MaGV.setText("MaGV");

        javax.swing.GroupLayout jPanelGVUpLayout = new javax.swing.GroupLayout(jPanelGVUp);
        jPanelGVUp.setLayout(jPanelGVUpLayout);
        jPanelGVUpLayout.setHorizontalGroup(
            jPanelGVUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGVUpLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelGVUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGVUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelGVUpLayout.createSequentialGroup()
                            .addGroup(jPanelGVUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Name)
                                .addComponent(Degree))
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGVUpLayout.createSequentialGroup()
                            .addComponent(Address)
                            .addGap(19, 19, 19)))
                    .addGroup(jPanelGVUpLayout.createSequentialGroup()
                        .addComponent(Salary)
                        .addGap(21, 21, 21)))
                .addGroup(jPanelGVUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGVUpLayout.createSequentialGroup()
                        .addGroup(jPanelGVUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelGVUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Country)
                            .addComponent(Sex))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelGVUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102))
                    .addGroup(jPanelGVUpLayout.createSequentialGroup()
                        .addGroup(jPanelGVUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelGVUpLayout.createSequentialGroup()
                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(204, 204, 204)
                                .addComponent(MaGV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelGVUpLayout.setVerticalGroup(
            jPanelGVUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGVUpLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelGVUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(Sex)
                    .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelGVUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Degree)
                    .addComponent(Country)
                    .addComponent(txtDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanelGVUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelGVUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salary)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaGV)
                    .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTableGV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableGV);

        Add.setText("Them");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Delete.setText("Xoa");

        Edit.setText("Sua");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGVDownLayout = new javax.swing.GroupLayout(jPanelGVDown);
        jPanelGVDown.setLayout(jPanelGVDownLayout);
        jPanelGVDownLayout.setHorizontalGroup(
            jPanelGVDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanelGVDownLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Add)
                .addGap(41, 41, 41)
                .addComponent(Delete)
                .addGap(49, 49, 49)
                .addComponent(Edit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelGVDownLayout.setVerticalGroup(
            jPanelGVDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGVDownLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelGVDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Delete)
                    .addComponent(Edit))
                .addGap(0, 177, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout GVLayout = new javax.swing.GroupLayout(GV);
        GV.setLayout(GVLayout);
        GVLayout.setHorizontalGroup(
            GVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGVUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelGVDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GVLayout.setVerticalGroup(
            GVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GVLayout.createSequentialGroup()
                .addComponent(jPanelGVUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelGVDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Giang Vien", GV);

        TenKhoa.setText("Ten khoa");

        MaKhoa.setText("Ma khoa");

        Ngaythanhlap.setText("Ngay thanh lap");

        txtTenKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelKhoaUpLayout = new javax.swing.GroupLayout(jPanelKhoaUp);
        jPanelKhoaUp.setLayout(jPanelKhoaUpLayout);
        jPanelKhoaUpLayout.setHorizontalGroup(
            jPanelKhoaUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKhoaUpLayout.createSequentialGroup()
                .addGroup(jPanelKhoaUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelKhoaUpLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelKhoaUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TenKhoa)
                            .addComponent(MaKhoa))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKhoaUpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Ngaythanhlap)
                        .addGap(18, 18, 18)))
                .addGroup(jPanelKhoaUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(txtMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayThanhLap))
                .addGap(285, 313, Short.MAX_VALUE))
        );
        jPanelKhoaUpLayout.setVerticalGroup(
            jPanelKhoaUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKhoaUpLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelKhoaUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TenKhoa)
                    .addComponent(txtTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanelKhoaUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaKhoa)
                    .addComponent(txtMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelKhoaUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ngaythanhlap)
                    .addComponent(txtNgayThanhLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jTableKhoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableKhoa);

        Add1.setText("Them");
        Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add1ActionPerformed(evt);
            }
        });

        Delete1.setText("Xoa");

        Edit1.setText("Sua");
        Edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelKhoaDownLayout = new javax.swing.GroupLayout(jPanelKhoaDown);
        jPanelKhoaDown.setLayout(jPanelKhoaDownLayout);
        jPanelKhoaDownLayout.setHorizontalGroup(
            jPanelKhoaDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanelKhoaDownLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Add1)
                .addGap(41, 41, 41)
                .addComponent(Delete1)
                .addGap(49, 49, 49)
                .addComponent(Edit1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelKhoaDownLayout.setVerticalGroup(
            jPanelKhoaDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKhoaDownLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelKhoaDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add1)
                    .addComponent(Delete1)
                    .addComponent(Edit1))
                .addGap(0, 177, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout KhoaLayout = new javax.swing.GroupLayout(Khoa);
        Khoa.setLayout(KhoaLayout);
        KhoaLayout.setHorizontalGroup(
            KhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelKhoaUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelKhoaDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        KhoaLayout.setVerticalGroup(
            KhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhoaLayout.createSequentialGroup()
                .addComponent(jPanelKhoaUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelKhoaDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Khoa", Khoa);

        jTableLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTableLop);

        Add2.setText("Them");
        Add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add2ActionPerformed(evt);
            }
        });

        Delete2.setText("Xoa");

        Edit2.setText("Sua");
        Edit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLopDownLayout = new javax.swing.GroupLayout(jPanelLopDown);
        jPanelLopDown.setLayout(jPanelLopDownLayout);
        jPanelLopDownLayout.setHorizontalGroup(
            jPanelLopDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanelLopDownLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Add2)
                .addGap(41, 41, 41)
                .addComponent(Delete2)
                .addGap(49, 49, 49)
                .addComponent(Edit2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLopDownLayout.setVerticalGroup(
            jPanelLopDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLopDownLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLopDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add2)
                    .addComponent(Delete2)
                    .addComponent(Edit2))
                .addGap(0, 177, Short.MAX_VALUE))
        );

        TenLop.setText("Ten lop");

        MaLop.setText("Ma lop");

        LopKhoa.setText("Khoa");

        txtTenLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenLopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLopUpLayout = new javax.swing.GroupLayout(jPanelLopUp);
        jPanelLopUp.setLayout(jPanelLopUpLayout);
        jPanelLopUpLayout.setHorizontalGroup(
            jPanelLopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLopUpLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelLopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TenLop)
                    .addComponent(MaLop)
                    .addComponent(LopKhoa))
                .addGap(18, 18, 18)
                .addGroup(jPanelLopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenLop, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLopKhoa))
                .addGap(285, 352, Short.MAX_VALUE))
        );
        jPanelLopUpLayout.setVerticalGroup(
            jPanelLopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLopUpLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelLopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TenLop)
                    .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanelLopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaLop)
                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelLopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LopKhoa)
                    .addComponent(txtLopKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LopLayout = new javax.swing.GroupLayout(Lop);
        Lop.setLayout(LopLayout);
        LopLayout.setHorizontalGroup(
            LopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLopUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelLopDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LopLayout.setVerticalGroup(
            LopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LopLayout.createSequentialGroup()
                .addComponent(jPanelLopUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLopDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Lop", Lop);

        TenGV.setText("Ten giang vien");

        LichKhoa.setText("Khoa");

        txttenGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttenGVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLichUpLayout = new javax.swing.GroupLayout(jPanelLichUp);
        jPanelLichUp.setLayout(jPanelLichUpLayout);
        jPanelLichUpLayout.setHorizontalGroup(
            jPanelLichUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLichUpLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelLichUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TenGV)
                    .addComponent(LichKhoa))
                .addGap(18, 18, 18)
                .addGroup(jPanelLichUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttenGV, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(txtLichKhoa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLichUpLayout.setVerticalGroup(
            jPanelLichUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLichUpLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelLichUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TenGV)
                    .addComponent(txttenGV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelLichUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LichKhoa)
                    .addComponent(txtLichKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jTableLich.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTableLich);

        Add3.setText("Them");

        Delete3.setText("Xoa");

        Edit3.setText("Sua");

        javax.swing.GroupLayout jPanel8LichDownLayout = new javax.swing.GroupLayout(jPanel8LichDown);
        jPanel8LichDown.setLayout(jPanel8LichDownLayout);
        jPanel8LichDownLayout.setHorizontalGroup(
            jPanel8LichDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
            .addGroup(jPanel8LichDownLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Add3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Edit3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8LichDownLayout.setVerticalGroup(
            jPanel8LichDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8LichDownLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8LichDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit3)
                    .addComponent(Delete3)
                    .addComponent(Add3))
                .addGap(0, 41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LichLayout = new javax.swing.GroupLayout(Lich);
        Lich.setLayout(LichLayout);
        LichLayout.setHorizontalGroup(
            LichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLichUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8LichDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LichLayout.setVerticalGroup(
            LichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LichLayout.createSequentialGroup()
                .addComponent(jPanelLichUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8LichDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lich", Lich);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexActionPerformed

    private void txtTenKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhoaActionPerformed

    private void Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Add1ActionPerformed

    private void Edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Edit1ActionPerformed

    private void Add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Add2ActionPerformed

    private void Edit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Edit2ActionPerformed

    private void txtTenLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenLopActionPerformed

    private void txttenGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttenGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttenGVActionPerformed

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
            java.util.logging.Logger.getLogger(GiangVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiangVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiangVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiangVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiangVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Add1;
    private javax.swing.JButton Add2;
    private javax.swing.JButton Add3;
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Country;
    private javax.swing.JLabel Degree;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Delete1;
    private javax.swing.JButton Delete2;
    private javax.swing.JButton Delete3;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Edit1;
    private javax.swing.JButton Edit2;
    private javax.swing.JButton Edit3;
    private javax.swing.JPanel GV;
    private javax.swing.JPanel Khoa;
    private javax.swing.JPanel Lich;
    private javax.swing.JLabel LichKhoa;
    private javax.swing.JPanel Lop;
    private javax.swing.JLabel LopKhoa;
    private javax.swing.JLabel MaGV;
    private javax.swing.JLabel MaKhoa;
    private javax.swing.JLabel MaLop;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Ngaythanhlap;
    private javax.swing.JLabel Salary;
    private javax.swing.JLabel Sex;
    private javax.swing.JLabel TenGV;
    private javax.swing.JLabel TenKhoa;
    private javax.swing.JLabel TenLop;
    private javax.swing.JPanel jPanel8LichDown;
    private javax.swing.JPanel jPanelGVDown;
    private javax.swing.JPanel jPanelGVUp;
    private javax.swing.JPanel jPanelKhoaDown;
    private javax.swing.JPanel jPanelKhoaUp;
    private javax.swing.JPanel jPanelLichUp;
    private javax.swing.JPanel jPanelLopDown;
    private javax.swing.JPanel jPanelLopUp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableGV;
    private javax.swing.JTable jTableKhoa;
    private javax.swing.JTable jTableLich;
    private javax.swing.JTable jTableLop;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtDegree;
    private javax.swing.JTextField txtLichKhoa;
    private javax.swing.JTextField txtLopKhoa;
    private javax.swing.JTextField txtMaGV;
    private javax.swing.JTextField txtMaKhoa;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNgayThanhLap;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSex;
    private javax.swing.JTextField txtTenKhoa;
    private javax.swing.JTextField txtTenLop;
    private javax.swing.JTextField txttenGV;
    // End of variables declaration//GEN-END:variables
}