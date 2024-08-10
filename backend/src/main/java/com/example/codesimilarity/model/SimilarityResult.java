
package com.example.codesimilarity.model;

import jakarta.persistence.*;
        import java.time.LocalDateTime;

@Entity
@Table(name = "Similarity_Results")
public class SimilarityResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "file1_id", nullable = false)
    private File file1;

    @ManyToOne
    @JoinColumn(name = "file2_id", nullable = false)
    private File file2;

    @Column(name = "similarity_score", nullable = false)
    private Float similarityScore;

    @Column(name = "analysis_details", columnDefinition = "TEXT")
    private String analysisDetails;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public File getFile1() {
        return file1;
    }

    public void setFile1(File file1) {
        this.file1 = file1;
    }

    public File getFile2() {
        return file2;
    }

    public void setFile2(File file2) {
        this.file2 = file2;
    }

    public Float getSimilarityScore() {
        return similarityScore;
    }

    public void setSimilarityScore(Float similarityScore) {
        this.similarityScore = similarityScore;
    }

    public String getAnalysisDetails() {
        return analysisDetails;
    }

    public void setAnalysisDetails(String analysisDetails) {
        this.analysisDetails = analysisDetails;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
