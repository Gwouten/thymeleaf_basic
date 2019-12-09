package deloof.wouter.thymeleaf_basic.controllers;

import deloof.wouter.thymeleaf_basic.model.Student;
import deloof.wouter.thymeleaf_basic.model.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping( value = "/studenten")
public class IndexController {

    @Autowired
    StudentDAO dao;

    @ModelAttribute("all")
    public Iterable<Student> findAllStudents() {
        return dao.findAll();
    }

    @RequestMapping( value = {"", "/index"}, method = RequestMethod.GET)
    public String index(ModelMap map) {
        return "index";
    }

}
