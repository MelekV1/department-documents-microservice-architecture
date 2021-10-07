package com.mcode.documentservice.service;

import com.mcode.documentservice.VO.Department;
import com.mcode.documentservice.VO.ResponseTemplateVO;
import com.mcode.documentservice.entity.Document;
import com.mcode.documentservice.repository.DocumentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Document saveDocument(Document document){
        log.info("Inside saveDocument of DocumentService");
        return documentRepository.save(document);
    }

    public ResponseTemplateVO getUserWithDepartment(Long documentId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Document document = documentRepository.findByDocumentId(documentId);
        Department department =
                restTemplate.getForObject("http://localhost:9001/departments/"+document.getDepartmentId(),Department.class);
        //log.info(department.getDepartmentName());
        vo.setDepartment(department);
        vo.setDocument(document);
        return vo;
    }
}
