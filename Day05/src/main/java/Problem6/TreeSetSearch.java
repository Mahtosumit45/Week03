package Problem6;

import java.util.TreeSet;

class TreeSetSearch {
    private TreeSet<Integer> treeSet;

    public TreeSetSearch(int[] array) {
        this.treeSet = new TreeSet<>();
        for (int num : array) {
            treeSet.add(num);
        }
    }

    public boolean search(int target) {
        return treeSet.contains(target);
    }
}
