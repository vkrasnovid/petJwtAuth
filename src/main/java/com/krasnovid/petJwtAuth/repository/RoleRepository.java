package com.krasnovid.petJwtAuth.repository;

import com.krasnovid.petJwtAuth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
