package students.task3;


public class Main {
    public static void main(String[] args) {
        MyImage img = new ProxyImage("src/main/resources/proxy.png");
        img.display();
    }
}
