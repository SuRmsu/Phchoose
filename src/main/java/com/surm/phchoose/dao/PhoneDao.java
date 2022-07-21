package com.surm.phchoose.dao;

import com.surm.phchoose.entity.Phone;

import java.util.List;

public interface PhoneDao {
    List<Phone> findAllPhones();
    int insertPhone(Phone phone);
    int updatePhone(Phone phone);
    int deletePhone(String id);
}