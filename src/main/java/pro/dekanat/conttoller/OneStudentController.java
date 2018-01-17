package pro.dekanat.conttoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.dekanat.model.Student;
import pro.dekanat.service.impls.StudentServiceImpl;

import java.sql.SQLException;

/**
 * Created by george on 1/13/18.
 */
@RestController
public class OneStudentController {

    @Autowired
    StudentServiceImpl studentService;

    @RequestMapping("/api//student")
    public Student getOneStudent() throws SQLException {
        return studentService.read(1);


    }

           }