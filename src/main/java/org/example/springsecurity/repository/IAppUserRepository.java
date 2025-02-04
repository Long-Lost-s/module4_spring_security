package org.example.springsecurity.repository;

import org.example.springsecurity.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String name);
}
