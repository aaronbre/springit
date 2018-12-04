package com.fracasapps.springit.springit.repository;

import com.fracasapps.springit.springit.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
