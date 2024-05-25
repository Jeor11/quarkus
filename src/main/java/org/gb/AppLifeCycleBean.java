package org.gb;

import java.util.logging.Logger;

import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.ShutdownEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class AppLifeCycleBean {
    private static final Logger LOGGER = Logger.getLogger("Esto es un log");
    //Esto es un metodo para que se inicialice la aplicacion
    void onStart(@Observes StartupEvent evt){
        LOGGER.info("La aplicacion se esta inicializando ");
    }
    //Esto es un metodo para que se finalizar la aplicacion
    void onStop(@Observes ShutdownEvent evt){
        LOGGER.info("La aplicacion se esta deteniendo ");
    }
}
