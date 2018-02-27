package pro.dekanat.conttoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.dekanat.model.Group;
import pro.dekanat.service.impls.GroupServiceImpl;

import java.sql.SQLException;

/**
 * Created by george on 1/15/18.
 */
@RestController
public class GroupController {

    @Autowired
    GroupServiceImpl groupService;

    @RequestMapping("/api/group")
    public Group getGroup() throws SQLException {
        return groupService.read(1);
    }
}
