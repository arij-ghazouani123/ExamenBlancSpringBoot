package com.example.examenpratiquespringboot.Service;

import com.example.examenpratiquespringboot.Entity.Project;

import java.util.List;

public interface IProjectService {
    public Project addProject(Project project);
    public void assignProjectToUser(int projectId, int userId);
    public void assignProjectToClient(int  projectId, String firstName, String lastName);
    public List<Project> getAllCurrentProject();


    public List<Project> getProjectsByScrumMaster(String fName, String IName);

}
