package Structure;

import java.util.ArrayList;
import Roles.*;

public class Company {
    public String name;
    public ArrayList<User> userList;
    public ArrayList<Project> projectList;

    public Company(String name) {
        this.name = name;
        this.userList = new ArrayList<User>();
        this.projectList = new ArrayList<Project>();
    }
}
