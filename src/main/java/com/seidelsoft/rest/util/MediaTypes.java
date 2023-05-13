package com.seidelsoft.rest.util;

import jakarta.ws.rs.core.MediaType;

public class MediaTypes extends MediaType {
    /**
     * A {@code String} constant representing {@value #APPLICATION_JSON} media type.
     */
    public static final String APPLICATION_JSON = "application/json;charset=utf-8";
    /**
     * A {@link MediaType} constant representing {@value #APPLICATION_JSON} media type.
     */
    public static final MediaType APPLICATION_JSON_TYPE = new MediaType("application", "json", "utf-8");
}
