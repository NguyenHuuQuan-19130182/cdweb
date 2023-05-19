package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends JpaRepository<Size,Long> {
}
