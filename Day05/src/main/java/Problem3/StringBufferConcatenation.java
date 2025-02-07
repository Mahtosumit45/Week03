package Problem3;

class StringBufferConcatenation {
    public long concatenate(int n) {
        long start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("a");
        }
        return System.currentTimeMillis() - start;
    }
}
