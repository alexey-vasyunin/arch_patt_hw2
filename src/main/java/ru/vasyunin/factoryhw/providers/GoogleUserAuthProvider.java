package ru.vasyunin.factoryhw.providers;

import ru.vasyunin.factoryhw.AuthProvider;

public class GoogleUserAuthProvider implements UserAuthProvider {

    public AuthProvider getAuthType() {
        return null;
    }

    public boolean isAuthed() {
        return false;
    }
}
