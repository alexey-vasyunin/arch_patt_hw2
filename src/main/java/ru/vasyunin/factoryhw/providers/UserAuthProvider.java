package ru.vasyunin.factoryhw.providers;
import ru.vasyunin.factoryhw.AuthProvider;

public interface UserAuthProvider {
    AuthProvider getAuthType();
    boolean isAuthed();
}
