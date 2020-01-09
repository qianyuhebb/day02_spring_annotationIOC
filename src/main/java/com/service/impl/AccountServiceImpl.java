package com.service.impl;

import com.dao.AccountDao;
import com.factory.BeanFactory;
import com.pojo.AccountDO;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {

//    accountDaoImpl accountDao = new accountDaoImpl();
      /* int i =1;*/

    @Autowired
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void saveAccout(AccountDO accountDO) {
        accountDao.saveAccout(accountDO);
    }



    public AccountDO findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    public List<AccountDO> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public void updateAccount(AccountDO accountDO) {
         accountDao.updateAccount(accountDO);
    }

    public void deleteAccount(Integer id) {
               accountDao.deleteAccount(id);
    }
}
