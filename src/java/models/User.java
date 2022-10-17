package models;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class User implements Serializable
{
    private String username;
    
    public User()
    {
        username = "";
    }
    
    public User(String username)
    {
        this.username = username;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }
}
