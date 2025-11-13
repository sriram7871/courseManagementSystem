package com.example.Course.Registeration.System.repository;

import com.example.Course.Registeration.System.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}
