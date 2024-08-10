
package com.example.codesimilarity.repository;

import com.example.codesimilarity.model.SimilarityResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimilarityResultRepository extends JpaRepository<SimilarityResult, Long> {
}
