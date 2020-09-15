/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hải
 */
public class GUI_QLBS extends javax.swing.JFrame {
    Connection connection = null;
    Statement statement = null;
    ResultSet resultset = null;
    PreparedStatement preStatement;
    DefaultTableModel dtmSach;
    /**
     * Creates new form GUI_QLBS
     */
    public GUI_QLBS() {
        initComponents();
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("QUẢN LÝ BÁN SÁCH");
        this.setLocationRelativeTo(null);
        this.setSize(800, 600);
        
        dtmSach = (DefaultTableModel)this.tbSach.getModel();
        ketNoiCSDL();
        hienThiQLBS();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        lbMaSH = new javax.swing.JLabel();
        lbTenSH = new javax.swing.JLabel();
        lbSoLuong = new javax.swing.JLabel();
        lbTheLoai = new javax.swing.JLabel();
        lbTenTG = new javax.swing.JLabel();
        lbGiaBan = new javax.swing.JLabel();
        txtMaSH = new javax.swing.JTextField();
        txtTenSH = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtTheLoai = new javax.swing.JTextField();
        txtTenTG = new javax.swing.JTextField();
        txtGiaBan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSach = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLichSuBan = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnBan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(204, 0, 0));
        lbTitle.setText("QUẢN LÝ BÁN SÁCH");

        lbMaSH.setText("Mã Sách");

        lbTenSH.setText("Tên Sách");

        lbSoLuong.setText("Số Lượng");

        lbTheLoai.setText("Thể Loại");

        lbTenTG.setText("Tên Tác giả");

        lbGiaBan.setText("Giá Bán");

