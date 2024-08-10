
package com.example.codesimilarity.repository;

import com.example.codesimilarity.model.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
