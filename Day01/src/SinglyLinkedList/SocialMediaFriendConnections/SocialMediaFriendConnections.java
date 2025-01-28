package SinglyLinkedList.SocialMediaFriendConnections;
import java.util.*;
public class SocialMediaFriendConnections {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();

        // Add users
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 30);
        sm.addUser(3, "Charlie", 20);

        // Add friend connections
        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);

        // Display friends
        sm.displayFriends(1);
        sm.displayFriends(2);

        // Find mutual friends
        sm.findMutualFriends(1, 2);

        // Count friends
        sm.countFriends();

        // Remove a friend connection
        sm.removeFriendConnection(1, 2);
        sm.displayFriends(1);

        // Search for a user
        sm.searchUser("Alice");
        sm.searchUserById(3);
    }
}
