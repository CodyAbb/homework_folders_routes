package com.codeclan.example.FoldersAndFiles.Components;

import com.codeclan.example.FoldersAndFiles.Models.File;
import com.codeclan.example.FoldersAndFiles.Models.Folder;
import com.codeclan.example.FoldersAndFiles.Models.User;
import com.codeclan.example.FoldersAndFiles.Repositories.FileRepository;
import com.codeclan.example.FoldersAndFiles.Repositories.FolderRepository;
import com.codeclan.example.FoldersAndFiles.Repositories.UserRepository;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        User cody = new User("Cody");
        userRepository.save(cody);

        User dave = new User("Dave");
        userRepository.save(dave);

        Folder work = new Folder("work", cody);
        folderRepository.save(work);

        Folder play = new Folder("play", dave);
        folderRepository.save(play);

        File presentation = new File("presentation", "png", 528, work);
        fileRepository.save(presentation);

        File game = new File("game", ".exe", 78000, play);
        fileRepository.save(game);
        File film = new File("film", ".mp4", 8000, play);
        fileRepository.save(film);


    }
}
