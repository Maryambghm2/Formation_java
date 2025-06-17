package org.example.demo_api_rest;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
// annotation @ApplicationPath est appliquée à une classe qui extend Application
// le chemin de @ApplicationPath indique l'url de base ou se trouve les ressources JAX-RS
// http://localhost:8080/demo_api_rest_war_exploded/api/
@ApplicationPath("/api")
// @ApplicationPath L'api disponible à la racine de l'application
public class HelloApplication extends Application {

}