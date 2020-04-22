package com.kodilla.testing.testing.statistics;

public class CalculateForumStatistics{

    int numberOfUsers = 0;
    int numberOfPost = 0;
    int numberOfComments = 0;
    Double averageNumberOfCommentsPerUser = 0.0;
    Double averageNumberOfCommentsPerPost = 0.0;
    Double averageNumberOfPostsPerUser = 0.0;

    public void calculateAdvStatistics(Statistics statistics){

        if (statistics.usersNames() != null){
            this.numberOfUsers = statistics.usersNames().size();
        }
        if (statistics.postsCount() > 0){
            this.numberOfPost = statistics.postsCount();
        }
        if (statistics.commentsCount() > 0){
            this.numberOfComments = statistics.commentsCount();
        }
        if (statistics.postsCount() > 0 && statistics.commentsCount() > 0){
            this.averageNumberOfCommentsPerPost = (double) numberOfComments / numberOfPost;
            this.averageNumberOfPostsPerUser = (double) statistics.usersNames().size() / statistics.postsCount();
            this.averageNumberOfCommentsPerUser = (double) statistics.usersNames().size() / statistics.commentsCount();
        }
    }

    public void showStatistics(){
        System.out.println("Numbers of Users : " + this.numberOfUsers + "\n" +
                "Numbers of Post : " + this.numberOfPost + "\n" +
                "Numbers of Comments : " + this.numberOfComments + "\n" +
                "Average number of commentsPerUser " + this.averageNumberOfCommentsPerUser + "\n" +
                "Average number of commentsPerPost " + this.averageNumberOfCommentsPerPost + "\n" +
                "Average Number of Posts Per User: " + this.averageNumberOfPostsPerUser + "\n");
    }
}