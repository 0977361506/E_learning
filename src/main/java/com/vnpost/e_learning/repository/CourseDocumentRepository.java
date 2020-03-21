package com.vnpost.e_learning.repository;

import com.vnpost.e_learning.entities.CourseDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDocumentRepository extends JpaRepository<CourseDocument,Long> {
}
