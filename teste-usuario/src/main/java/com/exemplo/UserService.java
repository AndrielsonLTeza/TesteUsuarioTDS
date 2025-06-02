package com.exemplo;

public class UserService {
    private final UserRepository repo;
    public UserService(UserRepository repo) { this.repo = repo; }

    public boolean cadastrarUsuario(String email) {
        if (email == null || !email.contains("@")) return false;
        repo.save(new User(email));
        return true;
    }
}
