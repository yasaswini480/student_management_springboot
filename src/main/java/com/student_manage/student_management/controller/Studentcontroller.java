package com.student_manage.student_management.controller;

import com.student_manage.student_management.model.Studentmodel;
import com.student_manage.student_management.service.Studentservice;
import lombok.*;
import org.springframework.aot.generate.GeneratedTypeReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.processing.Generated;
import java.util.List;

@RestController
@RequiredArgsConstructor

public class Studentcontroller
{
    private final Studentservice studservice;

    @PostMapping("/add")
    public Studentmodel addstudent(@RequestBody Studentmodel studmodel)
    {
        return this.studservice.addstudent(studmodel);
    }

    @DeleteMapping("/delete/{id}")
    public String deletestudent(@PathVariable Long id)
    {
        return this.studservice.deletestudent(id);
    }

    @PutMapping("/update/{id}")
    public void updatestudent(@PathVariable Long id, @RequestBody Studentmodel studmodel)
    {
        this.studservice.updatestudent(id, studmodel);
    }

    @GetMapping("/getall")
    public List<Studentmodel> getall()
    {
        return this.studservice.getall();
    }

}










