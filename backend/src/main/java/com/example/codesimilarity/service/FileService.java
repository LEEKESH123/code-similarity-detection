
package com.example.codesimilarity.service;

import com.example.codesimilarity.model.File;
import com.example.codesimilarity.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileService {

    @Autowired
    private FileRepository fileRepository;

    public File createFile(File file) {
        return fileRepository.save(file);
    }
}
