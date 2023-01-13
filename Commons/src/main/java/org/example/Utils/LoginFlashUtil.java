package org.example.Utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Timer;
import java.util.TimerTask;

public class LoginFlashUtil {
    public static void flash(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        new Timer().schedule(new TimerTask() {
            //每隔30分钟刷新登录
            @Override
            public void run() {
                Object user_id = session.getAttribute("user_id");
                if (user_id != null){
                    //移除user_id
                    session.removeAttribute("user_id");
                }
            }
        },0,30*60*60*1000);
    }
}
