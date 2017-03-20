package test;

import com.aliyun.app.Application;
import com.aliyun.app.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sg on 2017/3/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class Test {
    @Autowired
    private UserMapper userMapper;
    @org.junit.Test
    public void test(){

        System.out.println("user="+userMapper.findUserByName(1));
    }

}
