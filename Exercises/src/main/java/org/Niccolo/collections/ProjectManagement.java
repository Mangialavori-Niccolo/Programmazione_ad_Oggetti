package org.Niccolo.collections;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.*;

@Getter
 class Project {
    @Setter
    private String name;
    @Setter
    private LocalDate startDate, endDate;
    private final Set<Task> tasks;

    public Project(String name, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tasks = new HashSet<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        if (task.getProject() != this) {
            task.setProject(this);
        }
    }

    public void removeTask(Task task){
        tasks.remove(task);
        task.setProject(null);
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(name, project.name) && Objects.equals(startDate, project.startDate) && Objects.equals(endDate, project.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startDate, endDate);
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", tasks=" + tasks +
                '}';
    }
}




@Getter
class Task {
    private final UUID uuid;
    @Setter
    private String description;
    @Setter
    private Integer hoursNeeded;
    private Project project;
    @Setter
    private Employee teamLeader;


    public Task(String description, Integer hoursNeeded) {
        this.description = description;
        this.hoursNeeded = hoursNeeded;
        this.uuid = UUID.randomUUID();
    }

    public void setProject(Project project) {
        if (Objects.nonNull(this.project) && this.project.getTasks().contains(this)){
            this.project.removeTask(this);
        }
        if (Objects.nonNull(project)) {
            project.getTasks().add(this);
        }
        this.project = project;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(uuid, task.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }

    @Override
    public String toString() {
        return "Task{" +
                "uuid=" + uuid +
                ", description='" + description + '\'' +
                ", hoursNeeded=" + hoursNeeded +
                ", project=" + project +
                ", teamLeader=" + teamLeader +
                '}';
    }
}



@Setter
@Getter
class Employee {
     private String name, lastname, socialSecurityCode;

    public Employee(String name, String lastname, String socialSecurityCode) {
        this.name = name;
        this.lastname = lastname;
        this.socialSecurityCode = socialSecurityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(lastname, employee.lastname) && Objects.equals(socialSecurityCode, employee.socialSecurityCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, socialSecurityCode);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", socialSecurityCode='" + socialSecurityCode + '\'' +
                '}';
    }
}

