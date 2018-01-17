package pro.dekanat.DAO.impls.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.dekanat.DAO.interfaces.IStudentDAO;
import pro.dekanat.model.Student;
import pro.dekanat.service.impls.GroupServiceImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 1/13/18.
 */

@Component
public class StudentDAOJDBCImpl implements IStudentDAO{

    @Autowired
    GroupServiceImpl groupService;


   private static List<Student> list = new ArrayList<>();

    String url = "jdbc:mysql://localhost:3306/latelist";
    String login = "root";
    String password= "root";


    @Override
    public void createStudent(Student student) {

    }

    @Override
    public Student read(int studentId) {
        return null;
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(int studentId) {

    }

    @Override
    public List<Student> getAll() throws SQLException {

        System.out.println("Hello JDBC !");

        Connection con;
        Statement stmt;
        ResultSet rs;

        con = DriverManager.getConnection(url,login,password);
        stmt = con.createStatement();
        rs=stmt.executeQuery("SELECT * FROM student");
        list.clear();

        while (rs.next()){
            list.add(new Student(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    groupService.read(rs.getInt(4))
                    )
            );
         }
        con.close();

        return list;
    }
}
