package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser{

    private final String userName;
    private final int iD;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPublishedPosts;

    public String getUserName(){
        return userName;
    }

    public int getiD(){
        return iD;
    }

    public char getSex(){
        return sex;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public int getNumberOfPublishedPosts(){
        return numberOfPublishedPosts;
    }

    @Override
    public String toString(){
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", iD=" + iD +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPublishedPosts=" + numberOfPublishedPosts +
                '}';
    }

    public ForumUser(final String userName, final char sex, final LocalDate dateOfBirth, final int numberOfPublishedPosts){
        this.userName = userName;
        this.iD = hashCode();
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPublishedPosts = numberOfPublishedPosts;
    }
}
