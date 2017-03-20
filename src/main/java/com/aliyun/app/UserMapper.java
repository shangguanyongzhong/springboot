package com.aliyun.app;

import com.aliyun.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by sg on 2017/3/15.
 */

public interface UserMapper {
    @Select("select * from student where sid = #{sid}")
    User findUserByName(@Param("sid")int sid);

}
