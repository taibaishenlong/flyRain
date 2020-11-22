package com.wangchao.day1019.springaop.aopanno;
//账户的业务层接口
public interface AccountService {
    /**
     * 模拟保存账户
     */
    void saveAccount();
    /**
     * 模拟更新账户
     */
    void updateAccount(int i);
    /**
     * 删除账户
     */
    int deleteAccount();
}
