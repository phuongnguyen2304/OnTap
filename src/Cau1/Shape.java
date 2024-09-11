package Cau1;
public abstract class Shape {
    private String shapeName ;
    private String color ;

    public Shape (){

    }
    public Shape(String shapeName , String color){
        this.shapeName = shapeName ;
        this.color = color ;

    }
    public String getShapeName(){
        return shapeName ;
    }
    public void setShapeName(String shapeName){
        this.shapeName = shapeName ;
    }
    public String getColor(){
        return color ;
    }
    public void setColor(String color){
        this.color = color ;
    }

    public abstract double calAre();
    @Override
    public String toString() {
        return "Shape{" +
                "shapeName='" + shapeName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

