package FactoryPattern;

public class FactoryImplentationClass {
    
  static ShapeFactory shapeFactory = new ShapeFactory();

public static void main(String[] args) {


//Factory Design Pattern Implementation 
Shape circle = shapeFactory.getShapeType("Circle");
circle.draw();


Shape rectangle = shapeFactory.getShapeType("RectAngle");
rectangle.draw();


Shape square = shapeFactory.getShapeType("Square");
square.draw();

}

}
