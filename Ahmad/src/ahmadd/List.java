package ahmadd;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.table.DefaultTableModel;
import com.sun.tools.javac.Main;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.DocumentType;
import org.w3c.dom.EntityReference;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.w3c.dom.UserDataHandler;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.border.AbstractBorder;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.DocumentType;
import org.w3c.dom.UserDataHandler;

public class List extends javax.swing.JFrame {

    
    private String ner0=null;
    private String aa=null;
    private String aluurcin=null;
    private String alurcin=null;
    private String qq=null;
    private String huis=null;
    private String path2=null;
    private int a_code;
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ahmad";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Tuugii0713";
    private ArrayList<String> registrationHistory;
    private DefaultListModel<String> historyListModel;
    
    
    public List() throws SQLException {
        
        initComponents();
        createAndShowChart();
        
        setIcon();
        activity = new JPanel();
        activity.setLayout(new BoxLayout(activity, BoxLayout.Y_AXIS));
        registrationHistory = new ArrayList<>();
      
        Connection con;
        Statement st;
        ResultSet rs;
        
        
        try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad", "root", "Tuugii0713");
    st = con.createStatement();
    rs = st.executeQuery("SELECT count(arvan_gurav) FROM sudalgaa where arvan_gurav='Тийм'");
    if (rs.next()) {
        arvan_gurav8.setText(rs.getString(1));
    }
} catch (ClassNotFoundException | SQLException ex) {
    ex.printStackTrace();
}
        try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad", "root", "Tuugii0713");
    st = con.createStatement();
    rs = st.executeQuery("SELECT count(odoo_ajillaj) FROM sudalgaa where odoo_ajillaj='Тийм'");
    if (rs.next()) {
        odoo_ajillaj8.setText(rs.getString(1));
    }
} catch (ClassNotFoundException | SQLException ex) {
    ex.printStackTrace();
}
        
          try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad", "root", "Tuugii0713");
    st = con.createStatement();
    rs = st.executeQuery("SELECT count(arvan_hoyr) FROM sudalgaa where arvan_hoyr='Тийм'");
    if (rs.next()) {
        arvan_hoyr8.setText(rs.getString(1));
    }
} catch (ClassNotFoundException | SQLException ex) {
    ex.printStackTrace();
}
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT COUNT(*) AS rowCount FROM sudalgaa;");
        if(rs.next()){
           jLabel32.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT company='Кашмер Холдинг',count(company='Кашмер Холдинг') FROM sudalgaa where company='Кашмер Холдинг';");
        if(rs.next()){
           ahmad1.setText(rs.getString(2));
        }
        }catch(ClassNotFoundException ex){
        }
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_hoyr) FROM sudalgaa where arvan_hoyr='Тийм' and company='Кашмер Холдинг';");
        if(rs.next()){
           arvan_hoyr1.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
        
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_gurav) FROM sudalgaa where arvan_gurav='Тийм' and company='Кашмер Холдинг';");
        if(rs.next()){
           arvan_gurav1.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
         
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery(" SELECT count(odoo_ajillaj) FROM sudalgaa where odoo_ajillaj='Тийм' and company='Кашмер Холдинг';");
        if(rs.next()){
           odoo_ajillaj1.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT company='МонМяндас',count(company='МонМяндас') FROM sudalgaa where company='МонМяндас';");
        if(rs.next()){
           ahmad2.setText(rs.getString(2));
        }
        }catch(ClassNotFoundException ex){
        }
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_hoyr) FROM sudalgaa where arvan_hoyr='Тийм' and company='МонМяндас';");
        if(rs.next()){
           arvan_hoyr2.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
        
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_gurav) FROM sudalgaa where arvan_gurav='Тийм' and company='МонМяндас';");
        if(rs.next()){
           arvan_gurav2.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
         
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery(" SELECT count(odoo_ajillaj) FROM sudalgaa where odoo_ajillaj='Тийм' and company='МонМяндас';");
        if(rs.next()){
           odoo_ajillaj2.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT company='Хавт Шонхор',count(company='Хавт Шонхор') FROM sudalgaa where company='Хавт Шонхор';");
        if(rs.next()){
           ahmad3.setText(rs.getString(2));
        }
        }catch(ClassNotFoundException ex){
        }
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_hoyr) FROM sudalgaa where arvan_hoyr='Тийм' and company='Хавт Шонхор';");
        if(rs.next()){
           arvan_hoyr3.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
        
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_gurav) FROM sudalgaa where arvan_gurav='Тийм' and company='Хавт Шонхор';");
        if(rs.next()){
           arvan_gurav3.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
         
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery(" SELECT count(odoo_ajillaj) FROM sudalgaa where odoo_ajillaj='Тийм' and company='Хавт Шонхор';");
        if(rs.next()){
           odoo_ajillaj3.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT company='Эвсэг Од-ХХК',count(company='Эвсэг Од-ХХК') FROM sudalgaa where company='Эвсэг Од-ХХК';");
        while(rs.next()){
           ahmad4.setText(rs.getString(2));
        }
        }catch(ClassNotFoundException ex){
        }
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_hoyr) FROM sudalgaa where arvan_hoyr='Тийм' and company='Эвсэг Од-ХХК';");
        if(rs.next()){
           arvan_hoyr4.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_gurav) FROM sudalgaa where arvan_gurav='Тийм' and company='Эвсэг Од-ХХК';");
        if(rs.next()){
           arvan_gurav4.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery(" SELECT count(odoo_ajillaj) FROM sudalgaa where odoo_ajillaj='Тийм' and company='Эвсэг Од-ХХК';");
        if(rs.next()){
           odoo_ajillaj4.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
        
        
   
        
        
        
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT company='Говийн мяндас',count(company='Говийн мяндас') FROM sudalgaa where company='Говийн мяндас';");
        if(rs.next()){
           ahmad5.setText(rs.getString(2));
        }
        }catch(ClassNotFoundException ex){
        }
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_hoyr) FROM sudalgaa where arvan_hoyr='Тийм' and company='Говийн мяндас';");
        if(rs.next()){
           arvan_hoyr5.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_gurav) FROM sudalgaa where arvan_gurav='Тийм' and company='Говийн мяндас';");
        if(rs.next()){
           arvan_gurav5.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery(" SELECT count(odoo_ajillaj) FROM sudalgaa where odoo_ajillaj='Тийм' and company='Говийн мяндас';");
        if(rs.next()){
           odoo_ajillaj5.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        } 
        
        
        
 
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT company='Тансаг Ширээс ХХК',count(company='Тансаг Ширээс ХХК') FROM sudalgaa where company='Тансаг Ширээс ХХК';");
        if(rs.next()){
           ahmad6.setText(rs.getString(2));
        }
        }catch(ClassNotFoundException ex){
        }
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_hoyr) FROM sudalgaa where arvan_hoyr='Тийм' and company='Тансаг Ширээс ХХК';");
        if(rs.next()){
           arvan_hoyr6.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_gurav) FROM sudalgaa where arvan_gurav='Тийм' and company='Тансаг Ширээс ХХК';");
        if(rs.next()){
           arvan_gurav6.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery(" SELECT count(odoo_ajillaj) FROM sudalgaa where odoo_ajillaj='Тийм' and company='Тансаг Ширээс ХХК';");
        if(rs.next()){
           odoo_ajillaj6.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        } 
                
        
        
   
        
        
        
                try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT company='Эвсэг Од-ХХК',count(company='Эвсэг Од-ХХК') FROM sudalgaa where company='Эвсэг Од-ХХК';");
        if(rs.next()){
           ahmad7.setText(rs.getString(2));
        }
        }catch(ClassNotFoundException ex){
        }
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_hoyr) FROM sudalgaa where arvan_hoyr='Тийм' and company='Эвсэг Од-ХХК';");
        if(rs.next()){
           arvan_hoyr7.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_gurav) FROM sudalgaa where arvan_gurav='Тийм' and company='Эвсэг Од-ХХК';");
        if(rs.next()){
           arvan_gurav7.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery(" SELECT count(odoo_ajillaj) FROM sudalgaa where odoo_ajillaj='Тийм' and company='Эвсэг Од-ХХК';");
        if(rs.next()){
           odoo_ajillaj7.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
        
        
        
                      try{          
                          b.setVisible(true);
                                    String query=("SELECT * FROM ahmad.medeelel order by a_code desc limit 1;");
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
					st=con.createStatement();
                                        rs=st.executeQuery(query);
                                        while(rs.next()){
                                        name1.setText(rs.getString(3));
                                        a_code=rs.getInt(1);
                                        compa1.setText(rs.getString(4));
                                        }
                                        int a_code1=a_code-1;
                                        int a_code2=a_code1-1;
                                        int a_code3=a_code2-1;
                                        int a_code4=a_code3-1;
                                        int a_code5=a_code4-1;
                                        String query1=("SELECT * FROM ahmad.medeelel where a_code='"+a_code1+"' order by a_code desc limit 1 ;");
                                        rs=st.executeQuery(query1);
                                        while(rs.next()){
                                        name2.setText(rs.getString(3));
                                        compa2.setText(rs.getString(4));
                                        }
                                        
                                         String query2=("SELECT * FROM ahmad.medeelel where a_code='"+a_code2+"' order by a_code desc limit 1 ;");
                                        rs=st.executeQuery(query2);
                                        while(rs.next()){
                                        name3.setText(rs.getString(3));
                                        compa3.setText(rs.getString(4));
                                        }
                                        
                                        
                                         String query3=("SELECT * FROM ahmad.medeelel where a_code='"+a_code3+"' order by a_code desc limit 1 ;");
                                        rs=st.executeQuery(query3);
                                        while(rs.next()){
                                        name4.setText(rs.getString(3));
                                        compa4.setText(rs.getString(4));
                                        }
                                        
                                        
                                         String query4=("SELECT * FROM ahmad.medeelel where a_code='"+a_code4+"' order by a_code desc limit 1 ;");
                                        rs=st.executeQuery(query4);
                                        while(rs.next()){
                                        name5.setText(rs.getString(3));
                                        compa5.setText(rs.getString(4));
                                        }
                                        
                                        
                                         String query5=("SELECT * FROM ahmad.medeelel where a_code='"+a_code5+"' order by a_code desc limit 1 ;");
                                        rs=st.executeQuery(query5);
                                        while(rs.next()){
                                        name6.setText(rs.getString(3));
                                        compa6.setText(rs.getString(4));
                                        }
                                       
                                }catch(Exception e1){ 
                                e1.printStackTrace();
                                }

        
        addPlaceholderSty(qqww);
        addPlaceholderSty(qqww1);
                                
    }
    public void addPlaceholderSty(JTextField qqww){
        java.awt.Font font =qqww.getFont();
    font= font.deriveFont(Font.ITALIC);
    qqww.setFont(font);
    qqww.setForeground(Color.gray);
    }
    public void remove(JTextField qqww){
        java.awt.Font font =qqww.getFont();
    font= font.deriveFont(Font.ITALIC|Font.BOLD);
    qqww.setFont(font);
    qqww.setForeground(Color.black);
    }
    @SuppressWarnings("unchecked")
   
    private String cc=null;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        Container = new javax.swing.JPanel();
        archive1 = new javax.swing.JPanel();
        qqww1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table69 = new javax.swing.JTable();
        nuur69 = new javax.swing.JPanel();
        panel1000 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        ahmad80 = new javax.swing.JLabel();
        companyComboBox = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        arvan_hoyr8 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        arvan_gurav8 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        odoo_ajillaj8 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        generateButton = new javax.swing.JButton();
        Main = new javax.swing.JPanel()
        ;
        company = new javax.swing.JLabel();
        zuraas = new javax.swing.JPanel();
        Info = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nemeh = new javax.swing.JButton();
        k_holding = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ahmad1 = new javax.swing.JLabel();
        arvan_hoyr1 = new javax.swing.JLabel();
        arvan_gurav1 = new javax.swing.JLabel();
        odoo_ajillaj1 = new javax.swing.JLabel();
        t_shirees = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ahmad6 = new javax.swing.JLabel();
        arvan_hoyr6 = new javax.swing.JLabel();
        arvan_gurav6 = new javax.swing.JLabel();
        odoo_ajillaj6 = new javax.swing.JLabel();
        zuraas1 = new javax.swing.JPanel();
        evseg = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        ahmad7 = new javax.swing.JLabel();
        arvan_hoyr7 = new javax.swing.JLabel();
        arvan_gurav7 = new javax.swing.JLabel();
        odoo_ajillaj7 = new javax.swing.JLabel();
        zuraas2 = new javax.swing.JPanel();
        zuraas3 = new javax.swing.JPanel();
        zuraas4 = new javax.swing.JPanel();
        zuraas5 = new javax.swing.JPanel();
        zuraas6 = new javax.swing.JPanel();
        zuraas7 = new javax.swing.JPanel();
        m_myndas = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ahmad2 = new javax.swing.JLabel();
        arvan_hoyr2 = new javax.swing.JLabel();
        arvan_gurav2 = new javax.swing.JLabel();
        odoo_ajillaj2 = new javax.swing.JLabel();
        e_od = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ahmad4 = new javax.swing.JLabel();
        arvan_hoyr4 = new javax.swing.JLabel();
        arvan_gurav4 = new javax.swing.JLabel();
        odoo_ajillaj4 = new javax.swing.JLabel();
        g_myndas = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ahmad5 = new javax.swing.JLabel();
        arvan_hoyr5 = new javax.swing.JLabel();
        arvan_gurav5 = new javax.swing.JLabel();
        odoo_ajillaj5 = new javax.swing.JLabel();
        h_shonhor = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ahmad3 = new javax.swing.JLabel();
        arvan_hoyr3 = new javax.swing.JLabel();
        arvan_gurav3 = new javax.swing.JLabel();
        odoo_ajillaj3 = new javax.swing.JLabel();
        data = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        qqww = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        burtgel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        ovog = new javax.swing.JTextField();
        ner = new javax.swing.JTextField();
        eba = new javax.swing.JTextField();
        register = new javax.swing.JTextField();
        hayg = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        er = new javax.swing.JCheckBox();
        em = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        com = new javax.swing.JComboBox<>();
        activity = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        act1 = new javax.swing.JPanel();
        name1 = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        compa1 = new javax.swing.JLabel();
        act2 = new javax.swing.JPanel();
        name2 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        compa2 = new javax.swing.JLabel();
        act3 = new javax.swing.JPanel();
        b2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        compa3 = new javax.swing.JLabel();
        act4 = new javax.swing.JPanel();
        name4 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        compa4 = new javax.swing.JLabel();
        act5 = new javax.swing.JPanel();
        b4 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        compa5 = new javax.swing.JLabel();
        act6 = new javax.swing.JPanel();
        b5 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        compa6 = new javax.swing.JLabel();
        nuur = new javax.swing.JLabel();
        baiguullaguud = new javax.swing.JLabel();
        burtgell = new javax.swing.JLabel();
        archive = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(247, 248, 252));
        setPreferredSize(new java.awt.Dimension(1900, 850));
        setSize(new java.awt.Dimension(1900, 850));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(247, 248, 252));
        jPanel1.setForeground(new java.awt.Color(247, 248, 252));
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(1900, 850));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Arig-Gal_logo12.png"))); // NOI18N

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        archive1.setBackground(new java.awt.Color(255, 255, 255));

        qqww1.setText("Нэрээр хайлт хийнэ.");
        qqww1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qqww1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                qqww1FocusLost(evt);
            }
        });
        qqww1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qqww1ActionPerformed(evt);
            }
        });

        jLabel47.setText("/All гэж бичээд бүх мэдээллийг харна./");

        table69.setForeground(new java.awt.Color(51, 51, 51));
        table69.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ажилтаны код", "Компани", "Овог нэр", "Регистер", "Эрхэлж байсан ажил"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table69.setGridColor(new java.awt.Color(255, 255, 255));
        table69.setSelectionBackground(new java.awt.Color(51, 51, 51));
        table69.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table69MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table69);
        if (table69.getColumnModel().getColumnCount() > 0) {
            table69.getColumnModel().getColumn(0).setPreferredWidth(50);
            table69.getColumnModel().getColumn(1).setPreferredWidth(100);
            table69.getColumnModel().getColumn(3).setPreferredWidth(100);
            table69.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        javax.swing.GroupLayout archive1Layout = new javax.swing.GroupLayout(archive1);
        archive1.setLayout(archive1Layout);
        archive1Layout.setHorizontalGroup(
            archive1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(archive1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(qqww1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
        );
        archive1Layout.setVerticalGroup(
            archive1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(archive1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(archive1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qqww1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        nuur69.setBackground(new java.awt.Color(255, 255, 255));

        panel1000.setBackground(new java.awt.Color(255, 255, 255));
        panel1000.setForeground(new java.awt.Color(51, 51, 51));
        panel1000.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(247, 248, 252));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ahmad80.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ahmad80.setForeground(new java.awt.Color(51, 255, 102));
        ahmad80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        companyComboBox.setBackground(new java.awt.Color(247, 248, 252));
        companyComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        companyComboBox.setForeground(new java.awt.Color(51, 51, 51));
        companyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Кашмер Холдинг", "Мон-Мяндас", "Хавт шонхор", "Эвсэг-Од", "Говийн мяндас", "Тансаг ширээс", "Эвсэг ХХК", " " }));
        companyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyComboBoxActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("Нийт");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setText("Бүх ахмадууд");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(companyComboBox, 0, 225, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ahmad80, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ahmad80, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(companyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(247, 248, 252));
        jPanel11.setForeground(new java.awt.Color(51, 51, 51));
        jPanel11.setPreferredSize(new java.awt.Dimension(220, 160));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        arvan_hoyr8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        arvan_hoyr8.setForeground(new java.awt.Color(51, 51, 51));
        arvan_hoyr8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(arvan_hoyr8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 16, 70, 40));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setText("Нийт");
        jPanel11.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 104, 50));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("<html>2012 өмнө тэтгэвэрт гарсан</html>");
        jPanel11.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 61, 150, 80));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 255, 102));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText(" ");
        jPanel11.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 63, 60, 80));

        jPanel12.setBackground(new java.awt.Color(247, 248, 252));
        jPanel12.setPreferredSize(new java.awt.Dimension(220, 160));

        arvan_gurav8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        arvan_gurav8.setForeground(new java.awt.Color(51, 51, 51));
        arvan_gurav8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("Нийт");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("<html>2013 хойш тэтгэвэрт гарсан</html>");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 255, 102));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText(" ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(arvan_gurav8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(arvan_gurav8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        jPanel13.setBackground(new java.awt.Color(247, 248, 252));
        jPanel13.setPreferredSize(new java.awt.Dimension(220, 160));

        odoo_ajillaj8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        odoo_ajillaj8.setForeground(new java.awt.Color(51, 51, 51));
        odoo_ajillaj8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 51, 51));
        jLabel43.setText("Нийт");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 51, 51));
        jLabel44.setText("<html>Одоо компанид ажиллаж байгаа</html>");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 255, 102));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText(" ");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(odoo_ajillaj8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(odoo_ajillaj8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(247, 248, 252));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setText("<html>\"Ариг гал\" ХК-ахмадуудын судалгаа хэвлэх</html>");

        generateButton.setBackground(new java.awt.Color(51, 102, 255));
        generateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        generateButton.setForeground(new java.awt.Color(255, 255, 255));
        generateButton.setText("Хэвлэх");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout nuur69Layout = new javax.swing.GroupLayout(nuur69);
        nuur69.setLayout(nuur69Layout);
        nuur69Layout.setHorizontalGroup(
            nuur69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuur69Layout.createSequentialGroup()
                .addGroup(nuur69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(nuur69Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(nuur69Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(nuur69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel1000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(nuur69Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
        );
        nuur69Layout.setVerticalGroup(
            nuur69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuur69Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(nuur69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel1000, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new FlowLayout());
        Main = new RoundJPanel(214, 76); // Set background color as needed
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setPreferredSize(new java.awt.Dimension(1095, 695));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        company.setBackground(new java.awt.Color(0, 0, 0));
        company.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        company.setForeground(new java.awt.Color(53, 58, 76));
        company.setText("Компаниуд");
        Main.add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 11, 216, 61));

        zuraas.setPreferredSize(new java.awt.Dimension(710, 1));

        javax.swing.GroupLayout zuraasLayout = new javax.swing.GroupLayout(zuraas);
        zuraas.setLayout(zuraasLayout);
        zuraasLayout.setHorizontalGroup(
            zuraasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1095, Short.MAX_VALUE)
        );
        zuraasLayout.setVerticalGroup(
            zuraasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Main.add(zuraas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 78, 1095, -1));

        Info.setBackground(new java.awt.Color(242, 242, 246));
        Info.setPreferredSize(new java.awt.Dimension(990, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("№");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Бүх Ахмадууд");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("<html>2012 өмнө т/гарсан</html>");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Компани");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("<html>2013 өмнө т/гарсан</html>");

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("<html>Одоо компанид ажиллаж байгаа ахмад</html>");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout InfoLayout = new javax.swing.GroupLayout(Info);
        Info.setLayout(InfoLayout);
        InfoLayout.setHorizontalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        InfoLayout.setVerticalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InfoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        Main.add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 990, 60));

        nemeh.setBackground(new java.awt.Color(69, 85, 241));
        nemeh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add (1).png"))); // NOI18N
        nemeh.setAlignmentX(0.5F);
        nemeh.setContentAreaFilled(false);
        nemeh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nemeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nemehActionPerformed(evt);
            }
        });
        Main.add(nemeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 50, 50));

        k_holding.setBackground(new java.awt.Color(255, 255, 255));
        k_holding.setForeground(new java.awt.Color(255, 255, 255));
        k_holding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                k_holdingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k_holdingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                k_holdingMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                k_holdingMouseReleased(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(69, 85, 241));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(69, 85, 241));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("1");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Кашмер Холдинг");

        ahmad1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ahmad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_hoyr1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_hoyr1.setForeground(new java.awt.Color(255, 51, 51));
        arvan_hoyr1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_gurav1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_gurav1.setForeground(new java.awt.Color(255, 51, 51));
        arvan_gurav1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        odoo_ajillaj1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        odoo_ajillaj1.setForeground(new java.awt.Color(0, 255, 102));
        odoo_ajillaj1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout k_holdingLayout = new javax.swing.GroupLayout(k_holding);
        k_holding.setLayout(k_holdingLayout);
        k_holdingLayout.setHorizontalGroup(
            k_holdingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(k_holdingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(ahmad1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(arvan_hoyr1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(arvan_gurav1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(odoo_ajillaj1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        k_holdingLayout.setVerticalGroup(
            k_holdingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ahmad1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, k_holdingLayout.createSequentialGroup()
                .addGroup(k_holdingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, k_holdingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(k_holdingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(arvan_hoyr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arvan_gurav1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(odoo_ajillaj1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        Main.add(k_holding, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 990, 65));

        t_shirees.setBackground(new java.awt.Color(255, 255, 255));
        t_shirees.setForeground(new java.awt.Color(255, 255, 255));
        t_shirees.setPreferredSize(new java.awt.Dimension(990, 60));
        t_shirees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_shireesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t_shireesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t_shireesMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(69, 85, 241));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("6");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Тансаг ширээс");

        ahmad6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ahmad6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_hoyr6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_hoyr6.setForeground(new java.awt.Color(255, 51, 51));
        arvan_hoyr6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_gurav6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_gurav6.setForeground(new java.awt.Color(255, 51, 51));
        arvan_gurav6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        odoo_ajillaj6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        odoo_ajillaj6.setForeground(new java.awt.Color(0, 255, 102));
        odoo_ajillaj6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout t_shireesLayout = new javax.swing.GroupLayout(t_shirees);
        t_shirees.setLayout(t_shireesLayout);
        t_shireesLayout.setHorizontalGroup(
            t_shireesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t_shireesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(ahmad6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(arvan_hoyr6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arvan_gurav6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(odoo_ajillaj6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        t_shireesLayout.setVerticalGroup(
            t_shireesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ahmad6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(arvan_hoyr6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(arvan_gurav6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(odoo_ajillaj6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(t_shireesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addComponent(jLabel19))
        );

        Main.add(t_shirees, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        zuraas1.setPreferredSize(new java.awt.Dimension(850, 1));

        javax.swing.GroupLayout zuraas1Layout = new javax.swing.GroupLayout(zuraas1);
        zuraas1.setLayout(zuraas1Layout);
        zuraas1Layout.setHorizontalGroup(
            zuraas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        zuraas1Layout.setVerticalGroup(
            zuraas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Main.add(zuraas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 225, 990, -1));

        evseg.setBackground(new java.awt.Color(255, 255, 255));
        evseg.setForeground(new java.awt.Color(255, 255, 255));
        evseg.setPreferredSize(new java.awt.Dimension(990, 65));
        evseg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                evsegMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                evsegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                evsegMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(69, 85, 241));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("7");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Эвсэг ХХК");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        ahmad7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ahmad7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_hoyr7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_hoyr7.setForeground(new java.awt.Color(255, 51, 51));
        arvan_hoyr7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_gurav7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_gurav7.setForeground(new java.awt.Color(255, 51, 51));
        arvan_gurav7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        odoo_ajillaj7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        odoo_ajillaj7.setForeground(new java.awt.Color(0, 255, 102));
        odoo_ajillaj7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout evsegLayout = new javax.swing.GroupLayout(evseg);
        evseg.setLayout(evsegLayout);
        evsegLayout.setHorizontalGroup(
            evsegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(evsegLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(ahmad7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(arvan_hoyr7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arvan_gurav7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(odoo_ajillaj7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        evsegLayout.setVerticalGroup(
            evsegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(evsegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(evsegLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(evsegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arvan_hoyr7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ahmad7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arvan_gurav7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(odoo_ajillaj7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Main.add(evseg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 572, -1, -1));

        zuraas2.setPreferredSize(new java.awt.Dimension(990, 1));

        javax.swing.GroupLayout zuraas2Layout = new javax.swing.GroupLayout(zuraas2);
        zuraas2.setLayout(zuraas2Layout);
        zuraas2Layout.setHorizontalGroup(
            zuraas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        zuraas2Layout.setVerticalGroup(
            zuraas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Main.add(zuraas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 295, -1, -1));

        zuraas3.setPreferredSize(new java.awt.Dimension(990, 1));

        javax.swing.GroupLayout zuraas3Layout = new javax.swing.GroupLayout(zuraas3);
        zuraas3.setLayout(zuraas3Layout);
        zuraas3Layout.setHorizontalGroup(
            zuraas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        zuraas3Layout.setVerticalGroup(
            zuraas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Main.add(zuraas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 433, -1, -1));

        zuraas4.setPreferredSize(new java.awt.Dimension(990, 1));

        javax.swing.GroupLayout zuraas4Layout = new javax.swing.GroupLayout(zuraas4);
        zuraas4.setLayout(zuraas4Layout);
        zuraas4Layout.setHorizontalGroup(
            zuraas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        zuraas4Layout.setVerticalGroup(
            zuraas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Main.add(zuraas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 503, -1, -1));

        zuraas5.setPreferredSize(new java.awt.Dimension(990, 1));

        javax.swing.GroupLayout zuraas5Layout = new javax.swing.GroupLayout(zuraas5);
        zuraas5.setLayout(zuraas5Layout);
        zuraas5Layout.setHorizontalGroup(
            zuraas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        zuraas5Layout.setVerticalGroup(
            zuraas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Main.add(zuraas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));

        zuraas6.setFocusable(false);
        zuraas6.setPreferredSize(new java.awt.Dimension(990, 1));

        javax.swing.GroupLayout zuraas6Layout = new javax.swing.GroupLayout(zuraas6);
        zuraas6.setLayout(zuraas6Layout);
        zuraas6Layout.setHorizontalGroup(
            zuraas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        zuraas6Layout.setVerticalGroup(
            zuraas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Main.add(zuraas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 638, -1, -1));

        zuraas7.setPreferredSize(new java.awt.Dimension(990, 1));

        javax.swing.GroupLayout zuraas7Layout = new javax.swing.GroupLayout(zuraas7);
        zuraas7.setLayout(zuraas7Layout);
        zuraas7Layout.setHorizontalGroup(
            zuraas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        zuraas7Layout.setVerticalGroup(
            zuraas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Main.add(zuraas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 365, -1, -1));

        m_myndas.setBackground(new java.awt.Color(255, 255, 255));
        m_myndas.setForeground(new java.awt.Color(255, 255, 255));
        m_myndas.setPreferredSize(new java.awt.Dimension(990, 65));
        m_myndas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_myndasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m_myndasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m_myndasMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(69, 86, 241));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("2");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Мон-Мяндас");

        ahmad2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ahmad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_hoyr2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_hoyr2.setForeground(new java.awt.Color(255, 51, 51));
        arvan_hoyr2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_gurav2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_gurav2.setForeground(new java.awt.Color(255, 51, 51));
        arvan_gurav2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        odoo_ajillaj2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        odoo_ajillaj2.setForeground(new java.awt.Color(0, 255, 102));
        odoo_ajillaj2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout m_myndasLayout = new javax.swing.GroupLayout(m_myndas);
        m_myndas.setLayout(m_myndasLayout);
        m_myndasLayout.setHorizontalGroup(
            m_myndasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m_myndasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(ahmad2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arvan_hoyr2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(arvan_gurav2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(odoo_ajillaj2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        m_myndasLayout.setVerticalGroup(
            m_myndasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m_myndasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m_myndasLayout.createSequentialGroup()
                .addGroup(m_myndasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ahmad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(odoo_ajillaj2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arvan_hoyr2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arvan_gurav2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Main.add(m_myndas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 228, -1, -1));

        e_od.setBackground(new java.awt.Color(255, 255, 255));
        e_od.setForeground(new java.awt.Color(255, 255, 255));
        e_od.setPreferredSize(new java.awt.Dimension(990, 65));
        e_od.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e_odMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                e_odMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                e_odMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(69, 85, 241));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("4");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Эвсэг-Од");

        ahmad4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ahmad4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_hoyr4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_hoyr4.setForeground(new java.awt.Color(255, 51, 51));
        arvan_hoyr4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_gurav4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_gurav4.setForeground(new java.awt.Color(255, 51, 51));
        arvan_gurav4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        odoo_ajillaj4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        odoo_ajillaj4.setForeground(new java.awt.Color(0, 255, 102));
        odoo_ajillaj4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout e_odLayout = new javax.swing.GroupLayout(e_od);
        e_od.setLayout(e_odLayout);
        e_odLayout.setHorizontalGroup(
            e_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(e_odLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel17)
                .addGap(173, 173, 173)
                .addComponent(ahmad4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(arvan_hoyr4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arvan_gurav4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(odoo_ajillaj4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        e_odLayout.setVerticalGroup(
            e_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ahmad4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(arvan_hoyr4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(arvan_gurav4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(odoo_ajillaj4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(e_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Main.add(e_od, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 367, -1, -1));

        g_myndas.setBackground(new java.awt.Color(255, 255, 255));
        g_myndas.setForeground(new java.awt.Color(255, 255, 255));
        g_myndas.setPreferredSize(new java.awt.Dimension(990, 65));
        g_myndas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g_myndasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                g_myndasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                g_myndasMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(69, 85, 241));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("5");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Говийн мяндас");

        ahmad5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ahmad5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_hoyr5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_hoyr5.setForeground(new java.awt.Color(255, 51, 51));
        arvan_hoyr5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_gurav5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_gurav5.setForeground(new java.awt.Color(255, 51, 51));
        arvan_gurav5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        odoo_ajillaj5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        odoo_ajillaj5.setForeground(new java.awt.Color(0, 255, 102));
        odoo_ajillaj5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout g_myndasLayout = new javax.swing.GroupLayout(g_myndas);
        g_myndas.setLayout(g_myndasLayout);
        g_myndasLayout.setHorizontalGroup(
            g_myndasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(g_myndasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(ahmad5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(arvan_hoyr5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arvan_gurav5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(odoo_ajillaj5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        g_myndasLayout.setVerticalGroup(
            g_myndasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ahmad5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(arvan_hoyr5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(arvan_gurav5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(g_myndasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(g_myndasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(odoo_ajillaj5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Main.add(g_myndas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 436, -1, -1));

        h_shonhor.setBackground(new java.awt.Color(255, 255, 255));
        h_shonhor.setForeground(new java.awt.Color(255, 255, 255));
        h_shonhor.setPreferredSize(new java.awt.Dimension(990, 65));
        h_shonhor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_shonhorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                h_shonhorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                h_shonhorMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(69, 85, 241));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("3");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Хавт Шонхор");

        ahmad3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ahmad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_hoyr3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_hoyr3.setForeground(new java.awt.Color(255, 51, 51));
        arvan_hoyr3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_gurav3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_gurav3.setForeground(new java.awt.Color(255, 51, 51));
        arvan_gurav3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        odoo_ajillaj3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        odoo_ajillaj3.setForeground(new java.awt.Color(0, 255, 102));
        odoo_ajillaj3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout h_shonhorLayout = new javax.swing.GroupLayout(h_shonhor);
        h_shonhor.setLayout(h_shonhorLayout);
        h_shonhorLayout.setHorizontalGroup(
            h_shonhorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_shonhorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(ahmad3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(arvan_hoyr3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arvan_gurav3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(odoo_ajillaj3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        h_shonhorLayout.setVerticalGroup(
            h_shonhorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ahmad3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(h_shonhorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h_shonhorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(h_shonhorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(arvan_gurav3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arvan_hoyr3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(odoo_ajillaj3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Main.add(h_shonhor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 298, -1, -1));

        data.setBackground(new java.awt.Color(255, 255, 255));
        data.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        data.setPreferredSize(new java.awt.Dimension(1095, 696));

        table.setForeground(new java.awt.Color(51, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ажилтаны код", "Компани", "Овог нэр", "2012 оноос өмнө т/гарсан", "2013 оноос өмнө т/гарсан", "Одоо компанид ажиллаж байгаа ахмад"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setSelectionBackground(new java.awt.Color(51, 51, 51));
        table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
            table.getColumnModel().getColumn(1).setPreferredWidth(100);
            table.getColumnModel().getColumn(3).setPreferredWidth(100);
            table.getColumnModel().getColumn(4).setPreferredWidth(100);
            table.getColumnModel().getColumn(5).setPreferredWidth(200);
        }

        qqww.setText("Нэрээр хайлт хийнэ.");
        qqww.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qqwwFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                qqwwFocusLost(evt);
            }
        });
        qqww.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qqwwActionPerformed(evt);
            }
        });

        jLabel35.setText("/All гэж бичээд бүх мэдээллийг харна./");

        javax.swing.GroupLayout dataLayout = new javax.swing.GroupLayout(data);
        data.setLayout(dataLayout);
        dataLayout.setHorizontalGroup(
            dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(qqww, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1655, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 2182, Short.MAX_VALUE)
        );
        dataLayout.setVerticalGroup(
            dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qqww, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        burtgel.setBackground(new java.awt.Color(255, 255, 255));
        burtgel.setToolTipText("");
        burtgel.setPreferredSize(new java.awt.Dimension(1095, 695));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel22.setText("Бүртгэл");

        jPanel2.setPreferredSize(new java.awt.Dimension(0, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("Нэр:");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setText(" Овог:");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("Компани:");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("Эрхэлж байсан ажил:");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("Тэтгэвэрт гарсан он:");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("Төрсөн он сар:");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setText("Утас:");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setText("Гэрийн хаяг:");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setText("Регистр:");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 270));

        img1.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Зураг оруулах");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ovog.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ovog.setPreferredSize(new java.awt.Dimension(103, 30));
        ovog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovogActionPerformed(evt);
            }
        });

        ner.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ner.setPreferredSize(new java.awt.Dimension(103, 30));
        ner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nerActionPerformed(evt);
            }
        });

        eba.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        eba.setPreferredSize(new java.awt.Dimension(103, 30));

        register.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        register.setPreferredSize(new java.awt.Dimension(103, 30));
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        hayg.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        hayg.setPreferredSize(new java.awt.Dimension(103, 30));
        hayg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haygActionPerformed(evt);
            }
        });

        phone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        phone.setPreferredSize(new java.awt.Dimension(103, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setText("Хүйс:");

        er.setText("Эр");

        em.setText("Эм");
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 112));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Бүртгэх");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        com.setForeground(new java.awt.Color(102, 102, 102));
        com.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Кашмер Холдинг", "Мон-Мяндас", "Хавт Шонхор", "Эвсэг-Од", "Говийн мяндас", "Тансаг ширээс", "Эвсэг ХХК", " " }));

        javax.swing.GroupLayout burtgelLayout = new javax.swing.GroupLayout(burtgel);
        burtgel.setLayout(burtgelLayout);
        burtgelLayout.setHorizontalGroup(
            burtgelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 2178, Short.MAX_VALUE)
            .addGroup(burtgelLayout.createSequentialGroup()
                .addGroup(burtgelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(burtgelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(burtgelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addGroup(burtgelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ovog, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(burtgelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ner, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eba, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(burtgelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(burtgelLayout.createSequentialGroup()
                                .addComponent(er, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(burtgelLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(burtgelLayout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addGroup(burtgelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hayg, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 1163, Short.MAX_VALUE))
        );
        burtgelLayout.setVerticalGroup(
            burtgelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(burtgelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(burtgelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(burtgelLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(ovog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel25)
                        .addGap(8, 8, 8)
                        .addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel27)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel29))
                    .addGroup(burtgelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(burtgelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(burtgelLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(15, 15, 15)
                                .addComponent(ner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel26)
                                .addGap(5, 5, 5)
                                .addComponent(eba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel28)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel31))
                            .addGroup(burtgelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(burtgelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(er)
                                    .addComponent(em))))))
                .addGap(5, 5, 5)
                .addGroup(burtgelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(burtgelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hayg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addComponent(nuur69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(data, javax.swing.GroupLayout.DEFAULT_SIZE, 2184, Short.MAX_VALUE))
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                    .addComponent(burtgel, javax.swing.GroupLayout.PREFERRED_SIZE, 2178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContainerLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(archive1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1091, Short.MAX_VALUE)))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
                    .addComponent(nuur69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(data, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE))
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(burtgel, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE))
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(archive1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        activity.setBackground(new java.awt.Color(247, 248, 252));
        activity.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Latest activity");
        activity.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 195, 40));

        act1.setBackground(new java.awt.Color(255, 255, 255));
        act1.setPreferredSize(new java.awt.Dimension(190, 80));

        name1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name1.setText(" ");

        b.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b.setForeground(new java.awt.Color(0, 204, 0));
        b.setText("Бүртгэгдэсэн");
        b.setVisible(true);

        compa1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        compa1.setText(" ");

        javax.swing.GroupLayout act1Layout = new javax.swing.GroupLayout(act1);
        act1.setLayout(act1Layout);
        act1Layout.setHorizontalGroup(
            act1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(act1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(act1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compa1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        act1Layout.setVerticalGroup(
            act1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(act1Layout.createSequentialGroup()
                .addComponent(compa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(name1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b)
                .addGap(24, 24, 24))
        );

        activity.add(act1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, -1));

        act2.setBackground(new java.awt.Color(255, 255, 255));

        name2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name2.setText(" ");

        b1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 204, 0));
        b1.setText("Бүртгэгдэсэн");
        b.setVisible(false);

        compa2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        compa2.setText(" ");

        javax.swing.GroupLayout act2Layout = new javax.swing.GroupLayout(act2);
        act2.setLayout(act2Layout);
        act2Layout.setHorizontalGroup(
            act2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(act2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(act2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compa2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        act2Layout.setVerticalGroup(
            act2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(act2Layout.createSequentialGroup()
                .addComponent(compa2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name2)
                .addGap(12, 12, 12)
                .addComponent(b1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        activity.add(act2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 200, -1));

        act3.setBackground(new java.awt.Color(255, 255, 255));

        b2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 204, 0));
        b2.setText("Бүртгэгдэсэн");
        b.setVisible(false);

        name3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name3.setText(" ");

        compa3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        compa3.setText(" ");

        javax.swing.GroupLayout act3Layout = new javax.swing.GroupLayout(act3);
        act3.setLayout(act3Layout);
        act3Layout.setHorizontalGroup(
            act3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(act3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(act3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compa3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        act3Layout.setVerticalGroup(
            act3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, act3Layout.createSequentialGroup()
                .addComponent(compa3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        activity.add(act3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, -1));

        act4.setBackground(new java.awt.Color(255, 255, 255));
        act4.setPreferredSize(new java.awt.Dimension(0, 80));

        name4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name4.setText(" ");

        b3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b3.setForeground(new java.awt.Color(0, 204, 0));
        b3.setText("Бүртгэгдэсэн");
        b.setVisible(false);

        compa4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        compa4.setText(" ");

        javax.swing.GroupLayout act4Layout = new javax.swing.GroupLayout(act4);
        act4.setLayout(act4Layout);
        act4Layout.setHorizontalGroup(
            act4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(act4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(act4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compa4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        act4Layout.setVerticalGroup(
            act4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(act4Layout.createSequentialGroup()
                .addComponent(compa4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        activity.add(act4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 385, 200, -1));

        act5.setBackground(new java.awt.Color(255, 255, 255));
        act5.setPreferredSize(new java.awt.Dimension(0, 80));

        b4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b4.setForeground(new java.awt.Color(0, 204, 0));
        b4.setText("Бүртгэгдэсэн");
        b.setVisible(false);

        name6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name6.setText(" ");

        compa5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        compa5.setText(" ");

        javax.swing.GroupLayout act5Layout = new javax.swing.GroupLayout(act5);
        act5.setLayout(act5Layout);
        act5Layout.setHorizontalGroup(
            act5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, act5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(act5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compa5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        act5Layout.setVerticalGroup(
            act5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(act5Layout.createSequentialGroup()
                .addComponent(compa5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        activity.add(act5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 200, -1));

        act6.setBackground(new java.awt.Color(255, 255, 255));
        act6.setPreferredSize(new java.awt.Dimension(0, 80));

        b5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b5.setForeground(new java.awt.Color(0, 204, 0));
        b5.setText("Бүртгэгдэсэн");
        b.setVisible(false);

        name5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name5.setText(" ");

        compa6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        compa6.setText(" ");

        javax.swing.GroupLayout act6Layout = new javax.swing.GroupLayout(act6);
        act6.setLayout(act6Layout);
        act6Layout.setHorizontalGroup(
            act6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(act6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(act6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compa6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        act6Layout.setVerticalGroup(
            act6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, act6Layout.createSequentialGroup()
                .addComponent(compa6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(name5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b5)
                .addGap(27, 27, 27))
        );

        activity.add(act6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 200, -1));

        nuur.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nuur.setForeground(new java.awt.Color(0, 0, 128));
        nuur.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nuur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/house (4).png"))); // NOI18N
        nuur.setText("Нүүр");
        nuur.setToolTipText("");
        nuur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuurMouseClicked(evt);
            }
        });

        baiguullaguud.setBackground(new java.awt.Color(187, 187, 187));
        baiguullaguud.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        baiguullaguud.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        baiguullaguud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/enterprise.png"))); // NOI18N
        baiguullaguud.setText("Байгууллагууд");
        baiguullaguud.setForeground(new java.awt.Color(187,187,187));
        baiguullaguud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                baiguullaguudMouseClicked(evt);
            }
        });

        burtgell.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        burtgell.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        burtgell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/content-creator.png"))); // NOI18N
        burtgell.setText("Бүртгэл");
        burtgell.setForeground(new java.awt.Color(187,187,187));
        burtgell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                burtgellMouseClicked(evt);
            }
        });

        archive.setBackground(new java.awt.Color(187, 187, 187));
        archive.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        archive.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        archive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/documents (1).png"))); // NOI18N
        archive.setForeground(new java.awt.Color(187,187,187));
        archive.setText("Архив");
        baiguullaguud.setForeground(new java.awt.Color(187,187,187));
        archive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                archiveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(burtgell, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nuur, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(baiguullaguud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(archive, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(activity, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(nuur, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(baiguullaguud, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(burtgell, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(archive, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 1540, 840));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void evsegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evsegMouseExited
        // TODO add your handling code here:
        evseg.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_evsegMouseExited

    private void evsegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evsegMouseEntered
        // TODO add your handling code here:
        evseg.setBackground(new Color(242,242,246));
    }//GEN-LAST:event_evsegMouseEntered

    private void evsegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evsegMouseClicked
        aa="evseg";
        burtgel.setVisible(false);
        data.setVisible(true);
        nuur69.setVisible(false);
        Main.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_evsegMouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void h_shonhorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_shonhorMouseExited
        // TODO add your handling code here:
        h_shonhor.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_h_shonhorMouseExited

    private void h_shonhorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_shonhorMouseEntered
        // TODO add your handling code here:
        h_shonhor.setBackground(new Color(242,242,246));
    }//GEN-LAST:event_h_shonhorMouseEntered

    private void h_shonhorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_shonhorMouseClicked
        aa="h_shonhor";
        burtgel.setVisible(false);
        data.setVisible(true);
        nuur69.setVisible(false);
        Main.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_h_shonhorMouseClicked

    private void g_myndasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g_myndasMouseExited
        // TODO add your handling code here:
        g_myndas.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_g_myndasMouseExited

    private void g_myndasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g_myndasMouseEntered
        // TODO add your handling code here:
        g_myndas.setBackground(new Color(242,242,246));
    }//GEN-LAST:event_g_myndasMouseEntered

    private void g_myndasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g_myndasMouseClicked
        // TODO add your handling code here:
        aa="g_myndas";
           burtgel.setVisible(false);
        data.setVisible(true);
        nuur69.setVisible(false);
        Main.setVisible(false);
    }//GEN-LAST:event_g_myndasMouseClicked

    private void e_odMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_odMouseExited
        // TODO add your handling code here:
        e_od.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_e_odMouseExited

    private void e_odMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_odMouseEntered
        // TODO add your handling code here:
        e_od.setBackground(new Color(242,242,246));
    }//GEN-LAST:event_e_odMouseEntered

    private void e_odMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_odMouseClicked
        aa="e_od";
         burtgel.setVisible(false);
        data.setVisible(true);
        nuur69.setVisible(false);
        Main.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_e_odMouseClicked

    private void m_myndasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_myndasMouseExited
        // TODO add your handling code here:
        m_myndas.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_m_myndasMouseExited

    private void m_myndasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_myndasMouseEntered
        // TODO add your handling code here:
        m_myndas.setBackground(new Color(242,242,246));
    }//GEN-LAST:event_m_myndasMouseEntered

    private void m_myndasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_myndasMouseClicked
        // TODO add your handling code here:
        aa="m_myndas";
        burtgel.setVisible(false);
        data.setVisible(true);
        nuur69.setVisible(false);
        Main.setVisible(false);
    }//GEN-LAST:event_m_myndasMouseClicked

    private void t_shireesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_shireesMouseExited
        // TODO add your handling code here:
        t_shirees.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_t_shireesMouseExited

    private void t_shireesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_shireesMouseEntered
        // TODO add your handling code here:
        t_shirees.setBackground(new Color(242,242,246));

    }//GEN-LAST:event_t_shireesMouseEntered

    private void t_shireesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_shireesMouseClicked
        aa="t_shirees";
         burtgel.setVisible(false);
        data.setVisible(true);
        nuur69.setVisible(false);
        Main.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_t_shireesMouseClicked

    private void k_holdingMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k_holdingMouseReleased
        // TODO add your handling code here:
        k_holding.setBackground(new Color(65,65,65));
    }//GEN-LAST:event_k_holdingMouseReleased

    private void k_holdingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k_holdingMouseExited
        // TODO add your handling code here:
        k_holding.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_k_holdingMouseExited

    private void k_holdingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k_holdingMouseEntered
        // TODO add your handling code here:
        k_holding.setBackground(new Color(242,242,246));
    }//GEN-LAST:event_k_holdingMouseEntered

    private void k_holdingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k_holdingMouseClicked
        // TODO add your handling code here:
        aa="k_holding";
        
        burtgel.setVisible(false);
        data.setVisible(true);
        nuur69.setVisible(false);
        Main.setVisible(false);
    }//GEN-LAST:event_k_holdingMouseClicked

    private void nemehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nemehActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nemehActionPerformed

    private void qqwwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qqwwActionPerformed
        // TODO add your handling code here:
        String searchQuery = qqww.getText().trim();
        // Check if the search query is empty
        if (searchQuery.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Хайлт хоосон байж болохгүй.");
        } else {
            try {
                performSearch(searchQuery);
            } catch (SQLException ex) {
                Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_qqwwActionPerformed

    private void nuurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuurMouseClicked
        // TODO add your handling code here:
//        String path = "house (4).png";
//        ImageIcon icon = new ImageIcon(getClass().getResource(path));
//        nuur.setIcon(icon);
//        
//        String path1 = "enterprise.png";
//        ImageIcon icon1 = new ImageIcon(getClass().getResource(path1));
//        baiguullaguud.setIcon(icon1);
//        
//        String path2 = "content-creator.png";
//        ImageIcon icon2 = new ImageIcon(getClass().getResource(path2));
//        nuur.setIcon(icon2);
        
        // Assuming "nuur.png" is in the same directory as your Java file
        nuur.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\house (4).png"));
        baiguullaguud.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\enterprise.png"));
        burtgell.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\content-creator.png"));
        archive.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\documents (1).png"));
        
        java.awt.Font boldFont = nuur.getFont().deriveFont(Font.BOLD);
        nuur.setFont(boldFont);
        
//         

          baiguullaguud.setFont(new java.awt.Font("Segoe UI",Font.DEFAULTSIZE,16));
          
       //   burtgel.setFont(boldFont);
//        baiguullaguud.setFont(new Font("Segoe UI",Font.PLAIN,16));
            burtgell.setFont(new java.awt.Font("Segoe UI",Font.DEFAULTSIZE,16));
        archive.setFont(new java.awt.Font("Segoe UI",Font.DEFAULTSIZE,16));



        Color c=new Color(0,0,128);
        Color v=new Color(187,187,187);
        nuur.setForeground(c);
        baiguullaguud.setForeground(v);
        burtgell.setForeground(v);
        archive.setForeground(v);
        
        Main.setVisible(false);
        burtgel.setVisible(false);
        data.setVisible(false);
        archive1.setVisible(false);
        nuur69.setVisible(true);
    }//GEN-LAST:event_nuurMouseClicked

    private void baiguullaguudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baiguullaguudMouseClicked
        // TODO add your handling code here:
//        String path = "house (3).png";
//        ImageIcon icon = new ImageIcon(getClass().getResource(path));
//        nuur.setIcon(icon);
//        
//        String path1 = "enterprise (1).png";
//        ImageIcon icon1 = new ImageIcon(getClass().getResource(path1));
//        baiguullaguud.setIcon(icon1);
//        
//        String path2 = "content-creator.png";
//        ImageIcon icon2 = new ImageIcon(getClass().getResource(path2));
//        nuur.setIcon(icon2);
//         
        
        nuur.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\house (3).png"));
        baiguullaguud.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\enterprise (1).png"));
        burtgell.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\content-creator.png"));
        archive.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\documents (1).png"));

        
        java.awt.Font boldFont = baiguullaguud.getFont().deriveFont(Font.BOLD);
        baiguullaguud.setFont(boldFont); 
          
        
        
        
   
        nuur.setFont(new java.awt.Font("Segoe UI",Font.DEFAULTSIZE,16));
        burtgell.setFont(new java.awt.Font("Segoe UI",Font.DEFAULTSIZE,16));
        archive.setFont(new java.awt.Font("Segoe UI",Font.DEFAULTSIZE,16));




        Color c=new Color(0,0,128);
        Color v=new Color(187,187,187);
        nuur.setForeground(v);
        baiguullaguud.setForeground(c);
        burtgell.setForeground(v); 
        archive.setForeground(v); 
        
        burtgel.setVisible(false);
        data.setVisible(false);
        nuur69.setVisible(false);
        archive1.setVisible(false);
        Main.setVisible(true);
    }//GEN-LAST:event_baiguullaguudMouseClicked

    private void burtgellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_burtgellMouseClicked
        // TODO add your handling code here:
//        String path = "house (3).png";
//        ImageIcon icon = new ImageIcon(getClass().getResource(path));
//        nuur.setIcon(icon);
//        
//        String path1 = "enterprise.png";
//        ImageIcon icon1 = new ImageIcon(getClass().getResource(path1));
//        baiguullaguud.setIcon(icon1);
//        
//        String path2 = "content-creator (1).png";
//        ImageIcon icon2 = new ImageIcon(getClass().getResource(path2));
//        nuur.setIcon(icon2);
        archive.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\documents (1).png"));
        nuur.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\house (3).png"));
        baiguullaguud.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\enterprise.png"));
        burtgell.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\content-creator (1).png"));

        java.awt.Font boldFont = burtgell.getFont().deriveFont(Font.BOLD);
        burtgell.setFont(boldFont);
        baiguullaguud.setFont(new java.awt.Font("Segoe UI",Font.DEFAULTSIZE,16));
        nuur.setFont(new java.awt.Font("Segoe UI",Font.DEFAULTSIZE,16));
        archive.setFont(new java.awt.Font("Segoe UI",Font.DEFAULTSIZE,16));
        Color c=new Color(0,0,128);
        Color v=new Color(187,187,187);
        nuur.setForeground(v);
        baiguullaguud.setForeground(v);
        archive.setForeground(v);
        burtgell.setForeground(c);
        
        data.setVisible(false);
        nuur69.setVisible(false);
        Main.setVisible(false);
        archive1.setVisible(false);
        burtgel.setVisible(true);
    }//GEN-LAST:event_burtgellMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        
        int row = table.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) table.getModel();
        String company=model.getValueAt(row,1).toString();
        String ner=model.getValueAt(row,2).toString();
//        Profile pro=new Profile(company,ner);
//        pro.show();
        profile pf=new profile(company,ner);
        pf.show();
        
    }//GEN-LAST:event_tableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();	
			chooser.showOpenDialog(null);
			File f=chooser.getSelectedFile();
			String path=f.getAbsolutePath();
			try {
				BufferedImage bi=ImageIO.read(new File(path));
				Image img=bi.getScaledInstance(159, 198, Image.SCALE_SMOOTH);
				ImageIcon icon= new ImageIcon(img);
				img1.setIcon(icon); 
				path2 =path;
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nerActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                                Connection con=null;
				PreparedStatement pst=null;
                                Statement st=null;
                                ResultSet rs=null;
				try {	 
                                    if(er.isSelected()){
                                         huis="Эрэгтэй";
                                    }
                                    if(em.isSelected()){
                                     huis="Эмэгтэй";
                                    }
					String ner1 = ner.getText();
					String ovog1 = ovog.getText();
					String eba1 = eba.getText();
					ner0=ner1;
					String phone1 = phone.getText();
					String register1 = register.getText();
                                        String hayg1 = hayg.getText();
                                        String com1=com.getSelectedItem().toString();
					String query=("insert into sudalgaa(ovog,ner,register,tsol,t_garsan_on,tursun_on,utas,hayg,huis,zurag,company)values(?,?,?,?,?,?,?,?,?,?,?)");
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
					pst= con.prepareStatement(query);
					pst.setString(1,ovog.getText());
					pst.setString(2,ner.getText());
					pst.setString(3,register.getText());
					pst.setString(4,eba.getText());
					pst.setString(7,phone.getText());
                                        pst.setString(8,hayg1);
                                        pst.setString(9,huis);
					FileInputStream is=new FileInputStream(new File(path2));
					pst.setBlob(10, is);
                                        pst.setString(11, com1);
                                        
                                        SimpleDateFormat sdf1= new SimpleDateFormat("yyyy-MM-dd");
                                        String date1=sdf1.format(tga.getDate());
                                        pst.setString(5, date1);
					
                                        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
                                        String date=sdf.format(tos.getDate());
                                        pst.setString(6, date);
                                        
                                        pst.executeUpdate();
					img1.setIcon(null);
                                        acti();
					JOptionPane.showMessageDialog(null,"Registration Succesfully");
                                        
					}catch(ClassNotFoundException e1) {
						System.out.println(e1);
					}
				catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}finally {
    // Close resources in the reverse order of their creation
    try {
        if (con != null) {
            con.close();
        }
        // Close other resources (statements, result sets, etc.)
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
                                }
                                
                                
                                
                                
                              
                                
                                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ovogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ovogActionPerformed

    private void haygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haygActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_haygActionPerformed

    private void qqwwFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qqwwFocusGained
        // TODO add your handling code here:
        if(qqww.getText().equals("Нэрээр хайлт хийнэ.")){
        qqww.setText(null);
        qqww.requestFocus();
        remove(qqww);
        }
    }//GEN-LAST:event_qqwwFocusGained

    private void qqwwFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qqwwFocusLost
        // TODO add your handling code here:
        if(qqww.getText().length()==0){
        addPlaceholderSty(qqww);
        qqww.setText("Нэрээр хайлт хийнэ.");
        }
    }//GEN-LAST:event_qqwwFocusLost

    private void companyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyComboBoxActionPerformed

        updateStatistics();
    }//GEN-LAST:event_companyComboBoxActionPerformed
    private static final String MONGOLIAN_FONT_PATH = "C:\\Users\\NewTech\\Downloads\\Mogul Arial.ttf";
    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
                                               
                                             try {
        Document document = new Document();

        PdfWriter.getInstance(document, new FileOutputStream("hevleh.pdf"));

        document.open();

        // Add title with centered alignment1
         BaseFont mongolianFont = BaseFont.createFont(MONGOLIAN_FONT_PATH, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        Font titleFont = new Font(mongolianFont, 18, Font.BOLD);
        Paragraph title = new Paragraph("Ариг гал ХК-ийн ахмадуудын судалгаа", titleFont);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        title.add(Chunk.NEWLINE);
        

        

        // Format the date string in Mongolian locale with right alignment
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", new Locale("mn"));
        String mongolianDate = dateFormat.format(new Date());
        Paragraph dateParagraph = new Paragraph(mongolianDate);
        dateParagraph.setAlignment(Element.ALIGN_RIGHT);
        document.add(dateParagraph);
//        dateParagraph.add(Chunk.NEWLINE);
//        document.add(Chunk.NEWLINE);
      

        // Add the table to the document
        PdfPTable table = new PdfPTable(6);
        // Set table alignment to center
        table.setHorizontalAlignment(Element.ALIGN_CENTER);
        dateParagraph.add(Chunk.NEWLINE);

        // Add table header
        Font tableHeaderFont = new Font(mongolianFont, 12, Font.BOLD);
        table.addCell(new PdfPCell(new Phrase("№", tableHeaderFont)));
        table.addCell(new PdfPCell(new Phrase("Компаниуд", tableHeaderFont)));
        table.addCell(new PdfPCell(new Phrase("Бүх ахмадууд", tableHeaderFont)));
        table.addCell(new PdfPCell(new Phrase("2012 өмнө тэтгэвэрт гарсан", tableHeaderFont)));
        table.addCell(new PdfPCell(new Phrase("2013 хойш тэтгэвэрт гарсан", tableHeaderFont)));
        table.addCell(new PdfPCell(new Phrase("Одоо ажиллаж байгаа ахмад", tableHeaderFont)));
        dateParagraph.add(Chunk.NEWLINE);

        // Add table data using a loop (assuming you want to loop from 1 to 100)
 // Assuming you want to start counting from 1

    // Fetch data for the current company from the database
 

    // Replace the following lines with your actual data retrieval logic based on each company
    int i = 0;
while (i < 7) {
    // Fetch data for the current company from the database
        
        String deputyNumber = String.valueOf(i + 1);
    String companyName = companyComboBox.getItemAt(i);
    
    // Retrieve data for the current company

    String ahmadData = "";
    String label15Data = "";
    String label17Data = "";
    String label19Data = "";

    // Customize data retrieval based on the selected company
    if ("Кашмер Холдинг".equals(companyName)) {
        // Data retrieval logic for "Кашмер Холдинг"
        ahmadData = getAhmadDataForCompany1();
        label15Data = getLabel15DataForCompany1();
        label17Data = getLabel17DataForCompany1();
        label19Data = getLabel19DataForCompany1();
    } else if ("Мон-Мяндас".equals(companyName)) {
        // Data retrieval logic for "Мон-Мяндас"
        ahmadData = getAhmadDataForCompany2();
        label15Data = getLabel15DataForCompany2();
        label17Data = getLabel17DataForCompany2();
        label19Data = getLabel19DataForCompany2();
    } else if ("Хавт шонхор".equals(companyName)) {
        // Data retrieval logic for "Хавт шонхор"
        ahmadData = getAhmadDataForCompany3();
        label15Data = getLabel15DataForCompany3();
        label17Data = getLabel17DataForCompany3();
        label19Data = getLabel19DataForCompany3();
    } else if ("Эвсэг-Од".equals(companyName)) {
        // Data retrieval logic for "Эвсэг-Од"
        ahmadData = getAhmadDataForCompany4();
        label15Data = getLabel15DataForCompany4();
        label17Data = getLabel17DataForCompany4();
        label19Data = getLabel19DataForCompany4();
    } else if ("Говийн мяндас".equals(companyName)) {
        // Data retrieval logic for "Говийн мяндас"
        ahmadData = getAhmadDataForCompany5();
        label15Data = getLabel15DataForCompany5();
        label17Data = getLabel17DataForCompany5();
        label19Data = getLabel19DataForCompany5();
    } else if ("Тансаг ширээс".equals(companyName)) {
        // Data retrieval logic for "Тансаг ширээс"
        ahmadData = getAhmadDataForCompany6();
        label15Data = getLabel15DataForCompany6();
        label17Data = getLabel17DataForCompany6();
        label19Data = getLabel19DataForCompany6();
    } else if ("Эвсэг ХХК".equals(companyName)) {
        // Data retrieval logic for "Эвсэг ХХК"
        ahmadData = getAhmadDataForCompany7();
        label15Data = getLabel15DataForCompany7();
        label17Data = getLabel17DataForCompany7();
        label19Data = getLabel19DataForCompany7();
    }
    // Add more conditions for other companies...

    
    Font tableCellFont = new Font(mongolianFont, 10);
            table.addCell(new PdfPCell(new Phrase(deputyNumber, tableCellFont)));
            table.addCell(new PdfPCell(new Phrase(companyName, tableCellFont)));
            table.addCell(new PdfPCell(new Phrase(ahmadData, tableCellFont)));
            table.addCell(new PdfPCell(new Phrase(label15Data, tableCellFont)));
            table.addCell(new PdfPCell(new Phrase(label17Data, tableCellFont)));
            table.addCell(new PdfPCell(new Phrase(label19Data, tableCellFont)));

    i++;
}





        // Add a row for "niit"
        table.addCell("");
        table.addCell(new PdfPCell(new Phrase("Нийт", tableHeaderFont)));
        

        table.addCell(jLabel32.getText()); // Add data for the All Ajilchid column (Replace with actual data)
        table.addCell(arvan_hoyr8.getText()); // Add data for the 2012 column (Replace with actual data)
        table.addCell(arvan_gurav8.getText()); // Add data for the 2013 column (Replace with actual data)
        table.addCell(odoo_ajillaj8.getText()); // Add data for the Odoo column (Replace with actual data)

        document.add(table);

        // Create a list and add items to it
        Font listFont = new Font(mongolianFont, 10);
Paragraph listParagraph = new Paragraph();
listParagraph.setFont(listFont);

listParagraph.add(new Chunk("           Нэгтгэсэн: КХ ХХК ХНА                          /...................../      Б.Баасандорж"));
listParagraph.add(Chunk.NEWLINE); // Add a newline for the next item
listParagraph.add(new Chunk("           Танилцсан: Амьдийн асуудал хариуцсан ажилтан    /...................../      Ж.Баасанжав"));

document.add(listParagraph);
document.close();



 
        JOptionPane.showMessageDialog(null, "Хадаглагдав.");
        openPDFFile("C:\\Users\\NewTech\\Downloads\\ahmaddlast-main\\ahmaddlast-main\\Ahmadd\\hevleh.pdf");
    } catch (DocumentException | IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, e.getMessage());
    }


    
    }//GEN-LAST:event_generateButtonActionPerformed

    private void archiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseClicked
        // TODO add your handling code here:
        nuur.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\house (3).png"));
        baiguullaguud.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\enterprise.png"));
        burtgell.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\content-creator.png"));
        archive.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\documents (2).png"));

        
        java.awt.Font boldFont = archive.getFont().deriveFont(Font.BOLD);
        archive.setFont(boldFont);
        baiguullaguud.setFont(new java.awt.Font("Segoe UI",Font.DEFAULTSIZE,16));
        nuur.setFont(new java.awt.Font("Segoe UI",Font.DEFAULTSIZE,16));
        burtgell.setFont(new java.awt.Font("Segoe UI",Font.DEFAULTSIZE,16));
        Color c=new Color(0,0,128);
        Color v=new Color(187,187,187);
        
        burtgell.setForeground(v);
        nuur.setForeground(v);
        baiguullaguud.setForeground(v);
        archive.setForeground(c);
        
        
                data.setVisible(false);
        nuur69.setVisible(false);
        Main.setVisible(false);
        archive1.setVisible(true);
        burtgel.setVisible(false);
        
        
        
        
        
        String sql="SELECT * FROM ahmad.archive;";
        try{
        Connection con;
          Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad", "root", "Tuugii0713");
        PreparedStatement pst =con.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        DefaultTableModel model=(DefaultTableModel)table69.getModel();
        if(rs.next()){
        model.addRow(new String[]{rs.getString(1),rs.getString(4),rs.getString(2)+rs.getString(3),rs.getString(5),rs.getString(6)});
        }
        
        
        }catch(Exception e1){
        
        }
    }//GEN-LAST:event_archiveMouseClicked

    private void qqww1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qqww1FocusGained
        if(qqww1.getText().equals("Нэрээр хайлт хийнэ.")){
        qqww1.setText(null);
        qqww1.requestFocus();
        remove(qqww1);
        }
    }//GEN-LAST:event_qqww1FocusGained

    private void qqww1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qqww1FocusLost
        if(qqww1.getText().length()==0){
        addPlaceholderSty(qqww1);
        qqww1.setText("Нэрээр хайлт хийнэ.");
        }
    }//GEN-LAST:event_qqww1FocusLost

    private void qqww1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qqww1ActionPerformed
        String searchQuery = qqww1.getText().trim();
        if (searchQuery.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Хайлт хоосон байж болохгүй.");
        } else {
            try {
                performSearch(searchQuery);
            } catch (SQLException ex) {
                Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_qqww1ActionPerformed

    private void table69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table69MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table69MouseClicked
    private void performSearch(String searchQuery) throws SQLException {
        
        DefaultTableModel searchResultModel = (DefaultTableModel) table.getModel();
        searchResultModel.setRowCount(0);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad", "root", "Tuugii0713"); // e1.printStackTrace();
        if(searchQuery==null){
         String query = "SELECT * FROM ahmad.sudalgaa where company='Кашмер холдинг';";
            try (Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    int bcodeField = resultSet.getInt("a_code");
                    String UovogField = resultSet.getString("company");
                    String ovogField = resultSet.getString("ovog");
                    String nerField = resultSet.getString("ner");
                    String rd = resultSet.getString("arvan_hoyr");
                    
                    String utas = resultSet.getString("arvan_gurav");
                    
                    String ger = resultSet.getString("odoo_ajillaj");
                    
                   
                    
                    searchResultModel.addRow(new Object[]{bcodeField, UovogField,ovogField+nerField, rd, utas,ger});
                    
                }
            }
        }
        if(aa=="k_holding"){
            if (searchQuery.equalsIgnoreCase("all")) {
            // Fetch all students
            String query = "SELECT * FROM ahmad.sudalgaa where company='Кашмер холдинг';";
            try (Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    int bcodeField = resultSet.getInt("a_code");
                    String UovogField = resultSet.getString("company");
                    String ovogField = resultSet.getString("ovog");
                    String nerField = resultSet.getString("ner");
                    String rd = resultSet.getString("arvan_hoyr");
                    
                    String utas = resultSet.getString("arvan_gurav");
                    
                    String ger = resultSet.getString("odoo_ajillaj");
                    
                   
                    searchResultModel.addRow(new Object[]{bcodeField, UovogField,ovogField+nerField, rd, utas,ger});
                }
            }
        } else {
            // Perform a regular search
            String query = "SELECT * FROM ahmad.sudalgaa where company='Кашмер холдинг'and ner like ? ;";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                String wildcardSearchQuery = "%" + searchQuery + "%";
                preparedStatement.setString(1, wildcardSearchQuery);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        int bcodeField = resultSet.getInt("a_code");
                        String UovogField = resultSet.getString("company");
                        String ovogField = resultSet.getString("ovog");
                        String nerField = resultSet.getString("ner");
                        String rd = resultSet.getString("arvan_hoyr");                       
                        String utas = resultSet.getString("arvan_gurav");                       
                        String ger = resultSet.getString("odoo_ajillaj");
                        searchResultModel.addRow(new Object[]{bcodeField, UovogField, ovogField+nerField, rd, utas,ger});
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }catch(SQLException e){
                    e.printStackTrace();
                }finally {
    // Close resources in the reverse order of their creation
    try {
        if (connection != null) {
            connection.close();
        }
        // Close other resources (statements, result sets, etc.)
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
                                }
        }
    }
        
                if(aa=="m_myndas"){
            if (searchQuery.equalsIgnoreCase("all")) {
            // Fetch all students
            String query = "SELECT * FROM ahmad.sudalgaa where company='МонМяндас';";
            try (Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    int bcodeField = resultSet.getInt("a_code");
                    String UovogField = resultSet.getString("company");
                    String ovogField = resultSet.getString("ovog");
                    String nerField = resultSet.getString("ner");
                    String rd = resultSet.getString("arvan_hoyr");
                    
                    String utas = resultSet.getString("arvan_gurav");
                    
                    String ger = resultSet.getString("odoo_ajillaj");
                    
                   
                    searchResultModel.addRow(new Object[]{bcodeField, UovogField,ovogField+nerField, rd, utas,ger});
                }
            }
        } else {
            // Perform a regular search
            String query = "SELECT * FROM ahmad.sudalgaa where company='МонМяндас'and ner like ? ;";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                String wildcardSearchQuery = "%" + searchQuery + "%";
                preparedStatement.setString(1, wildcardSearchQuery);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        int bcodeField = resultSet.getInt("a_code");
                        String UovogField = resultSet.getString("company");
                        String ovogField = resultSet.getString("ovog");
                        String nerField = resultSet.getString("ner");
                        String rd = resultSet.getString("arvan_hoyr");                       
                        String utas = resultSet.getString("arvan_gurav");                       
                        String ger = resultSet.getString("odoo_ajillaj");
                        searchResultModel.addRow(new Object[]{bcodeField, UovogField, ovogField+nerField, rd, utas,ger});
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }catch(SQLException e){
                    e.printStackTrace();
                }
        }
    }
        
        
                
               if(aa=="h_shonhor"){
            if (searchQuery.equalsIgnoreCase("all")) {
            // Fetch all students
            String query = "SELECT * FROM ahmad.sudalgaa where company='Хавт Шонхор';";
            try (Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    int bcodeField = resultSet.getInt("a_code");
                    String UovogField = resultSet.getString("company");
                    String ovogField = resultSet.getString("ovog");
                    String nerField = resultSet.getString("ner");
                    String rd = resultSet.getString("arvan_hoyr");
                    
                    String utas = resultSet.getString("arvan_gurav");
                    
                    String ger = resultSet.getString("odoo_ajillaj");
                    
                   
                    searchResultModel.addRow(new Object[]{bcodeField, UovogField,ovogField+nerField, rd, utas,ger});
                }
            }
        } else {
            // Perform a regular search
            String query = "SELECT * FROM ahmad.sudalgaa where company='Кашмер холдинг'and ner like ? ;";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                String wildcardSearchQuery = "%" + searchQuery + "%";
                preparedStatement.setString(1, wildcardSearchQuery);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        int bcodeField = resultSet.getInt("a_code");
                        String UovogField = resultSet.getString("company");
                        String ovogField = resultSet.getString("ovog");
                        String nerField = resultSet.getString("ner");
                        String rd = resultSet.getString("arvan_hoyr");                       
                        String utas = resultSet.getString("arvan_gurav");                       
                        String ger = resultSet.getString("odoo_ajillaj");
                        searchResultModel.addRow(new Object[]{bcodeField, UovogField, ovogField+nerField, rd, utas,ger});
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }catch(SQLException e){
                    e.printStackTrace();
                }
        }
    }         
                
                
        
              if(aa=="e_od"){
            if (searchQuery.equalsIgnoreCase("all")) {
            // Fetch all students
            String query = "SELECT * FROM ahmad.sudalgaa where company='Эвсэг Од-ХХК';";
            try (Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    int bcodeField = resultSet.getInt("a_code");
                    String UovogField = resultSet.getString("company");
                    String ovogField = resultSet.getString("ovog");
                    String nerField = resultSet.getString("ner");
                    String rd = resultSet.getString("arvan_hoyr");
                    
                    String utas = resultSet.getString("arvan_gurav");
                    
                    String ger = resultSet.getString("odoo_ajillaj");
                    
                   
                    searchResultModel.addRow(new Object[]{bcodeField, UovogField,ovogField+nerField, rd, utas,ger});
                }
            }
        } else {
            // Perform a regular search
            String query = "SELECT * FROM ahmad.sudalgaa where company='Кашмер холдинг'and ner like ? ;";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                String wildcardSearchQuery = "%" + searchQuery + "%";
                preparedStatement.setString(1, wildcardSearchQuery);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        int bcodeField = resultSet.getInt("a_code");
                        String UovogField = resultSet.getString("company");
                        String ovogField = resultSet.getString("ovog");
                        String nerField = resultSet.getString("ner");
                        String rd = resultSet.getString("arvan_hoyr");                       
                        String utas = resultSet.getString("arvan_gurav");                       
                        String ger = resultSet.getString("odoo_ajillaj");
                        searchResultModel.addRow(new Object[]{bcodeField, UovogField, ovogField+nerField, rd, utas,ger});
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }catch(SQLException e){
                    e.printStackTrace();
                }
        }
    }         
               
               
               
               if(aa=="g_myndas"){
            if (searchQuery.equalsIgnoreCase("all")) {
            // Fetch all students
            String query = "SELECT * FROM ahmad.sudalgaa where company='Говийн мяндас';";
            try (Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    int bcodeField = resultSet.getInt("a_code");
                    String UovogField = resultSet.getString("company");
                    String ovogField = resultSet.getString("ovog");
                    String nerField = resultSet.getString("ner");
                    String rd = resultSet.getString("arvan_hoyr");
                    
                    String utas = resultSet.getString("arvan_gurav");
                    
                    String ger = resultSet.getString("odoo_ajillaj");
                    
                   
                    searchResultModel.addRow(new Object[]{bcodeField, UovogField,ovogField+nerField, rd, utas,ger});
                }
            }
        } else {
            // Perform a regular search
            String query = "SELECT * FROM ahmad.sudalgaa where company='Кашмер холдинг'and ner like ? ;";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                String wildcardSearchQuery = "%" + searchQuery + "%";
                preparedStatement.setString(1, wildcardSearchQuery);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        int bcodeField = resultSet.getInt("a_code");
                        String UovogField = resultSet.getString("company");
                        String ovogField = resultSet.getString("ovog");
                        String nerField = resultSet.getString("ner");
                        String rd = resultSet.getString("arvan_hoyr");                       
                        String utas = resultSet.getString("arvan_gurav");                       
                        String ger = resultSet.getString("odoo_ajillaj");
                        searchResultModel.addRow(new Object[]{bcodeField, UovogField, ovogField+nerField, rd, utas,ger});
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }catch(SQLException e){
                    e.printStackTrace();
                }
        }
    }        
             
               
               
               
               
                       if(aa=="t_shirees"){
            if (searchQuery.equalsIgnoreCase("all")) {
            // Fetch all students
            String query = "SELECT * FROM ahmad.sudalgaa where company='Тансаг Ширээс ХХК';";
            try (Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    int bcodeField = resultSet.getInt("a_code");
                    String UovogField = resultSet.getString("company");
                    String ovogField = resultSet.getString("ovog");
                    String nerField = resultSet.getString("ner");
                    String rd = resultSet.getString("arvan_hoyr");
                    
                    String utas = resultSet.getString("arvan_gurav");
                    
                    String ger = resultSet.getString("odoo_ajillaj");
                    
                   
                    searchResultModel.addRow(new Object[]{bcodeField, UovogField,ovogField+nerField, rd, utas,ger});
                }
            }
        } else {
            // Perform a regular search
            String query = "SELECT * FROM ahmad.sudalgaa where company='Кашмер холдинг'and ner like ? ;";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                String wildcardSearchQuery = "%" + searchQuery + "%";
                preparedStatement.setString(1, wildcardSearchQuery);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        int bcodeField = resultSet.getInt("a_code");
                        String UovogField = resultSet.getString("company");
                        String ovogField = resultSet.getString("ovog");
                        String nerField = resultSet.getString("ner");
                        String rd = resultSet.getString("arvan_hoyr");                       
                        String utas = resultSet.getString("arvan_gurav");                       
                        String ger = resultSet.getString("odoo_ajillaj");
                        searchResultModel.addRow(new Object[]{bcodeField, UovogField, ovogField+nerField, rd, utas,ger});
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }catch(SQLException e){
                    e.printStackTrace();
                }
        }
    }
                       
                       
                       
            if(aa=="evseg"){
            if (searchQuery.equalsIgnoreCase("all")) {
            // Fetch all students
            String query = "SELECT * FROM ahmad.sudalgaa where company='Эвсэг Од-ХХК';";
            try (Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    int bcodeField = resultSet.getInt("a_code");
                    String UovogField = resultSet.getString("company");
                    String ovogField = resultSet.getString("ovog");
                    String nerField = resultSet.getString("ner");
                    String rd = resultSet.getString("arvan_hoyr");
                    
                    String utas = resultSet.getString("arvan_gurav");
                    
                    String ger = resultSet.getString("odoo_ajillaj");
                    
                   
                    searchResultModel.addRow(new Object[]{bcodeField, UovogField,ovogField+nerField, rd, utas,ger});
                }
            }
        } else {
            // Perform a regular search
            String query = "SELECT * FROM ahmad.sudalgaa where company='Кашмер холдинг'and ner like ? ;";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                String wildcardSearchQuery = "%" + searchQuery + "%";
                preparedStatement.setString(1, wildcardSearchQuery);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        int bcodeField = resultSet.getInt("a_code");
                        String UovogField = resultSet.getString("company");
                        String ovogField = resultSet.getString("ovog");
                        String nerField = resultSet.getString("ner");
                        String rd = resultSet.getString("arvan_hoyr");                       
                        String utas = resultSet.getString("arvan_gurav");                       
                        String ger = resultSet.getString("odoo_ajillaj");
                        searchResultModel.addRow(new Object[]{bcodeField, UovogField, ovogField+nerField, rd, utas,ger});
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }catch(SQLException e){
                    e.printStackTrace();
                }
        }
    }
        
    }
     private void showChartButtonActionPerformed(ActionEvent evt) {
        createAndShowChart();
    }

private void createAndShowChart() {
        String query = "SELECT t_garsan_on, COUNT(*) FROM medeelel GROUP BY t_garsan_on";

        try (java.sql.Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             java.sql.Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            JDBCCategoryDataset dataset = new JDBCCategoryDataset(connection, query);
            dataset.executeQuery(query);

            JFreeChart chart = ChartFactory.createLineChart(
                    "Ахмадын судалгааны график",
                    "Он",
                    "Нийт ахмадийн тоо",
                    dataset,
                    PlotOrientation.VERTICAL,
                    false,
                    true,
                    true
            );

            LineAndShapeRenderer renderer = new LineAndShapeRenderer();
            chart.getCategoryPlot().setRenderer(renderer);

            ChartPanel chartPanel = new ChartPanel(chart);
            panel1000.removeAll();
            panel1000.add(chartPanel, BorderLayout.CENTER);
            panel1000.revalidate();
            panel1000.repaint();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
        ImageIcon img=new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\cashmere-holding.jpg");
        Image img1=img.getImage();
        Image s = img1.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
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
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        img=new ImageIcon(s);
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new List().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        });
    }
    
    private void setIcon() {
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Arig-Gal_logo1.png")));
    }

    private void updateStatistics() {
        Object selectedCompanyItem = companyComboBox.getSelectedItem();

        if (selectedCompanyItem != null) {
            String selectedCompanyText = selectedCompanyItem.toString();
            String selectedCompany = selectedCompanyText.split("\\(")[0].trim();

            try (java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad", "root", "Tuugii0713");
                 PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM sudalgaa WHERE company = ?")) {

                preparedStatement.setString(1, selectedCompany);

                try (ResultSet rs = preparedStatement.executeQuery()) {
                    if (rs.next()) {
                        // Assuming ahmad1 is a JTextComponent where you want to display the count
                        ahmad80.setText(rs.getString(1));
                        
                    }

                    // Update other statistics as needed
                }
            } catch (SQLException ex) {
                ex.printStackTrace(); // Log or handle the exception more appropriately
            }
            try (java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad", "root", "Tuugii0713");
                 PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM sudalgaa WHERE company = ? AND arvan_hoyr = 'Тийм'")) {

                preparedStatement.setString(1, selectedCompany);

                try (ResultSet rs = preparedStatement.executeQuery()) {
                    if (rs.next()) {
                        // Assuming ahmad1 is a JTextComponent where you want to display the count
                        jLabel39.setText(rs.getString(1));
                        
                    }

                    // Update other statistics as needed
                }
            } catch (SQLException ex) {
                ex.printStackTrace(); // Log or handle the exception more appropriately
            }
            try (java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad", "root", "Tuugii0713");
                 PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM sudalgaa WHERE company = ? AND arvan_gurav = 'Тийм'")) {

                preparedStatement.setString(1, selectedCompany);

                try (ResultSet rs = preparedStatement.executeQuery()) {
                    if (rs.next()) {
                        // Assuming ahmad1 is a JTextComponent where you want to display the count
                        jLabel42.setText(rs.getString(1));
                        
                    }

                    // Update other statistics as needed
                }
            } catch (SQLException ex) {
                ex.printStackTrace(); // Log or handle the exception more appropriately
            }
            try (java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad", "root", "Tuugii0713");
                 PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM sudalgaa WHERE company = ? AND odoo_ajillaj = 'Тийм'")) {

                preparedStatement.setString(1, selectedCompany);

                try (ResultSet rs = preparedStatement.executeQuery()) {
                    if (rs.next()) {
                        // Assuming ahmad1 is a JTextComponent where you want to display the count
                        jLabel45.setText(rs.getString(1));
                        
                    }

                    // Update other statistics as needed
                }
            } catch (SQLException ex) {
                ex.printStackTrace(); // Log or handle the exception more appropriately
            }
        }
    
    }
    private void openPDFFile(String filePath) {
    try {
        File file = new File(filePath);
        if (file.exists()) {
            Desktop.getDesktop().open(file);
        } else {
            System.out.println("File not found: " + filePath);
        }
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}
 
        private String getDeputyNumberForCompany(String companyName) {
    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad", "root", "Tuugii0713");
         PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM sudalgaa a_code")) {

        preparedStatement.setString(1, companyName);

        try (ResultSet rs = preparedStatement.executeQuery()) {
            if (rs.next()) {
                return rs.getString("a_code");
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace(); // Log or handle the exception more appropriately
    }
    return "";
}
    private String getAhmadDataForCompany1() {
    return getCountForCompany("Кашмер Холдинг");
}

private String getLabel15DataForCompany1() {
    return getCountForCompanyWithCondition("Кашмер Холдинг", "arvan_hoyr = 'Тийм'");
}

private String getLabel17DataForCompany1() {
    return getCountForCompanyWithCondition("Кашмер Холдинг", "arvan_gurav = 'Тийм'");
}

private String getLabel19DataForCompany1() {
    return getCountForCompanyWithCondition("Кашмер Холдинг", "odoo_ajillaj = 'Тийм'");
}

// Implement similar methods for other companies

private String getCountForCompany(String companyName) {
    return executeCountQuery("SELECT COUNT(*) FROM sudalgaa WHERE company = ?", companyName);
}

private String getCountForCompanyWithCondition(String companyName, String condition) {
    String sqlQuery = "SELECT COUNT(*) FROM sudalgaa WHERE company = ? AND " + condition;
    return executeCountQuery(sqlQuery, companyName);
}

private String executeCountQuery(String sqlQuery, String companyName) {
    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad", "root", "Tuugii0713");
         PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {

        preparedStatement.setString(1, companyName);

        try (ResultSet rs = preparedStatement.executeQuery()) {
            if (rs.next()) {
                return rs.getString(1);
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace(); // Log or handle the exception more appropriately
    }
    return "";
}
private String getAhmadDataForCompany2() {
    return getCountForCompany("МонМяндас");
}

private String getLabel15DataForCompany2() {
    return getCountForCompanyWithCondition("МонМяндас", "arvan_hoyr = 'Тийм'");
}

private String getLabel17DataForCompany2() {
    return getCountForCompanyWithCondition("МонМяндас", "arvan_gurav = 'Тийм'");
}

private String getLabel19DataForCompany2() {
    return getCountForCompanyWithCondition("МонМяндас", "odoo_ajillaj = 'Тийм'");
}
private String getAhmadDataForCompany3() {
    return getCountForCompany("Хавт шонхор");
}

private String getLabel15DataForCompany3() {
    return getCountForCompanyWithCondition("Хавт шонхор", "arvan_hoyr = 'Тийм'");
}

private String getLabel17DataForCompany3() {
    return getCountForCompanyWithCondition("Хавт шонхор", "arvan_gurav = 'Тийм'");
}

private String getLabel19DataForCompany3() {
    return getCountForCompanyWithCondition("Хавт шонхор", "odoo_ajillaj = 'Тийм'");
}
private String getAhmadDataForCompany4() {
    return getCountForCompany("Эвсэг-Од");
}

private String getLabel15DataForCompany4() {
    return getCountForCompanyWithCondition("Эвсэг-Од", "arvan_hoyr = 'Тийм'");
}

private String getLabel17DataForCompany4() {
    return getCountForCompanyWithCondition("Эвсэг-Од", "arvan_gurav = 'Тийм'");
}

private String getLabel19DataForCompany4() {
    return getCountForCompanyWithCondition("Эвсэг-Од", "odoo_ajillaj = 'Тийм'");
}
private String getAhmadDataForCompany5() {
    return getCountForCompany("Говийн мяндас");
}

private String getLabel15DataForCompany5() {
    return getCountForCompanyWithCondition("Говийн мяндас", "arvan_hoyr = 'Тийм'");
}

private String getLabel17DataForCompany5() {
    return getCountForCompanyWithCondition("Говийн мяндас", "arvan_gurav = 'Тийм'");
}

private String getLabel19DataForCompany5() {
    return getCountForCompanyWithCondition("Говийн мяндас", "odoo_ajillaj = 'Тийм'");
}
private String getAhmadDataForCompany6() {
    return getCountForCompany("Тансаг ширээс");
}

private String getLabel15DataForCompany6() {
    return getCountForCompanyWithCondition("Тансаг ширээс", "arvan_hoyr = 'Тийм'");
}

private String getLabel17DataForCompany6() {
    return getCountForCompanyWithCondition("Тансаг ширээс", "arvan_gurav = 'Тийм'");
}

private String getLabel19DataForCompany6() {
    return getCountForCompanyWithCondition("Тансаг ширээс", "odoo_ajillaj = 'Тийм'");
}
private String getAhmadDataForCompany7() {
    return getCountForCompany("Эвсэг ХХК");
}

private String getLabel15DataForCompany7() {
    return getCountForCompanyWithCondition("Эвсэг ХХК", "arvan_hoyr = 'Тийм'");
}

private String getLabel17DataForCompany7() {
    return getCountForCompanyWithCondition("Эвсэг ХХК", "arvan_gurav = 'Тийм'");
}

private String getLabel19DataForCompany7() {
    return getCountForCompanyWithCondition("Эвсэг ХХК", "odoo_ajillaj = 'Тийм'");
}

    private void generateReportButtonActionPerformed(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
//C:\\Users\\anna\\Documents\\NetBeansProjects\\JavaApplication1\\hevleh.pdf
private void populateCompanyComboBox() throws IOException, SQLException {
    try (java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad", "root", " ")) {
        try (java.sql.Statement st = con.createStatement()) {
            try (ResultSet rs = st.executeQuery("SELECT company, COUNT(*) AS count FROM sudalgaa GROUP BY company")) {
                while (rs.next()) {
                    String companyName = rs.getString("company");
                    int count = rs.getInt("count");
                    String displayText = companyName + " (" + count + ")";
                    companyComboBox.addItem(displayText);
                }
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        // Close resources (in reverse order of creation)
       
    }
}




    
        private Color getBackground(Color white) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    class RoundJPanel extends JPanel {
    private Shape shape;

    public RoundJPanel(int width, int height) {
        setPreferredSize(new Dimension(width, height));
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 25, 25);
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getBackground());
        g2d.fill(shape);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor((Color.WHITE));
        g2d.draw(shape);
    }
 
    }
        private void updateHistoryPanel() {
        // Clear existing labels
        activity.removeAll();

        // Add labels for each entry in the registration history
        for (String entry : registrationHistory) {
            JLabel label = new JLabel(entry);
            activity.add(label);
        }

        // Update the UI
        activity.revalidate();
        activity.repaint();
    }
        
        private void acti(){
                                Connection con=null;
				PreparedStatement pst=null;
                                Statement st=null;
                                ResultSet rs=null;
                      try{          
                                    String query=("SELECT * FROM ahmad.medeelel order by a_code desc limit 1;");
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
					st=con.createStatement();
                                        rs=st.executeQuery(query);
                                        while(rs.next()){
                                        name1.setText(rs.getString(3));
                                        a_code=rs.getInt(1);
                                        compa1.setText(rs.getString(4));
                                        }
                                        int a_code1=a_code-1;
                                        int a_code2=a_code1-1;
                                        int a_code3=a_code2-1;
                                        int a_code4=a_code3-1;
                                        int a_code5=a_code4-1;
                                        String query1=("SELECT * FROM ahmad.medeelel where a_code='"+a_code1+"' order by a_code desc limit 1 ;");
                                        rs=st.executeQuery(query1);
                                        while(rs.next()){
                                        name2.setText(rs.getString(3));
                                        compa2.setText(rs.getString(4));
                                        
                                        }
                                        
                                         String query2=("SELECT * FROM ahmad.medeelel where a_code='"+a_code2+"' order by a_code desc limit 1 ;");
                                        rs=st.executeQuery(query2);
                                        while(rs.next()){
                                        name3.setText(rs.getString(3));
                                        compa3.setText(rs.getString(4));
                                        }
                                        
                                        
                                         String query3=("SELECT * FROM ahmad.medeelel where a_code='"+a_code3+"' order by a_code desc limit 1 ;");
                                        rs=st.executeQuery(query3);
                                        while(rs.next()){
                                        name4.setText(rs.getString(3));
                                        compa4.setText(rs.getString(4));
                                        }
                                        
                                        
                                         String query4=("SELECT * FROM ahmad.medeelel where a_code='"+a_code4+"' order by a_code desc limit 1 ;");
                                        rs=st.executeQuery(query4);
                                        while(rs.next()){
                                        name5.setText(rs.getString(3));
                                         compa5.setText(rs.getString(4));
                                        }
                                        
                                        
                                         String query5=("SELECT * FROM ahmad.medeelel where a_code='"+a_code5+"' order by a_code desc limit 1 ;");
                                        rs=st.executeQuery(query5);
                                        while(rs.next()){
                                        name6.setText(rs.getString(3));
                                         compa6.setText(rs.getString(4));
                                        }
                                       
                                }catch(Exception e1){ 
                                e1.printStackTrace();
                                }
        
        }
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Info;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel act1;
    private javax.swing.JPanel act2;
    private javax.swing.JPanel act3;
    private javax.swing.JPanel act4;
    private javax.swing.JPanel act5;
    private javax.swing.JPanel act6;
    private javax.swing.JPanel activity;
    private javax.swing.JLabel ahmad1;
    private javax.swing.JLabel ahmad2;
    private javax.swing.JLabel ahmad3;
    private javax.swing.JLabel ahmad4;
    private javax.swing.JLabel ahmad5;
    private javax.swing.JLabel ahmad6;
    private javax.swing.JLabel ahmad7;
    private javax.swing.JLabel ahmad80;
    private javax.swing.JLabel archive;
    private javax.swing.JPanel archive1;
    private javax.swing.JLabel arvan_gurav1;
    private javax.swing.JLabel arvan_gurav2;
    private javax.swing.JLabel arvan_gurav3;
    private javax.swing.JLabel arvan_gurav4;
    private javax.swing.JLabel arvan_gurav5;
    private javax.swing.JLabel arvan_gurav6;
    private javax.swing.JLabel arvan_gurav7;
    private javax.swing.JLabel arvan_gurav8;
    private javax.swing.JLabel arvan_hoyr1;
    private javax.swing.JLabel arvan_hoyr2;
    private javax.swing.JLabel arvan_hoyr3;
    private javax.swing.JLabel arvan_hoyr4;
    private javax.swing.JLabel arvan_hoyr5;
    private javax.swing.JLabel arvan_hoyr6;
    private javax.swing.JLabel arvan_hoyr7;
    private javax.swing.JLabel arvan_hoyr8;
    private javax.swing.JLabel b;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel baiguullaguud;
    private javax.swing.JPanel burtgel;
    private javax.swing.JLabel burtgell;
    private javax.swing.JComboBox<String> com;
    private javax.swing.JLabel compa1;
    private javax.swing.JLabel compa2;
    private javax.swing.JLabel compa3;
    private javax.swing.JLabel compa4;
    private javax.swing.JLabel compa5;
    private javax.swing.JLabel compa6;
    private javax.swing.JLabel company;
    private javax.swing.JComboBox<String> companyComboBox;
    private javax.swing.JPanel data;
    private javax.swing.JPanel e_od;
    private javax.swing.JTextField eba;
    private javax.swing.JCheckBox em;
    private javax.swing.JCheckBox er;
    private javax.swing.JPanel evseg;
    private javax.swing.JPanel g_myndas;
    private javax.swing.JButton generateButton;
    private javax.swing.JPanel h_shonhor;
    private javax.swing.JTextField hayg;
    private javax.swing.JLabel img;
    private javax.swing.JLabel img1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel k_holding;
    private javax.swing.JPanel m_myndas;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JButton nemeh;
    private javax.swing.JTextField ner;
    private javax.swing.JLabel nuur;
    private javax.swing.JPanel nuur69;
    private javax.swing.JLabel odoo_ajillaj1;
    private javax.swing.JLabel odoo_ajillaj2;
    private javax.swing.JLabel odoo_ajillaj3;
    private javax.swing.JLabel odoo_ajillaj4;
    private javax.swing.JLabel odoo_ajillaj5;
    private javax.swing.JLabel odoo_ajillaj6;
    private javax.swing.JLabel odoo_ajillaj7;
    private javax.swing.JLabel odoo_ajillaj8;
    private javax.swing.JTextField ovog;
    private javax.swing.JPanel panel1000;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField qqww;
    private javax.swing.JTextField qqww1;
    private javax.swing.JTextField register;
    private javax.swing.JPanel t_shirees;
    private javax.swing.JTable table;
    private javax.swing.JTable table69;
    private javax.swing.JPanel zuraas;
    private javax.swing.JPanel zuraas1;
    private javax.swing.JPanel zuraas2;
    private javax.swing.JPanel zuraas3;
    private javax.swing.JPanel zuraas4;
    private javax.swing.JPanel zuraas5;
    private javax.swing.JPanel zuraas6;
    private javax.swing.JPanel zuraas7;
    // End of variables declaration//GEN-END:variables
}