        tbSach.setBackground(new java.awt.Color(51, 102, 255));
        tbSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sách", "Tên Sách", "Số Lượng", "Thể Loại", "Tên Tác giả", "Giá Bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSach);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLichSuBan.setText("Lịch sử bán");
        btnLichSuBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichSuBanActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 51, 51));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnBan.setBackground(new java.awt.Color(51, 153, 255));
        btnBan.setText("Bán");
        btnBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMaSH)
                                    .addComponent(lbTenSH))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTenSH, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(txtMaSH)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbSoLuong)
                                .addGap(18, 18, 18)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbGiaBan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbTenTG)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbTheLoai)
                                        .addGap(19, 19, 19)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTheLoai, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txtTenTG)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnLichSuBan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(btnBan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaSH)
                    .addComponent(lbTheLoai)
                    .addComponent(txtMaSH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenSH)
                    .addComponent(txtTenSH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenTG)
                    .addComponent(txtTenTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGiaBan)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSoLuong))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa)
                    .addComponent(btnLichSuBan)
                    .addComponent(btnThoat)
                    .addComponent(btnTimKiem))
                .addGap(18, 18, 18)
                .addComponent(btnBan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSachMouseClicked
        // TODO add your handling code here:
        int row = this.tbSach.getSelectedRow();
        this.txtMaSH.setText((String)tbSach.getValueAt(row, 0));
        this.txtTenSH.setText((String)tbSach.getValueAt(row, 1));
        this.txtSoLuong.setText(tbSach.getValueAt(row, 2) + "");
        this.txtTheLoai.setText((String)tbSach.getValueAt(row, 3));
        this.txtTenTG.setText((String)tbSach.getValueAt(row, 4));
        this.txtGiaBan.setText(tbSach.getValueAt(row, 5) + "");
    }//GEN-LAST:event_tbSachMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        txtMaSH.setText("");
        txtTenSH.setText("");
        txtSoLuong.setText("");
        txtTheLoai.setText("");
        txtTenTG.setText("");
        txtGiaBan.setText("");
        txtMaSH.requestFocus();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        GUI_TimKiem tk = new GUI_TimKiem();
        tk.setVisible(true);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        if(txtMaSH.getText().equalsIgnoreCase("")|| 
                txtTenSH.getText().equalsIgnoreCase("")|| 
                txtSoLuong.getText().equalsIgnoreCase("")||
                txtTheLoai.getText().equalsIgnoreCase("")||
                txtTenTG.getText().equalsIgnoreCase("")||
                txtGiaBan.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập đủ các thông tin", ">.<", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(kiemTraMaTonTai(txtMaSH.getText())){
            int n = JOptionPane.showConfirmDialog(null, 
                    "Mã ["+txtMaSH.getText()+"] đã tồn tại, bạn có muốn cập nhật không", 
                    "Trùng mã", JOptionPane.YES_NO_CANCEL_OPTION);
            if(n == JOptionPane.NO_OPTION)
                return;
            try{
                String sqlUpdate = "UPDATE tblSach SET MaSH = ?, TenSH = ?, SoLuong = ?, TheLoai = ?, TenTG = ?, GiaBan = ? WHERE MaSH = ?";
                    preStatement= connection.prepareStatement(sqlUpdate);
                    preStatement.setString(1, txtMaSH.getText());
                    preStatement.setString(2, txtTenSH.getText());
                    preStatement.setInt(3, Integer.parseInt(txtSoLuong.getText()));
                    preStatement.setString(4, txtTheLoai.getText());
                    preStatement.setString(5, txtTenTG.getText());
                    preStatement.setInt(6, Integer.parseInt(txtGiaBan.getText())); 
                    preStatement.setString(7, txtMaSH.getText());
                int x = preStatement.executeUpdate();
                if(x > 0){
                    hienThiQLBS();
                    JOptionPane.showMessageDialog(null, "Đã cập nhật", "Thông báo", JOptionPane.DEFAULT_OPTION);
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        else
            try{
                String sqlInsert = "INSERT INTO tblSach VALUES(?,?,?,?,?,?)";
                    preStatement= connection.prepareStatement(sqlInsert);
                    preStatement.setString(1, txtMaSH.getText());
                    preStatement.setString(2, txtTenSH.getText());
                    preStatement.setInt(3, Integer.parseInt(txtSoLuong.getText()));
                    preStatement.setString(4, txtTheLoai.getText());
                    preStatement.setString(5, txtTenTG.getText());
                    preStatement.setInt(6, Integer.parseInt(txtGiaBan.getText()));
                int x = preStatement.executeUpdate();
                if(x > 0){
                    hienThiQLBS();
                    JOptionPane.showMessageDialog(null, "Lưu thành công", "Thông báo", JOptionPane.DEFAULT_OPTION);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null, "Bạn muốn thoát chứ?", "Thoát?", JOptionPane.YES_NO_OPTION);
        if(n == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if(txtMaSH.getText().equalsIgnoreCase("")|| 
                txtTenSH.getText().equalsIgnoreCase("")|| 
                txtSoLuong.getText().equalsIgnoreCase("")||
                txtTheLoai.getText().equalsIgnoreCase("")||
                txtTenTG.getText().equalsIgnoreCase("")||
                txtGiaBan.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Hãy chọn sách cần xóa", ">.<", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int n = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa không", "Xóa?", JOptionPane.YES_NO_OPTION);
        if(n == JOptionPane.NO_OPTION)
            return;
        if(n == JOptionPane.YES_OPTION)
            try{
                String sqlDelete = "DELETE FROM tblSach WHERE MaSH = '"+txtMaSH.getText()+"'";
                int x = statement.executeUpdate(sqlDelete);
                if(x > 0)
                {
                    hienThiQLBS();
                    JOptionPane.showMessageDialog(null, "Mã sách "+txtMaSH.getText()+" đã xóa thành công", "Thông báo", JOptionPane.DEFAULT_OPTION);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanActionPerformed
        // TODO add your handling code here:
        if(txtMaSH.getText().equalsIgnoreCase("")|| 
                txtTenSH.getText().equalsIgnoreCase("")|| 
                txtSoLuong.getText().equalsIgnoreCase("")||
                txtTheLoai.getText().equalsIgnoreCase("")||
                txtTenTG.getText().equalsIgnoreCase("")||
                txtGiaBan.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Hãy chọn sách cần bán", ">.<", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            int n = JOptionPane.showConfirmDialog(null, "Xác nhận bán sách" + "\n"+txtTenSH.getText()+"" + "\nSố lượng " +txtSoLuong.getText()+ "", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if(n == JOptionPane.NO_OPTION)
                return;
            if(n == JOptionPane.YES_OPTION){
                try{
                    String sqlUpdate = "UPDATE tblSach SET SoLuong = (SELECT SoLuong FROM tblSach WHERE MaSH = ?) - ? WHERE MaSH = ?";
                        preStatement= connection.prepareStatement(sqlUpdate);
                        preStatement.setString(1, txtMaSH.getText());
                        preStatement.setInt(2, Integer.parseInt(txtSoLuong.getText()));
                        preStatement.setString(3, txtMaSH.getText());
                    int x = preStatement.executeUpdate();
                    if(x > 0){
                        hienThiQLBS();
                        JOptionPane.showMessageDialog(null, "Đã bán", "Thông báo", JOptionPane.DEFAULT_OPTION);
                    }
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                try{
                String sqlInsert = "INSERT INTO tblLichSuBan VALUES(?,?,?,getdate())";
                    preStatement= connection.prepareStatement(sqlInsert);
                    preStatement.setString(1, txtMaSH.getText());
                    preStatement.setString(2, txtTenSH.getText());
                    preStatement.setInt(3, Integer.parseInt(txtSoLuong.getText()));
                    
                int x = preStatement.executeUpdate();
                if(x > 0){
                    hienThiQLBS();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            }
        }
    }//GEN-LAST:event_btnBanActionPerformed

    private void btnLichSuBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichSuBanActionPerformed
        // TODO add your handling code here:
        GUI_LichSuBan lsb = new GUI_LichSuBan();
        lsb.setVisible(true);
    }//GEN-LAST:event_btnLichSuBanActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_QLBS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_QLBS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_QLBS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_QLBS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_QLBS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBan;
    private javax.swing.JButton btnLichSuBan;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbGiaBan;
    private javax.swing.JLabel lbMaSH;
    private javax.swing.JLabel lbSoLuong;
    private javax.swing.JLabel lbTenSH;
    private javax.swing.JLabel lbTenTG;
    private javax.swing.JLabel lbTheLoai;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTable tbSach;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtMaSH;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSH;
    private javax.swing.JTextField txtTenTG;
    private javax.swing.JTextField txtTheLoai;
    // End of variables declaration//GEN-END:variables

    private void ketNoiCSDL() {
        String strServer = "DESKTOP-MHCMN5J\\SQLEXPRESS";
        String strDatabase = "dbQLBS";
        String strUser = "sa";
        String strPassword = "sa2012";
       
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://" + strServer
                                + ":1433;databaseName=" + strDatabase
                                //+ ";integratedSecurity = true";
                                +" ;user = " + strUser 
                                + "; password = " +  strPassword;
            connection = DriverManager.getConnection(connectionURL);
            statement = connection.createStatement(resultset.TYPE_SCROLL_INSENSITIVE,resultset.CONCUR_READ_ONLY);
        }
        catch(SQLException ex1) {
            System.out.println("SQL Exception: " + ex1.toString());
        }
        catch(ClassNotFoundException ex2) {
            System.out.println("Class Not Found Exception: " + ex2.toString());
        }
    }
    

    private void hienThiQLBS() {
        try{
            String sql = "SELECT * FROM tblSach";
            resultset = statement.executeQuery(sql);
            dtmSach.setRowCount(0);
            while(resultset.next()){
                String maSH = resultset.getString("MaSH");
                String tenSH = resultset.getString("TenSH");
                int soLuong = resultset.getInt("SoLuong");
                String theLoai = resultset.getString("TheLoai");
                String tenTG = resultset.getString("TenTG");
                int giaBan = resultset.getInt("GiaBan");
                
                Vector<Object> vec = new Vector<Object>();
                vec.add(maSH);
                vec.add(tenSH);
                vec.add(soLuong);
                vec.add(theLoai);
                vec.add(tenTG);
                vec.add(giaBan);
                dtmSach.addRow(vec);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private boolean kiemTraMaTonTai(String ma) {
        try{
            String sqlSelect = "SELECT * FROM tblSach WHERE MaSH = '"+ma+"'";
            ResultSet rs = statement.executeQuery(sqlSelect);
            if(rs.next())
                return true;
            else
                return false;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
}
