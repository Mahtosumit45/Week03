package SinglyLinkedList.SocialMediaFriendConnections;
import java.util.*;
class User {
    int userId;
    String name;
    int age;
    Friend friendList;
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendList = null;
        this.next = null;
    }
}

