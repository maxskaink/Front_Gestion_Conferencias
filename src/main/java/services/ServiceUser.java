/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import models.User;

import org.glassfish.jersey.jackson.JacksonFeature;
/**
 *
 * @author isabe
 */
public class ServiceUser {
    private String endPoint;
    private Client client;

    public ServiceUser() {
        this.endPoint = "http://localhost:8081/api/users"; 
        client = ClientBuilder.newClient().register(new JacksonFeature());
    }
    
    //GET /api/users/{id}
    public User getUser(Integer idUser) {
        WebTarget target = client.target(this.endPoint + "/" + idUser);
        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).get();

        if (response.getStatus() == 200) {
            return response.readEntity(User.class); // Lee el cuerpo como User
        } else {
            throw new RuntimeException("Failed to fetch user: " + response.getStatus());
        }
    }
    
    // PUT /api/users/{id}
    public User updateUser(String id, User updatedUser) {
        WebTarget target = client.target(this.endPoint + "/" + id);
        Entity<User> data = Entity.entity(updatedUser, MediaType.APPLICATION_JSON_TYPE);

        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).put(data);

        // Maneja la respuesta
        if (response.getStatus() == 200) {
            return response.readEntity(User.class); // Retorna el objeto User actualizado
        } else {
            throw new RuntimeException("Failed to update user: " + response.getStatus());
        }
    }

    // DELETE /api/users/{id}
    public boolean deleteUser(Integer id) {
        WebTarget target = client.target(this.endPoint + "/" + id);
        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).delete();

        // Verifica si el estado es 200 (OK)
        if (response.getStatus() == 200) {
            return true; // Eliminación exitosa
        } else {
            System.out.println("Error: " + response.getStatus() + " " + response.getStatusInfo());
            return false;
        }
    }

    // POST /api/users/login
    public User loginUser(String email, String password) {
        User user = new User(); // Crea un nuevo objeto User
        user.setEmail(email); // Establece el email
        user.setPassword(password); // Establece la contraseña

        WebTarget target = client.target(this.endPoint + "/login");
        Entity<User> data = Entity.entity(user, MediaType.APPLICATION_JSON_TYPE);

        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).post(data);

        // Maneja la respuesta
        if (response.getStatus() == 200) {
            // Lee la respuesta y crea una nueva instancia de User a partir de los datos devueltos
            User loggedInUser = response.readEntity(User.class);
            return loggedInUser; // Retorna el objeto User
        } else {
            // Maneja errores de inicio de sesión
            throw new RuntimeException("Failed to login user: " + response.getStatus());
        }
    }
    
    public String getUserRole(User user) {
        if (user != null) {
            return user.getRol(); // Retorna el rol del usuario
        }
        return null; // O un valor predeterminado si el usuario es nulo
    }

}
