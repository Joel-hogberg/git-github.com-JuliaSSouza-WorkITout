package Structure;

import java.util.ArrayList;

import Roles.*;

public class Task {
    public String name;
    public Project project;
    public boolean isCompleted;
    public String description;
    public String deadline;
    public int priority;
    public ArrayList<User> responsible;

    public Task(String name, Project project) {
        this.name = name;
        this.project = project;
        this.isCompleted = false;
        this.responsible = new ArrayList<User>();
    }
    

}
