public class ArrayDriver {
    public static void main(String[] args) {
        ArrayProcessor ap = new ArrayProcessor();
        int len = ap.getArrayLength(new String[]{"one", "two", "three"});
        System.out.println("Array length is " + len);
    }
}
