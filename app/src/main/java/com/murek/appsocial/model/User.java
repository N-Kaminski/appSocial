package com.murek.appsocial.model;

import com.parse.ParseClassName;
import com.parse.ParseObject;


@ParseClassName("User")
public class User extends ParseObject {
//    private String userId;
//    private String userName;
//    private String userEmail;
//    private String userpassword;
//    private String userFotoPerfil;
//    private String[] intereses;

    public User() {
    }

    public String getUserId() {
        return getObjectId();
    }

    public void setUserId(String userId) {
        put("objectId", userId);
    }

    public String getUserName() {
        return getString("name");
    }

    public void setUserName(String userName) {
        put("name", userName);
    }

    public String getUserEmail() {
        return getString("email");
    }

    public void setUserEmail(String userEmail) {
        put("email", userEmail);
    }

    public String getUserpassword() {
        return getString("password");
    }

    public void setUserpassword(String userpassword) {
        put("password", userpassword);
    }

    public String getUserFotoPerfil() {
        return getString("foto_perfil");
    }

    public void setUserFotoPerfil(String userFotoPerfil) {
        put("foto_perfil", userFotoPerfil);
    }

    public String getRedSocial() {
        return getString("red_social");
    }

    public void setRedSocial(String redSocial) {
        if (redSocial != null) {
            put("red_social", redSocial);
        }
    }
}