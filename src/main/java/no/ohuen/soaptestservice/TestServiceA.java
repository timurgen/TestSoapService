/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ohuen.soaptestservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import no.ohuen.soaptestservice.response.GetDocumentRevisionResponse;
import no.ohuen.soaptestservice.response.GetDocumentRevisionResult;
import no.ohuen.soaptestservice.response.Response;
import no.ohuen.soaptestservice.response.Revision;

/**
 *
 * @author 100tsa
 */
@WebService(serviceName = "TestServiceA")
@Stateless()
public class TestServiceA {

    /**
     * Web service operation
     * @param request
     * @param credentials
     * @return 
     */
    @WebMethod(operationName = "getDocumentRevision")
    public GetDocumentRevisionResponse getDocumentRevision(
            @WebParam(name = "request") final Request request,
            @WebParam(name = "credentials") final Credentials credentials) {
        
        GetDocumentRevisionResponse response = new GetDocumentRevisionResponse();
        GetDocumentRevisionResult responseResult = new GetDocumentRevisionResult();
        Revision revision = new Revision();
        
        Response res = new Response();
        res.setStatus(0);
        res.setText(null);
        res.setVersion("V201409");
        
        revision.setRevisionNo(0);
        revision.setRevisionDate("2018-11-06 09:50");
        revision.setFileName("so13f2x_2_2947.pdf");
        revision.setFileContent("base64 encoded content");
        
        responseResult.setResponse(res);
        responseResult.setRevision(revision);
        response.setGetDocumentRevisionResult(responseResult);
        
        return response;
    }
}
