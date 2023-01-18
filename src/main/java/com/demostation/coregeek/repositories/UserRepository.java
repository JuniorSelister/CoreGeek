package com.demostation.coregeek.repositories;

import com.demostation.coregeek.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Person, Integer> {
}
