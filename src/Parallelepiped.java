public class Parallelepiped extends Exception{
    private static int length;
    private static int width;
    private static int height;


    public Parallelepiped(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static int getSquare() {
        return (2 * ((height * length) + (length * width) + (height * width)));

    }

    public static int getVolume() {
        return ((length * width * height));
    }
}

