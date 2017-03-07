package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.UserDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tolly on 3/7/2017.
 */
@Path("/users")
public class DisplayUsers {
    @GET
    @Produces("text/html")
    public Response getUser() {
        UserDao userDao = new UserDao();

        String htmlString = "<table><tr><th>User Name</th></tr>";
        List<User> allUsers = userDao.getAllUsers();
        for (User user : allUsers) {
            htmlString += "<tr><td>" + user.getUserName() + "</td></tr>";
        }
        htmlString += "</table>";
        return Response.status(200).entity(htmlString).build();
    }
}
