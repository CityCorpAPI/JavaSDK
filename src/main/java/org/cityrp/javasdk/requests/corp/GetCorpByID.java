package org.cityrp.javasdk.requests.corp;

import org.cityrp.javasdk.api.Corp;
import org.cityrp.javasdk.http.Headers;
import org.cityrp.javasdk.requests.Request;
import org.cityrp.javasdk.requests.RequestType;

public class GetCorpByID extends Request<Corp> {

    public GetCorpByID(long id) {
        super("corp?corp_id=%s", RequestType.GET, Corp.class);
        this.replacePathVariables(id);
        this.header(Headers.CONTENT_TYPE, "application/json");
    }
}
