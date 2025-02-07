package Problem3;

class StringConcatenation {
    public long concatenate(int n) {
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }
        return System.currentTimeMillis() - start;
    }
}
