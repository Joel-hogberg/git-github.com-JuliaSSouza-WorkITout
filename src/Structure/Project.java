package Structure;

import java.util.ArrayList;

import Roles.ProjectManager;
import Roles.*;

public class Project {

    public String name;
    public Company company;
    public ProjectManager projectManager;
    public ArrayList<User> team;
    public ArrayList<Task> tasks;

    // Constructor without project manager
    public Project(String name, Company company) {
        this.name = name;
        this.company = company;
        this.team = new ArrayList<User>();
        this.tasks = new ArrayList<Task>();
    }

    // Constructor with project manager
    public Project(String name, Company company, ProjectManager projectManager) {
        this.name = name;
        this.company = company;
        this.projectManager = projectManager;
        this.team = new ArrayList<User>();
        this.tasks = new ArrayList<Task>();
    }
}
