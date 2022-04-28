package com.kifiyapro.bunchi.Service;

public class AuthResponseDto {



    private String token_type;
    private Integer expires_in;
    private String access_token;

    public AuthResponseDto() {
    }

    public AuthResponseDto(String token_type, Integer expires_in, String access_token) {
        this.token_type = token_type;
        this.expires_in = expires_in;
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public Integer getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Integer expires_in) {
        this.expires_in = expires_in;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}