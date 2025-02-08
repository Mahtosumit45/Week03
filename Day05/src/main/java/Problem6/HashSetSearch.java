package Problem6;

import java.util.HashSet;

class HashSetSearch {
    private HashSet<Integer> hashSet;

    public HashSetSearch(int[] array) {
        this.hashSet = new HashSet<>();
        for (int num : array) {
            hashSet.add(num);
        }
    }

    public boolean search(int target) {
        return hashSet.contains(target);
    }
}
