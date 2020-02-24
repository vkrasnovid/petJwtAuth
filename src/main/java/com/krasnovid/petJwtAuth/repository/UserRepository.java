package com.krasnovid.petJwtAuth.repository;

import com.krasnovid.petJwtAuth.model.User;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Caching;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    @Caching(
            put = {
                    @CachePut(value = "userCache", key = "'username:' + #result.username", condition = "#result != null"),
                    @CachePut(value = "userCache", key = "#result.id", condition = "#result != null")
            }
    )
    User findByUsername(String name);
}
