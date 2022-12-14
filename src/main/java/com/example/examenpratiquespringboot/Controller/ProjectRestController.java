package com.example.examenpratiquespringboot.Controller;

import com.example.examenpratiquespringboot.Entity.Project;
import com.example.examenpratiquespringboot.Entity.User;
import com.example.examenpratiquespringboot.Service.IProjectService;
import com.example.examenpratiquespringboot.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("project")
public class ProjectRestController {

    @Autowired
    IProjectService iProjectService;



    @PostMapping("/addProject")
    public Project addProject(@RequestBody Project project) {
        return iProjectService.addProject(project);
    }



    @PutMapping("/assignProjectToUser/{projectId}/{userId}")
    public void assignProjectToUser(@PathVariable Integer projectId,
                @PathVariable Integer userId){
        iProjectService.assignProjectToUser(userId,projectId);
    }
}
