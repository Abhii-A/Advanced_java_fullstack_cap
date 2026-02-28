package com.abhii.library.repository;

import com.abhii.library.entity.LibraryBranch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryBranchRepository extends JpaRepository<LibraryBranch, Long> {
}