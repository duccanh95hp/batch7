package com.example.demo_di_ioc.respositories;

import com.example.demo_di_ioc.entities.Role;
import com.example.demo_di_ioc.statics.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
