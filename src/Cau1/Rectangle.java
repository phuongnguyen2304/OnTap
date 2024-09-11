package Cau1;

public class  Rectangle extends Shape{
    private double width ;
    private double height ;

    public Rectangle( String shapeName ,String color  ,double width, double height) {
        super(shapeName, color);
        this.width = width ;
        this.height = height ;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width ;
    }
    public double getHeight(){
        return height ;
    }
    public void setHeight(double height){
        this.height = height ;
    }

    @Override
    public double calAre() {
        return width*height;
    }

    @Override
    public String toString() {
        return "Hinh chu nhat rong " + width + " dai " + height + " co mau " + getColor() + " ten la " + getShapeName() + " co dien tich la: " + calAre();
    }


}
