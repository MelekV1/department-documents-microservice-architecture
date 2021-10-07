package com.mcode.documentservice.VO;

import com.mcode.documentservice.entity.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Document document;
    private Department department;
}
