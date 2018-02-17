package com.example.techtron.recyclerdeveloper;


import java.util.ArrayList;

/*
We have a class
we made a constructor to create objects with the peramaters of name and read
then we set those values in the AuthorsList class
and we create two methods one for get name and one for get read
create int id number
create array list method for authors which takes the argument for number of authors
    create array list for authors
    loop for number of authors
        adds string to array list of author containing "author " plus incremented id number where i is less than half the number of contacts
    return contacts

 */
public class AuthorsList {
    String authorName;
    Boolean haveRead;

    public AuthorsList(String name, boolean read){
        authorName = name;
        haveRead = read;
    }

    public String getAuthor() {
        return authorName;
    }
    public boolean getRead() {
        return haveRead;
    }
    private static int lastAuthorId = 0;

    public static ArrayList<AuthorsList> createAuthorList(int numAuthors){
        ArrayList<AuthorsList> authors = new ArrayList<AuthorsList>();
        for(int i = 1; i < numAuthors; i++){
            authors.add(new AuthorsList("Author "+ ++lastAuthorId, i <= lastAuthorId/2));
        }
        return authors;
    }
}
