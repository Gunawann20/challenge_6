package org.binaracademy.challenge6.entity;

import lombok.Data;

@Data
public class UserDto {
    private String username;
    private String password;
    private String email;
    private String name;

    public User getUserFromDto(){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setName(name);
        return user;
    }
}
