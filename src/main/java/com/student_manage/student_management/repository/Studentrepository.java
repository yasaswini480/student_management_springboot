package com.student_manage.student_management.repository;

//import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

import com.student_manage.student_management.model.Studentmodel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepository extends JpaRepository<Studentmodel, Long>
{

}
