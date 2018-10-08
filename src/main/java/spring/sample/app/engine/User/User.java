package spring.sample.app.engine.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class User {
    @RequestMapping(value="", method=RequestMethod.GET)
    public List<String> getUserIds() {
        ArrayList<String> list = new ArrayList<>();
        list.add("001");
        list.add("002");
        return list;
    }
}
