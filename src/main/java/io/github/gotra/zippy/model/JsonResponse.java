package io.github.gotra.zippy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


public class JsonResponse {


    public enum Status {
        SUCCESS,
        FAILURE,
        ERROR
    }

    Status status;

    Object data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    Object error;


    public JsonResponse(Status status, Object data, Object error) {
        this.status = status;
        this.data = data;
        this.error = error;
    }

    public Status getStatus() {
        return status;
    }

    public Object getData() {
        return data;
    }

    public Object getError() {
        return error;
    }
}
