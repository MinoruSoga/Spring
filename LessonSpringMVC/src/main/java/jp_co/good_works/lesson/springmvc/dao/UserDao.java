package jp_co.good_works.lesson.springmvc.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import jp_co.good_works.lesson.springmvc.form.LoginForm;
import jp_co.good_works.lesson.springmvc.logic.LoginInfo;

public class UserDao {

    public LoginInfo select(String userID, String password)throws SQLException{
        LoginForm loginForm = new LoginForm();
        LoginInfo loginInfo = null; //new LoginInfo();
        String url = "jdbc:mysql://localhost/login";
        String id = "root";
        String pass = "Minoru_2021";
        java.sql.Connection cnct = null;
        java.sql.Statement st = null;
        java.sql.ResultSet rs = null;
        java.sql.PreparedStatement pst = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            cnct = DriverManager.getConnection(url,id,pass);
            System.out.println("接続完了");
            //st = cnct.createStatement();
            String quary = "select * from user where USERID = ? and PASSWORD = ?";
            pst = cnct.prepareStatement(quary);
            pst.setString(1,userID);
            pst.setString(2,password);
            rs = pst.executeQuery();
            //rs = st.executeQuery("SELECT * FROM user WHERE USERID="+USERID);
            if(rs.next()){
                loginInfo = new LoginInfo();
                loginInfo.setUserID(userID);
                loginInfo.setUserID(password);
                //String user = rs.getString("USERID");
                //String password = rs.getString("password");
                //loginInfo.setUserID(password);
                //System.out.println("ID:"+user+"PW:"+password);
                //if(user.equals(USERID)&&password.equals(password)){
                //}else{
                }
            }catch(ClassNotFoundException e){
                //TODO自動化されたcatchブロック
                e.printStackTrace();
                System.out.println("クラスが見つかりません");
            }catch(SQLException e){
                //TODO自動生成されたcatchブロック
                e.printStackTrace();
                System.out.println("接続失敗");
            }finally{
                if(cnct!=null)cnct.close();
                if(rs!=null)rs.close();
                if(pst!=null)pst.close();
                if(st!=null)st.close();
            }
            return loginInfo;

    }
}
