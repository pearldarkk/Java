public class test {
    public static void main(String[] args) {
        String name = " Le     manh           Cuong             ";
        name = name.replaceAll("^ +", "").replaceAll(" +$", "").replaceAll(" +", " ");
        System.out.println(name);

    }
}
