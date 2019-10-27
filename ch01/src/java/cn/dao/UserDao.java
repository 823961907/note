/*
 *
 */

package cn.dao;

import cn.bean.BaseUser;

import java.util.List;

public interface UserDao{

    public int registUser(BaseUser baseUser);

    public List<BaseUser> getAllUser();
    public BaseUser getUserByUserName(String userName);

}
