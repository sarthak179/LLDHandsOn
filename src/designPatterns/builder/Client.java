package designPatterns.builder;

public class Client {
    public static void main(String[] args) throws Exception {
        Student student = Student.builder()
                            .setId(1)
                            .setBatchName("LLD Jan 23")
                            .setName("Sarthak")
                            .setGradYear(2021)
                            .setYoe(2)
                            .setPsp(80)
                            .build();
    }
}
