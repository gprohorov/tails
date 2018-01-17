package pro.dekanat.conttoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.dekanat.model.Group;
import pro.dekanat.service.impls.GroupServiceImpl;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by george on 1/15/18.
 */
@RestController
public class GroupsController {

    @Autowired
    GroupServiceImpl groupService;

    @RequestMapping("/api/groups")
    public List<Group> getAllGroupss() throws SQLException {
        return groupService.getAll();
    }
}
