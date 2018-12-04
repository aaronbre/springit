package com.fracasapps.springit.springit.repository;

import com.fracasapps.springit.springit.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
}
