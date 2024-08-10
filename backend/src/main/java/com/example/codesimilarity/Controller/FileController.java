
package com.example.codesimilarity.Controller;

import com.example.codesimilarity.model.File;
import com.example.codesimilarity.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/files")
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping("/create")
    public ResponseEntity<File> createFile(@RequestBody File file) {
        File newFile = fileService.createFile(file);
        return ResponseEntity.ok(newFile);
    }
}
