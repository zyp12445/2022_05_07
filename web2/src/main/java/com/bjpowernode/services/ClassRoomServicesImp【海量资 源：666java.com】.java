package com.bjpowernode.services;
import com.bjpowernode.beans.ClassRoom;
import com.bjpowernode.mapper.ClassRoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomServicesImp implements ClassRoomServices {
    @Autowired
    ClassRoomMapper classRoomMapper;

    @Override
    public List<ClassRoom> getAll() {
        return classRoomMapper.getAll();
    }
}
