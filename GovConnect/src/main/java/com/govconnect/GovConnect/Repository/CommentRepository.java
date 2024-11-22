package com.govconnect.GovConnect.Repository;

import com.govconnect.GovConnect.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
