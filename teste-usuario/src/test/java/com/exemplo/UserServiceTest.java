package com.exemplo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {
      @Test
    void deveCadastrarUsuarioComEmailValido() {
        UserRepository repo = mock(UserRepository.class);
        UserService service = new UserService(repo);
        boolean resultado = service.cadastrarUsuario("teste@email.com");
        assertTrue(resultado);
        verify(repo).save(any(User.class));
    }

    @Test
    void naoDeveCadastrarUsuarioComEmailInvalido() {
        UserRepository repo = mock(UserRepository.class);
        UserService service = new UserService(repo);
        boolean resultado = service.cadastrarUsuario("emailInvalido");
        assertFalse(resultado);
        verify(repo, never()).save(any());
    }
} 

