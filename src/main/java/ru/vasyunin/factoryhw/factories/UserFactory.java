package ru.vasyunin.factoryhw.factories;
import ru.vasyunin.factoryhw.providers.UserAuthProvider;
import ru.vasyunin.factoryhw.providers.UserProfileProvider;

public interface UserFactory {
    UserAuthProvider createUserAuthProvider();
    UserProfileProvider createUserProfileProvider();
}
