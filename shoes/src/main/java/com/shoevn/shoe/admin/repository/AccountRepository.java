package com.shoevn.shoe.admin.repository;
import com.shoevn.shoe.Beans.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AccountRepository extends JpaRepository<Account,Long>{
}
