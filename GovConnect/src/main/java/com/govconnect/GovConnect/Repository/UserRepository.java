package com.govconnect.GovConnect.Repository;

import com.govconnect.GovConnect.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
