package ru.vasyunin.factoryhw.factories;

import ru.vasyunin.factoryhw.providers.GoogleUserAuthProvider;
import ru.vasyunin.factoryhw.providers.GoogleUserProfileProvider;
import ru.vasyunin.factoryhw.providers.UserAuthProvider;
import ru.vasyunin.factoryhw.providers.UserProfileProvider;

public class GoogleFactory implements UserFactory {
    public UserAuthProvider createUserAuthProvider() {
        return new GoogleUserAuthProvider();
    }

    public UserProfileProvider createUserProfileProvider() {
        return new GoogleUserProfileProvider();
    }

}
