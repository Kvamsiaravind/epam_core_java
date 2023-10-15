package practicepatterns.abstractfactorypattern;

public interface Shape {
    public void draw();
}

class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw() method in rounded rectangle");
    }
}

class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("draw() method in rounded square");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw() method in rectangle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw() method in square");
    }
}

abstract class AbstractFactory {
    abstract Shape getShape(String shapeType) ;
}

class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}

class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}

class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}