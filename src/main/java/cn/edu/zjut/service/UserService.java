package cn.edu.zjut.service;

import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.exception.UserException;

public class UserService
{
    public boolean login(UserBean loginUser) throws Exception
    {
        if (loginUser.getAccount().equalsIgnoreCase("admin"))
        {
            throw new UserException("用户名不能为 admin");
        }
        if (loginUser.getPassword().toUpperCase().contains(" AND ") || loginUser.getPassword().toUpperCase().contains(" OR "))
        {
            throw new java.sql.SQLException("密码不能包括' and '或' or '");
        }
        return loginUser.getAccount().equals(loginUser.getPassword());
    }

    public boolean register(UserBean loginUser)
    {
        return !loginUser.getAccount().isEmpty() && loginUser.getAccount().equals(loginUser.getPassword()) && loginUser.getPassword().equals(loginUser.getRepassword());
    }
}