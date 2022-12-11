public class Main {

    public static void main(String[] args) {
        IndexBodyMass calculate = new IndexBodyMass();
        double myimt = calculate.imt(70, 1.68);
        System.out.println(myimt);
    }

}

