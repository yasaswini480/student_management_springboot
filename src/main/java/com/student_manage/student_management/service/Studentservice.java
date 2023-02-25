package com.student_manage.student_management.service;

import com.student_manage.student_management.model.Studentmodel;
import com.student_manage.student_management.repository.Studentrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class Studentservice
{
    private final Studentrepository studrepo;

    public Studentmodel addstudent(Studentmodel studmodel)
    {
        return this.studrepo.save(studmodel);
    }

    public String deletestudent(Long id)
    {
        this.studrepo.deleteById(id);
        return "deleted";
    }

    public void updatestudent(Long id, Studentmodel studmodel)
    {
        Studentmodel std = this.studrepo.findById(id).get();
        std.setFirstname(studmodel.getFirstname());
        std.setId(studmodel.getId());
        std.setSection(studmodel.getSection());
        std.setSubject(studmodel.getSubject());
        this.studrepo.save(std);
    }

    public List<Studentmodel> getall()
    {
        return this.studrepo.findAll();
    }
}
