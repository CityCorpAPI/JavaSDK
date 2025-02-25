package org.cityrp.javasdk.requests.corp;

import org.cityrp.javasdk.api.Corp;
import org.cityrp.javasdk.http.Headers;
import org.cityrp.javasdk.requests.Request;
import org.cityrp.javasdk.requests.RequestType;

public class GetCorpByName extends Request<Corp> {

    public GetCorpByName(String corpName) {
        super("corp?corp_name=%s", RequestType.GET, Corp.class);
        this.replacePathVariables(corpName);
        this.header(Headers.CONTENT_TYPE, "application/json");
    }
}
