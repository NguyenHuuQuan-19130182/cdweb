package com.shoevn.shoe.Dao;

import com.shoevn.shoe.Beans.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends JpaRepository<Account,Long> {
    @Query("select  a from  Account a where a.username = ?1")
    public Account findByUserName(String name);

    @Query("select  a from  Account a where a.id = ?1")
    public Account findAccountById(long id);
}
