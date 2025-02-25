package org.cityrp.javasdk;

import java.util.Base64;
import java.util.UUID;

public class CityCorpClient implements Authorization {

    private static final String BASE_URL = "https://api.cityrp.org/citycorp/";

    private final UUID uuid;
    private final String token;

    public CityCorpClient(UUID uuid, String token) {
        this.uuid = uuid;
        this.token = token;
    }

    @Override
    public String authorizationString() {
        return String.format("Basic %s", new String(Base64.getEncoder().encode((this.uuid + ":" + this.token).getBytes())));
    }

    @Override
    public int hashCode() {
        return (this.uuid.toString() + this.token).hashCode();
    }
}
