package com.we.security.dao;

import com.we.security.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    /**
     * 查询所有用户
     * @return 返回用户集合
     */
    List<User> selectAllUser();




    /**
     * 添加用户账号
     * @param user 添加的类型
     * @return 返回受影响行数
     */
    int addUser(User user);





    /**
     * 删除管理员账号
     * @param id  要删除的id
     * @return 返回受影响行数
     */
    int deleteUser(long id);



    /**
     * 修改管理员账号
     * @param user 修改的类型
     * @return 返回受影响行数
     */
    int updateUser(User user);


    /**
     * 通过id查找管理员账号
     * @param id
     * @return  返回Admin类型
     */
   User selectUserById(long id);

}
