package classBox_encapsulation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public double getLength() {
        return length;
    }

    private void setLength(double length) {
        if(length <= 0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        if (width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        if (height <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public double calculateSurfaceArea (){
        //2lw + 2lh + 2wh
        double surfaceArea = (2 * length * width)
                + (2 * length * height) + (2 * width * height);

        return surfaceArea;
    }

    public double calculateLateralSurfaceArea (){
        //2lh + 2wh
        double lateralSurfaceArea = (2 * length * height) + (2 * width * height);

        return lateralSurfaceArea;

    }

    public double calculateVolume (){
      //
        double volume = length * width * height;

        return volume;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Surface Area - %.2f%n",calculateSurfaceArea()));
        sb.append(String.format("Lateral Surface Area - %.2f%n",calculateVolume()));
        sb.append(String.format("Volume – %.2f",calculateVolume()));

        return sb.toString();
    }
}
