package com.vnpost.e_learning.repository;

import com.vnpost.e_learning.entities.Eventt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Eventt,Long> {
}
