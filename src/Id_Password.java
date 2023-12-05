import java.util.HashMap;

public class Id_Password {
    HashMap<String,String> loginInfo =new HashMap<String,String>();
    HashMap<String,String> StaffLogin =new HashMap<String,String>();
    Id_Password()
    {
        loginInfo.put("tamim","123");
        StaffLogin.put("staff","135");
    }
    protected HashMap getLogInfo()
    {
        return loginInfo;
    }
    protected HashMap getLogInfoStaff()
    {
        return StaffLogin;
    }

}
