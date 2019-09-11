package com.soplab.lecture.repository;
import com.soplab.lecture.model.Sashimi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SashimiRepository extends JpaRepository<Sashimi, Integer> {}
