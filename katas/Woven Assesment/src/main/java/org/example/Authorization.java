package org.example;

import java.util.*;

class Permission {
    public Permission() {}
    public Permission(String role, String name, boolean active) {
        this.role = role;
        this.name = name;
        this.active = active;
    }

    public String role;
    public String name;
    public boolean active;
}

class User {
    public User() {}
    public User(int id, String name, List<String> roles) {
        this.id = id;
        this.name = name;
        this.roles = roles;
    }
    public int id;
    public String name;
    public List<String> roles;
}

class Authorization {
    public List<Permission> permissions;
    public List<User> users;

    public Authorization(List<Permission> permissions, List<User> users) {
        this.permissions = permissions;
        this.users = users;
    }

    public ArrayList<String> listPermissions(int userId) {
        User user = new User();
        Permission permission = new Permission();

//         trying to use this as a template...
//        List<Users.Profile> profiles = Users.SocialMediaProfiles.fetchSocialProfiles(email);

//     permission = user(userId)
        if (permission.active = true) {
            try {
                return (ArrayList<String>) user.roles;
            } catch (Exception e) {
                // ToDo: split this error handling so that each lookup is specific and properly handled;
                System.out.println("user or role cannot be found");
            }
        }
                return new ArrayList();
    }

        public boolean checkPermitted (String permissionName,int userId){
            // TODO: fill this out!
            throw new RuntimeException("Please remove this when you implement this function");
        }
    }