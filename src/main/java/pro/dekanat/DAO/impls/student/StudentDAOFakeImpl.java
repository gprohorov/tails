package pro.dekanat.DAO.impls.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.dekanat.DAO.interfaces.IStudentDAO;
import pro.dekanat.model.Group;
import pro.dekanat.model.Student;
import pro.dekanat.service.impls.GroupServiceImpl;

import javax.annotation.PostConstruct;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 1/13/18.
 */

@Component
public class StudentDAOFakeImpl implements IStudentDAO{

   private static List<Student> list = new ArrayList<>();
   private static List<Group> groups= new ArrayList<>();



    @Autowired
    GroupServiceImpl groupService;

    @PostConstruct
    void init() throws SQLException {
        groups = groupService.getAll();
        list.add(new Student(1,"Stepan","Ivanov", new Group(1,"PZ","PZ",1)));
        list.add(new Student(2,"Vasiliy","Petrov",  groupService.read(2)));
    }
/*

    private  List<Student> lis = Arrays.asList(new Student(1,"l","l"
            , groupService.read(0)));

    static {

        list.add(new Student(1,"Ivan","Ivanov", new Group(1,"PZ","PZ",1)));
        list.add(new Student(2,"Petro","Petrov",  null )  );
        list.add(new Student(2,"Sidor","Sidorov", null));

    }


    private static List<Group> getGroups(){
        return groupService.getAll();
    }
*/

    @Override
    public void createStudent(Student student) {

    }

    @Override
    public Student read(int studentId) {
        return
                list.get(0);
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(int studentId) {

    }

    @Override
    public List<Student> getAll() throws SQLException {

        list.add(new Student(1,"Ivan","Ivanov", new Group(1,"PZ","PZ",1)));
        list.add(new Student(2,"Petro","Petrov",  groupService.read(2)));
        list.add(new Student(2,"Sidor","Sidorov", groupService.read(2)));
        list.add(new Student(5,"Pavel","Psvlov",  groupService.read(1)));
        return list;
    }
}
