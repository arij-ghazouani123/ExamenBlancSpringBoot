package com.example.examenpratiquespringboot.Service;

import com.example.examenpratiquespringboot.Entity.Project;
import com.example.examenpratiquespringboot.Entity.Sprint;
import com.example.examenpratiquespringboot.Entity.User;
import com.example.examenpratiquespringboot.Repository.ProjectRepository;
import com.example.examenpratiquespringboot.Repository.SprintRepository;
import com.example.examenpratiquespringboot.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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
        return projectRepository.save(project);

    }

    @Override
    public void assignProjectToUser(int projectId, int userId) {
        User user =userRepository.findById(userId).orElse(null);
        Project project =projectRepository.findById(projectId).orElse(null);

        user.setProjects((List<Project>) project);
        userRepository.save(user);

    @Override
        public void assignProjectToClient( Integer projectId, String firstName, String lastName)
        {
            Project project = projectRepository.findById(projectId).orElse(null);
            List<User> user = userRepository.findAll();


            }

            @Override
            public List<Project> getAllCurrentProject() {
            List<Project> currentProjects = projectRepository.findAll();

            }



        }
        }