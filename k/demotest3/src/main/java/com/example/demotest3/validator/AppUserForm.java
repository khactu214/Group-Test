package com.example.demotest3.validator;

public class AppUserForm {
    private Long userId;
    private String userName;
    private String password;
    private String confirmPassword;
    private boolean enabled;

    public AppUserForm() {

    }
    public AppUserForm(Long userId, String userName, //
                        boolean enabled, //
                       String password, String confirmPassword) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.enabled = enabled;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

}
