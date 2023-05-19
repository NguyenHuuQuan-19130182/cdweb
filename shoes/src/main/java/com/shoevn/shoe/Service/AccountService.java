package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.Account;
import com.shoevn.shoe.Dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public Account save(Account account){
        return accountDao.save(account);
    }
    public Account findByUsername(String username){
        return accountDao.findByUserName(username);
    }
}
