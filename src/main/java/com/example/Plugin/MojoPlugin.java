package com.example.Plugin;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.util.HashMap;
import java.util.Scanner;

@Mojo(name="user")
public class MojoPlugin extends AbstractMojo{


    @Parameter(property = "name",defaultValue = "Orhun Mert Bozkurt")
    private String userName;

    @Parameter(property = "password")
    private int password;

    @Parameter(property = "project" , readonly = true)
    MavenProject project;

    @Parameter(property = "User List")
    private HashMap<Integer , String> user_list = new HashMap<Integer , String>();

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        //We are imaging a database.
        SignUp();
        SignIn();

        project.getProperties().put("Name:" , getUserName());

        getLog().info("Hello World. Maven Plugin is started...");
        getLog().info("Name:"+getUserName() +" Password:"+getPassword());
    }
    public void SignIn(){

        Scanner scan = new Scanner(System.in);

        System.out.println("UserName:");
        String name = scan.nextLine();
        System.out.println("Password");
        int password = scan.nextInt();

        boolean cond = controlUserList(user_list , password);

        getLog().info("Connecting...");

        if (cond) {

            setUserName(name);
            setPassword(password);
            getLog().info("Connecting success");
            getLog().info("Connected. Welcome to "+name);

        }
        else{
            getLog().info("Connecting failed. Try again...");
        }

    }
    public void SignUp(){

        Scanner scan = new Scanner(System.in);
        boolean cond = false;
        String name;
        int password;

       while(cond == false){

            System.out.println("Please write your username:");
            name = scan.nextLine();
            System.out.println("Please write your password");
            password = scan.nextInt();

            cond = controlUserList(user_list , password);

            //if we don't have same password in hashmap, we can add a new user.
            if(!(cond)){

                user_list.put(password ,name);
                getLog().info("Sign Up success");
                break;

            }
            else{
                getLog().info("Sign Up failed. Try again.");
            }

        }


    }
    public boolean controlUserList(HashMap<Integer , String> userlist , int password){
        return userlist.containsKey(password);
    }
    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String name){
        this.userName = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public HashMap<Integer, String> getUser_list() {
        return user_list;
    }

    public void setUser_list(HashMap<Integer, String> user_list) {
        this.user_list = user_list;
    }
}
