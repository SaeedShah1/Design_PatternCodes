package FactoryPattern;


// Shape factory will create the
// desired object without exposing creational details
public class ShapeFactory {
    
    public Shape getShapeType(String shapeType){

        if(shapeType == "Circle"){

            return new Circle();
        }else

        if(shapeType == "RectAngle"){

            return new Rectangle();
        }
        else 
        if(shapeType == "Square"){

            return new Square();
        }

        return null;
    }
}
