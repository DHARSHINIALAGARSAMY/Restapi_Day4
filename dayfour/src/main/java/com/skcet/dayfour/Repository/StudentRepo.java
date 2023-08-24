package com.skcet.dayfour.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.dayfour.Model.StudentModel;

public interface StudentRepo extends JpaRepository<StudentModel, Integer> {

}
