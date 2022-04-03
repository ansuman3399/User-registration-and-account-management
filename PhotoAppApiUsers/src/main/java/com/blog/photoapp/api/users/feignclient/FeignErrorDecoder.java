package com.blog.photoapp.api.users.feignclient;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        switch (response.status()) {
            case 400: {
                //Do Something
                break;
            }
            case 404: {
                break;
            }
            default:
                return new Exception(response.reason());
        }
        return null;
    }
}
