package Problem3;

class StringBuilderConcatenation {
    public long concatenate(int n) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        return System.currentTimeMillis() - start;
    }
}
