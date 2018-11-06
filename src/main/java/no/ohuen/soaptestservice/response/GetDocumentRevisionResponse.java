/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ohuen.soaptestservice.response;

import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author 100tsa
 */
@XmlType(name="GetDocumentRevisionResponse")
public class GetDocumentRevisionResponse {
    private GetDocumentRevisionResult getDocumentRevisionResult;

    public GetDocumentRevisionResponse() {
    }

    public GetDocumentRevisionResult getGetDocumentRevisionResult() {
        return getDocumentRevisionResult;
    }

    public void setGetDocumentRevisionResult(GetDocumentRevisionResult revisionResult) {
        this.getDocumentRevisionResult = revisionResult;
    }
    
    
}
