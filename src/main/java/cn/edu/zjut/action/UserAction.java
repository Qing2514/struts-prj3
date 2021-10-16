package cn.edu.zjut.action;

import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class UserAction extends ActionSupport
{
    private UserBean loginUser;
    private Integer count = 0;

    public UserAction()
    {
        System.out.println("创建了一个 UserAction 类对象。");
    }

    public Integer getCount()
    {
        return count;
    }

    public UserBean getLoginUser()
    {
        return loginUser;
    }

    public void setLoginUser(UserBean loginUser)
    {
        this.loginUser = loginUser;
    }

    private Map session;

    public String login() throws Exception
    {
        ActionContext ctx = ActionContext.getContext();
        session = (Map) ctx.getSession();
        UserService userServ = new UserService();
        try
        {
            if (userServ.login(loginUser))
            {
                session.put("user", loginUser.getAccount());
                return "success";
            }
            return "fail";
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    public String register()
    {
        UserService userServ = new UserService();
        if (userServ.register(loginUser))
        {
            return "registersuccess";
        }
        return "registerfail";
    }

    public void validateLogin()
    {
        String account = loginUser.getAccount();
        String pwd = loginUser.getPassword();
        if (account == null || account.equals(""))
        {
            this.addFieldError("loginUser.account", this.getText("login.account.null"));
        }
        if (pwd == null || pwd.equals(""))
        {
            this.addFieldError("loginUser.password", this.getText("login.password.null"));
        }
    }

    public void validateRegister()
    {
        String account = loginUser.getAccount();
        String pwd = loginUser.getPassword();
        if (account == null || account.equals(""))
        {
            this.addFieldError("loginUser.account", this.getText("login.account.null"));
        }
        if (pwd == null || pwd.equals(""))
        {
            this.addFieldError("loginUser.password", this.getText("login.password.null"));
        }
    }

}