package ru.den.patterns.prototype;

public class Projectfactory {
    Project project;

    public Projectfactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject(){
        return (Project) project.copy();
    }
}
