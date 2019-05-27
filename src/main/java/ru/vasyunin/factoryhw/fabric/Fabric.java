package ru.vasyunin.factoryhw.fabric;

import org.reflections.Reflections;
import ru.vasyunin.factoryhw.AuthProvider;
import ru.vasyunin.factoryhw.factories.UserFactory;

import java.util.Set;

public class Fabric {
    private static volatile Fabric instance = new Fabric();

    public static Fabric getInstance(){
        Fabric fabric = instance;
        if (instance == null){
            synchronized (Fabric.class){
                fabric = instance;
                if (fabric == null){
                    instance = fabric = new Fabric();
                }
            }
        }
        return instance;
    }

    public UserFactory createFactory(AuthProvider authType) throws IllegalAccessException, InstantiationException {
        Package aPackage = Fabric.class.getPackage();
        Reflections reflections = new Reflections(aPackage);
        Set<Class<? extends UserFactory>> typesOf =
                reflections.getSubTypesOf(UserFactory.class);

        for (Class<? extends UserFactory> aClass : typesOf) {
            if (aClass.getSimpleName().startsWith(authType.name().toUpperCase()) && aClass.getSimpleName().endsWith("Provider")) {
                return aClass.newInstance();
            }
        }
        return null;
    }

    private Fabric() {
    }
}
