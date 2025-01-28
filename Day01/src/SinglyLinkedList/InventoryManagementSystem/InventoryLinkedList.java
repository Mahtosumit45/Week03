package SinglyLinkedList.InventoryManagementSystem;

class InventoryLinkedList {
    private Item head;

    public void addAtBeginning(String itemName, int itemID, int quantity, double price) {
        Item newItem = new Item(itemName, itemID, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    public void addAtEnd(String itemName, int itemID, int quantity, double price) {
        Item newItem = new Item(itemName, itemID, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newItem;
    }

    public void addAtPosition(int position, String itemName, int itemID, int quantity, double price) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            addAtBeginning(itemName, itemID, quantity, price);
            return;
        }

        Item newItem = new Item(itemName, itemID, quantity, price);
        Item current = head;
        int count = 1;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position out of range.");
            return;
        }

        newItem.next = current.next;
        current.next = newItem;
    }

    public void removeByItemID(int itemID) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        if (head.itemID == itemID) {
            head = head.next;
            return;
        }

        Item current = head;
        while (current.next != null && current.next.itemID != itemID) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Item with ID " + itemID + " not found.");
            return;
        }

        current.next = current.next.next;
    }

    public void updateQuantity(int itemID, int newQuantity) {
        Item current = head;
        while (current != null) {
            if (current.itemID == itemID) {
                current.quantity = newQuantity;
                System.out.println("Quantity updated for Item ID " + itemID + ".");
                return;
            }
            current = current.next;
        }
        System.out.println("Item with ID " + itemID + " not found.");
    }

    public void searchByItemID(int itemID) {
        Item current = head;
        while (current != null) {
            if (current.itemID == itemID) {
                System.out.println("Item found: Name: " + current.itemName + ", ID: " + current.itemID + ", Quantity: " + current.quantity + ", Price: " + current.price);
                return;
            }
            current = current.next;
        }
        System.out.println("Item with ID " + itemID + " not found.");
    }

    public void searchByItemName(String itemName) {
        Item current = head;
        while (current != null) {
            if (current.itemName.equalsIgnoreCase(itemName)) {
                System.out.println("Item found: Name: " + current.itemName + ", ID: " + current.itemID + ", Quantity: " + current.quantity + ", Price: " + current.price);
                return;
            }
            current = current.next;
        }
        System.out.println("Item with Name " + itemName + " not found.");
    }

    public void calculateTotalValue() {
        double totalValue = 0;
        Item current = head;
        while (current != null) {
            totalValue += current.quantity * current.price;
            current = current.next;
        }
        System.out.println("Total Inventory Value: " + totalValue);
    }

    public void sortByItemName(boolean ascending) {
        if (head == null || head.next == null) return;

        head = mergeSort(head, (a, b) -> ascending ? a.itemName.compareToIgnoreCase(b.itemName) < 0 : a.itemName.compareToIgnoreCase(b.itemName) > 0);
    }

    public void sortByPrice(boolean ascending) {
        if (head == null || head.next == null) return;

        head = mergeSort(head, (a, b) -> ascending ? a.price < b.price : a.price > b.price);
    }

    private Item mergeSort(Item head, java.util.function.BiFunction<Item, Item, Boolean> comparator) {
        if (head == null || head.next == null) return head;

        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(head, comparator);
        Item right = mergeSort(nextOfMiddle, comparator);

        return sortedMerge(left, right, comparator);
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;

        Item slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Item sortedMerge(Item a, Item b, java.util.function.BiFunction<Item, Item, Boolean> comparator) {
        if (a == null) return b;
        if (b == null) return a;

        if (comparator.apply(a, b)) {
            a.next = sortedMerge(a.next, b, comparator);
            return a;
        } else {
            b.next = sortedMerge(a, b.next, comparator);
            return b;
        }
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("No items in inventory.");
            return;
        }

        Item current = head;
        while (current != null) {
            System.out.println("Name: " + current.itemName + ", ID: " + current.itemID + ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }
}
