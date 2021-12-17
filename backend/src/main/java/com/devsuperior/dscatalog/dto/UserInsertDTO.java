package com.devsuperior.dscatalog.dto;

import net.bytebuddy.implementation.bind.annotation.Super;

public class UserInsertDTO extends UserDTO {
    private static final long serialVersionUID = 1L;
    
    private String password;

    UserInsertDTO() {
        super();
    }

    /**
     * @return String return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
