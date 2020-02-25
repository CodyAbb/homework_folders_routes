package com.codeclan.example.FoldersAndFiles.Repositories;

import com.codeclan.example.FoldersAndFiles.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
