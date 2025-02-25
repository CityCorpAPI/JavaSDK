package org.cityrp.javasdk.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.cityrp.javasdk.http.Headers;

@Getter
@AllArgsConstructor
public abstract class Request<T> {

    protected String path;
    protected final RequestType requestType;
    protected final Class<? extends T> responseClass;
    private final Headers headers = new Headers();

    public Request<T> header(String header, String value) {
        this.headers.header(header, value);
        return this;
    }

    protected String replacePathVariables(Object... pathVariables) {
        return this.path = String.format(this.path, pathVariables);
    }
}
