package edu.monash.monplan.controller;

import edu.monash.monplan.model.Course;
import edu.monash.monplan.service.MonPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class CourseController extends MonPlanController<Course> {

    @RequestMapping(path = "/{name}", method = RequestMethod.GET)
    public String getCourseById(@PathVariable(value="name") String name) {
        if(name){
            return "Hello " + name;
        } else {
            return "Hello World"
        }
    }
}
