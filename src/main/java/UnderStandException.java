public class UnderStandException {

    public int divide(int a, int b) throws Exception {
       return a/b;
    }
    public static void main(String[] args) throws Exception{
        UnderStandException underStandException = new UnderStandException();
        System.out.println("before");
        System.out.println(underStandException.divide(1,0));
        System.out.println("after");
    }
}
