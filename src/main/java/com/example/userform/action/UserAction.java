package com.example.userform.action;

import com.example.userform.model.User;
import com.example.userform.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserAction extends ActionSupport {
    private User user;

    @Autowired
    private UserService userService;

    public String execute() {
        userService.saveUser(user);
        return SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
