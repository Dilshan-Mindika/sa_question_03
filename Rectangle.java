public class Rectangle implements Shape {
    @Override
    public void draw() {
        int length = 4;
        int width = 6;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}