package com.we.security.dao;


import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Video {

    /**
     * 查询所有监控视频
     * @return 返回监控视频对象集合
     */
    List<Video> selectAllVideo();




    /**
     * 添加监控视频
     * @param video 添加的类型
     * @return 返回受影响行数
     */
    int addVideo(Video video);





    /**
     * 删除监控视频
     * @param id  要删除监控视频的id
     * @return 返回受影响行数
     */
    int deleteVideo(long id);



    /**
     * 修改监控视频
     * @param video 修改的类型
     * @return 返回受影响行数
     */
    int updateVideo(Video video);


    /**
     * 通过id查找监控视频
     * @param id
     * @return  返回Video类型
     */
    Video selectVideoById(long id);
}
