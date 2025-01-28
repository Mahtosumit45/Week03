package SinglyLinkedList.SocialMediaFriendConnections;
import java.util.*;
class SocialMedia {
    private User head;

    // Add a new user
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newUser;
        }
        System.out.println("User added: " + name);
    }

    // Find user by User ID
    private User findUserById(int userId) {
        User current = head;
        while (current != null) {
            if (current.userId == userId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Add a friend connection
    public void addFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        addFriend(user1, userId2);
        addFriend(user2, userId1);
        System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
    }

    private void addFriend(User user, int friendId) {
        Friend newFriend = new Friend(friendId);
        if (user.friendList == null) {
            user.friendList = newFriend;
        } else {
            Friend current = user.friendList;
            while (current.next != null) {
                if (current.friendId == friendId) {
                    return; // Avoid duplicate connections
                }
                current = current.next;
            }
            current.next = newFriend;
        }
    }

    // Remove a friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        removeFriend(user1, userId2);
        removeFriend(user2, userId1);
        System.out.println("Friend connection removed between " + user1.name + " and " + user2.name);
    }

    private void removeFriend(User user, int friendId) {
        Friend current = user.friendList, prev = null;

        while (current != null) {
            if (current.friendId == friendId) {
                if (prev == null) {
                    user.friendList = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        Set<Integer> mutualFriends = new HashSet<>();
        Friend current = user1.friendList;

        while (current != null) {
            mutualFriends.add(current.friendId);
            current = current.next;
        }

        System.out.print("Mutual Friends: ");
        current = user2.friendList;
        boolean hasMutual = false;

        while (current != null) {
            if (mutualFriends.contains(current.friendId)) {
                System.out.print(current.friendId + " ");
                hasMutual = true;
            }
            current = current.next;
        }

        if (!hasMutual) {
            System.out.println("None");
        } else {
            System.out.println();
        }
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        Friend current = user.friendList;

        if (current == null) {
            System.out.println("None");
            return;
        }

        while (current != null) {
            System.out.print(current.friendId + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Search for a user by Name or User ID
    public void searchUser(String name) {
        User current = head;
        boolean found = false;

        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                System.out.println("User Found: UserID: " + current.userId + ", Name: " + current.name + ", Age: " + current.age);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("User with name " + name + " not found.");
        }
    }

    public void searchUserById(int userId) {
        User user = findUserById(userId);

        if (user == null) {
            System.out.println("User with ID " + userId + " not found.");
        } else {
            System.out.println("User Found: UserID: " + user.userId + ", Name: " + user.name + ", Age: " + user.age);
        }
    }

    // Count the number of friends for each user
    public void countFriends() {
        User current = head;

        while (current != null) {
            int count = 0;
            Friend friend = current.friendList;

            while (friend != null) {
                count++;
                friend = friend.next;
            }

            System.out.println("User " + current.name + " has " + count + " friend(s).");
            current = current.next;
        }
    }
}
