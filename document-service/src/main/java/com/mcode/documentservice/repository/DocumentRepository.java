package com.mcode.documentservice.repository;

import com.mcode.documentservice.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository  extends JpaRepository<Document,Long> {
    Document findByDocumentId(Long documentId);
}
