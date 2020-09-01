package management;

import java.sql.*;
import java.util.Vector;
 
import javax.swing.table.DefaultTableModel;
 
//DB ó��
public class MemberDAO {
 
    private static final String DRIVER
        = "com.mysql.cj.jdbc.Driver";
    private static final String URL
        = "jdbc:mysql://localhost:3306/project1?characterEncoding=UTF-8&&serverTimezone=UTC";
    
   
    private static final String USER = "root"; //DB ID
    private static final String PASS = "19801212"; //DB �н�����
    Member_List mList;
   
    public MemberDAO() {
   
    }
   	

	public MemberDAO(Member_List mList){
        this.mList = mList;
        System.out.println("DAO=>"+mList);
    }
   
    /**DB���� �޼ҵ�*/
    public Connection getConn(){
        Connection con = null;
       
        try {
            Class.forName(DRIVER); //1. ����̹� �ε�
            con = DriverManager.getConnection(URL,USER,PASS); //2. ����̹� ����
           
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return con;
    }
   
   
    /**�ѻ���� ȸ�� ������ ��� �޼ҵ�*/
    public MemberDTO getMemberDTO(String id){
       
        MemberDTO dto = new MemberDTO();
       
        Connection con = null;       //����
        PreparedStatement ps = null; //���
        ResultSet rs = null;         //���
       
        try {
           
            con = getConn();
            String sql = "select * from tb_member";
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
           
            rs = ps.executeQuery();
           
            if(rs.next()){
                dto.setId(rs.getString("id"));
                dto.setPwd(rs.getString("Pwd"));
                dto.setName(rs.getString("Name"));
                dto.setTel(rs.getString("tel"));
                dto.setAddr(rs.getString("addr"));
                dto.setBirth(rs.getString("birth"));
                dto.setJob(rs.getString("job"));
                dto.setGender(rs.getString("gender"));
                dto.setEmail(rs.getString("email"));
                dto.setIntro(rs.getString("intro"));
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }      
       
        return dto;    
    }
   
    /**�������Ʈ ���*/
    public Vector getMemberList(){
       
        Vector data = new Vector();  //Jtable�� ���� ���� �ִ� ��� 1. 2�����迭   2. Vector �� vector�߰�
       
           
        Connection con = null;       //����
        PreparedStatement ps = null; //���
        ResultSet rs = null;         //���
       
        try{
           
            con = getConn();
            String sql = "select * from tb_member order by name asc";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
           
            while(rs.next()){
                String id = rs.getString("id");
                String pwd = rs.getString("pwd");
                String name = rs.getString("name");
                String tel = rs.getString("tel");
                String addr = rs.getString("addr");
                String birth = rs.getString("birth");
                String gender = rs.getString("gender");
                String job = rs.getString("job");
                String email = rs.getString("email");
                String intro = rs.getString("intro");
               
                Vector row = new Vector();
                row.add(id);
                row.add(pwd);
                row.add(name);
                row.add(tel);
                row.add(addr);
                row.add(birth);
                row.add(job);
                row.add(gender);
                row.add(email);
                row.add(intro);
               
                data.add(row);             
            }//while
        }catch(Exception e){
            e.printStackTrace();
        }
        return data;
    }//getMemberList()
   
 
 
    /**ȸ�� ���*/
    public boolean insertMember(MemberDTO dto){
       
        boolean ok = false;
       
        Connection con = null;       //����
        PreparedStatement ps = null; //���
       
        try{
           
            con = getConn();
            String sql = "insert into tb_member(" +
                        "id,pwd,name,tel,addr,birth," +
                        "job,gender,email,intro) "+
                        "values(?,?,?,?,?,?,?,?,?,?)";
           
            ps = con.prepareStatement(sql);
            ps.setString(1, dto.getId());
            ps.setString(2, dto.getPwd());
            ps.setString(3, dto.getName());
            ps.setString(4, dto.getTel());
            ps.setString(5, dto.getAddr());
            ps.setString(6, dto.getBirth());
            ps.setString(7, dto.getJob());
            ps.setString(8, dto.getGender());
            ps.setString(9, dto.getEmail());
            ps.setString(10, dto.getIntro());          
            int r = ps.executeUpdate(); //���� -> ����
           
           
            if(r>0){
                System.out.println("���� ����");   
                ok=true;
            }else{
                System.out.println("���� ����");
            }
           
               
           
        }catch(Exception e){
            e.printStackTrace();
        }
       
        return ok;
    }//insertMmeber
   
   
    /**ȸ������ ����*/
    public boolean updateMember(MemberDTO vMem){
        System.out.println("dto="+vMem.toString());
        boolean ok = false;
        Connection con = null;
        PreparedStatement ps = null;
        try{
           
            con = getConn();           
            String sql = "update tb_member set name=?, tel=?, addr=?, birth=?, job=?, gender=?" +
                    ", email=?,intro=? "+ "where id=? and pwd=?";
           
            ps = con.prepareStatement(sql);
           
            ps.setString(1, vMem.getName());
            ps.setString(2, vMem.getTel());
            ps.setString(3, vMem.getAddr());
            ps.setString(4, vMem.getBirth());
            ps.setString(5, vMem.getJob());
            ps.setString(6, vMem.getGender());
            ps.setString(7, vMem.getEmail());
            ps.setString(8, vMem.getIntro());
            ps.setString(9, vMem.getId());
            ps.setString(10, vMem.getPwd());
           
            int r = ps.executeUpdate(); //���� -> ����
            // 1~n: ���� , 0 : ����
           
            if(r>0) ok = true; //������ �����Ǹ� ok���� true�� ����
           
        }catch(Exception e){
            e.printStackTrace();
        }
       
        return ok;
    }
   
    /**ȸ������ ���� :
     *tip: �ǹ������� ȸ�������� Delete ���� �ʰ� Ż�𿩺θ� üũ�Ѵ�.*/
    public boolean deleteMember(String id, String pwd){
       
        boolean ok =false ;
        Connection con =null;
        PreparedStatement ps =null;
       
        try {
            con = getConn();
            String sql = "delete from tb_member where id=? and pwd=?";
           
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, pwd);
            int r = ps.executeUpdate(); // ���� -> ����
           
            if (r>0) ok=true; //������;
           
        } catch (Exception e) {
            System.out.println(e + "-> �����߻�");
        }      
        return ok;
    }
   
   
    /**DB������ �ٽ� �ҷ�����*/   
    public void userSelectAll(DefaultTableModel model) {
       
       
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
       
        try {
            con = getConn();
            String sql = "select * from tb_member order by name asc";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
           
            // DefaultTableModel�� �ִ� ������ �����
            for (int i = 0; i < model.getRowCount();) {
                model.removeRow(0);
            }
 
            while (rs.next()) {
                Object data[] = { rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),
                       rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10)};
 
                model.addRow(data);                
            }
 
        } catch (SQLException e) {
            System.out.println(e + "=> userSelectAll fail");
        } finally{
           
            if(rs!=null)
                try {
                    rs.close();
                } catch (SQLException e2) {
                    e2.printStackTrace();
                }
            if(ps!=null)
                try {
                    ps.close();
                } catch (SQLException e1) {
                   e1.printStackTrace();
                }
            if(con!=null)
                try {
                    con.close();
                } catch (SQLException e) {
                   e.printStackTrace();
                }
        }
    }
}
