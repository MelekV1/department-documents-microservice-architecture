package com.mcode.documentservice.controller;

import com.mcode.documentservice.VO.ResponseTemplateVO;
import com.mcode.documentservice.entity.Document;
import com.mcode.documentservice.service.DocumentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/documents")
@Slf4j
public class DocumentController {
    @Autowired
    private DocumentService documentService;

    @PostMapping("/")
    public Document saveDocument(@RequestBody Document document) {
        log.info("Inside saveDocument of DocumentController");
        return documentService.saveDocument(document);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getDocumentWithDepartment(@PathVariable("id") Long documentId) {
        log.info("Inside getDocumentWithDepartment of DocumentController");
        return documentService.getUserWithDepartment(documentId);
    }

}
