package com.madhut.expense.repository;

import com.madhut.expense.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
	Category findByName(String name);
}
