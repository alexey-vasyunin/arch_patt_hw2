package ru.vasyunin.factoryhw;

import ru.vasyunin.factoryhw.fabric.Fabric;
import ru.vasyunin.factoryhw.factories.UserFactory;
import ru.vasyunin.factoryhw.providers.UserProfileProvider;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        UserFactory factory = Fabric.getInstance().createFactory(AuthProvider.GOOGLE);
        UserProfileProvider provider = factory.createUserProfileProvider();

        System.out.println(provider.getEmail());

    }
}
