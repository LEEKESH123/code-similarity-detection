
package com.example.codesimilarity.Controller;

import com.example.codesimilarity.model.SimilarityResult;
import com.example.codesimilarity.service.SimilarityResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/similarity-results")
public class SimilarityResultController {

    @Autowired
    private SimilarityResultService similarityResultService;

    @PostMapping("/create")
    public ResponseEntity<SimilarityResult> createSimilarityResult(@RequestBody SimilarityResult similarityResult) {
        SimilarityResult newResult = similarityResultService.createSimilarityResult(similarityResult);
        return ResponseEntity.ok(newResult);
    }
}
