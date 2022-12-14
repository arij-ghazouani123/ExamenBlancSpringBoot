package com.example.examenpratiquespringboot.Service;

import com.example.examenpratiquespringboot.Entity.Project;
import com.example.examenpratiquespringboot.Entity.Sprint;
import com.example.examenpratiquespringboot.Entity.User;
import com.example.examenpratiquespringboot.Repository.ProjectRepository;
import com.example.examenpratiquespringboot.Repository.SprintRepository;
import com.example.examenpratiquespringboot.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class IProjectServiceIMP implements IProjectService {

    UserRepository userRepository;
    //  @Autowired
   ProjectRepository projectRepository;
    SprintRepository sprintRepository;


    @Override
    public Project addProject(Project project) {
      //  return projectRepository.save(project);
        Project p = projectRepository.save(project);
        List<Sprint> list = new ArrayList<>();
        for (String sprint : project.getSprints()) {
            sprint.setProject(projectRepository.findById(p.getId()).orElse(null));
            list.add(sprint);
        }
        sprintRepository.saveAll(list);
    }

    @Override
    public void assignProjectToUser(int projectId, int userId) {
        User user = userRepository.retrieveById(userId);
        Project project = this.retrieveById(projectId);

        project.setUser(user);



    @Override
    public void assignProjectToClient(int projectId, String firstName, String lastName) {

    }

    @Override
    public List<Project> getAllCurrentProject() {
        return null;
    }
}

