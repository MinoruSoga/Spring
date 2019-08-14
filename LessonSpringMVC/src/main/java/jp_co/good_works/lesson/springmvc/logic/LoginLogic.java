package jp_co.good_works.lesson.springmvc.logic;

import java.sql.SQLException;
import javax.security.auth.login.LoginException;

import jp_co.good_works.lesson.springmvc.form.LoginForm;

public class LoginLogic {

    // UserDao ud = new UserDao();
    private LoginInfo loginInfo = null;
    LoginForm loginForm = new LoginForm();

    String x = "guest";
    String y = "guest";

    // ログイン実行
    public LoginInfo login(String userID, String password)throws LoginException, SQLException{
        // loginInfo = ud.select(userID, password);
        if((userID.equals(x))&&(password.equals(y))){
            loginInfo = new LoginInfo();
            loginInfo.setUserID(userID);
            loginInfo.setPassword(password);
        }else{
            throw new LoginException("ユーザIDまたはパスワードが違います");
        }
        return LoginInfo;
    }

    public boolean isLive(){
        if(loginInfo != null){
            return true;
        }else{
            return false;
        }
    }
}
