package it.ariadne.dao;

import java.util.List;

import it.ariadne.model.UserInfo;

public interface UserInfoDAO {
    
    public UserInfo findUserInfo(String userName);
     
    // [USER,AMIN,..]
    public List<String> getUserRoles(String userName);
     
}
