package com.bjpowernode.controller;
import com.bjpowernode.beans.ClassRoom;
import com.bjpowernode.services.ClassRoomServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@Controller
public class IndexController {
    @Autowired
    ClassRoomServices classRoomServices;
    @RequestMapping({"/index", "/"})
    public String indexView(Model model) {
        List<ClassRoom> all = classRoomServices.getAll();
        model.addAttribute("classRooms",all);
        return "index";
    }
}
