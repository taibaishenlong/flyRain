package com.wangchao.day1021.twotx_isolation_anno.test;

import com.wangchao.day1021.twotx_isolation_anno.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//测试类
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:21tx_isolation_anno.xml")
public class AccountServiceTest {
    @Autowired
    private IAccountService ias;

    @Test
    public void testTransfer(){
        ias.transfer("jim","lucy",1000f);
    }
}