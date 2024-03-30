package com.springbackend.project.repository;

import com.springbackend.project.model.RecipeCategoryMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeCategoryMappingRepository extends JpaRepository<RecipeCategoryMapping, Long> {

}
