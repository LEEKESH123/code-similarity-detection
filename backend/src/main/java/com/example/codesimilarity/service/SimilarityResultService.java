
package com.example.codesimilarity.service;

import com.example.codesimilarity.model.SimilarityResult;
import com.example.codesimilarity.repository.SimilarityResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimilarityResultService {

    @Autowired
    private SimilarityResultRepository similarityResultRepository;

    public SimilarityResult createSimilarityResult(SimilarityResult similarityResult) {
        return similarityResultRepository.save(similarityResult);
    }
}
