package com.codeclan.example.FoldersAndFiles.Repositories;

import com.codeclan.example.FoldersAndFiles.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
