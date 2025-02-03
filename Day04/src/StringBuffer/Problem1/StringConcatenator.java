package StringBuffer.Problem1;

class StringConcatenator {
    public static String concatenateStrings(String[] strings) {
        StringBuffer sb = new StringBuffer();

        for (String str : strings) {
            sb.append(str);
        }

        return sb.toString();
    }
}
