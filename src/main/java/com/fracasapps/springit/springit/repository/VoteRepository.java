package com.fracasapps.springit.springit.repository;

import com.fracasapps.springit.springit.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
