package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.Size;
import com.shoevn.shoe.Dao.SizeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeService {
    @Autowired
    private SizeDao sizeDao;

    public List<Size> getAllSize(){
        return sizeDao.findAll();
    }
    public List<Size> getAllSizeById(long id){
        return  sizeDao.getAllSizeById(id);
    }
    public Size getSizeById(long idSize){
        return  sizeDao.getSizeById(idSize);
    }
}
