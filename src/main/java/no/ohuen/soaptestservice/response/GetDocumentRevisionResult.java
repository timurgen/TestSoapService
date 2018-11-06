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
@XmlType(name = "GetDocumentRevisionResult")
public class GetDocumentRevisionResult {
    private Response response;
    private Revision revision;

    public GetDocumentRevisionResult() {
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public Revision getRevision() {
        return revision;
    }

    public void setRevision(Revision revision) {
        this.revision = revision;
    }
    
    
}
