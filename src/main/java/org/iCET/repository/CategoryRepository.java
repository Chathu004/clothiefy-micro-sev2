package org.iCET.repository;

import org.iCET.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {
    CategoryEntity getByName(String name);
}
