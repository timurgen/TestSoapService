/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ohuen.soaptestservice.response;

import java.util.List;

/**
 *
 * @author 100tsa
 */
public class Revision {
    private List<String> indexValues;
    private int revisionNo;
    private String revisionDate;
    private String fileName;
    private String fileContent;

    public Revision() {
    }

    public List<String> getIndexValues() {
        return indexValues;
    }

    public void setIndexValues(List<String> indexValues) {
        this.indexValues = indexValues;
    }

    public int getRevisionNo() {
        return revisionNo;
    }

    public void setRevisionNo(int revisionNo) {
        this.revisionNo = revisionNo;
    }

    public String getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(String revisionDate) {
        this.revisionDate = revisionDate;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }
    
    
}
