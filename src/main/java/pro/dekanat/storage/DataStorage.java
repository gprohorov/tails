package pro.dekanat.storage;

import org.springframework.context.annotation.Configuration;
import pro.dekanat.model.Group;
import pro.dekanat.model.Student;

import java.util.Arrays;
import java.util.List;

/**
 * Created by george on 2/19/18.
 */
@Configuration
public class DataStorage {

    private List<Group> groups = Arrays.asList(
            new Group(1, "SD", "Software Design", 3),
            new Group(2, "CS", "Computer System", 3),
            new Group(3, "MPUIK", "Math Problems and Cybernetics", 3)

    );

    public List<Student> students = Arrays.asList(
            new Student(2,"Petro","Petrov",  groups.get(2)),
            new Student(3,"Sidor","Sidorov", groups.get(1)),
            new Student(4,"Pavel","Pavlov",  groups.get(0)),
            new Student(6,"Vasia","Vasin",   groups.get(2))
            );


    public List<Group> getGroups(){
        return groups;
    }

    public List<Student> getStudents(){
        return students;
    }


}
