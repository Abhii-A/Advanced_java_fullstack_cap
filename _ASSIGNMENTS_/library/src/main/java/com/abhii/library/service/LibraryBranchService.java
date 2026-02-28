package com.abhii.library.service;

import com.abhii.library.entity.LibraryBranch;
import java.util.List;

public interface LibraryBranchService {

    LibraryBranch addBranch(LibraryBranch branch);

    List<LibraryBranch> getAllBranches();

    LibraryBranch getBranchById(Long id);

    LibraryBranch updateBranch(Long id, LibraryBranch updated);

    void deleteBranch(Long id);
}