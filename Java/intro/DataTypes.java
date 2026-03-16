public class DataTypes {
    public static void main(String[] args) {
        //int
        int age = 34;

        System.out.println("my age is "+age);

        //float
        float per = 34.534f;
        System.out.println("my percentrage is "+per );


        String output = String.format("age: %d percentage: %.1f",age,per);

        System.out.println(output);

        System.out.printf("age: %d percentage: %.1f\n",age,per);

        System.out.println("hello");

    }
}
