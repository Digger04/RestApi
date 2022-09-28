package com.example.restapi.callapi;

public class callapi {
    private boolean success;
    private error error;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public com.example.restapi.callapi.error getError() {
        return error;
    }

    public void setError(com.example.restapi.callapi.error error) {
        this.error = error;
    }

    public callapi(boolean success, com.example.restapi.callapi.error error) {
        this.success = success;
        this.error = error;
    }
}
