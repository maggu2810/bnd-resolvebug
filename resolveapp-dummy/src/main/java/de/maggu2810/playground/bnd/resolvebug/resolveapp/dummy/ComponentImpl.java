
package de.maggu2810.playground.bnd.resolvebug.resolveapp.dummy;

import java.util.Map;

import javax.persistence.EntityManagerFactory;

import org.osgi.framework.Bundle;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.jpa.EntityManagerFactoryBuilder;

@Component
public class ComponentImpl implements EntityManagerFactoryBuilder {

    @Override
    public EntityManagerFactory createEntityManagerFactory(final Map<String, Object> props) {
        return null;
    }

    @Override
    public String getPersistenceProviderName() {
        return null;
    }

    @Override
    public Bundle getPersistenceProviderBundle() {
        return null;
    }

}
