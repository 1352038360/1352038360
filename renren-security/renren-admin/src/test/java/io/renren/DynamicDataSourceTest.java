package io.renren;


import io.renren.modules.sys.dao.ZuserDao;
import io.renren.modules.sys.entity.SysUserEntity;
import io.renren.service.DataSourceTestService;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DynamicDataSourceTest {
    @Autowired
    private DataSourceTestService dataSourceTestService;
    @Autowired
    private ZuserDao zuserDao;
    @Test
    public void test(){

        System.out.println(zuserDao.selectList(null));
    }




}
