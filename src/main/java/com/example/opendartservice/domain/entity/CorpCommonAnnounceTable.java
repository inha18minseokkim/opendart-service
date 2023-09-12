package com.example.opendartservice.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="tbCorpCmnAnn")
public class CorpCommonAnnounceTable {
    @Id
    private Long id;
    @Column(name="classification")
    private String classification;
    @Column(name="corp_code")
    private String corpCode;
    @Column(name="corp_name")
    private String corpName;
    @Column(name="receptDate")
    private String receptDate;
    @Column(name="reportName")
    private String reportName;

}