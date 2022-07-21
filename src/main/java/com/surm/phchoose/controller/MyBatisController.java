package com.surm.phchoose.controller;

import com.surm.phchoose.dao.PhoneDao;
import com.surm.phchoose.entity.Phone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MyBatisController {
    @Resource
    PhoneDao phoneDao;

    @GetMapping("/phones/queryAll")
    public List<Phone> queryAll() { return phoneDao.findAllPhones();}

    @GetMapping("/phones/insert")
    public Boolean insert(String id ,String brand,String cpu,int battery){

        Phone phone = new Phone();
        phone.setId(id);
        phone.setCpu(cpu);
        phone.setBrand(brand);
        phone.setBattery(battery);
        return phoneDao.insertPhone(phone) > 0;
    }

    @GetMapping("/phones/update")
    public Boolean update(String id ,String brand,String cpu,int battery){
        if (id == null) {
            return false;
        }
        Phone phone = new Phone();
        phone.setCpu(cpu);
        phone.setBrand(brand);
        phone.setBattery(battery);
        return phoneDao.updatePhone(phone) > 0;
    }

    @GetMapping("/phones/delete")
    public Boolean delete(String id) {
        if (id == null) {
            return false;
        }
        return phoneDao.deletePhone(id) > 0;

    }
}