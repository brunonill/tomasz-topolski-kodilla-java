package com.kodilla.testing.testing.statistics;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class TestCalculateForumStatistics{

    @BeforeClass
    public static void beforeClass() throws Exception{
        for (int i = 0; i < 100; i++){
            inputListOfUsersFull.add("Users" + i);
        }
    }

    static List<String> inputListOfUsersFull = new ArrayList<>();
    int inputNumberOfPost;
    int inputNumberOfComments;
    Double expectedResultAvgComment;
    Double expectedResultAvgPost;
    Double expectedResultAvgCommentperPost;

    public TestCalculateForumStatistics(List<String> inputListOfUsersFull, int inputNumberOfPost, int inputNumberOfComments, Double expectedResultAvgComment, Double expectedResultAvgPost, Double expectedResultAvgCommentperPost){
        TestCalculateForumStatistics.inputListOfUsersFull = inputListOfUsersFull;
        this.inputNumberOfPost = inputNumberOfPost;
        this.inputNumberOfComments = inputNumberOfComments;
        this.expectedResultAvgComment = expectedResultAvgComment;
        this.expectedResultAvgPost = expectedResultAvgPost;
        this.expectedResultAvgCommentperPost = expectedResultAvgCommentperPost;
    }

    @Parameterized.Parameters(name = "TestCase Nr. {index}: inputList={0}, Posts={1}, Comments={2}, expectedAvgComment={3}, expectedAvgPost={4},expectedAvgCommentperPost={5}")

    public static Collection<Object[]> data(){
        List<String> inputEmptyList = new ArrayList<>();
        return Arrays.asList(new Object[][]{
                {inputListOfUsersFull, 0, 0, 0.0, 0.0, 0.0},         // gdy liczba użytkowników = 100
                {inputEmptyList, 0, 0, 0.0, 0.0, 0.0},               // gdyliczba użytkowników = 0
                {inputListOfUsersFull, 1000, 0, 0.0, 0.0, 0.0},      // gdy liczba postów = 1000
                {inputListOfUsersFull, 100, 1000, 1.0, 10.0, 0.1},     // gdy liczba komentarzy < liczba postów,
                {inputListOfUsersFull, 1000, 100, 0.1, 0.1, 1.0},    // gdy liczba komentarzy > liczba postów,
                {inputListOfUsersFull, 0, 0, 0.0, 0.0, 0.0},    // gdy liczba postów = 0,
                {inputListOfUsersFull, 100, 0, 0.0, 0.0, 0.0}     // gdy liczba komentarzy = 0,
        });
    }

    @Test
    public void testAvg(){

        //        Given
        CalculateForumStatistics calculateForumStatistics = new CalculateForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);

        //        When

        when(statisticsMock.usersNames()).thenReturn(inputListOfUsersFull);
        when(statisticsMock.postsCount()).thenReturn(inputNumberOfPost);
        when(statisticsMock.commentsCount()).thenReturn(inputNumberOfComments);
        calculateForumStatistics.calculateAdvStatistics(statisticsMock);
        //        Then

        Assert.assertEquals(expectedResultAvgPost, calculateForumStatistics.averageNumberOfCommentsPerPost);
        Assert.assertEquals(expectedResultAvgComment, calculateForumStatistics.averageNumberOfPostsPerUser);
        Assert.assertEquals(expectedResultAvgCommentperPost, calculateForumStatistics.averageNumberOfCommentsPerUser);

    }

}

