package com.soplab.lecture.menu;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Long> {

    @Override
    List<Menu> findAll();
}
