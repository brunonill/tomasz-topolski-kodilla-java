package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum{
    List<ForumUser> forumUserList = new ArrayList<>();

    public List<ForumUser> getForumUserList(){
        return new ArrayList<>(forumUserList);
    }

    public Forum(){
        forumUserList.add(new ForumUser("Tomasz21",'M', LocalDate.of(1962,3,21),23));
        forumUserList.add(new ForumUser("Agnieszka11",'F', LocalDate.of(1984,4,2),212));
        forumUserList.add(new ForumUser("Tz243",'M', LocalDate.of(1992,5,6),319));
        forumUserList.add(new ForumUser("Palwkos32",'F', LocalDate.of(2002,6,11),0));
        forumUserList.add(new ForumUser("KaPil",'M', LocalDate.of(1999,1,13),512));
        forumUserList.add(new ForumUser("Wojtas",'F', LocalDate.of(2019,2,26),1));
        forumUserList.add(new ForumUser("Worekx",'M', LocalDate.of(1983,6,6),12));
        forumUserList.add(new ForumUser("Jupiter",'F', LocalDate.of(1992,8,7),0));

    }
}
