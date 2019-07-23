package com.we.security.dao;

import com.we.security.entity.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 管理员账号
 */
@Repository
public interface AdminDao {
    /**
     * 查询所有管理员
     * @return 返回管理员集合
     */
    List<Admin> selectAllAdmin();




    /**
     * 添加管理员账号
     * @param admin 添加的类型
     * @return 返回受影响行数
     */
    int addAdmin(Admin admin);





    /**
     * 删除管理员账号
     * @param id  要删除的id
     * @return 返回受影响行数
     */
    int deleteAdmin(long id);



    /**
     * 修改管理员账号
     * @param admin 修改的类型
     * @return 返回受影响行数
     */
    int updateAdmin(Admin admin);


    /**
     * 通过id查找管理员账号
     * @param id
     * @return  返回Admin类型
     */
    Admin selectAdminById(long id);

}
