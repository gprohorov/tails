package pro.dekanat.DAO.impls.group;

import org.springframework.stereotype.Component;
import pro.dekanat.DAO.interfaces.IGroupDAO;
import pro.dekanat.model.Group;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 1/13/18.
 */

@Component
public class GroupDAOJDBCImpl implements IGroupDAO {

    private static List<Group> groups = new ArrayList<>();

/*
    static {
        list.add(new Group(1, "SD", "Software Design", 3));
        list.add(new Group(2, "CS", "Computer System", 3));
        list.add(new Group(3, "MPUIK", "Math Problems and Cybernetics", 3));

    }
*/

    @Override
    public void createStudent(Group Group) {

    }

    @Override
    public Group read(int groupId) throws SQLException {
        System.out.println(groupId);
        return getAll().stream().filter(group -> group.getId() == groupId)
                .findFirst().get();
    }

    @Override
    public void update(Group group) {

    }

    @Override
    public void delete(int groupId) {

    }

    @Override
    public List<Group> getAll() throws SQLException {


       Connection con;
        Statement stmt;
        ResultSet rs;

        String url = "jdbc:mysql://localhost:3306/latelist";
        String login = "root";
        String password= "root";

        con = DriverManager.getConnection(url,login,password);
        stmt = con.createStatement();
        rs=stmt.executeQuery("SELECT * FROM groips");

        groups.clear();

        while (rs.next()){
            groups.add(new Group(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4)
                    )
            );
        }
        System.out.println( "groups size - "+ groups.size());
        con.close();






        return groups;
    }
}
