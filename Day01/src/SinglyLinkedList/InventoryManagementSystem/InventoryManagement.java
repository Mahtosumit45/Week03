package SinglyLinkedList.InventoryManagementSystem;

public class InventoryManagement {
    public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtBeginning("Laptop", 101, 10, 800.0);
        inventory.addAtEnd("Mouse", 102, 50, 25.0);
        inventory.addAtPosition(2, "Keyboard", 103, 30, 45.0);

        System.out.println("All Items:");
        inventory.displayAll();

        System.out.println("\nSearching for Item ID 102:");
        inventory.searchByItemID(102);

        System.out.println("\nUpdating Quantity for Item ID 103:");
        inventory.updateQuantity(103, 40);

        System.out.println("\nTotal Inventory Value:");
        inventory.calculateTotalValue();

        System.out.println("\nSorting Items by Name (Ascending):");
        inventory.sortByItemName(true);
        inventory.displayAll();

        System.out.println("\nSorting Items by Price (Descending):");
        inventory.sortByPrice(false);
        inventory.displayAll();

        System.out.println("\nRemoving Item with ID 101:");
        inventory.removeByItemID(101);

        System.out.println("\nAll Items After Removal:");
        inventory.displayAll();
    }
}
